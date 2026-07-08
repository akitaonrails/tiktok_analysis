package X;

import com.bytedance.android.live.iap.service.IapService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.payment.v2.PaymentProcessHelper$querySubscriptionHistory$2", f = "PaymentProcessHelper.kt", l = {44}, m = "invokeSuspend")
public final class C515660KKe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C518090KTn>, Object> {
    public int LL;

    public C515660KKe(InterfaceC1364105Vn<? super C515660KKe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C515660KKe(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentProcessHelper@d606.querySubscriptionHistory$2");
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
            final C013C c013c = new C013C();
            this.LL = 1;
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            ((InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class)).LJ(new InterfaceC518110KTp() { // from class: X.0KKf
                @Override // X.InterfaceC518110KTp
                public final void onFailure() {
                    C013C c013c2 = c013c;
                    if (c013c2.element) {
                        return;
                    }
                    c013c2.element = true;
                    InterfaceC1364105Vn<C518090KTn> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn.resumeWith(null);
                }

                @Override // X.InterfaceC518110KTp
                public final void LIZ(C518090KTn c518090KTn) {
                    C013C c013c2 = c013c;
                    if (c013c2.element) {
                        return;
                    }
                    c013c2.element = true;
                    InterfaceC1364105Vn<C518090KTn> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(c518090KTn);
                    interfaceC1364105Vn.resumeWith(c518090KTn);
                }
            });
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PaymentProcessHelper@d606.querySubscriptionHistory$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PaymentProcessHelper@d606.querySubscriptionHistory$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C518090KTn> interfaceC1364105Vn) {
        return new C515660KKe(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
