package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13I9, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13I9 extends C13IF<long[]> {
    public long[] LIZ;
    public int LIZIZ;

    @Override // X.C13IF
    public final long[] LIZ() {
        return Arrays.copyOf(this.LIZ, this.LIZIZ);
    }

    @Override // X.C13IF
    public final int LIZLLL() {
        return this.LIZIZ;
    }

    public C13I9(long[] jArr) {
        this.LIZ = jArr;
        this.LIZIZ = jArr.length;
        LIZIZ(10);
    }

    @Override // X.C13IF
    public final void LIZIZ(int i) {
        long[] jArr = this.LIZ;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.LIZ = Arrays.copyOf(jArr, i);
        }
    }
}
