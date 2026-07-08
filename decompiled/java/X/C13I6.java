package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13I6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13I6 extends C13IF<C13B4> {
    public short[] LIZ;
    public int LIZIZ;

    @Override // X.C13IF
    public final C13B4 LIZ() {
        return new C13B4(Arrays.copyOf(this.LIZ, this.LIZIZ));
    }

    @Override // X.C13IF
    public final int LIZLLL() {
        return this.LIZIZ;
    }

    public C13I6(short[] sArr) {
        this.LIZ = sArr;
        this.LIZIZ = sArr.length;
        LIZIZ(10);
    }

    @Override // X.C13IF
    public final void LIZIZ(int i) {
        short[] sArr = this.LIZ;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.LIZ = Arrays.copyOf(sArr, i);
        }
    }
}
