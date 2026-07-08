package X;

/* JADX INFO: renamed from: X.0tyH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685830tyH {
    public static long LIZ() {
        return C1685910tyP.LJIIJ;
    }

    public static long LIZIZ() {
        return C1685910tyP.LJ;
    }

    public static long LIZJ(float f, float f2, float f3) {
        int i = C1685910tyP.LJIIJJI;
        C1E02 c1e02 = C1E04.LJ;
        if (0.0f > f || f > 360.0f || 0.0f > f2 || f2 > 1.0f || 0.0f > f3 || f3 > 1.0f) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HSV (");
            sbLIZ.append(f);
            sbLIZ.append(", ");
            sbLIZ.append(f2);
            sbLIZ.append(", ");
            sbLIZ.append(f3);
            sbLIZ.append(") must be in range (0..360, 0..1, 0..1)");
            C1685840tyI.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return C1685850tyJ.LIZ(LIZLLL(f, f2, f3, 5), LIZLLL(f, f2, f3, 3), LIZLLL(f, f2, f3, 1), 0.5f, c1e02);
    }

    public static float LIZLLL(float f, float f2, float f3, int i) {
        float f4 = (i + (f / 60.0f)) % 6.0f;
        return f3 - ((f2 * f3) * Math.max(0.0f, Math.min(f4, Math.min(4 - f4, 1.0f))));
    }
}
