package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0m7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1384320m7y {
    public CharSequence LIZIZ;
    public long LIZLLL;
    public int LJII;
    public long LIZJ = -1;
    public int LJ = LSPassThroughRecordSizeConfig.DEFAULT;
    public int LJFF = LSPassThroughRecordSizeConfig.DEFAULT;
    public int LJI = 1;
    public int LJIIIIZZ = -1;
    public int LJIIIZ = -1;

    public static final boolean LJ() {
        return false;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('(');
        sbLIZ.append(this.LJII);
        sbLIZ.append(',');
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("):");
        sbLIZ.append(LIZLLL());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int LIZIZ() {
        return this.LJFF;
    }

    public int LIZJ() {
        return this.LJ;
    }

    public CharSequence LIZLLL() {
        return this.LIZIZ;
    }
}
