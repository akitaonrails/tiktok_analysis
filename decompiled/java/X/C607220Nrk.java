package X;

import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* JADX INFO: renamed from: X.0Nrk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607220Nrk {
    public final int LIZ;
    public final int LIZIZ;
    public final FeedItemList LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Response(pullType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", requestType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", feedItemList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C607220Nrk(int i, int i2, FeedItemList feedItemList) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = feedItemList;
    }
}
