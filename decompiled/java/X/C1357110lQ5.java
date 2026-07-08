package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0lQ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357110lQ5 {
    public final String LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LikeParams(aid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1357110lQ5(Aweme aweme, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = aweme;
        this.LIZJ = str2;
    }
}
