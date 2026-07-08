package X;

/* JADX INFO: renamed from: X.0wKl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776650wKl extends AbstractC1776680wKo {
    public final float LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1776650wKl)) {
            return false;
        }
        C1776650wKl c1776650wKl = (C1776650wKl) obj;
        return Float.compare(this.LIZJ, c1776650wKl.LIZJ) == 0 && Float.compare(this.LIZLLL, c1776650wKl.LIZLLL) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelativeLineTo(dx=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", dy=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZJ) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public C1776650wKl(float f, float f2) {
        super(false, false, 3);
        this.LIZJ = f;
        this.LIZLLL = f2;
    }
}
