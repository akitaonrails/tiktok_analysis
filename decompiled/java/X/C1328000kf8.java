package X;

/* JADX INFO: renamed from: X.0kf8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328000kf8 {
    public final int LIZ;
    public final int LIZIZ;

    public final String toString() {
        Object[] objArr = new Object[2];
        int i = this.LIZ;
        objArr[0] = i == Integer.MAX_VALUE ? "" : Integer.toString(i);
        int i2 = this.LIZIZ;
        objArr[1] = i2 != Integer.MAX_VALUE ? Integer.toString(i2) : "";
        return C786410Ut5.k4(null, "%s-%s", objArr);
    }

    public final int hashCode() {
        return ((this.LIZ + 31) * 31) + this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1328000kf8)) {
            return false;
        }
        C1328000kf8 c1328000kf8 = (C1328000kf8) obj;
        if (this.LIZ == c1328000kf8.LIZ && this.LIZIZ == c1328000kf8.LIZIZ) {
            return true;
        }
        return false;
    }

    public C1328000kf8(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
