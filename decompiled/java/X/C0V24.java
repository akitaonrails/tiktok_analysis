package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0V24, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0V24 {
    public final String LIZ;
    public long LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final int[] LJ;
    public final int LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("visibleScene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sumFrame=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sumDroppedFrames=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", sumFrameCost=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dropLevel=");
        sbLIZ.append(Arrays.toString(this.LJ));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0V24(String str) {
        this.LIZ = str;
        int i = C0VXC.LIZIZ - 1;
        this.LJFF = i;
        this.LJ = new int[i + 1];
    }
}
