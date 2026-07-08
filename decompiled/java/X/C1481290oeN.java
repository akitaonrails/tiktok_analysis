package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0oeN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481290oeN {
    public final String LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;
    public final int LJ;
    public final int LJFF;
    public Object LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public Map LJIIJJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaError{sourceId='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", codecType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isDash=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", errorExtra=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", extraInfo=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", playUrl='");
        sbLIZ.append((String) null);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1481290oeN(int i, int i2, int i3, Object obj, String str) {
        this.LIZ = str;
        this.LIZIZ = i == 1;
        this.LIZJ = i;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = obj;
    }
}
