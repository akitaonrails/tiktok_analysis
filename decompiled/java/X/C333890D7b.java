package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0D7b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.UCPCheckoutGateway", f = "UCPCheckoutGateway.kt", l = {BaseNotice.CREATOR}, m = "updateCheckout")
public final class C333890D7b extends AbstractC23140094w {
    public C0D7Y LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0D7Y LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333890D7b(C0D7Y c0d7y, InterfaceC1364105Vn<? super C333890D7b> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0d7y;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UCPCheckoutGateway@ccae.updateCheckout$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(null, null, null, null, null, this);
        C1C7U.LIZIZ("UCPCheckoutGateway@ccae.updateCheckout$1");
        return objLIZLLL;
    }
}
