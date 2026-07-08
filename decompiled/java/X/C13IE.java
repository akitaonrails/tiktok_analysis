package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13IE, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13IE extends C13IF<char[]> {
    public char[] LIZ;
    public int LIZIZ;

    @Override // X.C13IF
    public final char[] LIZ() {
        return Arrays.copyOf(this.LIZ, this.LIZIZ);
    }

    @Override // X.C13IF
    public final int LIZLLL() {
        return this.LIZIZ;
    }

    public C13IE(char[] cArr) {
        this.LIZ = cArr;
        this.LIZIZ = cArr.length;
        LIZIZ(10);
    }

    @Override // X.C13IF
    public final void LIZIZ(int i) {
        char[] cArr = this.LIZ;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.LIZ = Arrays.copyOf(cArr, i);
        }
    }
}
