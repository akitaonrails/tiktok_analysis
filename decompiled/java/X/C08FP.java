package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.08FP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08FP implements Comparable<C08FP>, Serializable {
    public static final long serialVersionUID = 7003130400674500845L;
    public final double mDownThreshold;
    public final double mRate;
    public final double mUpThreshold;

    public double getMedianThreshold() {
        return (this.mDownThreshold + this.mUpThreshold) / 2.0d;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.mRate);
        int i = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.mDownThreshold);
        int i2 = (i * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.mUpThreshold);
        return (i2 * 31) + ((int) ((jDoubleToLongBits3 >>> 32) ^ jDoubleToLongBits3));
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Shift{mRate=");
        sbLIZ.append(this.mRate);
        sbLIZ.append(", mDownThreshold=");
        sbLIZ.append(this.mDownThreshold);
        sbLIZ.append(", mUpThreshold=");
        sbLIZ.append(this.mUpThreshold);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public int compareTo(C08FP c08fp) {
        return Double.compare(this.mRate, c08fp.mRate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08FP)) {
            return false;
        }
        C08FP c08fp = (C08FP) obj;
        if (Double.compare(c08fp.mRate, this.mRate) == 0 && Double.compare(c08fp.mDownThreshold, this.mDownThreshold) == 0 && Double.compare(c08fp.mUpThreshold, this.mUpThreshold) == 0) {
            return true;
        }
        return false;
    }

    public C08FP(double d, double d2, double d3) {
        this.mRate = d;
        this.mDownThreshold = d2;
        this.mUpThreshold = d3;
    }
}
