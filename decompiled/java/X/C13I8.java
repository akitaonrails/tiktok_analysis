package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13I8, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13I8 extends C13IF<int[]> {
    public int[] LIZ;
    public int LIZIZ;

    @Override // X.C13IF
    public final int[] LIZ() {
        return Arrays.copyOf(this.LIZ, this.LIZIZ);
    }

    @Override // X.C13IF
    public final int LIZLLL() {
        return this.LIZIZ;
    }

    public C13I8(int[] iArr) {
        this.LIZ = iArr;
        this.LIZIZ = iArr.length;
        LIZIZ(10);
    }

    @Override // X.C13IF
    public final void LIZIZ(int i) {
        int[] iArr = this.LIZ;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.LIZ = Arrays.copyOf(iArr, i);
        }
    }
}
