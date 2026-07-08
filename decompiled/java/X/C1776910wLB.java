package X;

/* JADX INFO: renamed from: X.0wLB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776910wLB {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1776910wLB)) {
            return false;
        }
        C1776910wLB c1776910wLB = (C1776910wLB) obj;
        return Float.compare(this.LIZ, c1776910wLB.LIZ) == 0 && Float.compare(this.LIZIZ, c1776910wLB.LIZIZ) == 0 && Float.compare(this.LIZJ, c1776910wLB.LIZJ) == 0 && this.LIZLLL == c1776910wLB.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Sample(x=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", y=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", z=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", timestampMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public C1776910wLB(float f, float f2, float f3, long j) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = j;
    }
}
