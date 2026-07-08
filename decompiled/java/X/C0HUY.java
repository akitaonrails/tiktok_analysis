package X;

/* JADX INFO: renamed from: X.0HUY, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HUY implements InterfaceC21640319mb {
    public final float LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HUY)) {
            return false;
        }
        C0HUY c0huy = (C0HUY) obj;
        return Float.compare(this.LIZ, c0huy.LIZ) == 0 && Float.compare(this.LIZIZ, c0huy.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Alpha(startAlpha=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", endAlpha=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C0HUY(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }
}
