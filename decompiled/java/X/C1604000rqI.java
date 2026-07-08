package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0rqI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1604000rqI {
    public final int LIZ;
    public final Aweme LIZIZ;
    public final C0SZ8 LIZJ;
    public final boolean LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedPageContext(position=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", aweme=");
        Aweme aweme = this.LIZIZ;
        sbLIZ.append(aweme != null ? aweme.getAid() : null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1604000rqI(int i, C0SZ8 c0sz8, Aweme aweme, boolean z) {
        this.LIZ = i;
        this.LIZIZ = aweme;
        this.LIZJ = c0sz8;
        this.LIZLLL = z;
    }
}
