package X;

import com.ss.android.ugc.aweme.account.login.trustedfriends.TrustedFriendsApi;

/* JADX INFO: renamed from: X.0XRb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.trustedfriends.TrustedFriendsApi", f = "TrustedFriendsApi.kt", l = {40}, m = "fetchFriendsRequesterList")
public final class C848690XRb extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TrustedFriendsApi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C848690XRb(TrustedFriendsApi trustedFriendsApi, InterfaceC1364105Vn<? super C848690XRb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = trustedFriendsApi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TrustedFriendsApi@688.fetchFriendsRequesterList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("TrustedFriendsApi@688.fetchFriendsRequesterList$1");
        return objLIZ;
    }
}
