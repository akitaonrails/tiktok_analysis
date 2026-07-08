package X;

/* JADX INFO: renamed from: X.13Ba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19968413Ba {
    public static final int LIZ(long j, long[] jArr) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else if (j < j2) {
                length = i2 - 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }
}
