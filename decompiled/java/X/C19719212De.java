package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS125S0201000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12De, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19719212De implements Function2, InterfaceC1631620sYq, InterfaceC1631630sYr, InterfaceC1685420txc, InterfaceC1685430txd, InterfaceC2280171EMt, InterfaceC2280181EMu, InterfaceC2280191EMv, InterfaceC2280201EMw, InterfaceC2280211EMx, InterfaceC2280231EMz, C1EN0, C1EN1, C1EN2, C1EN3, C1EN4, C1EN5, C1EN6, C1EN7 {
    public final int LL;
    public final boolean LLILLJJLI;
    public Object LLILLL;
    public InterfaceC1675110tgz LLILZ;
    public List<InterfaceC1675110tgz> LLILZIL;

    public final void LJIIIZ(InterfaceC1680500tpg interfaceC1680500tpg) {
        C20030013Ys c20030013YsLJI;
        if (this.LLILLJJLI && (c20030013YsLJI = interfaceC1680500tpg.LJI()) != null) {
            interfaceC1680500tpg.LIZLLL(c20030013YsLJI);
            if (C13Z4.LIZLLL(this.LLILZ, c20030013YsLJI)) {
                this.LLILZ = c20030013YsLJI;
                return;
            }
            List<InterfaceC1675110tgz> list = this.LLILZIL;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.LLILZIL = arrayList;
                arrayList.add(c20030013YsLJI);
                return;
            }
            ArrayList arrayList2 = (ArrayList) list;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                if (C13Z4.LIZLLL((InterfaceC1675110tgz) ListProtector.get(list, i), c20030013YsLJI)) {
                    ListProtector.set(list, i, c20030013YsLJI);
                    return;
                }
            }
            arrayList2.add(c20030013YsLJI);
        }
    }

    public final void LJIIJ(Object obj) {
        boolean z;
        if (!Intrinsics.LJFF(this.LLILLL, obj)) {
            if (this.LLILLL == null) {
                z = true;
            } else {
                z = false;
            }
            this.LLILLL = obj;
            if (!z && this.LLILLJJLI) {
                InterfaceC1675110tgz interfaceC1675110tgz = this.LLILZ;
                if (interfaceC1675110tgz != null) {
                    interfaceC1675110tgz.invalidate();
                    this.LLILZ = null;
                }
                List<InterfaceC1675110tgz> list = this.LLILZIL;
                if (list != null) {
                    ArrayList arrayList = (ArrayList) list;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((InterfaceC1675110tgz) ListProtector.get(list, i)).invalidate();
                    }
                    arrayList.clear();
                }
            }
        }
    }

    public final Object LIZ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int iLIZ;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(this.LL);
        LJIIIZ(c13zcLJIIJ);
        if (c13zcLJIIJ.LJJIIJ(this)) {
            iLIZ = C13Z4.LIZ(2, 0);
        } else {
            iLIZ = C13Z4.LIZ(1, 0);
        }
        Object obj = this.LLILLL;
        C19719512Dh.LJ(2, obj);
        Object objInvoke = ((Function2) obj).invoke(c13zcLJIIJ, Integer.valueOf(i | iLIZ));
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C19719312Df(this);
        }
        return objInvoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return LIZ((InterfaceC1680500tpg) obj, ((Number) obj2).intValue());
    }

    public C19719212De(int i, InterfaceC1451105m9 interfaceC1451105m9, boolean z) {
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = interfaceC1451105m9;
    }

    public final Object LIZIZ(Object obj, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int iLIZ;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(this.LL);
        LJIIIZ(c13zcLJIIJ);
        if (c13zcLJIIJ.LJJIIJ(this)) {
            iLIZ = C13Z4.LIZ(2, 1);
        } else {
            iLIZ = C13Z4.LIZ(1, 1);
        }
        Object obj2 = this.LLILLL;
        C19719512Dh.LJ(3, obj2);
        Object objInvoke = ((InterfaceC1631620sYq) obj2).invoke(obj, c13zcLJIIJ, Integer.valueOf(iLIZ | i));
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS125S0201000_29(this, obj, i, 1);
        }
        return objInvoke;
    }

    @Override // X.InterfaceC1631620sYq
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return LIZIZ(obj, (InterfaceC1680500tpg) obj2, ((Number) obj3).intValue());
    }

    public final Object LIZJ(Object obj, Object obj2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int iLIZ;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(this.LL);
        LJIIIZ(c13zcLJIIJ);
        if (c13zcLJIIJ.LJJIIJ(this)) {
            iLIZ = C13Z4.LIZ(2, 2);
        } else {
            iLIZ = C13Z4.LIZ(1, 2);
        }
        Object obj3 = this.LLILLL;
        C19719512Dh.LJ(4, obj3);
        Object objInvoke = ((InterfaceC1631630sYr) obj3).invoke(obj, obj2, c13zcLJIIJ, Integer.valueOf(iLIZ | i));
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C12DZ(this, obj, obj2, i);
        }
        return objInvoke;
    }

    @Override // X.InterfaceC1631630sYr
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return LIZJ(obj, obj2, (InterfaceC1680500tpg) obj3, ((Number) obj4).intValue());
    }

    public final Object LIZLLL(Object obj, Object obj2, Object obj3, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int iLIZ;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(this.LL);
        LJIIIZ(c13zcLJIIJ);
        if (c13zcLJIIJ.LJJIIJ(this)) {
            iLIZ = C13Z4.LIZ(2, 3);
        } else {
            iLIZ = C13Z4.LIZ(1, 3);
        }
        Object obj4 = this.LLILLL;
        C19719512Dh.LJ(5, obj4);
        Object objInvoke = ((InterfaceC1685420txc) obj4).invoke(obj, obj2, obj3, c13zcLJIIJ, Integer.valueOf(iLIZ | i));
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C19718812Da(this, obj, obj2, obj3, i);
        }
        return objInvoke;
    }

    @Override // X.InterfaceC1685420txc
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return LIZLLL(obj, obj2, obj3, (InterfaceC1680500tpg) obj4, ((Number) obj5).intValue());
    }

    public final Object LJ(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int iLIZ;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(this.LL);
        LJIIIZ(c13zcLJIIJ);
        if (c13zcLJIIJ.LJJIIJ(this)) {
            iLIZ = C13Z4.LIZ(2, 4);
        } else {
            iLIZ = C13Z4.LIZ(1, 4);
        }
        Object obj5 = this.LLILLL;
        C19719512Dh.LJ(6, obj5);
        Object objInvoke = ((InterfaceC1685430txd) obj5).invoke(obj, obj2, obj3, obj4, c13zcLJIIJ, Integer.valueOf(iLIZ | i));
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C19718912Db(this, obj, obj2, obj3, obj4, i);
        }
        return objInvoke;
    }

    @Override // X.InterfaceC1685430txd
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return LJ(obj, obj2, obj3, obj4, (InterfaceC1680500tpg) obj5, ((Number) obj6).intValue());
    }

    public final Object LJFF(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int iLIZ;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(this.LL);
        LJIIIZ(c13zcLJIIJ);
        if (c13zcLJIIJ.LJJIIJ(this)) {
            iLIZ = C13Z4.LIZ(2, 5);
        } else {
            iLIZ = C13Z4.LIZ(1, 5);
        }
        Object obj6 = this.LLILLL;
        C19719512Dh.LJ(7, obj6);
        Object objYc = ((InterfaceC2280171EMt) obj6).yc(obj, obj2, obj3, obj4, obj5, c13zcLJIIJ, Integer.valueOf(i | iLIZ));
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C19719012Dc(this, obj, obj2, obj3, obj4, obj5, i);
        }
        return objYc;
    }

    @Override // X.InterfaceC2280171EMt
    public final /* bridge */ /* synthetic */ Object yc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return LJFF(obj, obj2, obj3, obj4, obj5, (InterfaceC1680500tpg) obj6, ((Number) obj7).intValue());
    }

    public final Object LJI(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int iLIZ;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(this.LL);
        LJIIIZ(c13zcLJIIJ);
        if (c13zcLJIIJ.LJJIIJ(this)) {
            iLIZ = C13Z4.LIZ(2, 6);
        } else {
            iLIZ = C13Z4.LIZ(1, 6);
        }
        Object obj7 = this.LLILLL;
        C19719512Dh.LJ(8, obj7);
        Object objDN = ((InterfaceC2280181EMu) obj7).dN(obj, obj2, obj3, obj4, obj5, obj6, c13zcLJIIJ, Integer.valueOf(i | iLIZ));
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C19719112Dd(this, obj, obj2, obj3, obj4, obj5, obj6, i);
        }
        return objDN;
    }

    @Override // X.InterfaceC2280181EMu
    public final /* bridge */ /* synthetic */ Object dN(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return LJI(obj, obj2, obj3, obj4, obj5, obj6, (InterfaceC1680500tpg) obj7, ((Number) obj8).intValue());
    }

    public final Object LJII(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int iLIZ;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(this.LL);
        LJIIIZ(c13zcLJIIJ);
        if (c13zcLJIIJ.LJJIIJ(this)) {
            iLIZ = C13Z4.LIZ(2, 7);
        } else {
            iLIZ = C13Z4.LIZ(1, 7);
        }
        Object obj8 = this.LLILLL;
        C19719512Dh.LJ(9, obj8);
        Object objOs = ((InterfaceC2280191EMv) obj8).os(obj, obj2, obj3, obj4, obj5, obj6, obj7, c13zcLJIIJ, Integer.valueOf(i | iLIZ));
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C19719412Dg(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, i);
        }
        return objOs;
    }

    @Override // X.InterfaceC2280191EMv
    public final /* bridge */ /* synthetic */ Object os(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return LJII(obj, obj2, obj3, obj4, obj5, obj6, obj7, (InterfaceC1680500tpg) obj8, ((Number) obj9).intValue());
    }

    public final Object LJIIIIZZ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int iLIZ;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(this.LL);
        LJIIIZ(c13zcLJIIJ);
        if (c13zcLJIIJ.LJJIIJ(this)) {
            iLIZ = C13Z4.LIZ(2, 9);
        } else {
            iLIZ = C13Z4.LIZ(1, 9);
        }
        Object obj10 = this.LLILLL;
        C19719512Dh.LJ(11, obj10);
        Object objM3 = ((InterfaceC2280211EMx) obj10).M3(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, c13zcLJIIJ, Integer.valueOf(i | iLIZ));
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C12DY(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, i);
        }
        return objM3;
    }

    @Override // X.InterfaceC2280211EMx
    public final /* bridge */ /* synthetic */ Object M3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return LJIIIIZZ(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, (InterfaceC1680500tpg) obj10, ((Number) obj11).intValue());
    }
}
