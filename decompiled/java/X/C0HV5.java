package X;

/* JADX INFO: renamed from: X.0HV5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HV5 implements InterfaceC21640319mb {
    public final float LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HV5)) {
            return false;
        }
        C0HV5 c0hv5 = (C0HV5) obj;
        return Float.compare(this.LIZ, c0hv5.LIZ) == 0 && Float.compare(this.LIZIZ, c0hv5.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TranslationY(startY=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetY=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C0HV5(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }
}
