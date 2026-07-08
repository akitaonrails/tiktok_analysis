package X;

/* JADX INFO: renamed from: X.07Tf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1867707Tf {
    public final float LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1867707Tf)) {
            return false;
        }
        C1867707Tf c1867707Tf = (C1867707Tf) obj;
        return Float.compare(this.LIZ, c1867707Tf.LIZ) == 0 && this.LIZIZ == c1867707Tf.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WavePoint(target=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bornTs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public C1867707Tf(float f, long j) {
        this.LIZ = f;
        this.LIZIZ = j;
    }
}
