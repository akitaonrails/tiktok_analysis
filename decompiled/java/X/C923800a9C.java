package X;

/* JADX INFO: renamed from: X.0a9C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923800a9C {
    public final C1100750ekb LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final Float LJFF;
    public final Float LJI;
    public final Float LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeviceMetrics(scoreResult=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fps=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", drop3=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", temperature=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", cpu=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", deviceAllScore=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", deviceVideoScore=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", deviceRecordScore=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C923800a9C(C1100750ekb c1100750ekb, float f, float f2, float f3, float f4, Float f5, Float f6, Float f7) {
        this.LIZ = c1100750ekb;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = f4;
        this.LJFF = f5;
        this.LJI = f6;
        this.LJII = f7;
    }
}
