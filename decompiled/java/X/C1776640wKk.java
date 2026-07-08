package X;

/* JADX INFO: renamed from: X.0wKk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776640wKk extends AbstractC1776680wKo {
    public final float LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1776640wKk)) {
            return false;
        }
        C1776640wKk c1776640wKk = (C1776640wKk) obj;
        return Float.compare(this.LIZJ, c1776640wKk.LIZJ) == 0 && Float.compare(this.LIZLLL, c1776640wKk.LIZLLL) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReflectiveQuadTo(x=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", y=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZJ) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public C1776640wKk(float f, float f2) {
        super(false, true, 1);
        this.LIZJ = f;
        this.LIZLLL = f2;
    }
}
