package X;

import com.ss.android.ugc.aweme.account.login.trustedfriends.TrustedFriendsApiWithCustomDomain;

/* JADX INFO: renamed from: X.0XPN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.trustedfriends.TrustedFriendsApiWithCustomDomain", f = "TrustedFriendsApiWithCustomDomain.kt", l = {88}, m = "loginUsingPassportTicket")
public final class C0XPN extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TrustedFriendsApiWithCustomDomain LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0XPN(TrustedFriendsApiWithCustomDomain trustedFriendsApiWithCustomDomain, InterfaceC1364105Vn<? super C0XPN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = trustedFriendsApiWithCustomDomain;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TrustedFriendsApiWithCustomDomain@60e0.loginUsingPassportTicket$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("TrustedFriendsApiWithCustomDomain@60e0.loginUsingPassportTicket$1");
        return objLIZIZ;
    }
}
