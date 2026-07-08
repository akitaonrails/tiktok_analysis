package X;

/* JADX INFO: renamed from: X.0wKf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776590wKf extends AbstractC1776680wKo {
    public final float LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1776590wKf) && Float.compare(this.LIZJ, ((C1776590wKf) obj).LIZJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelativeHorizontalTo(dx=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZJ);
    }

    public C1776590wKf(float f) {
        super(false, false, 3);
        this.LIZJ = f;
    }
}
