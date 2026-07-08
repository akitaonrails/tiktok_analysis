package X;

import android.content.Context;
import java.util.List;

/* JADX INFO: renamed from: X.0pmp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524970pmp {
    public final C1304160k2g LIZ;
    public final InterfaceC2220701Bvo LIZIZ;
    public final C21346018gE LIZJ;
    public final C1524360plq LIZLLL;
    public final C1524470pm1 LJ;
    public final C2219681BuA LJFF;
    public final C1522950pjZ LJI;
    public final C09U3 LJII;
    public final List<InterfaceC1304090k2Z> LJIIIIZZ;

    public final Context LIZ() {
        return this.LIZ.LIZ();
    }

    public C1524970pmp(C1304160k2g c1304160k2g) {
        InterfaceC2220701Bvo c2221081BwQ;
        this.LIZ = c1304160k2g;
        if (!c1304160k2g.LJIIIIZZ.fileMultithreadSwitch) {
            c2221081BwQ = new C2221091BwR(c1304160k2g);
        } else {
            c2221081BwQ = new C2221081BwQ(c1304160k2g);
        }
        this.LIZIZ = c2221081BwQ;
        C21346018gE c21346018gE = new C21346018gE(c1304160k2g);
        this.LIZJ = c21346018gE;
        C1524360plq c1524360plq = new C1524360plq();
        this.LIZLLL = c1524360plq;
        C1524470pm1 c1524470pm1 = new C1524470pm1(c1304160k2g);
        this.LJ = c1524470pm1;
        C2219681BuA c2219681BuA = new C2219681BuA(c1304160k2g);
        this.LJFF = c2219681BuA;
        C1522950pjZ c1522950pjZ = new C1522950pjZ(c1304160k2g);
        this.LJI = c1522950pjZ;
        C09U3 c09u3 = new C09U3();
        this.LJII = c09u3;
        this.LJIIIIZZ = C1697810uHb.LJIIJJI(c2221081BwQ, c21346018gE, c1524360plq, c1524470pm1, c2219681BuA, c1522950pjZ, c09u3);
    }
}
