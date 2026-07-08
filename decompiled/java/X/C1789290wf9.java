package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0wf9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.jsb.impl.IapPaymentPrecheckMethod$handle$1$1", f = "IapPaymentPrecheckMethod.kt", l = {39}, m = "invokeSuspend")
public final class C1789290wf9 extends C09AX implements Function1<InterfaceC1364105Vn<? super AbstractC1157840gEg<List<? extends C1789670wfl>>>, Object> {
    public int LL;
    public final /* synthetic */ C1789460wfQ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789290wf9(C1789460wfQ c1789460wfQ, InterfaceC1364105Vn<? super C1789290wf9> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1789460wfQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1789290wf9(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super AbstractC1157840gEg<List<? extends C1789670wfl>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IapPaymentPrecheckMethod@d8cb.handle$1$1");
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
            C1789140weu c1789140weuLIZIZ = InterfaceC1789300wfA.LIZ.LIZIZ();
            C1789460wfQ c1789460wfQ = this.LLILLJJLI;
            this.LL = 1;
            obj = c1789140weuLIZIZ.LIZIZ(c1789460wfQ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IapPaymentPrecheckMethod@d8cb.handle$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("IapPaymentPrecheckMethod@d8cb.handle$1$1");
        return obj;
    }
}
