package X;

import com.bytedance.bpea.transmit.StackManager;

/* JADX INFO: renamed from: X.0Wva, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838920Wva {
    public final Throwable[] LIZ;
    public int LIZIZ;
    public int LIZJ;

    public C838920Wva() {
        int i = StackManager.LIZ;
        this.LIZ = new Throwable[StackManager.LJ];
    }

    public final void LIZ(Throwable th) {
        int i;
        int i2 = StackManager.LJ;
        if (i2 > 0 && this.LIZIZ == i2) {
            int i3 = StackManager.LJFF;
            if (i3 != 0 && i3 < (i = StackManager.LJ)) {
                int i4 = i - 1;
                while (i3 < i4) {
                    Throwable[] thArr = this.LIZ;
                    int i5 = i3 + 1;
                    thArr[i3] = thArr[i5];
                    i3 = i5;
                }
                this.LIZ[this.LIZIZ - 1] = th;
            } else {
                int i6 = StackManager.LJ - 1;
                int i7 = 0;
                while (i7 < i6) {
                    Throwable[] thArr2 = this.LIZ;
                    int i8 = i7 + 1;
                    thArr2[i7] = thArr2[i8];
                    i7 = i8;
                }
                this.LIZ[this.LIZIZ - 1] = th;
            }
        } else {
            int i9 = this.LIZIZ;
            Throwable[] thArr3 = this.LIZ;
            if (i9 < thArr3.length) {
                thArr3[i9] = th;
                this.LIZIZ = i9 + 1;
            }
        }
        this.LIZJ++;
        StackManager.LJIIJJI++;
    }
}
