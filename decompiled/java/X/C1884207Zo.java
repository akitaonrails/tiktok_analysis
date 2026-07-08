package X;

/* JADX INFO: renamed from: X.07Zo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1884207Zo {
    public final float LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1884207Zo)) {
            return false;
        }
        C1884207Zo c1884207Zo = (C1884207Zo) obj;
        return Float.compare(this.LIZ, c1884207Zo.LIZ) == 0 && this.LIZIZ == c1884207Zo.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Sample(lux=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timestampMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public C1884207Zo(float f, long j) {
        this.LIZ = f;
        this.LIZIZ = j;
    }
}
