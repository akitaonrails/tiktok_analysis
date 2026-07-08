package X;

/* JADX INFO: renamed from: X.0rz1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609410rz1 {
    public final boolean LIZ;
    public final EnumC992500bw0 LIZIZ;
    public final InterfaceC1609780rzc LIZJ;
    public final InterfaceC1609780rzc LIZLLL;
    public final boolean LJ;
    public final C1609450rz5 LJFF;

    public C1609410rz1() {
        this(false, null, null, null, null, 63);
    }

    public C1609410rz1(boolean z, EnumC992500bw0 enumC992500bw0, InterfaceC1609780rzc interfaceC1609780rzc, C438170HGd c438170HGd, C1609450rz5 c1609450rz5, int i) {
        z = (i & 1) != 0 ? true : z;
        enumC992500bw0 = (i & 2) != 0 ? EnumC992500bw0.OUTLINE_BORDER : enumC992500bw0;
        interfaceC1609780rzc = (i & 4) != 0 ? null : interfaceC1609780rzc;
        c438170HGd = (i & 8) != 0 ? null : c438170HGd;
        boolean z2 = (i & 16) != 0;
        c1609450rz5 = (i & 32) != 0 ? null : c1609450rz5;
        this.LIZ = z;
        this.LIZIZ = enumC992500bw0;
        this.LIZJ = interfaceC1609780rzc;
        this.LIZLLL = c438170HGd;
        this.LJ = z2;
        this.LJFF = c1609450rz5;
    }
}
