package X;

/* JADX INFO: renamed from: X.0SWz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722830SWz {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C722830SWz)) {
            return false;
        }
        C722830SWz c722830SWz = (C722830SWz) obj;
        return Float.compare(this.LIZ, c722830SWz.LIZ) == 0 && Float.compare(this.LIZIZ, c722830SWz.LIZIZ) == 0 && Float.compare(this.LIZJ, c722830SWz.LIZJ) == 0 && Float.compare(this.LIZLLL, c722830SWz.LIZLLL) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MagnifierPlacement(sourceX=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sourceY=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", centerX=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", centerY=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public C722830SWz(float f, float f2, float f3, float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
    }
}
