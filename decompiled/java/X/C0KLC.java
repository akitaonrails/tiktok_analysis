package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KLC, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.payment.v2.PaymentProcessHelper", f = "PaymentProcessHelper.kt", l = {27}, m = "getPlayStoreCurrencyCode")
public final class C0KLC extends AbstractC23140094w {
    public Function1 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0KL8 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KLC(C0KL8 c0kl8, InterfaceC1364105Vn<? super C0KLC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0kl8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentProcessHelper@367d.getPlayStoreCurrencyCode$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(this, null);
        C1C7U.LIZIZ("PaymentProcessHelper@367d.getPlayStoreCurrencyCode$1");
        return objLIZIZ;
    }
}
