package X;

/* JADX INFO: renamed from: X.0NW6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NW6 {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RippleAlpha(draggedAlpha=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", focusedAlpha=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hoveredAlpha=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pressedAlpha=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0NW6)) {
            return false;
        }
        C0NW6 c0nw6 = (C0NW6) obj;
        if (this.LIZ == c0nw6.LIZ && this.LIZIZ == c0nw6.LIZIZ && this.LIZJ == c0nw6.LIZJ && this.LIZLLL == c0nw6.LIZLLL) {
            return true;
        }
        return false;
    }

    public C0NW6(float f, float f2, float f3, float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
    }
}
