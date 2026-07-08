package X;

/* JADX INFO: renamed from: X.00YB, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00YB {
    public final int LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00YB)) {
            return false;
        }
        C00YB c00yb = (C00YB) obj;
        return this.LIZ == c00yb.LIZ && Float.compare(this.LIZIZ, c00yb.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MicTouchEvent(action=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", y=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C00YB(int i, float f) {
        this.LIZ = i;
        this.LIZIZ = f;
    }
}
