package X;

/* JADX INFO: renamed from: X.1DFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252831DFp implements Comparable<C2252831DFp> {
    public final byte[] LL;
    public final int LLILLJJLI;

    @Override // java.lang.Comparable
    public final int compareTo(C2252831DFp c2252831DFp) {
        int i;
        int i2 = this.LLILLJJLI & 15;
        int i3 = c2252831DFp.LLILLJJLI & 15;
        int i4 = 16;
        if (i2 == 0) {
            i = 16;
        } else {
            i = 0;
        }
        int i5 = i2 + i;
        if (i3 != 0) {
            i4 = 0;
        }
        return i5 - (i3 + i4);
    }

    public C2252831DFp(byte[] bArr, int i) {
        this.LL = bArr;
        this.LLILLJJLI = i;
    }
}
