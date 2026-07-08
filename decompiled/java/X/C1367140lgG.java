package X;

/* JADX INFO: renamed from: X.0lgG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1367140lgG {
    public final EnumC1381990m4D LIZ;
    public final boolean LIZIZ;
    public final InterfaceC1367040lg6 LIZJ;
    public final InterfaceC1367160lgI LIZLLL;
    public final InterfaceC1367150lgH LJ;
    public final boolean LJFF;
    public final String LJI;

    public /* synthetic */ C1367140lgG() {
        this(EnumC1381990m4D.UNKNOWN, false, new InterfaceC1367040lg6() { // from class: X.0lgL
        }, new InterfaceC1367160lgI() { // from class: X.0lgJ
        }, new InterfaceC1367150lgH() { // from class: X.0lgN
        }, false, null);
    }

    public C1367140lgG(EnumC1381990m4D enumC1381990m4D, boolean z, InterfaceC1367040lg6 interfaceC1367040lg6, InterfaceC1367160lgI interfaceC1367160lgI, InterfaceC1367150lgH interfaceC1367150lgH, boolean z2, String str) {
        this.LIZ = enumC1381990m4D;
        this.LIZIZ = z;
        this.LIZJ = interfaceC1367040lg6;
        this.LIZLLL = interfaceC1367160lgI;
        this.LJ = interfaceC1367150lgH;
        this.LJFF = z2;
        this.LJI = str;
    }

    public static C1367140lgG LIZ(C1367140lgG c1367140lgG, EnumC1381990m4D enumC1381990m4D, boolean z, InterfaceC1367040lg6 interfaceC1367040lg6, InterfaceC1367160lgI interfaceC1367160lgI, InterfaceC1367150lgH interfaceC1367150lgH, boolean z2, String str, int i) {
        String str2 = str;
        boolean z3 = z2;
        InterfaceC1367150lgH interfaceC1367150lgH2 = interfaceC1367150lgH;
        InterfaceC1367160lgI interfaceC1367160lgI2 = interfaceC1367160lgI;
        InterfaceC1367040lg6 interfaceC1367040lg62 = interfaceC1367040lg6;
        boolean z4 = z;
        EnumC1381990m4D enumC1381990m4D2 = enumC1381990m4D;
        if ((i & 1) != 0) {
            enumC1381990m4D2 = c1367140lgG.LIZ;
        }
        if ((i & 2) != 0) {
            z4 = c1367140lgG.LIZIZ;
        }
        if ((i & 4) != 0) {
            interfaceC1367040lg62 = c1367140lgG.LIZJ;
        }
        if ((i & 8) != 0) {
            interfaceC1367160lgI2 = c1367140lgG.LIZLLL;
        }
        if ((i & 16) != 0) {
            interfaceC1367150lgH2 = c1367140lgG.LJ;
        }
        if ((i & 32) != 0) {
            z3 = c1367140lgG.LJFF;
        }
        if ((i & 64) != 0) {
            str2 = c1367140lgG.LJI;
        }
        c1367140lgG.getClass();
        return new C1367140lgG(enumC1381990m4D2, z4, interfaceC1367040lg62, interfaceC1367160lgI2, interfaceC1367150lgH2, z3, str2);
    }
}
