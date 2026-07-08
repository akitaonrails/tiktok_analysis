package X;

/* JADX INFO: renamed from: X.0met, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404730met {
    public final long[] LIZ = new long[6];

    public final long LIZ(int i) {
        boolean z;
        long[] jArr = this.LIZ;
        boolean z2 = true;
        if (jArr.length <= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return -1L;
        }
        if (i >= 0 && i < jArr.length) {
            z2 = false;
        }
        if (z2) {
            return -2L;
        }
        long j = jArr[0];
        long j2 = jArr[i];
        if (j <= 0) {
            return -1L;
        }
        if (i <= 0) {
            return -2L;
        }
        return j2 - j;
    }
}
