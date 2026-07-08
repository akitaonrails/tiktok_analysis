package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13IA, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13IA extends C13IF<boolean[]> {
    public boolean[] LIZ;
    public int LIZIZ;

    @Override // X.C13IF
    public final boolean[] LIZ() {
        return Arrays.copyOf(this.LIZ, this.LIZIZ);
    }

    @Override // X.C13IF
    public final int LIZLLL() {
        return this.LIZIZ;
    }

    public C13IA(boolean[] zArr) {
        this.LIZ = zArr;
        this.LIZIZ = zArr.length;
        LIZIZ(10);
    }

    @Override // X.C13IF
    public final void LIZIZ(int i) {
        boolean[] zArr = this.LIZ;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.LIZ = Arrays.copyOf(zArr, i);
        }
    }
}
