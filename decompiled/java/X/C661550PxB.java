package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0PxB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661550PxB {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final Aweme LIZ;
    public int LIZIZ;
    public final C662100Py4 LIZJ;
    public long LIZLLL = -1;
    public int LJ = -1;
    public C0N0Y LJFF;
    public int LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public final String LJIIJ;

    public final int hashCode() {
        return this.LJIIJ.hashCode();
    }

    public final void LIZ(long j) {
        String aid;
        this.LIZLLL = j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set mStartPlayTime = ");
        sbLIZ.append(j);
        sbLIZ.append(", aid = ");
        Aweme aweme = this.LIZ;
        if (aweme == null) {
            aid = "null";
        } else {
            aid = aweme.getAid();
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof C661550PxB) && TextUtils.equals(this.LJIIJ, ((C661550PxB) obj).LJIIJ)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public C661550PxB(Aweme aweme, C662100Py4 c662100Py4, String str) {
        this.LIZ = aweme;
        this.LIZJ = new C662100Py4();
        this.LIZJ = c662100Py4;
        this.LJIIJ = str;
    }
}
