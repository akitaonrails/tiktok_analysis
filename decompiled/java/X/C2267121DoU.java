package X;

import java.util.HashSet;

/* JADX INFO: renamed from: X.1DoU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2267121DoU {
    public static final C2267311Don LIZ = new C2267311Don();

    public static boolean LIZ(C2267081DoQ c2267081DoQ) {
        boolean z;
        boolean z2;
        EnumC2266981DoG enumC2266981DoG;
        EnumC2266981DoG enumC2266981DoG2;
        EnumC2266981DoG[] enumC2266981DoGArr = c2267081DoQ.LJJJJ;
        EnumC2266981DoG enumC2266981DoG3 = enumC2266981DoGArr[0];
        EnumC2266981DoG enumC2266981DoG4 = enumC2266981DoGArr[1];
        C2267271Doj c2267271Doj = c2267081DoQ.LJJJJI;
        EnumC2266981DoG enumC2266981DoG5 = EnumC2266981DoG.FIXED;
        if (enumC2266981DoG3 == enumC2266981DoG5 || c2267081DoQ.LJIJJLI() || enumC2266981DoG3 == EnumC2266981DoG.WRAP_CONTENT || ((enumC2266981DoG3 == (enumC2266981DoG2 = EnumC2266981DoG.MATCH_CONSTRAINT) && c2267081DoQ.LJIJ == 0 && c2267081DoQ.LJJJJJL == 0.0f && c2267081DoQ.LJIILJJIL(0)) || (enumC2266981DoG3 == enumC2266981DoG2 && c2267081DoQ.LJIJ == 1 && c2267081DoQ.LJIILL(0, c2267081DoQ.LJIIJJI())))) {
            z = true;
        } else {
            z = false;
        }
        if (enumC2266981DoG4 == enumC2266981DoG5 || c2267081DoQ.LJIL() || enumC2266981DoG4 == EnumC2266981DoG.WRAP_CONTENT || ((enumC2266981DoG4 == (enumC2266981DoG = EnumC2266981DoG.MATCH_CONSTRAINT) && c2267081DoQ.LJIJI == 0 && c2267081DoQ.LJJJJJL == 0.0f && c2267081DoQ.LJIILJJIL(1)) || (enumC2266981DoG4 == enumC2266981DoG && c2267081DoQ.LJIJI == 1 && c2267081DoQ.LJIILL(1, c2267081DoQ.LJIIIIZZ())))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c2267081DoQ.LJJJJJL > 0.0f) {
            if (!z && !z2) {
                return false;
            }
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(int i, C2267081DoQ c2267081DoQ, InterfaceC2267341Doq interfaceC2267341Doq) {
        boolean z;
        C2267141DoW c2267141DoW;
        C2267141DoW c2267141DoW2;
        boolean z2;
        C2267141DoW c2267141DoW3;
        C2267141DoW c2267141DoW4;
        if (c2267081DoQ.LJIILJJIL) {
            return;
        }
        if (!(c2267081DoQ instanceof C2267091DoR) && c2267081DoQ.LJIJJ() && LIZ(c2267081DoQ)) {
            C2267091DoR.LJJIJLIJ(c2267081DoQ, interfaceC2267341Doq, new C2267311Don());
        }
        C2267141DoW c2267141DoWLJI = c2267081DoQ.LJI(EnumC2266931DoB.LEFT);
        C2267141DoW c2267141DoWLJI2 = c2267081DoQ.LJI(EnumC2266931DoB.RIGHT);
        int iLIZJ = c2267141DoWLJI.LIZJ();
        int iLIZJ2 = c2267141DoWLJI2.LIZJ();
        HashSet<C2267141DoW> hashSet = c2267141DoWLJI.LIZ;
        char c = 0;
        if (hashSet != null && c2267141DoWLJI.LIZJ) {
            for (C2267141DoW c2267141DoW5 : hashSet) {
                C2267081DoQ c2267081DoQ2 = c2267141DoW5.LIZLLL;
                int i2 = i + 1;
                boolean zLIZ = LIZ(c2267081DoQ2);
                if (c2267081DoQ2.LJIJJ() && zLIZ) {
                    C2267091DoR.LJJIJLIJ(c2267081DoQ2, interfaceC2267341Doq, new C2267311Don());
                }
                C2267141DoW c2267141DoW6 = c2267081DoQ2.LJJIJ;
                if ((c2267141DoW5 == c2267141DoW6 && (c2267141DoW4 = c2267081DoQ2.LJJIJIIJIL.LJFF) != null && c2267141DoW4.LIZJ) || (c2267141DoW5 == c2267081DoQ2.LJJIJIIJIL && (c2267141DoW3 = c2267141DoW6.LJFF) != null && c2267141DoW3.LIZJ)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                EnumC2266981DoG enumC2266981DoG = c2267081DoQ2.LJJJJ[c];
                EnumC2266981DoG enumC2266981DoG2 = EnumC2266981DoG.MATCH_CONSTRAINT;
                if (enumC2266981DoG == enumC2266981DoG2 && !zLIZ) {
                    if (enumC2266981DoG == enumC2266981DoG2 && c2267081DoQ2.LJIL >= 0 && c2267081DoQ2.LJIJJLI >= 0 && ((c2267081DoQ2.LJJL == 8 || (c2267081DoQ2.LJIJ == 0 && c2267081DoQ2.LJJJJJL == 0.0f)) && !c2267081DoQ2.LJIJ() && z2 && !c2267081DoQ2.LJIJ())) {
                        LIZLLL(i2, c2267081DoQ, interfaceC2267341Doq, c2267081DoQ2);
                    }
                } else if (!c2267081DoQ2.LJIJJ()) {
                    C2267141DoW c2267141DoW7 = c2267081DoQ2.LJJIJ;
                    if (c2267141DoW5 == c2267141DoW7 && c2267081DoQ2.LJJIJIIJIL.LJFF == null) {
                        int iLIZLLL = c2267141DoW7.LIZLLL() + iLIZJ;
                        c2267081DoQ2.LJJII(iLIZLLL, c2267081DoQ2.LJIIJJI() + iLIZLLL);
                        LIZIZ(i2, c2267081DoQ2, interfaceC2267341Doq);
                    } else {
                        C2267141DoW c2267141DoW8 = c2267081DoQ2.LJJIJIIJIL;
                        if (c2267141DoW5 == c2267141DoW8 && c2267141DoW7.LJFF == null) {
                            int iLIZLLL2 = iLIZJ - c2267141DoW8.LIZLLL();
                            c2267081DoQ2.LJJII(iLIZLLL2 - c2267081DoQ2.LJIIJJI(), iLIZLLL2);
                            LIZIZ(i2, c2267081DoQ2, interfaceC2267341Doq);
                        } else if (z2 && !c2267081DoQ2.LJIJ()) {
                            LIZJ(i2, c2267081DoQ2, interfaceC2267341Doq);
                        }
                    }
                }
                c = 0;
            }
        }
        if (c2267081DoQ instanceof C2267171DoZ) {
            return;
        }
        HashSet<C2267141DoW> hashSet2 = c2267141DoWLJI2.LIZ;
        if (hashSet2 != null && c2267141DoWLJI2.LIZJ) {
            for (C2267141DoW c2267141DoW9 : hashSet2) {
                C2267081DoQ c2267081DoQ3 = c2267141DoW9.LIZLLL;
                int i3 = i + 1;
                boolean zLIZ2 = LIZ(c2267081DoQ3);
                if (c2267081DoQ3.LJIJJ() && zLIZ2) {
                    C2267091DoR.LJJIJLIJ(c2267081DoQ3, interfaceC2267341Doq, new C2267311Don());
                }
                C2267141DoW c2267141DoW10 = c2267081DoQ3.LJJIJ;
                if ((c2267141DoW9 == c2267141DoW10 && (c2267141DoW2 = c2267081DoQ3.LJJIJIIJIL.LJFF) != null && c2267141DoW2.LIZJ) || (c2267141DoW9 == c2267081DoQ3.LJJIJIIJIL && (c2267141DoW = c2267141DoW10.LJFF) != null && c2267141DoW.LIZJ)) {
                    z = true;
                } else {
                    z = false;
                }
                EnumC2266981DoG enumC2266981DoG3 = c2267081DoQ3.LJJJJ[0];
                EnumC2266981DoG enumC2266981DoG4 = EnumC2266981DoG.MATCH_CONSTRAINT;
                if (enumC2266981DoG3 == enumC2266981DoG4 && !zLIZ2) {
                    if (enumC2266981DoG3 == enumC2266981DoG4 && c2267081DoQ3.LJIL >= 0 && c2267081DoQ3.LJIJJLI >= 0 && (c2267081DoQ3.LJJL == 8 || (c2267081DoQ3.LJIJ == 0 && c2267081DoQ3.LJJJJJL == 0.0f))) {
                        if (!c2267081DoQ3.LJIJ() && z && !c2267081DoQ3.LJIJ()) {
                            LIZLLL(i3, c2267081DoQ, interfaceC2267341Doq, c2267081DoQ3);
                        }
                    }
                } else if (!c2267081DoQ3.LJIJJ()) {
                    C2267141DoW c2267141DoW11 = c2267081DoQ3.LJJIJ;
                    if (c2267141DoW9 == c2267141DoW11 && c2267081DoQ3.LJJIJIIJIL.LJFF == null) {
                        int iLIZLLL3 = c2267141DoW11.LIZLLL() + iLIZJ2;
                        c2267081DoQ3.LJJII(iLIZLLL3, c2267081DoQ3.LJIIJJI() + iLIZLLL3);
                        LIZIZ(i3, c2267081DoQ3, interfaceC2267341Doq);
                    } else {
                        C2267141DoW c2267141DoW12 = c2267081DoQ3.LJJIJIIJIL;
                        if (c2267141DoW9 == c2267141DoW12 && c2267141DoW11.LJFF == null) {
                            int iLIZLLL4 = iLIZJ2 - c2267141DoW12.LIZLLL();
                            c2267081DoQ3.LJJII(iLIZLLL4 - c2267081DoQ3.LJIIJJI(), iLIZLLL4);
                            LIZIZ(i3, c2267081DoQ3, interfaceC2267341Doq);
                        } else if (z && !c2267081DoQ3.LJIJ()) {
                            LIZJ(i3, c2267081DoQ3, interfaceC2267341Doq);
                        }
                    }
                }
            }
        }
        c2267081DoQ.LJIILJJIL = true;
    }

    public static void LIZJ(int i, C2267081DoQ c2267081DoQ, InterfaceC2267341Doq interfaceC2267341Doq) {
        float f;
        float f2 = c2267081DoQ.LJJJLL;
        int iLIZJ = c2267081DoQ.LJJIJ.LJFF.LIZJ();
        int iLIZJ2 = c2267081DoQ.LJJIJIIJIL.LJFF.LIZJ();
        int iLIZLLL = c2267081DoQ.LJJIJ.LIZLLL() + iLIZJ;
        int iLIZLLL2 = iLIZJ2 - c2267081DoQ.LJJIJIIJIL.LIZLLL();
        if (iLIZJ == iLIZJ2) {
            f2 = 0.5f;
        } else {
            iLIZJ = iLIZLLL;
            iLIZJ2 = iLIZLLL2;
        }
        int iLJIIJJI = c2267081DoQ.LJIIJJI();
        int i2 = (iLIZJ2 - iLIZJ) - iLJIIJJI;
        if (iLIZJ > iLIZJ2) {
            i2 = (iLIZJ - iLIZJ2) - iLJIIJJI;
        }
        if (i2 > 0) {
            f = (f2 * i2) + 0.5f;
        } else {
            f = f2 * i2;
        }
        int i3 = ((int) f) + iLIZJ;
        int i4 = i3 + iLJIIJJI;
        if (iLIZJ > iLIZJ2) {
            i4 = i3 - iLJIIJJI;
        }
        c2267081DoQ.LJJII(i3, i4);
        LIZIZ(i + 1, c2267081DoQ, interfaceC2267341Doq);
    }

    public static void LJ(int i, C2267081DoQ c2267081DoQ, InterfaceC2267341Doq interfaceC2267341Doq) {
        float f;
        float f2 = c2267081DoQ.LJJJLZIJ;
        int iLIZJ = c2267081DoQ.LJJIJIIJI.LJFF.LIZJ();
        int iLIZJ2 = c2267081DoQ.LJJIJIL.LJFF.LIZJ();
        int iLIZLLL = c2267081DoQ.LJJIJIIJI.LIZLLL() + iLIZJ;
        int iLIZLLL2 = iLIZJ2 - c2267081DoQ.LJJIJIL.LIZLLL();
        if (iLIZJ == iLIZJ2) {
            f2 = 0.5f;
        } else {
            iLIZJ = iLIZLLL;
            iLIZJ2 = iLIZLLL2;
        }
        int iLJIIIIZZ = c2267081DoQ.LJIIIIZZ();
        int i2 = (iLIZJ2 - iLIZJ) - iLJIIIIZZ;
        if (iLIZJ > iLIZJ2) {
            i2 = (iLIZJ - iLIZJ2) - iLJIIIIZZ;
        }
        if (i2 > 0) {
            f = (f2 * i2) + 0.5f;
        } else {
            f = f2 * i2;
        }
        int i3 = (int) f;
        int i4 = iLIZJ + i3;
        int i5 = i4 + iLJIIIIZZ;
        if (iLIZJ > iLIZJ2) {
            i4 = iLIZJ - i3;
            i5 = i4 - iLJIIIIZZ;
        }
        c2267081DoQ.LJJIII(i4, i5);
        LJI(i + 1, c2267081DoQ, interfaceC2267341Doq);
    }

    public static void LJI(int i, C2267081DoQ c2267081DoQ, InterfaceC2267341Doq interfaceC2267341Doq) {
        boolean z;
        C2267141DoW c2267141DoW;
        C2267141DoW c2267141DoW2;
        boolean z2;
        C2267141DoW c2267141DoW3;
        C2267141DoW c2267141DoW4;
        if (c2267081DoQ.LJIILL) {
            return;
        }
        if (!(c2267081DoQ instanceof C2267091DoR) && c2267081DoQ.LJIJJ() && LIZ(c2267081DoQ)) {
            C2267091DoR.LJJIJLIJ(c2267081DoQ, interfaceC2267341Doq, new C2267311Don());
        }
        C2267141DoW c2267141DoWLJI = c2267081DoQ.LJI(EnumC2266931DoB.TOP);
        C2267141DoW c2267141DoWLJI2 = c2267081DoQ.LJI(EnumC2266931DoB.BOTTOM);
        int iLIZJ = c2267141DoWLJI.LIZJ();
        int iLIZJ2 = c2267141DoWLJI2.LIZJ();
        HashSet<C2267141DoW> hashSet = c2267141DoWLJI.LIZ;
        if (hashSet != null && c2267141DoWLJI.LIZJ) {
            for (C2267141DoW c2267141DoW5 : hashSet) {
                C2267081DoQ c2267081DoQ2 = c2267141DoW5.LIZLLL;
                int i2 = i + 1;
                boolean zLIZ = LIZ(c2267081DoQ2);
                if (c2267081DoQ2.LJIJJ() && zLIZ) {
                    C2267091DoR.LJJIJLIJ(c2267081DoQ2, interfaceC2267341Doq, new C2267311Don());
                }
                C2267141DoW c2267141DoW6 = c2267081DoQ2.LJJIJIIJI;
                if ((c2267141DoW5 == c2267141DoW6 && (c2267141DoW4 = c2267081DoQ2.LJJIJIL.LJFF) != null && c2267141DoW4.LIZJ) || (c2267141DoW5 == c2267081DoQ2.LJJIJIL && (c2267141DoW3 = c2267141DoW6.LJFF) != null && c2267141DoW3.LIZJ)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                EnumC2266981DoG enumC2266981DoG = c2267081DoQ2.LJJJJ[1];
                EnumC2266981DoG enumC2266981DoG2 = EnumC2266981DoG.MATCH_CONSTRAINT;
                if (enumC2266981DoG == enumC2266981DoG2 && !zLIZ) {
                    if (enumC2266981DoG == enumC2266981DoG2 && c2267081DoQ2.LJJIFFI >= 0 && c2267081DoQ2.LJJI >= 0 && (c2267081DoQ2.LJJL == 8 || (c2267081DoQ2.LJIJI == 0 && c2267081DoQ2.LJJJJJL == 0.0f))) {
                        if (!c2267081DoQ2.LJIJI() && z2 && !c2267081DoQ2.LJIJI()) {
                            LJFF(i2, c2267081DoQ, interfaceC2267341Doq, c2267081DoQ2);
                        }
                    }
                } else if (!c2267081DoQ2.LJIJJ()) {
                    C2267141DoW c2267141DoW7 = c2267081DoQ2.LJJIJIIJI;
                    if (c2267141DoW5 == c2267141DoW7 && c2267081DoQ2.LJJIJIL.LJFF == null) {
                        int iLIZLLL = c2267141DoW7.LIZLLL() + iLIZJ;
                        c2267081DoQ2.LJJIII(iLIZLLL, c2267081DoQ2.LJIIIIZZ() + iLIZLLL);
                        LJI(i2, c2267081DoQ2, interfaceC2267341Doq);
                    } else {
                        C2267141DoW c2267141DoW8 = c2267081DoQ2.LJJIJIL;
                        if (c2267141DoW5 == c2267141DoW8 && c2267141DoW7.LJFF == null) {
                            int iLIZLLL2 = iLIZJ - c2267141DoW8.LIZLLL();
                            c2267081DoQ2.LJJIII(iLIZLLL2 - c2267081DoQ2.LJIIIIZZ(), iLIZLLL2);
                            LJI(i2, c2267081DoQ2, interfaceC2267341Doq);
                        } else if (z2 && !c2267081DoQ2.LJIJI()) {
                            LJ(i2, c2267081DoQ2, interfaceC2267341Doq);
                        }
                    }
                }
            }
        }
        if (c2267081DoQ instanceof C2267171DoZ) {
            return;
        }
        HashSet<C2267141DoW> hashSet2 = c2267141DoWLJI2.LIZ;
        if (hashSet2 != null && c2267141DoWLJI2.LIZJ) {
            for (C2267141DoW c2267141DoW9 : hashSet2) {
                C2267081DoQ c2267081DoQ3 = c2267141DoW9.LIZLLL;
                int i3 = i + 1;
                boolean zLIZ2 = LIZ(c2267081DoQ3);
                if (c2267081DoQ3.LJIJJ() && zLIZ2) {
                    C2267091DoR.LJJIJLIJ(c2267081DoQ3, interfaceC2267341Doq, new C2267311Don());
                }
                C2267141DoW c2267141DoW10 = c2267081DoQ3.LJJIJIIJI;
                if ((c2267141DoW9 == c2267141DoW10 && (c2267141DoW2 = c2267081DoQ3.LJJIJIL.LJFF) != null && c2267141DoW2.LIZJ) || (c2267141DoW9 == c2267081DoQ3.LJJIJIL && (c2267141DoW = c2267141DoW10.LJFF) != null && c2267141DoW.LIZJ)) {
                    z = true;
                } else {
                    z = false;
                }
                EnumC2266981DoG enumC2266981DoG3 = c2267081DoQ3.LJJJJ[1];
                EnumC2266981DoG enumC2266981DoG4 = EnumC2266981DoG.MATCH_CONSTRAINT;
                if (enumC2266981DoG3 == enumC2266981DoG4 && !zLIZ2) {
                    if (enumC2266981DoG3 == enumC2266981DoG4 && c2267081DoQ3.LJJIFFI >= 0 && c2267081DoQ3.LJJI >= 0 && (c2267081DoQ3.LJJL == 8 || (c2267081DoQ3.LJIJI == 0 && c2267081DoQ3.LJJJJJL == 0.0f))) {
                        if (!c2267081DoQ3.LJIJI() && z && !c2267081DoQ3.LJIJI()) {
                            LJFF(i3, c2267081DoQ, interfaceC2267341Doq, c2267081DoQ3);
                        }
                    }
                } else if (!c2267081DoQ3.LJIJJ()) {
                    C2267141DoW c2267141DoW11 = c2267081DoQ3.LJJIJIIJI;
                    if (c2267141DoW9 == c2267141DoW11 && c2267081DoQ3.LJJIJIL.LJFF == null) {
                        int iLIZLLL3 = c2267141DoW11.LIZLLL() + iLIZJ2;
                        c2267081DoQ3.LJJIII(iLIZLLL3, c2267081DoQ3.LJIIIIZZ() + iLIZLLL3);
                        LJI(i3, c2267081DoQ3, interfaceC2267341Doq);
                    } else {
                        C2267141DoW c2267141DoW12 = c2267081DoQ3.LJJIJIL;
                        if (c2267141DoW9 == c2267141DoW12 && c2267141DoW11.LJFF == null) {
                            int iLIZLLL4 = iLIZJ2 - c2267141DoW12.LIZLLL();
                            c2267081DoQ3.LJJIII(iLIZLLL4 - c2267081DoQ3.LJIIIIZZ(), iLIZLLL4);
                            LJI(i3, c2267081DoQ3, interfaceC2267341Doq);
                        } else if (z && !c2267081DoQ3.LJIJI()) {
                            LJ(i3, c2267081DoQ3, interfaceC2267341Doq);
                        }
                    }
                }
            }
        }
        C2267141DoW c2267141DoWLJI3 = c2267081DoQ.LJI(EnumC2266931DoB.BASELINE);
        if (c2267141DoWLJI3.LIZ != null && c2267141DoWLJI3.LIZJ) {
            int iLIZJ3 = c2267141DoWLJI3.LIZJ();
            for (C2267141DoW c2267141DoW13 : c2267141DoWLJI3.LIZ) {
                C2267081DoQ c2267081DoQ4 = c2267141DoW13.LIZLLL;
                int i4 = i + 1;
                boolean zLIZ3 = LIZ(c2267081DoQ4);
                if (c2267081DoQ4.LJIJJ() && zLIZ3) {
                    C2267091DoR.LJJIJLIJ(c2267081DoQ4, interfaceC2267341Doq, new C2267311Don());
                }
                if (c2267081DoQ4.LJJJJ[1] != EnumC2266981DoG.MATCH_CONSTRAINT || zLIZ3) {
                    if (!c2267081DoQ4.LJIJJ() && c2267141DoW13 == c2267081DoQ4.LJJIJL) {
                        int iLIZLLL5 = c2267141DoW13.LIZLLL() + iLIZJ3;
                        if (c2267081DoQ4.LJJIIZI) {
                            int i5 = iLIZLLL5 - c2267081DoQ4.LJJJJZ;
                            int i6 = c2267081DoQ4.LJJJJJ + i5;
                            c2267081DoQ4.LJJJJLL = i5;
                            c2267081DoQ4.LJJIJIIJI.LJIIIIZZ(i5);
                            c2267081DoQ4.LJJIJIL.LJIIIIZZ(i6);
                            c2267081DoQ4.LJJIJL.LJIIIIZZ(iLIZLLL5);
                            c2267081DoQ4.LJIILIIL = true;
                        }
                        LJI(i4, c2267081DoQ4, interfaceC2267341Doq);
                    }
                }
            }
        }
        c2267081DoQ.LJIILL = true;
    }

    public static void LIZLLL(int i, C2267081DoQ c2267081DoQ, InterfaceC2267341Doq interfaceC2267341Doq, C2267081DoQ c2267081DoQ2) {
        int iLJIIJJI;
        float f = c2267081DoQ2.LJJJLL;
        int iLIZJ = c2267081DoQ2.LJJIJ.LJFF.LIZJ() + c2267081DoQ2.LJJIJ.LIZLLL();
        int iLIZJ2 = c2267081DoQ2.LJJIJIIJIL.LJFF.LIZJ() - c2267081DoQ2.LJJIJIIJIL.LIZLLL();
        if (iLIZJ2 >= iLIZJ) {
            int iLJIIJJI2 = c2267081DoQ2.LJIIJJI();
            if (c2267081DoQ2.LJJL != 8) {
                int i2 = c2267081DoQ2.LJIJ;
                if (i2 == 2) {
                    if (c2267081DoQ instanceof C2267091DoR) {
                        iLJIIJJI = c2267081DoQ.LJIIJJI();
                    } else {
                        iLJIIJJI = c2267081DoQ.LJJJJI.LJIIJJI();
                    }
                    iLJIIJJI2 = (int) (c2267081DoQ2.LJJJLL * 0.5f * iLJIIJJI);
                } else if (i2 == 0) {
                    iLJIIJJI2 = iLIZJ2 - iLIZJ;
                }
                iLJIIJJI2 = Math.max(c2267081DoQ2.LJIJJLI, iLJIIJJI2);
                int i3 = c2267081DoQ2.LJIL;
                if (i3 > 0) {
                    iLJIIJJI2 = Math.min(i3, iLJIIJJI2);
                }
            }
            int i4 = iLIZJ + ((int) ((f * ((iLIZJ2 - iLIZJ) - iLJIIJJI2)) + 0.5f));
            c2267081DoQ2.LJJII(i4, iLJIIJJI2 + i4);
            LIZIZ(i + 1, c2267081DoQ2, interfaceC2267341Doq);
        }
    }

    public static void LJFF(int i, C2267081DoQ c2267081DoQ, InterfaceC2267341Doq interfaceC2267341Doq, C2267081DoQ c2267081DoQ2) {
        int iLJIIIIZZ;
        float f = c2267081DoQ2.LJJJLZIJ;
        int iLIZJ = c2267081DoQ2.LJJIJIIJI.LJFF.LIZJ() + c2267081DoQ2.LJJIJIIJI.LIZLLL();
        int iLIZJ2 = c2267081DoQ2.LJJIJIL.LJFF.LIZJ() - c2267081DoQ2.LJJIJIL.LIZLLL();
        if (iLIZJ2 >= iLIZJ) {
            int iLJIIIIZZ2 = c2267081DoQ2.LJIIIIZZ();
            if (c2267081DoQ2.LJJL != 8) {
                int i2 = c2267081DoQ2.LJIJI;
                if (i2 == 2) {
                    if (c2267081DoQ instanceof C2267091DoR) {
                        iLJIIIIZZ = c2267081DoQ.LJIIIIZZ();
                    } else {
                        iLJIIIIZZ = c2267081DoQ.LJJJJI.LJIIIIZZ();
                    }
                    iLJIIIIZZ2 = (int) (f * 0.5f * iLJIIIIZZ);
                } else if (i2 == 0) {
                    iLJIIIIZZ2 = iLIZJ2 - iLIZJ;
                }
                iLJIIIIZZ2 = Math.max(c2267081DoQ2.LJJI, iLJIIIIZZ2);
                int i3 = c2267081DoQ2.LJJIFFI;
                if (i3 > 0) {
                    iLJIIIIZZ2 = Math.min(i3, iLJIIIIZZ2);
                }
            }
            int i4 = iLIZJ + ((int) ((f * ((iLIZJ2 - iLIZJ) - iLJIIIIZZ2)) + 0.5f));
            c2267081DoQ2.LJJIII(i4, iLJIIIIZZ2 + i4);
            LJI(i + 1, c2267081DoQ2, interfaceC2267341Doq);
        }
    }
}
