package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0hZr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1209410hZr extends C728560Shy {
    public C2189821An6 LLILZ;
    public final /* synthetic */ C1209400hZq LLILZIL;

    @Override // X.C728560Shy, X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        String aid;
        String upvoteId;
        super.onSuccess();
        C2189821An6 c2189821An6 = this.LLILZ;
        if (c2189821An6 == null || (upvoteId = c2189821An6.getUpvoteId()) == null || upvoteId.length() == 0) {
            InterfaceC1209300hZg interfaceC1209300hZgLJJIIZI = C19212010Ec.LIZJ.LJJIIZI();
            C2189821An6 c2189821An62 = this.LLILZ;
            if (c2189821An62 == null || (aid = c2189821An62.getAid()) == null) {
                aid = "";
            }
            Pair pair = (Pair) this.LL.getData();
            interfaceC1209300hZgLJJIIZI.LIZLLL(pair != null ? (Aweme) pair.getSecond() : null, aid);
        }
    }

    public C1209410hZr(C1209400hZq c1209400hZq) {
        this.LLILZIL = c1209400hZq;
    }

    @Override // X.C728560Shy, X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        if (!this.LLILZIL.LLILZ) {
            super.onFailed(exc);
        }
    }
}
