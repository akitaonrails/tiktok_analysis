package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import p2.j1;

/* JADX INFO: renamed from: X.0u2D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688270u2D implements InterfaceC1688370u2N, InterfaceC1688100u1w {
    public final boolean LIZ = true;
    public final InterfaceC1672520tco LIZIZ;
    public final InterfaceC1688160u22 LIZJ;
    public final float LIZLLL;
    public final AbstractC1688180u24 LJ;
    public final float LJFF;
    public final int LJI;
    public final int LJII;
    public final C1688280u2E LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1688270u2D)) {
            return false;
        }
        C1688270u2D c1688270u2D = (C1688270u2D) obj;
        return this.LIZ == c1688270u2D.LIZ && Intrinsics.LJFF(this.LIZIZ, c1688270u2D.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1688270u2D.LIZJ) && C1668650tWZ.LIZJ(this.LIZLLL, c1688270u2D.LIZLLL) && Intrinsics.LJFF(this.LJ, c1688270u2D.LJ) && C1668650tWZ.LIZJ(this.LJFF, c1688270u2D.LJFF) && this.LJI == c1688270u2D.LJI && this.LJII == c1688270u2D.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1688270u2D.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlowMeasurePolicy(isHorizontal=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", horizontalArrangement=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", verticalArrangement=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mainAxisSpacing=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZLLL));
        sbLIZ.append(", crossAxisAlignment=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", crossAxisArrangementSpacing=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LJFF));
        sbLIZ.append(", maxItemsInMainAxis=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", maxLines=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", overflow=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ.hashCode();
    }

    @Override // X.InterfaceC1688100u1w
    public final boolean LJII() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1688100u1w, X.InterfaceC1688150u21
    public final int LJ(AbstractC1686530tzP abstractC1686530tzP) {
        if (LJII()) {
            return abstractC1686530tzP.LJJL();
        }
        return abstractC1686530tzP.LJJLI();
    }

    @Override // X.InterfaceC1688100u1w, X.InterfaceC1688150u21
    public final int LJI(AbstractC1686530tzP abstractC1686530tzP) {
        if (LJII()) {
            return abstractC1686530tzP.LJJLI();
        }
        return abstractC1686530tzP.LJJL();
    }

    @Override // X.InterfaceC1688370u2N
    public final int LIZ(j1 j1Var, List list, int i) {
        InterfaceC1676340tiy interfaceC1676340tiy;
        C1688280u2E c1688280u2E = this.LJIIIIZZ;
        List list2 = (List) C13LP.LJJJLZIJ(1, list);
        InterfaceC1676340tiy interfaceC1676340tiy2 = null;
        if (list2 != null) {
            interfaceC1676340tiy = (InterfaceC1676340tiy) C13LP.LJJJLL(list2);
        } else {
            interfaceC1676340tiy = null;
        }
        List list3 = (List) C13LP.LJJJLZIJ(2, list);
        if (list3 != null) {
            interfaceC1676340tiy2 = (InterfaceC1676340tiy) C13LP.LJJJLL(list3);
        }
        c1688280u2E.LIZIZ(interfaceC1676340tiy, interfaceC1676340tiy2, this.LIZ, C1682390tsj.LIZ(0, i, 0, Integer.MAX_VALUE));
        if (this.LIZ) {
            List<? extends InterfaceC1676340tiy> list4 = (List) C13LP.LJJJLL(list);
            if (list4 == null) {
                list4 = C13BV.INSTANCE;
            }
            float f = this.LIZLLL;
            j1Var.getClass();
            return LJIIL(list4, i, C1682420tsm.LIZ(f, j1Var), C1682420tsm.LIZ(this.LJFF, j1Var), this.LJI, this.LJII, this.LJIIIIZZ);
        }
        List<? extends InterfaceC1676340tiy> list5 = (List) C13LP.LJJJLL(list);
        if (list5 == null) {
            list5 = C13BV.INSTANCE;
        }
        float f2 = this.LIZLLL;
        j1Var.getClass();
        return LJIILJJIL(list5, i, C1682420tsm.LIZ(f2, j1Var), C1682420tsm.LIZ(this.LJFF, j1Var), this.LJI, this.LJII, this.LJIIIIZZ);
    }

    @Override // X.InterfaceC1688370u2N
    public final int LIZIZ(j1 j1Var, List list, int i) {
        InterfaceC1676340tiy interfaceC1676340tiy;
        C1688280u2E c1688280u2E = this.LJIIIIZZ;
        List list2 = (List) C13LP.LJJJLZIJ(1, list);
        InterfaceC1676340tiy interfaceC1676340tiy2 = null;
        if (list2 != null) {
            interfaceC1676340tiy = (InterfaceC1676340tiy) C13LP.LJJJLL(list2);
        } else {
            interfaceC1676340tiy = null;
        }
        List list3 = (List) C13LP.LJJJLZIJ(2, list);
        if (list3 != null) {
            interfaceC1676340tiy2 = (InterfaceC1676340tiy) C13LP.LJJJLL(list3);
        }
        c1688280u2E.LIZIZ(interfaceC1676340tiy, interfaceC1676340tiy2, this.LIZ, C1682390tsj.LIZ(0, Integer.MAX_VALUE, 0, i));
        if (this.LIZ) {
            List<? extends InterfaceC1676340tiy> list4 = (List) C13LP.LJJJLL(list);
            if (list4 == null) {
                list4 = C13BV.INSTANCE;
            }
            float f = this.LIZLLL;
            j1Var.getClass();
            return LJIILJJIL(list4, i, C1682420tsm.LIZ(f, j1Var), C1682420tsm.LIZ(this.LJFF, j1Var), this.LJI, this.LJII, this.LJIIIIZZ);
        }
        List<? extends InterfaceC1676340tiy> list5 = (List) C13LP.LJJJLL(list);
        if (list5 == null) {
            list5 = C13BV.INSTANCE;
        }
        float f2 = this.LIZLLL;
        j1Var.getClass();
        return LJIIL(list5, i, C1682420tsm.LIZ(f2, j1Var), C1682420tsm.LIZ(this.LJFF, j1Var), this.LJI, this.LJII, this.LJIIIIZZ);
    }

    @Override // X.InterfaceC1688370u2N
    public final int LIZJ(j1 j1Var, List list, int i) {
        InterfaceC1676340tiy interfaceC1676340tiy;
        C1688280u2E c1688280u2E = this.LJIIIIZZ;
        List list2 = (List) C13LP.LJJJLZIJ(1, list);
        InterfaceC1676340tiy interfaceC1676340tiy2 = null;
        if (list2 != null) {
            interfaceC1676340tiy = (InterfaceC1676340tiy) C13LP.LJJJLL(list2);
        } else {
            interfaceC1676340tiy = null;
        }
        List list3 = (List) C13LP.LJJJLZIJ(2, list);
        if (list3 != null) {
            interfaceC1676340tiy2 = (InterfaceC1676340tiy) C13LP.LJJJLL(list3);
        }
        c1688280u2E.LIZIZ(interfaceC1676340tiy, interfaceC1676340tiy2, this.LIZ, C1682390tsj.LIZ(0, i, 0, Integer.MAX_VALUE));
        if (this.LIZ) {
            List<? extends InterfaceC1676340tiy> list4 = (List) C13LP.LJJJLL(list);
            if (list4 == null) {
                list4 = C13BV.INSTANCE;
            }
            float f = this.LIZLLL;
            j1Var.getClass();
            return LJIIL(list4, i, C1682420tsm.LIZ(f, j1Var), C1682420tsm.LIZ(this.LJFF, j1Var), this.LJI, this.LJII, this.LJIIIIZZ);
        }
        List list5 = (List) C13LP.LJJJLL(list);
        if (list5 == null) {
            list5 = C13BV.INSTANCE;
        }
        float f2 = this.LIZLLL;
        j1Var.getClass();
        return LJIILIIL(i, C1682420tsm.LIZ(f2, j1Var), list5);
    }

    @Override // X.InterfaceC1688370u2N
    public final int LIZLLL(j1 j1Var, List list, int i) {
        InterfaceC1676340tiy interfaceC1676340tiy;
        C1688280u2E c1688280u2E = this.LJIIIIZZ;
        List list2 = (List) C13LP.LJJJLZIJ(1, list);
        InterfaceC1676340tiy interfaceC1676340tiy2 = null;
        if (list2 != null) {
            interfaceC1676340tiy = (InterfaceC1676340tiy) C13LP.LJJJLL(list2);
        } else {
            interfaceC1676340tiy = null;
        }
        List list3 = (List) C13LP.LJJJLZIJ(2, list);
        if (list3 != null) {
            interfaceC1676340tiy2 = (InterfaceC1676340tiy) C13LP.LJJJLL(list3);
        }
        c1688280u2E.LIZIZ(interfaceC1676340tiy, interfaceC1676340tiy2, this.LIZ, C1682390tsj.LIZ(0, Integer.MAX_VALUE, 0, i));
        if (this.LIZ) {
            List list4 = (List) C13LP.LJJJLL(list);
            if (list4 == null) {
                list4 = C13BV.INSTANCE;
            }
            float f = this.LIZLLL;
            j1Var.getClass();
            return LJIILIIL(i, C1682420tsm.LIZ(f, j1Var), list4);
        }
        List<? extends InterfaceC1676340tiy> list5 = (List) C13LP.LJJJLL(list);
        if (list5 == null) {
            list5 = C13BV.INSTANCE;
        }
        float f2 = this.LIZLLL;
        j1Var.getClass();
        return LJIIL(list5, i, C1682420tsm.LIZ(f2, j1Var), C1682420tsm.LIZ(this.LJFF, j1Var), this.LJI, this.LJII, this.LJIIIIZZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1688370u2N
    public final InterfaceC1690350u5Z LJFF(InterfaceC1689940u4u interfaceC1689940u4u, List<? extends List<? extends InterfaceC1673370teB>> list, long j) {
        InterfaceC1673370teB interfaceC1673370teB;
        InterfaceC1673370teB interfaceC1673370teB2;
        EnumC1324330kZD enumC1324330kZD;
        EnumC1324330kZD enumC1324330kZD2;
        EnumC1324330kZD enumC1324330kZD3;
        C1688350u2L c1688350u2L;
        InterfaceC1673370teB interfaceC1673370teB3;
        C1688300u2G c1688300u2G;
        Integer numValueOf;
        Integer numValueOf2;
        C1688330u2J c1688330u2JLIZ;
        int iLJII;
        int height;
        int width;
        boolean z;
        C1688300u2G c1688300u2G2;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        if (this.LJII == 0 || this.LJI == 0 || ((ArrayList) list).isEmpty() || (C1682380tsi.LJII(j) == 0 && this.LJIIIIZZ.LIZ != EnumC1688240u2A.Visible)) {
            return interfaceC1689940u4u.LJLJJL(0, 0, C2097608Jq.LJ(), AFwS266S0000000_25.get$arr$(490));
        }
        List list2 = (List) C13LP.LJJJJZI(list);
        if (list2.isEmpty()) {
            return interfaceC1689940u4u.LJLJJL(0, 0, C2097608Jq.LJ(), AFwS266S0000000_25.get$arr$(491));
        }
        List list3 = (List) C13LP.LJJJLZIJ(1, list);
        if (list3 != null) {
            interfaceC1673370teB = (InterfaceC1673370teB) C13LP.LJJJLL(list3);
        } else {
            interfaceC1673370teB = null;
        }
        List list4 = (List) C13LP.LJJJLZIJ(2, list);
        if (list4 != null) {
            interfaceC1673370teB2 = (InterfaceC1673370teB) C13LP.LJJJLL(list4);
        } else {
            interfaceC1673370teB2 = null;
        }
        C1688280u2E c1688280u2E = this.LJIIIIZZ;
        list2.size();
        c1688280u2E.getClass();
        C1688280u2E c1688280u2E2 = this.LJIIIIZZ;
        c1688280u2E2.getClass();
        if (this.LIZ) {
            enumC1324330kZD = EnumC1324330kZD.Horizontal;
        } else {
            enumC1324330kZD = EnumC1324330kZD.Vertical;
        }
        long jLIZJ = C1688310u2H.LIZJ(C1688310u2H.LIZIZ(10, C1688310u2H.LIZ(j, enumC1324330kZD)), enumC1324330kZD);
        if (interfaceC1673370teB != null) {
            C1688060u1s.LIZJ(interfaceC1673370teB, this, jLIZJ, new AwS391S0200000_25(c1688280u2E2, this, 222));
            c1688280u2E2.LIZLLL = interfaceC1673370teB;
        }
        if (interfaceC1673370teB2 != null) {
            C1688060u1s.LIZJ(interfaceC1673370teB2, this, jLIZJ, new AwS391S0200000_25(c1688280u2E2, this, 224));
            c1688280u2E2.LJFF = interfaceC1673370teB2;
        }
        Iterator it2 = list2.iterator();
        float f = this.LIZLLL;
        float f2 = this.LJFF;
        if (this.LIZ) {
            enumC1324330kZD2 = EnumC1324330kZD.Horizontal;
        } else {
            enumC1324330kZD2 = EnumC1324330kZD.Vertical;
        }
        long jLIZ = C1688310u2H.LIZ(j, enumC1324330kZD2);
        int i3 = this.LJI;
        int i4 = this.LJII;
        C1688280u2E c1688280u2E3 = this.LJIIIIZZ;
        int i5 = C1688060u1s.LIZ;
        C19968013Aw c19968013Aw = new C19968013Aw(new InterfaceC1690350u5Z[16]);
        int iLJIIIIZZ = C1682380tsi.LJIIIIZZ(jLIZ);
        int iLJIIJ = C1682380tsi.LJIIJ(jLIZ);
        int iLJII2 = C1682380tsi.LJII(jLIZ);
        C20029713Yp c20029713YpLIZ = C1685990tyX.LIZ();
        ArrayList arrayList = new ArrayList();
        int iCeil = (int) Math.ceil(interfaceC1689940u4u.LJJJJLL(f));
        int iCeil2 = (int) Math.ceil(interfaceC1689940u4u.LJJJJLL(f2));
        long jLIZ2 = C1682390tsj.LIZ(0, iLJIIIIZZ, 0, iLJII2);
        long jLIZIZ = C1688310u2H.LIZIZ(14, jLIZ2);
        if (this.LIZ) {
            enumC1324330kZD3 = EnumC1324330kZD.Horizontal;
        } else {
            enumC1324330kZD3 = EnumC1324330kZD.Vertical;
        }
        long jLIZJ2 = C1688310u2H.LIZJ(jLIZIZ, enumC1324330kZD3);
        C259800zU c259800zU = new C259800zU();
        if (it2 instanceof C1688320u2I) {
            interfaceC1689940u4u.LJJI(iLJIIIIZZ);
            interfaceC1689940u4u.LJJI(iLJII2);
            c1688350u2L = new C1688350u2L(0);
        } else {
            c1688350u2L = null;
        }
        if (it2.hasNext()) {
            try {
            } catch (IndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
                interfaceC1673370teB3 = null;
            }
            if (!(it2 instanceof C1688320u2I)) {
                interfaceC1673370teB3 = (InterfaceC1673370teB) it2.next();
                if (interfaceC1673370teB3 == null) {
                    c1688300u2G = null;
                } else {
                    c1688300u2G = new C1688300u2G(C1688060u1s.LIZJ(interfaceC1673370teB3, this, jLIZJ2, new AwS604S0100000_25(c259800zU, (C259800zU<EnumC1888140zEa>) 645)));
                    if (c1688300u2G != null) {
                        numValueOf = Integer.valueOf((int) (c1688300u2G.LIZ >> 32));
                        numValueOf2 = Integer.valueOf(C1688300u2G.LIZIZ(c1688300u2G.LIZ));
                    }
                }
                numValueOf = null;
                numValueOf2 = null;
            } else {
                throw null;
            }
        } else {
            interfaceC1673370teB3 = null;
            c1688300u2G = null;
            numValueOf = null;
            numValueOf2 = null;
        }
        C1688450u2V c1688450u2V = new C1688450u2V();
        C1688450u2V c1688450u2V2 = new C1688450u2V();
        C1688290u2F c1688290u2F = new C1688290u2F(i3, c1688280u2E3, jLIZ, i4, iCeil, iCeil2);
        C1688340u2K c1688340u2KLIZIZ = c1688290u2F.LIZIZ(it2.hasNext(), 0, C1688300u2G.LIZ(iLJIIIIZZ, iLJII2), c1688300u2G, 0, 0, 0, false, false);
        if (c1688340u2KLIZIZ.LIZIZ) {
            if (c1688300u2G != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            c1688330u2JLIZ = c1688290u2F.LIZ(c1688340u2KLIZIZ, z3, -1, 0, iLJIIIIZZ, 0);
        } else {
            c1688330u2JLIZ = null;
        }
        int i6 = iLJIIIIZZ;
        int iMax = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (!c1688340u2KLIZIZ.LIZIZ && interfaceC1673370teB3 != null) {
            int iIntValue = numValueOf.intValue();
            i7 += iIntValue;
            iMax = Math.max(iMax, numValueOf2.intValue());
            i6 -= iIntValue;
            int i12 = i11 + 1;
            c1688280u2E3.getClass();
            arrayList.add(interfaceC1673370teB3);
            c20029713YpLIZ.LJII(i11, c259800zU.element);
            int i13 = i12 - i8;
            if (i13 < i3) {
                z = true;
            } else {
                z = false;
            }
            if (c1688350u2L != null) {
                if (z) {
                    i = i6 - iCeil;
                    if (i < 0) {
                        i = 0;
                    }
                } else {
                    i = iLJIIIIZZ;
                }
                interfaceC1689940u4u.LJJI(i);
                if (z) {
                    i2 = iLJII2;
                } else {
                    i2 = (iLJII2 - iMax) - iCeil2;
                    if (i2 < 0) {
                        i2 = 0;
                    }
                }
                interfaceC1689940u4u.LJJI(i2);
            }
            if (!it2.hasNext()) {
                interfaceC1673370teB3 = null;
            } else {
                try {
                    if (!(it2 instanceof C1688320u2I)) {
                        interfaceC1673370teB3 = (InterfaceC1673370teB) it2.next();
                    } else {
                        throw null;
                    }
                } catch (IndexOutOfBoundsException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    interfaceC1673370teB3 = null;
                }
            }
            C1688300u2G c1688300u2G3 = null;
            c259800zU.element = null;
            if (interfaceC1673370teB3 != null) {
                c1688300u2G3 = new C1688300u2G(C1688060u1s.LIZJ(interfaceC1673370teB3, this, jLIZJ2, new AwS604S0100000_25(c259800zU, (C259800zU<EnumC1888140zEa>) 643)));
                numValueOf = Integer.valueOf(((int) (c1688300u2G3.LIZ >> 32)) + iCeil);
                numValueOf2 = Integer.valueOf(C1688300u2G.LIZIZ(c1688300u2G3.LIZ));
            } else {
                numValueOf = null;
                numValueOf2 = null;
            }
            boolean zHasNext = it2.hasNext();
            long jLIZ3 = C1688300u2G.LIZ(i6, iLJII2);
            if (c1688300u2G3 == null) {
                c1688300u2G2 = null;
            } else {
                c1688300u2G2 = new C1688300u2G(C1688300u2G.LIZ(numValueOf.intValue(), numValueOf2.intValue()));
            }
            c1688340u2KLIZIZ = c1688290u2F.LIZIZ(zHasNext, i13, jLIZ3, c1688300u2G2, i10, i9, iMax, false, false);
            if (c1688340u2KLIZIZ.LIZ) {
                iLJIIJ = Math.min(Math.max(iLJIIJ, i7), iLJIIIIZZ);
                int i14 = i9 + iMax;
                if (c1688300u2G3 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c1688290u2F = c1688290u2F;
                c1688330u2JLIZ = c1688290u2F.LIZ(c1688340u2KLIZIZ, z2, i10, i14, i6, i13);
                c1688450u2V2.LIZJ(iMax);
                iLJII2 = (iLJII2 - i14) - iCeil2;
                c1688450u2V.LIZJ(i12);
                if (numValueOf != null) {
                    numValueOf = Integer.valueOf(numValueOf.intValue() - iCeil);
                } else {
                    numValueOf = null;
                }
                i10++;
                i9 = i14 + iCeil2;
                i8 = i12;
                i6 = iLJIIIIZZ;
                i7 = 0;
                iMax = 0;
            }
            i11 = i12;
        }
        if (c1688330u2JLIZ != null) {
            arrayList.add(c1688330u2JLIZ.LIZ);
            c20029713YpLIZ.LJII(arrayList.size() - 1, c1688330u2JLIZ.LIZIZ);
            int i15 = c1688450u2V.LIZIZ - 1;
            if (c1688330u2JLIZ.LIZLLL) {
                c1688450u2V2.LJI(i15, Math.max(c1688450u2V2.LIZ(i15), C1688300u2G.LIZIZ(c1688330u2JLIZ.LIZJ)));
                c1688450u2V.LJI(i15, c1688450u2V.LIZIZ() + 1);
            } else {
                c1688450u2V2.LIZJ(C1688300u2G.LIZIZ(c1688330u2JLIZ.LIZJ));
                c1688450u2V.LIZJ(c1688450u2V.LIZIZ() + 1);
            }
        }
        int size = arrayList.size();
        Object[] objArr = new AbstractC1686530tzP[size];
        for (int i16 = 0; i16 < size; i16++) {
            objArr[i16] = c20029713YpLIZ.LIZIZ(i16);
        }
        int i17 = c1688450u2V.LIZIZ;
        int[] iArr = new int[i17];
        int[] iArr2 = new int[i17];
        int[] iArr3 = c1688450u2V.LIZ;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (i18 < i17) {
            int i21 = iArr3[i18];
            Object[] objArr2 = objArr;
            InterfaceC1690350u5Z interfaceC1690350u5ZLIZ = C1688110u1x.LIZ(this, iLJIIJ, C1682380tsi.LJIIIZ(jLIZ2), C1682380tsi.LJIIIIZZ(jLIZ2), c1688450u2V2.LIZ(i18), iCeil, interfaceC1689940u4u, arrayList, objArr, i19, i21, iArr, i18);
            if (this.LIZ) {
                height = interfaceC1690350u5ZLIZ.getWidth();
                width = interfaceC1690350u5ZLIZ.getHeight();
            } else {
                height = interfaceC1690350u5ZLIZ.getHeight();
                width = interfaceC1690350u5ZLIZ.getWidth();
            }
            iArr2[i18] = width;
            i20 += width;
            iLJIIJ = Math.max(iLJIIJ, height);
            c19968013Aw.LIZLLL(interfaceC1690350u5ZLIZ);
            i18++;
            i19 = i21;
            objArr = objArr2;
        }
        if (c19968013Aw.LLILLL == 0) {
            i20 = 0;
            iLJIIJ = 0;
        }
        boolean z4 = this.LIZ;
        InterfaceC1688160u22 interfaceC1688160u22 = this.LIZJ;
        InterfaceC1672520tco interfaceC1672520tco = this.LIZIZ;
        if (z4) {
            int iLJLLJ = i20 + (interfaceC1689940u4u.LJLLJ(interfaceC1688160u22.LIZ()) * (c19968013Aw.LLILLL - 1));
            int iLJIIIZ = C1682380tsi.LJIIIZ(jLIZ);
            iLJII = C1682380tsi.LJII(jLIZ);
            if (iLJLLJ < iLJIIIZ) {
                iLJLLJ = iLJIIIZ;
            }
            if (iLJLLJ <= iLJII) {
                iLJII = iLJLLJ;
            }
            interfaceC1688160u22.LIZJ(interfaceC1689940u4u, iLJII, iArr2, iArr);
        } else {
            int iLJLLJ2 = i20 + (interfaceC1689940u4u.LJLLJ(interfaceC1672520tco.LIZ()) * (c19968013Aw.LLILLL - 1));
            int iLJIIIZ2 = C1682380tsi.LJIIIZ(jLIZ);
            int iLJII3 = C1682380tsi.LJII(jLIZ);
            if (iLJLLJ2 < iLJIIIZ2) {
                iLJLLJ2 = iLJIIIZ2;
            }
            if (iLJLLJ2 > iLJII3) {
                iLJLLJ2 = iLJII3;
            }
            iLJII = iLJLLJ2;
            interfaceC1672520tco.LIZIZ(interfaceC1689940u4u, iLJLLJ2, iArr2, interfaceC1689940u4u.getLayoutDirection(), iArr);
        }
        int iLJIIJ2 = C1682380tsi.LJIIJ(jLIZ);
        int iLJIIIIZZ2 = C1682380tsi.LJIIIIZZ(jLIZ);
        if (iLJIIJ < iLJIIJ2) {
            iLJIIJ = iLJIIJ2;
        }
        if (iLJIIJ <= iLJIIIIZZ2) {
            iLJIIIIZZ2 = iLJIIJ;
        }
        if (z4) {
            int i22 = iLJII;
            iLJII = iLJIIIIZZ2;
            iLJIIIIZZ2 = i22;
        }
        return interfaceC1689940u4u.LJLJJL(iLJII, iLJIIIIZZ2, C2097608Jq.LJ(), new AwS604S0100000_25(c19968013Aw, (C19968013Aw<InterfaceC1690350u5Z>) 646));
    }

    public final int LJIILIIL(int i, int i2, List list) {
        int iLJJIIZ;
        int i3 = this.LJI;
        int size = list.size();
        int i4 = 0;
        int iMax = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < size) {
            InterfaceC1676340tiy interfaceC1676340tiy = (InterfaceC1676340tiy) ListProtector.get(list, i4);
            if (this.LIZ) {
                iLJJIIZ = interfaceC1676340tiy.LJJIL(i);
            } else {
                iLJJIIZ = interfaceC1676340tiy.LJJIIZ(i);
            }
            int i7 = iLJJIIZ + i2;
            int i8 = i4 + 1;
            if (i8 - i5 != i3 && i8 != list.size()) {
                i6 += i7;
            } else {
                iMax = Math.max(iMax, (i6 + i7) - i2);
                i6 = 0;
                i5 = i4;
            }
            i4 = i8;
        }
        return iMax;
    }

    @Override // X.InterfaceC1688150u21
    public final void LJIIIIZZ(int i, int[] iArr, int[] iArr2, InterfaceC1689940u4u interfaceC1689940u4u) {
        if (this.LIZ) {
            this.LIZIZ.LIZIZ(interfaceC1689940u4u, i, iArr, interfaceC1689940u4u.getLayoutDirection(), iArr2);
        } else {
            this.LIZJ.LIZJ(interfaceC1689940u4u, i, iArr, iArr2);
        }
    }

    @Override // X.InterfaceC1688100u1w
    public final int LJIIIZ(int i, int i2, AbstractC1686530tzP abstractC1686530tzP, EnumC1671200tag enumC1671200tag) {
        AbstractC1688180u24 abstractC1688180u24;
        C1688050u1r c1688050u1r;
        Object objLJJJ = abstractC1686530tzP.LJJJ();
        if (!(objLJJJ instanceof C1688050u1r) || (c1688050u1r = (C1688050u1r) objLJJJ) == null || (abstractC1688180u24 = c1688050u1r.LIZJ) == null) {
            abstractC1688180u24 = this.LJ;
        }
        return abstractC1688180u24.LIZ(i - LJ(abstractC1686530tzP), enumC1671200tag);
    }

    @Override // X.InterfaceC1688150u21
    public final long LJIIJJI(int i, int i2, int i3, boolean z) {
        if (this.LIZ) {
            if (!z) {
                return C1682390tsj.LIZ(i, i2, 0, i3);
            }
            return C1682400tsk.LIZIZ(i, i2, 0, i3);
        }
        if (!z) {
            return C1682390tsj.LIZ(0, i3, i, i2);
        }
        return C1682400tsk.LIZ(0, i3, i, i2);
    }

    public final int LJIIL(List<? extends InterfaceC1676340tiy> list, int i, int i2, int i3, int i4, int i5, C1688280u2E c1688280u2E) {
        int iLJJII;
        int iLJJIJ;
        boolean z;
        C1688300u2G c1688300u2G;
        long jLIZ;
        boolean z2;
        C1688300u2G c1688300u2G2;
        boolean z3;
        int iLJJIJ2;
        boolean z4;
        int iLIZIZ;
        if (list.isEmpty()) {
            jLIZ = C1688300u2G.LIZ(0, 0);
        } else {
            int i6 = Integer.MAX_VALUE;
            C1688290u2F c1688290u2F = new C1688290u2F(i4, c1688280u2E, C1682390tsj.LIZ(0, i, 0, Integer.MAX_VALUE), i5, i2, i3);
            InterfaceC1676340tiy interfaceC1676340tiy = (InterfaceC1676340tiy) C13LP.LJJJLZIJ(0, list);
            if (interfaceC1676340tiy != null) {
                if (this.LIZ) {
                    iLJJII = interfaceC1676340tiy.LJJIJ(i);
                } else {
                    iLJJII = interfaceC1676340tiy.LJJII(i);
                }
                if (this.LIZ) {
                    iLJJIJ = interfaceC1676340tiy.LJJII(iLJJII);
                } else {
                    iLJJIJ = interfaceC1676340tiy.LJJIJ(iLJJII);
                }
            } else {
                iLJJII = 0;
                iLJJIJ = 0;
            }
            int iMax = 0;
            int iLIZIZ2 = 0;
            int i7 = 0;
            if (list.size() > 1) {
                z = true;
            } else {
                z = false;
            }
            long jLIZ2 = C1688300u2G.LIZ(i, Integer.MAX_VALUE);
            if (interfaceC1676340tiy == null) {
                c1688300u2G = null;
            } else {
                c1688300u2G = new C1688300u2G(C1688300u2G.LIZ(iLJJIJ, iLJJII));
            }
            if (c1688290u2F.LIZIZ(z, 0, jLIZ2, c1688300u2G, 0, 0, 0, false, false).LIZIZ) {
                if (interfaceC1676340tiy != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                C1688300u2G c1688300u2GLIZ = c1688280u2E.LIZ(0, 0, z4);
                if (c1688300u2GLIZ != null) {
                    iLIZIZ = C1688300u2G.LIZIZ(c1688300u2GLIZ.LIZ);
                } else {
                    iLIZIZ = 0;
                }
                jLIZ = C1688300u2G.LIZ(iLIZIZ, 0);
            } else {
                int size = list.size();
                int i8 = i;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (i9 >= size) {
                        break;
                    }
                    i8 -= iLJJIJ;
                    int i11 = i9 + 1;
                    iMax = Math.max(iMax, iLJJII);
                    InterfaceC1676340tiy interfaceC1676340tiy2 = (InterfaceC1676340tiy) C13LP.LJJJLZIJ(i11, list);
                    if (interfaceC1676340tiy2 != null) {
                        if (this.LIZ) {
                            iLJJII = interfaceC1676340tiy2.LJJIJ(i);
                        } else {
                            iLJJII = interfaceC1676340tiy2.LJJII(i);
                        }
                        if (this.LIZ) {
                            iLJJIJ2 = interfaceC1676340tiy2.LJJII(iLJJII);
                        } else {
                            iLJJIJ2 = interfaceC1676340tiy2.LJJIJ(iLJJII);
                        }
                        iLJJIJ = iLJJIJ2 + i2;
                    } else {
                        iLJJII = 0;
                        iLJJIJ = 0;
                    }
                    if (i9 + 2 < list.size()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i12 = i11 - i10;
                    long jLIZ3 = C1688300u2G.LIZ(i8, i6);
                    if (interfaceC1676340tiy2 == null) {
                        c1688300u2G2 = null;
                    } else {
                        c1688300u2G2 = new C1688300u2G(C1688300u2G.LIZ(iLJJIJ, iLJJII));
                    }
                    C1688340u2K c1688340u2KLIZIZ = c1688290u2F.LIZIZ(z2, i12, jLIZ3, c1688300u2G2, i7, iLIZIZ2, iMax, false, false);
                    if (c1688340u2KLIZIZ.LIZ) {
                        iLIZIZ2 += iMax + i3;
                        if (interfaceC1676340tiy2 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c1688290u2F = c1688290u2F;
                        C1688330u2J c1688330u2JLIZ = c1688290u2F.LIZ(c1688340u2KLIZIZ, z3, i7, iLIZIZ2, i8, i12);
                        iLJJIJ -= i2;
                        i7++;
                        if (c1688340u2KLIZIZ.LIZIZ) {
                            if (c1688330u2JLIZ != null) {
                                long j = c1688330u2JLIZ.LIZJ;
                                if (!c1688330u2JLIZ.LIZLLL) {
                                    iLIZIZ2 += C1688300u2G.LIZIZ(j) + i3;
                                }
                            }
                            i9 = i11;
                        } else {
                            i8 = i;
                            i10 = i11;
                            iMax = 0;
                        }
                    }
                    i6 = Integer.MAX_VALUE;
                    i9 = i11;
                }
                jLIZ = C1688300u2G.LIZ(iLIZIZ2 - i3, i9);
            }
        }
        return (int) (jLIZ >> 32);
    }

    public final int LJIILJJIL(List<? extends InterfaceC1676340tiy> list, int i, int i2, int i3, int i4, int i5, C1688280u2E c1688280u2E) {
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        C1688300u2G c1688300u2G;
        long jLIZ;
        boolean z2;
        C1688300u2G c1688300u2G2;
        boolean z3;
        boolean z4;
        int iLIZIZ;
        EnumC1688240u2A enumC1688240u2A;
        int iLJJIJ;
        int iLJJII;
        int i10 = 0;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        int size3 = list.size();
        for (int i11 = 0; i11 < size3; i11++) {
            InterfaceC1676340tiy interfaceC1676340tiy = (InterfaceC1676340tiy) ListProtector.get(list, i11);
            if (this.LIZ) {
                iLJJIJ = interfaceC1676340tiy.LJJII(i);
            } else {
                iLJJIJ = interfaceC1676340tiy.LJJIJ(i);
            }
            iArr[i11] = iLJJIJ;
            if (this.LIZ) {
                iLJJII = interfaceC1676340tiy.LJJIJ(iLJJIJ);
            } else {
                iLJJII = interfaceC1676340tiy.LJJII(iLJJIJ);
            }
            iArr2[i11] = iLJJII;
        }
        if (i5 != Integer.MAX_VALUE && i4 != Integer.MAX_VALUE) {
            i6 = i4 * i5;
        } else {
            i6 = Integer.MAX_VALUE;
        }
        if ((i6 < list.size() && ((enumC1688240u2A = c1688280u2E.LIZ) == EnumC1688240u2A.ExpandIndicator || enumC1688240u2A == EnumC1688240u2A.ExpandOrCollapseIndicator)) || (i6 >= list.size() && i5 >= c1688280u2E.LIZIZ && c1688280u2E.LIZ == EnumC1688240u2A.ExpandOrCollapseIndicator)) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        int iMin = Math.min(i6 - i7, list.size());
        int iLJJLIIIJ = C13LQ.LJJLIIIJ(iArr) + ((list.size() - 1) * i2);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i12 = iArr2[0];
        C531650Kt9 it2 = new IntRange(1, size2 - 1).iterator();
        while (it2.LLILLL) {
            int i13 = iArr2[it2.nextInt()];
            if (i12 < i13) {
                i12 = i13;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i14 = iArr[0];
        C531650Kt9 it3 = new IntRange(1, size - 1).iterator();
        while (it3.LLILLL) {
            int i15 = iArr[it3.nextInt()];
            if (i14 < i15) {
                i14 = i15;
            }
        }
        int i16 = iLJJLIIIJ;
        while (i14 <= i16 && i12 != i) {
            int i17 = (i14 + i16) / 2;
            int i18 = C1688060u1s.LIZ;
            if (list.isEmpty()) {
                jLIZ = C1688300u2G.LIZ(i10, i10);
            } else {
                C1688290u2F c1688290u2F = new C1688290u2F(i4, c1688280u2E, C1682390tsj.LIZ(i10, i17, i10, Integer.MAX_VALUE), i5, i2, i3);
                Object objLJJJLZIJ = C13LP.LJJJLZIJ(i10, list);
                if (objLJJJLZIJ != null) {
                    i8 = iArr2[i10];
                    i9 = iArr[i10];
                } else {
                    i8 = 0;
                    i9 = 0;
                }
                if (list.size() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                long jLIZ2 = C1688300u2G.LIZ(i17, Integer.MAX_VALUE);
                if (objLJJJLZIJ == null) {
                    c1688300u2G = null;
                } else {
                    c1688300u2G = new C1688300u2G(C1688300u2G.LIZ(i9, i8));
                }
                if (c1688290u2F.LIZIZ(z, 0, jLIZ2, c1688300u2G, 0, 0, 0, false, false).LIZIZ) {
                    if (objLJJJLZIJ != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    C1688300u2G c1688300u2GLIZ = c1688280u2E.LIZ(0, 0, z4);
                    if (c1688300u2GLIZ != null) {
                        iLIZIZ = C1688300u2G.LIZIZ(c1688300u2GLIZ.LIZ);
                    } else {
                        iLIZIZ = 0;
                    }
                    jLIZ = C1688300u2G.LIZ(iLIZIZ, 0);
                } else {
                    int i19 = 0;
                    int size4 = list.size();
                    int i20 = 0;
                    int i21 = 0;
                    int i22 = 0;
                    int iLIZIZ2 = 0;
                    int iMax = 0;
                    int i23 = i17;
                    while (true) {
                        if (i20 >= size4) {
                            break;
                        }
                        i23 -= i9;
                        int i24 = i20 + 1;
                        iMax = Math.max(iMax, i8);
                        Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(i24, list);
                        if (objLJJJLZIJ2 != null) {
                            i19 = iArr2[i24];
                            i9 = iArr[i24] + i2;
                        } else {
                            i9 = 0;
                        }
                        if (i20 + 2 < list.size()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int i25 = i24 - i21;
                        long jLIZ3 = C1688300u2G.LIZ(i23, Integer.MAX_VALUE);
                        if (objLJJJLZIJ2 == null) {
                            c1688300u2G2 = null;
                        } else {
                            c1688300u2G2 = new C1688300u2G(C1688300u2G.LIZ(i9, i19));
                        }
                        C1688340u2K c1688340u2KLIZIZ = c1688290u2F.LIZIZ(z2, i25, jLIZ3, c1688300u2G2, i22, iLIZIZ2, iMax, false, false);
                        if (c1688340u2KLIZIZ.LIZ) {
                            iLIZIZ2 += iMax + i3;
                            if (objLJJJLZIJ2 != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            C1688330u2J c1688330u2JLIZ = c1688290u2F.LIZ(c1688340u2KLIZIZ, z3, i22, iLIZIZ2, i23, i25);
                            i9 -= i2;
                            i22++;
                            if (c1688340u2KLIZIZ.LIZIZ) {
                                if (c1688330u2JLIZ != null) {
                                    long j = c1688330u2JLIZ.LIZJ;
                                    if (!c1688330u2JLIZ.LIZLLL) {
                                        iLIZIZ2 += C1688300u2G.LIZIZ(j) + i3;
                                    }
                                }
                                i20 = i24;
                            } else {
                                i21 = i24;
                                i23 = i17;
                                iMax = 0;
                            }
                        }
                        i20 = i24;
                        i8 = i19;
                        i19 = 0;
                    }
                    jLIZ = C1688300u2G.LIZ(iLIZIZ2 - i3, i20);
                }
            }
            i12 = (int) (jLIZ >> 32);
            int iLIZIZ3 = C1688300u2G.LIZIZ(jLIZ);
            if (i12 <= i && iLIZIZ3 >= iMin) {
                if (i12 >= i) {
                    return i17;
                }
                i16 = i17 - 1;
            } else {
                iLJJLIIIJ = i17 + 1;
                if (iLJJLIIIJ > i16) {
                    break;
                }
                i14 = iLJJLIIIJ;
            }
            iLJJLIIIJ = i17;
            i10 = 0;
        }
        return iLJJLIIIJ;
    }

    public C1688270u2D(InterfaceC1672520tco interfaceC1672520tco, InterfaceC1688160u22 interfaceC1688160u22, float f, C1688040u1q c1688040u1q, float f2, int i, int i2, C1688280u2E c1688280u2E) {
        this.LIZIZ = interfaceC1672520tco;
        this.LIZJ = interfaceC1688160u22;
        this.LIZLLL = f;
        this.LJ = c1688040u1q;
        this.LJFF = f2;
        this.LJI = i;
        this.LJII = i2;
        this.LJIIIIZZ = c1688280u2E;
    }

    @Override // X.InterfaceC1688150u21
    public final InterfaceC1690350u5Z LJIIJ(AbstractC1686530tzP[] abstractC1686530tzPArr, InterfaceC1689940u4u interfaceC1689940u4u, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        int i6;
        EnumC1671200tag layoutDirection;
        int i7 = i;
        if (this.LIZ) {
            i6 = i2;
            layoutDirection = EnumC1671200tag.Ltr;
        } else {
            i6 = i7;
            i7 = i2;
            layoutDirection = interfaceC1689940u4u.getLayoutDirection();
        }
        return interfaceC1689940u4u.LJLJJL(i7, i6, C2097608Jq.LJ(), new C1688140u20(iArr2, i3, i4, i5, abstractC1686530tzPArr, this, i2, layoutDirection, iArr));
    }
}
