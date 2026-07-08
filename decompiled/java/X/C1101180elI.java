package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0elI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101180elI {
    public final float LIZ;
    public float LIZIZ;
    public final Map<String, C491530JPj> LIZJ;
    public final EnumC1101170elH LIZLLL;
    public final long LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScoreResult(deviceScore=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", totalScore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", itemScores=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", level=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", time=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1101180elI(float f, float f2, Map<String, C491530JPj> map, EnumC1101170elH enumC1101170elH, long j) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = map;
        this.LIZLLL = enumC1101170elH;
        this.LJ = j;
    }
}
