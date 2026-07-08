package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KKZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.payment.v2.PaymentProcessHelper", f = "PaymentProcessHelper.kt", l = {31}, m = "getPlayStoreCurrencyCode")
public final class C0KKZ extends AbstractC23140094w {
    public Function1 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0KKY LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KKZ(C0KKY c0kky, InterfaceC1364105Vn<? super C0KKZ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0kky;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PaymentProcessHelper@d606.getPlayStoreCurrencyCode$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(this, null);
        C1C7U.LIZIZ("PaymentProcessHelper@d606.getPlayStoreCurrencyCode$1");
        return objLIZIZ;
    }
}
