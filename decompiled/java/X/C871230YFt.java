package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0YFt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.stranger.DefaultMessageRequestManager$provideMessageRequestDataAndNotifyUpdate$1$1", f = "DefaultMessageRequestManager.kt", l = {240}, m = "invokeSuspend")
public final class C871230YFt extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C871200YFq LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C871230YFt(C871200YFq c871200YFq, InterfaceC1364105Vn<? super C871230YFt> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c871200YFq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C871230YFt(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultMessageRequestManager@9541.provideMessageRequestDataAndNotifyUpdate$1$1");
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
            C871200YFq c871200YFq = this.LLILLJJLI;
            this.LL = 1;
            if (c871200YFq.LJJI(this) == objLJFF) {
                C1C7U.LIZIZ("DefaultMessageRequestManager@9541.provideMessageRequestDataAndNotifyUpdate$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultMessageRequestManager@9541.provideMessageRequestDataAndNotifyUpdate$1$1");
        return unit;
    }
}
