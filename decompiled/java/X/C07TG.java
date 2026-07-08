package X;

/* JADX INFO: renamed from: X.07TG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07TG {
    public final float LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07TG)) {
            return false;
        }
        C07TG c07tg = (C07TG) obj;
        return Float.compare(this.LIZ, c07tg.LIZ) == 0 && Float.compare(this.LIZIZ, c07tg.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CardFrameState(afterWidth=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", afterAlpha=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C07TG(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }
}
