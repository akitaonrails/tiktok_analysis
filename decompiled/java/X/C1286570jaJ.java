package X;

/* JADX INFO: renamed from: X.0jaJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1286570jaJ {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public float LIZLLL;

    public final boolean LIZ() {
        return this.LIZ > this.LIZJ && this.LIZLLL > 0.001f;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExposureCompensationInfo{max = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", exposure = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", min = ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", step = ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
