package X;

/* JADX INFO: renamed from: X.10tR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19389510tR {
    public final float LIZ;
    public final float LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19389510tR)) {
            return false;
        }
        C19389510tR c19389510tR = (C19389510tR) obj;
        return Float.compare(this.LIZ, c19389510tR.LIZ) == 0 && Float.compare(this.LIZIZ, c19389510tR.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvailableWindowSize(width=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C19389510tR(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f)));
        this.LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f2)));
    }
}
