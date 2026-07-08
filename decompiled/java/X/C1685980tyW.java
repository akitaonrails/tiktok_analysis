package X;

/* JADX INFO: renamed from: X.0tyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685980tyW {
    public static final C20029713Yp<C1685930tyR> LIZ;

    static {
        C1E02 c1e02 = C1E04.LJ;
        int i = c1e02.LIZJ;
        C1686030tyb c1686030tyb = new C1686030tyb(c1e02);
        int i2 = c1e02.LIZJ;
        C1E07 c1e07 = C1E04.LJJ;
        int i3 = i2 | (c1e07.LIZJ << 6);
        C1685930tyR c1685930tyR = new C1685930tyR(c1e02, c1e07, 0);
        int i4 = c1e07.LIZJ | (c1e02.LIZJ << 6);
        C1685930tyR c1685930tyR2 = new C1685930tyR(c1e07, c1e02, 0);
        C20029713Yp c20029713Yp = C1685990tyX.LIZ;
        C20029713Yp<C1685930tyR> c20029713Yp2 = new C20029713Yp<>(6);
        c20029713Yp2.LJII(i | (i << 6), c1686030tyb);
        c20029713Yp2.LJII(i3, c1685930tyR);
        c20029713Yp2.LJII(i4, c1685930tyR2);
        LIZ = c20029713Yp2;
    }
}
