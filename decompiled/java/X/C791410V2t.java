package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.0V2t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791410V2t {
    public final long[] LIZ = new long[4];

    public final boolean LIZIZ() {
        long[] jArr = this.LIZ;
        return jArr[0] - jArr[2] > 100;
    }

    public final void LIZ(long j) {
        long[] jArr = this.LIZ;
        if (jArr[0] == 0) {
            jArr[0] = SystemClock.uptimeMillis();
        }
        long[] jArr2 = this.LIZ;
        jArr2[1] = jArr2[1] + 1;
        if (j < jArr2[2]) {
            jArr2[2] = j;
        }
        if (j > jArr2[3]) {
            jArr2[3] = j;
        }
    }
}
