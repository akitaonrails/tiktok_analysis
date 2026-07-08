package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01cz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.buffer.MessageSearchContentUpdateBufferKt$chunkedWithDebounce$1", f = "MessageSearchContentUpdateBuffer.kt", l = {100}, m = "invokeSuspend")
public final class C375101cz extends C09AX implements Function2<InterfaceC346701Wf<? super List<Object>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C375101cz(InterfaceC346201Wa<Object> interfaceC346201Wa, int i, long j, InterfaceC1364105Vn<? super C375101cz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346201Wa;
        this.LLILZ = i;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C375101cz c375101cz = new C375101cz(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c375101cz.LLILLJJLI = obj;
        return c375101cz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageSearchContentUpdateBufferKt@6a78.chunkedWithDebounce$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C375401d2 c375401d2 = new C375401d2(this.LLILLL, new ArrayList(), this.LLILZ, interfaceC346701Wf, this.LLILZIL, null);
            this.LL = 1;
            if (C2296808zG.LJ(c375401d2, this) == objLJFF) {
                C1C7U.LIZIZ("MessageSearchContentUpdateBufferKt@6a78.chunkedWithDebounce$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageSearchContentUpdateBufferKt@6a78.chunkedWithDebounce$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super List<Object>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
