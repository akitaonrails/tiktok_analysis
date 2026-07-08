package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13I3, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13I3 extends C13IF<C13BN> {
    public int[] LIZ;
    public int LIZIZ;

    @Override // X.C13IF
    public final C13BN LIZ() {
        return new C13BN(Arrays.copyOf(this.LIZ, this.LIZIZ));
    }

    @Override // X.C13IF
    public final int LIZLLL() {
        return this.LIZIZ;
    }

    public C13I3(int[] iArr) {
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
