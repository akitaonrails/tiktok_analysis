package X;

import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;

/* JADX INFO: renamed from: X.0SAZ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SAZ {
    public long LIZIZ;
    public long LIZJ;
    public SlidesImageLoadParams LJI;
    public String LJIIIIZZ;
    public long LIZ = -1;
    public int LIZLLL = 1;
    public int LJ = 1;
    public int LJFF = -1;
    public C0SAY LJII = C0SAY.UNKNOWN;
    public int LJIIIZ = -1;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\n            isFirstShow ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(",\n            picPosition ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(",\n            showStartTime ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",\n            showEndTime ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(",\n            loadCompleteTime ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(",\n            loadStatus ");
        sbLIZ.append(this.LJII);
        sbLIZ.append("\n        ");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
