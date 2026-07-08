package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09IW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.iap.core.payment.action.external.ListenToWebPaymentUpdateAction$perform$paymentStatus$1$1", f = "ListenToWebPaymentUpdateAction.kt", l = {63}, m = "invokeSuspend")
public final class C09IW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC346201Wa<String> LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09IW(InterfaceC346201Wa<String> interfaceC346201Wa, InterfaceC346201Wa<String> interfaceC346201Wa2, InterfaceC1364105Vn<? super C09IW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346201Wa;
        this.LLILLL = interfaceC346201Wa2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09IW(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ListenToWebPaymentUpdateAction@dbeb.perform$paymentStatus$1$1");
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
            InterfaceC346201Wa[] interfaceC346201WaArr = new InterfaceC346201Wa[2];
            interfaceC346201WaArr[0] = this.LLILLJJLI;
            InterfaceC346201Wa interfaceC346201Wa = this.LLILLL;
            if (interfaceC346201Wa == null) {
                interfaceC346201Wa = C1518305wz.LL;
            }
            interfaceC346201WaArr[1] = interfaceC346201Wa;
            C23127094j c23127094jLJJII = C09IC.LJJII(interfaceC346201WaArr);
            this.LL = 1;
            obj = C09IC.LJIIZILJ(c23127094jLJJII, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ListenToWebPaymentUpdateAction@dbeb.perform$paymentStatus$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ListenToWebPaymentUpdateAction@dbeb.perform$paymentStatus$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
