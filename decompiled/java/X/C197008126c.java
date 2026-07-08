package X;

/* JADX INFO: renamed from: X.126c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197008126c {
    public int LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public final int[] LJ = new int[256];
    public final int[] LJFF = new int[256];
    public final int[] LJI = new int[256];
    public final int[] LJII = new int[32];
    public final int[][] LIZLLL = new int[256][];

    public C197008126c(byte[] bArr, int i, int i2) {
        this.LIZIZ = i;
        this.LIZJ = i2;
        int i3 = 0;
        do {
            this.LIZLLL[i3] = new int[]{i, i, i, 0};
            int i4 = (i3 << 12) / 256;
            this.LJI[i3] = 256;
            this.LJFF[i3] = 0;
            i3++;
        } while (i3 < 256);
    }
}
