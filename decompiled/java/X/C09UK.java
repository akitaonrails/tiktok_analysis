package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09UK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.unlocktts.UnlockReadTextVoiceComponent$realFetchVoiceEffect$1$2", f = "UnlockReadTextVoiceComponent.kt", l = {}, m = "invokeSuspend")
public final class C09UK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19522411Zm LL;
    public final /* synthetic */ RuntimeException LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09UK(C19522411Zm c19522411Zm, RuntimeException runtimeException, InterfaceC1364105Vn<? super C09UK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19522411Zm;
        this.LLILLJJLI = runtimeException;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09UK(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("UnlockReadTextVoiceComponent@2e46.realFetchVoiceEffect$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0FWT c0fwtW2 = this.LL.W2();
        if (c0fwtW2 != null) {
            c0fwtW2.I10(new ExceptionResult(this.LLILLJJLI));
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("UnlockReadTextVoiceComponent@2e46.realFetchVoiceEffect$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
