package X;

import com.google.gson.k;
import com.google.gson.n;

/* JADX INFO: renamed from: X.07R6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07R6 {
    public static final C01GW LIZ;
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static final C01GW LJ;
    public static final C01GW LJFF;
    public static final C01GW LJI;
    public static final C01GW LJII;
    public static final C01GW LJIIIIZZ;
    public static final C01GW LJIIIZ;
    public static final C01GW LJIIJ;
    public static final C01GW LJIIJJI;
    public static final C01GW LJIIL;
    public static final C01GW LJIILIIL;
    public static final C01GW LJIILJJIL;
    public static final C01GW LJIILL;
    public static final C01GW LJIILLIIL;
    public static final C01GW LJIIZILJ;
    public static final C01GW LJIJ;
    public static final C01GW LJIJI;
    public static final C01GW LJIJJ;

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        LIZ = C452501pT.LIZ(enumC452301pR, new C07RG());
        LIZIZ = C452501pT.LIZ(enumC452301pR, new C1925707gV());
        LIZJ = C452501pT.LIZ(enumC452301pR, new C07R0());
        LIZLLL = C452501pT.LIZ(enumC452301pR, new C07R2());
        LJ = C452501pT.LIZ(enumC452301pR, new C1925607gU());
        LJFF = C452501pT.LIZ(enumC452301pR, new C1925507gT());
        LJI = C452501pT.LIZ(enumC452301pR, new C07R4());
        LJII = C452501pT.LIZ(enumC452301pR, new C07RE());
        LJIIIIZZ = C452501pT.LIZ(enumC452301pR, new C07R5());
        LJIIIZ = C452501pT.LIZ(enumC452301pR, new C07R3());
        LJIIJ = C452501pT.LIZ(enumC452301pR, new C07RF());
        LJIIJJI = C452501pT.LIZ(enumC452301pR, new C07RD());
        LJIIL = C452501pT.LIZ(enumC452301pR, new C07RC());
        LJIILIIL = C452501pT.LIZ(enumC452301pR, new C07R1());
        LJIILJJIL = C452501pT.LIZ(enumC452301pR, new C1861807Qy());
        LJIILL = C452501pT.LIZ(enumC452301pR, new C1861907Qz());
        LJIILLIIL = C452501pT.LIZ(enumC452301pR, new C07RB());
        LJIIZILJ = C452501pT.LIZ(enumC452301pR, new C07RA());
        LJIJ = C452501pT.LIZ(enumC452301pR, new C07R9());
        LJIJI = C452501pT.LIZ(enumC452301pR, new C1861607Qw());
        LJIJJ = C452501pT.LIZ(enumC452301pR, new C1861707Qx());
    }

    public static final String LIZ(n nVar) {
        int iLJIIJJI;
        int iLJIIJJI2;
        int iLJIIJJI3;
        k kVarLJJIIZ;
        k kVarLJJIIZ2;
        k kVarLJJIIZ3;
        k kVarLJJIIZ4;
        k kVarLJJIIZ5;
        int iLJIIJJI4 = 2;
        if (nVar != null && (kVarLJJIIZ5 = nVar.LJJIIZ("min_open_timeout")) != null) {
            iLJIIJJI = kVarLJJIIZ5.LJIIJJI();
        } else {
            iLJIIJJI = 2;
        }
        int iLJIIJJI5 = 8;
        if (nVar != null && (kVarLJJIIZ4 = nVar.LJJIIZ("max_open_timeout")) != null) {
            iLJIIJJI2 = kVarLJJIIZ4.LJIIJJI();
        } else {
            iLJIIJJI2 = 8;
        }
        if (nVar != null && (kVarLJJIIZ3 = nVar.LJJIIZ("min_rw_timeout")) != null) {
            iLJIIJJI4 = kVarLJJIIZ3.LJIIJJI();
        }
        if (nVar != null && (kVarLJJIIZ2 = nVar.LJJIIZ("max_rw_timeout")) != null) {
            iLJIIJJI5 = kVarLJJIIZ2.LJIIJJI();
        }
        if (nVar != null && (kVarLJJIIZ = nVar.LJJIIZ("sample_internal")) != null) {
            iLJIIJJI3 = kVarLJJIIZ.LJIIJJI();
        } else {
            iLJIIJJI3 = 30;
        }
        n nVar2 = new n();
        nVar2.LJJIII(Integer.valueOf(iLJIIJJI), "min_open_timeout");
        nVar2.LJJIII(Integer.valueOf(iLJIIJJI2), "max_open_timeout");
        nVar2.LJJIII(Integer.valueOf(iLJIIJJI4), "min_rw_timeout");
        nVar2.LJJIII(Integer.valueOf(iLJIIJJI5), "max_rw_timeout");
        nVar2.LJJIII(Integer.valueOf(iLJIIJJI3), "sample_internal");
        return nVar2.toString();
    }
}
