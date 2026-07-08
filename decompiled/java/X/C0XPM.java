package X;

import com.ss.android.ugc.aweme.account.login.trustedfriends.TrustedFriendsApiWithCustomDomain;

/* JADX INFO: renamed from: X.0XPM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.trustedfriends.TrustedFriendsApiWithCustomDomain", f = "TrustedFriendsApiWithCustomDomain.kt", l = {57}, m = "fetchRecoveryVerificationStatus")
public final class C0XPM extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TrustedFriendsApiWithCustomDomain LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0XPM(TrustedFriendsApiWithCustomDomain trustedFriendsApiWithCustomDomain, InterfaceC1364105Vn<? super C0XPM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = trustedFriendsApiWithCustomDomain;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TrustedFriendsApiWithCustomDomain@60e0.fetchRecoveryVerificationStatus$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, null, this);
        C1C7U.LIZIZ("TrustedFriendsApiWithCustomDomain@60e0.fetchRecoveryVerificationStatus$1");
        return objLIZ;
    }
}
