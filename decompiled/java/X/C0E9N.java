package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0E9N, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.reducenoise.EditorProReduceNoiseComponent$checkAndDownloadModel$1$path$1", f = "EditorProReduceNoiseComponent.kt", l = {159}, m = "invokeSuspend")
public final class C0E9N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ C0E9L LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E9N(C0E9L c0e9l, InterfaceC1364105Vn<? super C0E9N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0e9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0E9N(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProReduceNoiseComponent@2710.checkAndDownloadModel$1$path$1");
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
            C0E9L c0e9l = this.LLILLJJLI;
            this.LL = 1;
            obj = c0e9l.X1(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EditorProReduceNoiseComponent@2710.checkAndDownloadModel$1$path$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EditorProReduceNoiseComponent@2710.checkAndDownloadModel$1$path$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
