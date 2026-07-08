package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13BB, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13BB extends C13BC {
    public C13BB() {
        super(16);
    }

    public C13BB(int i) {
        super(i);
    }

    public final void LIZ(long j) {
        int i = this.LIZIZ + 1;
        long[] jArr = this.LIZ;
        if (jArr.length < i) {
            this.LIZ = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.LIZ;
        int i2 = this.LIZIZ;
        jArr2[i2] = j;
        this.LIZIZ = i2 + 1;
    }
}
