package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.18dL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21328118dL {
    public final C21325918cz LIZ;
    public C21326918d9 LIZIZ;
    public C21328218dM LIZJ;
    public final C21328618dQ LIZLLL;
    public C21328718dR LJ;
    public final boolean LJFF;
    public boolean LJI;
    public C21326518d5 LJII;
    public boolean LJIIIIZZ;
    public InterfaceC1156870gD7 LJIIIZ;
    public final C21328518dP LJIIJ;
    public final C21328318dN LJIIJJI;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.18dP] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.18dN] */
    public C21328118dL(C21325918cz c21325918cz) {
        this.LIZ = c21325918cz;
        c21325918cz.getClass();
        this.LIZIZ = new C21326918d9();
        this.LIZJ = new C21328218dM();
        this.LIZLLL = new C21328618dQ();
        this.LJ = new C21328718dR(true);
        this.LJFF = c21325918cz.LIZ.LJJJJ;
        this.LJIIIIZZ = true;
        this.LJIIJ = new InterfaceC21327918dJ() { // from class: X.18dP
            @Override // X.InterfaceC21327918dJ
            public final void onStart() {
                C21328118dL c21328118dL = this.LIZ;
                if (c21328118dL.LJI) {
                    return;
                }
                C21328118dL c21328118dL2 = this.LIZ;
                c21328118dL.LJ = new C21328718dR(c21328118dL2.LJIIIIZZ);
                c21328118dL2.LJ.LIZIZ = System.currentTimeMillis();
                C21325918cz c21325918cz2 = this.LIZ.LIZ;
                c21325918cz2.LJIL = 0;
                c21325918cz2.LJJ = 0;
            }

            @Override // X.InterfaceC21327918dJ
            public final void LIZ(boolean z) {
                C21328118dL c21328118dL = this.LIZ;
                if (c21328118dL.LJI) {
                    if (z) {
                        c21328118dL.LJI = false;
                        return;
                    }
                    return;
                }
                c21328118dL.LJ.LIZJ = System.currentTimeMillis();
                C21328118dL c21328118dL2 = this.LIZ;
                C21328718dR c21328718dR = c21328118dL2.LJ;
                C21325918cz c21325918cz2 = c21328118dL2.LIZ;
                C21326718d7 c21326718d7 = c21325918cz2.LIZ;
                c21328718dR.LJFF = c21326718d7.LJJ;
                c21328718dR.LJ = c21326718d7.LJIL;
                c21328718dR.LJI = c21325918cz2.LJIL;
                c21328718dR.LJII = c21325918cz2.LJJ;
                c21328718dR.LIZLLL = z;
                if (c21328118dL2.LJFF) {
                    long j = c21328718dR.LIZJ - c21328718dR.LIZIZ;
                    if (z) {
                        C21328218dM c21328218dM = c21328118dL2.LIZJ;
                        c21328218dM.LJIJI = j;
                        c21328218dM.LIZIZ = Long.valueOf(System.currentTimeMillis());
                        C21328118dL c21328118dL3 = this.LIZ;
                        C21328218dM c21328218dM2 = c21328118dL3.LIZJ;
                        Object obj = c21328118dL3.LJII;
                        if (obj == null) {
                            obj = new Object();
                        }
                        c21328218dM2.LIZJ(C21323718cd.LIZ(obj));
                        return;
                    }
                    c21328118dL2.LIZJ.LJIJ = j;
                    return;
                }
                Object obj2 = c21328118dL2.LJII;
                if (obj2 == null) {
                    obj2 = new Object();
                }
                c21328718dR.LIZJ(C21323718cd.LIZ(obj2));
            }
        };
        this.LJIIJJI = new InterfaceC21328018dK() { // from class: X.18dN
            @Override // X.InterfaceC21328018dK
            public final void onEnd() {
                Long l;
                C21328118dL c21328118dL = this.LIZ;
                if (c21328118dL.LJI) {
                    return;
                }
                c21328118dL.LIZLLL.LJJIIZ = System.currentTimeMillis();
                C21328118dL c21328118dL2 = this.LIZ;
                C21328618dQ c21328618dQ = c21328118dL2.LIZLLL;
                c21328618dQ.LJJIIJ = c21328618dQ.LJJIIZ - c21328618dQ.LJJIIJZLJL;
                if (c21328118dL2.LJIIIIZZ && (l = c21328118dL2.LIZIZ.LIZIZ) != null) {
                    long jLongValue = l.longValue();
                    C21328618dQ c21328618dQ2 = c21328118dL2.LIZLLL;
                    c21328618dQ2.LJJIIZI = c21328618dQ2.LJJIIZ - jLongValue;
                }
                C21328118dL c21328118dL3 = this.LIZ;
                C21328618dQ c21328618dQ3 = c21328118dL3.LIZLLL;
                C21328218dM c21328218dM = c21328118dL3.LIZJ;
                c21328618dQ3.getClass();
                c21328618dQ3.LIZ = c21328218dM.LIZ;
                c21328618dQ3.LIZIZ = c21328218dM.LIZIZ;
                c21328618dQ3.LIZJ = c21328218dM.LIZJ;
                c21328618dQ3.LIZLLL = c21328218dM.LIZLLL;
                c21328618dQ3.LJ = c21328218dM.LJ;
                c21328618dQ3.LJFF = c21328218dM.LJFF;
                c21328618dQ3.LJI = c21328218dM.LJI;
                c21328618dQ3.LJII = c21328218dM.LJII;
                c21328618dQ3.LJIIIIZZ = c21328218dM.LJIIIIZZ;
                c21328618dQ3.LJIIIZ = c21328218dM.LJIIIZ;
                c21328618dQ3.LJIIJ = c21328218dM.LJIIJ;
                c21328618dQ3.LJIILLIIL = c21328218dM.LJIILLIIL;
                c21328618dQ3.LJIIJJI = c21328218dM.LJIIJJI;
                c21328618dQ3.LJIIL = c21328218dM.LJIIL;
                c21328618dQ3.LJIILIIL = c21328218dM.LJIILIIL;
                c21328618dQ3.LJIJ = c21328218dM.LJIJ;
                c21328618dQ3.LJIJI = c21328218dM.LJIJI;
                c21328618dQ3.LJIJJ = c21328218dM.LJIJJ;
                c21328618dQ3.LJIJJLI = c21328218dM.LJIJJLI;
                c21328618dQ3.LJIL = c21328218dM.LJIL;
                c21328618dQ3.LJJ = c21328218dM.LJJ;
                c21328618dQ3.LJJI = c21328218dM.LJJI;
                c21328618dQ3.LJIILJJIL = c21328218dM.LJIILJJIL;
                c21328618dQ3.LJIILL = c21328218dM.LJIILL;
                c21328618dQ3.LJIIZILJ = c21328218dM.LJIIZILJ;
                c21328618dQ3.LJJIFFI = c21328218dM.LJJIFFI;
                c21328618dQ3.LJJII = c21328218dM.LJJII;
                c21328618dQ3.LJJIII = c21328218dM.LJJIII;
                C21328118dL c21328118dL4 = this.LIZ;
                if (c21328118dL4.LJIIIIZZ) {
                    InterfaceC1156870gD7 interfaceC1156870gD7 = c21328118dL4.LJIIIZ;
                    if (interfaceC1156870gD7 != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.putAll(c21328118dL4.LIZIZ.LIZLLL());
                        linkedHashMap.putAll(c21328118dL4.LIZLLL.LIZLLL());
                        interfaceC1156870gD7.LIZ(linkedHashMap);
                    }
                } else {
                    InterfaceC1156870gD7 interfaceC1156870gD72 = c21328118dL4.LJIIIZ;
                    if (interfaceC1156870gD72 != null) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.putAll(c21328118dL4.LIZLLL.LIZLLL());
                        interfaceC1156870gD72.LIZIZ(linkedHashMap2);
                    }
                }
                C21328118dL c21328118dL5 = this.LIZ;
                C21328618dQ c21328618dQ4 = c21328118dL5.LIZLLL;
                Object obj = c21328118dL5.LJII;
                if (obj == null) {
                    obj = new Object();
                }
                c21328618dQ4.LIZJ(C21323718cd.LIZ(obj));
            }

            @Override // X.InterfaceC21328018dK
            public final void onStart() {
                C21328118dL c21328118dL = this.LIZ;
                if (c21328118dL.LJI) {
                    return;
                }
                c21328118dL.LIZLLL.LJJIIJZLJL = System.currentTimeMillis();
            }
        };
    }

    public final Map LIZIZ(Throwable th, boolean z) {
        boolean z2;
        this.LIZJ.LIZIZ = Long.valueOf(System.currentTimeMillis());
        this.LIZJ.LIZJ = System.currentTimeMillis();
        C21328218dM c21328218dM = this.LIZJ;
        if (th == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        c21328218dM.LJJIFFI = z2;
        if (th != null) {
            c21328218dM.LJJII = 1001;
            c21328218dM.LJJIII = C1325860kbg.LJI(th);
        }
        c21328218dM.LIZLLL = z;
        if (!this.LJFF) {
            Object obj = this.LJII;
            if (obj == null) {
                obj = new Object();
            }
            c21328218dM.LIZJ(C21323718cd.LIZ(obj));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            linkedHashMap.putAll(this.LIZIZ.LIZLLL());
        }
        linkedHashMap.putAll(c21328218dM.LIZLLL());
        return linkedHashMap;
    }

    public final void LIZ(long j, long j2, long j3, boolean z) {
        C21328218dM c21328218dM = this.LIZJ;
        c21328218dM.LJJ++;
        if (z) {
            c21328218dM.LJJI++;
        }
        c21328218dM.LJIJJ += j;
        c21328218dM.LJIJJLI += j2;
        c21328218dM.LJIL += j3;
    }
}
