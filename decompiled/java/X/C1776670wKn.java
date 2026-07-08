package X;

/* JADX INFO: renamed from: X.0wKn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776670wKn extends AbstractC1776680wKo {
    public final float LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1776670wKn)) {
            return false;
        }
        C1776670wKn c1776670wKn = (C1776670wKn) obj;
        return Float.compare(this.LIZJ, c1776670wKn.LIZJ) == 0 && Float.compare(this.LIZLLL, c1776670wKn.LIZLLL) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelativeReflectiveQuadTo(dx=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", dy=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZJ) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public C1776670wKn(float f, float f2) {
        super(false, true, 1);
        this.LIZJ = f;
        this.LIZLLL = f2;
    }
}
