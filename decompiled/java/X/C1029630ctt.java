package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0ctt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1029630ctt {
    public final AwemeRawAd LIZ;
    public final boolean LIZIZ;
    public String LIZJ;
    public C1016930cZP LIZLLL;

    public C1029630ctt() {
        this(null, false, null, 15);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdLynxModel(awemeRawAd=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", registerNativeBottomBar=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", refer=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", adLpBottomModel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1029630ctt(AwemeRawAd awemeRawAd, boolean z, String str, int i) {
        awemeRawAd = (i & 1) != 0 ? null : awemeRawAd;
        z = (i & 2) != 0 ? false : z;
        str = (i & 4) != 0 ? null : str;
        this.LIZ = awemeRawAd;
        this.LIZIZ = z;
        this.LIZJ = str;
        this.LIZLLL = null;
    }
}
