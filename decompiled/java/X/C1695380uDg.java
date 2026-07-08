package X;

/* JADX INFO: renamed from: X.0uDg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695380uDg {
    public static final /* synthetic */ int LIZLLL = 0;
    public final float LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final int hashCode() {
        return (((Float.floatToIntBits(this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LineHeightStyle(alignment=");
        sbLIZ.append((Object) C1695360uDe.LIZIZ(this.LIZ));
        sbLIZ.append(", trim=");
        int i = this.LIZIZ;
        sbLIZ.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sbLIZ.append(",mode=");
        int i2 = this.LIZJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Mode(value=");
        sbLIZ2.append(i2);
        sbLIZ2.append(')');
        sbLIZ.append((Object) C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1695380uDg)) {
            return false;
        }
        C1695380uDg c1695380uDg = (C1695380uDg) obj;
        if (Float.compare(this.LIZ, c1695380uDg.LIZ) == 0 && this.LIZIZ == c1695380uDg.LIZIZ && this.LIZJ == c1695380uDg.LIZJ) {
            return true;
        }
        return false;
    }

    public C1695380uDg(float f, int i, int i2) {
        this.LIZ = f;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
