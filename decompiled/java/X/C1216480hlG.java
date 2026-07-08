package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;

/* JADX INFO: renamed from: X.0hlG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1216480hlG extends AbstractC1216410hl9<C194457115z, C1255920ims<C194457115z>> {
    public final String LL;

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        if (TextUtils.equals("from_discovery_challenge", this.LL)) {
            return 9000;
        }
        return i + LivePreCreateNextRoomPlayer.ENABLE;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [PRESENTER extends X.0ims<MODEL>, X.0ims] */
    public C1216480hlG(AbstractC1255880imo abstractC1255880imo, String str) {
        C194457115z c194457115z;
        this.mModel = abstractC1255880imo instanceof C194457115z ? abstractC1255880imo : new C194457115z();
        this.mPresenter = new C1255920ims();
        this.LL = str;
        if (TextUtils.equals("from_discovery_challenge", str) && (c194457115z = this.mModel) != null) {
            C194457115z c194457115z2 = c194457115z;
            if (!TextUtils.isEmpty("discovery_challenge_video")) {
                c194457115z2.LLILLL = "discovery_challenge_video";
            }
        }
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        this.mPresenter.LIZJ(Integer.valueOf(i), c2189821An6.getChallengeId(), Integer.valueOf(c2189821An6.getVideoType()), Boolean.FALSE);
    }
}
