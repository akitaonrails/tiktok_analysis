package X;

import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.api.response.CheckPlayResponse;
import com.ss.android.ugc.aweme.mix.api.response.ManageResponse;

/* JADX INFO: renamed from: X.0gXO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1169440gXO implements InterfaceC736910SvR<InterfaceC1169460gXQ> {
    public final MixFeedApi LL;
    public final C1169430gXN LLILLJJLI;

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0gXN] */
    public C1169440gXO() {
        MixFeedApi.LIZ.getClass();
        this.LL = C1169360gXG.LIZ();
        this.LLILLJJLI = new InterfaceC1169460gXQ() { // from class: X.0gXN
            @Override // X.InterfaceC1169460gXQ
            public final AbstractC19484711Kz<ManageResponse> LJLI(String str, String str2) {
                return this.LL.LL.manageMixFeed(EnumC1163900gOS.RENAME.getOperation(), str, null, null, null, str2, null);
            }

            @Override // X.InterfaceC1169460gXQ
            public final C11NZ<CheckPlayResponse> checkPlaylistName(int i, String str) {
                return this.LL.LL.checkPlaylistName(i, str);
            }
        };
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LLILLJJLI;
    }
}
