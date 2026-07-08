package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0uYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final /* synthetic */ class C1708590uYz extends C2217421BqW implements Function1<C1708320uYY, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ C1708220uYO LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC1708270uYT LLILZ;
    public final /* synthetic */ C1708990uZd LLILZIL;
    public final /* synthetic */ Function1<String, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1708590uYz(Context context, C1708220uYO c1708220uYO, String str, C1709880ub4 c1709880ub4, C1708990uZd c1708990uZd, AwS605S0100000_26 awS605S0100000_26) {
        super(1, C1449605lu.class, "requestPreRiskThenBind", "bindEWallet$requestPreRiskThenBind(Landroid/content/Context;Lcom/ss/android/ugc/aweme/pipo/cashier/common/bind/CashierBindPaymentMethodHelper;Ljava/lang/String;Lcom/ss/android/ugc/aweme/pipo/cashier/common/bind/CashierBindPaymentMethodHelper$BindStatusCallback;Lcom/ss/android/ugc/aweme/pipo/cashier/cashier/config/CashierStaticConfig;Lkotlin/jvm/functions/Function1;Lcom/ss/android/ugc/aweme/pipo/cashier/common/bind/api/BindRequestParams;)V", 0);
        this.LL = context;
        this.LLILLJJLI = c1708220uYO;
        this.LLILLL = str;
        this.LLILZ = c1709880ub4;
        this.LLILZIL = c1708990uZd;
        this.LLILZLL = awS605S0100000_26;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1708320uYY c1708320uYY) {
        C1708220uYO.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, c1708320uYY);
        return Unit.LIZ;
    }
}
