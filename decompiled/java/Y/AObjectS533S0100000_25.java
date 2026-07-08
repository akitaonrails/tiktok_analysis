package Y;

import X.AbstractC1686530tzP;
import X.C0MXE;
import X.C0NWB;
import X.C0NWC;
import X.C1296880jqw;
import X.C13D2;
import X.C15438062q;
import X.C1665750tRt;
import X.C1665930tSB;
import X.C1666970tTr;
import X.C1668040tVa;
import X.C1673090tdj;
import X.C1679930tol;
import X.C1682380tsi;
import X.C1682900ttY;
import X.C1685720ty6;
import X.C1685760tyA;
import X.C1688120u1y;
import X.C1691430u7J;
import X.C2097608Jq;
import X.C259800zU;
import X.C594920NVa;
import X.C594950NVd;
import X.EnumC1667040tTy;
import X.InterfaceC1668050tVb;
import X.InterfaceC1672350tcX;
import X.InterfaceC1673370teB;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC20032213Zo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS533S0100000_25 implements Function2 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS533S0100000_25(Function2 function2, int i) {
        this.$t = i;
        if (1 - i != 0) {
            this.l0 = function2;
        } else {
            this.l0 = function2;
        }
    }

    public AObjectS533S0100000_25(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS533S0100000_25 aObjectS533S0100000_25, Object obj, Object obj2) {
        C594920NVa c594920NVa = (C594920NVa) aObjectS533S0100000_25.l0;
        C1673090tdj c1673090tdj = new C1673090tdj();
        c1673090tdj.LIZ(0.0f, C0NWB.LIZ);
        c1673090tdj.LIZ((int) (((C1682900ttY) obj).LIZ & 4294967295L), C0NWC.LIZ);
        List<T> list = c1673090tdj.LIZ;
        float[] fArr = c1673090tdj.LIZIZ;
        int size = ((ArrayList) list).size();
        C1691430u7J.LIZ(size, fArr.length);
        return new Pair(new C594950NVd(list, Arrays.copyOfRange(fArr, 0, size)), c594920NVa.LJ());
    }

    public static final Object invoke$1(AObjectS533S0100000_25 aObjectS533S0100000_25, Object obj, Object obj2) {
        int i;
        InterfaceC1672350tcX interfaceC1672350tcX = (InterfaceC1672350tcX) obj;
        C1682380tsi c1682380tsi = (C1682380tsi) obj2;
        List<InterfaceC1673370teB> listLJJLIL = interfaceC1672350tcX.LJJLIL(Unit.LIZ, (Function2) aObjectS533S0100000_25.l0);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIL, 10));
        Iterator<InterfaceC1673370teB> it2 = listLJJLIL.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LJJJJZ(c1682380tsi.LIZ));
        }
        if (arrayList.size() == 1) {
            i = 16;
        } else {
            i = 4;
        }
        float f = i;
        Iterator it3 = arrayList.iterator();
        int iLJJL = 0;
        while (it3.hasNext()) {
            iLJJL += ((AbstractC1686530tzP) it3.next()).LJJL();
        }
        return interfaceC1672350tcX.LJLJJL(C1682380tsi.LJIIIIZZ(c1682380tsi.LIZ), iLJJL + ((int) interfaceC1672350tcX.LJJJJLL(f)), C2097608Jq.LJ(), new AObjectS368S0100000_25(arrayList, 12));
    }

    public static final Object invoke$2(AObjectS533S0100000_25 aObjectS533S0100000_25, Object obj, Object obj2) {
        boolean z;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            if (((C259800zU) aObjectS533S0100000_25.l0).element == EnumC1667040tTy.LL) {
                z = true;
            } else {
                z = false;
            }
            C1666970tTr.LIZLLL(z, interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS533S0100000_25 aObjectS533S0100000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            InterfaceC1668050tVb.LIZ.getClass();
            C1296880jqw c1296880jqw = C1668040tVa.LJIIJJI;
            Function2 function2 = (Function2) aObjectS533S0100000_25.l0;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, c1296880jqw, interfaceC1680500tpg, 48);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, c1685760tyA);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg.LJJIII();
                if (interfaceC1680500tpg.LJJIIZ()) {
                    interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, c1688120u1yLIZ, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                interfaceC1680500tpg.LJJIIJZLJL(1980339416);
                if (function2 != null) {
                    function2.invoke(interfaceC1680500tpg, 0);
                }
                interfaceC1680500tpg.LJ();
                interfaceC1680500tpg.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS533S0100000_25 aObjectS533S0100000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            InterfaceC1668050tVb.LIZ.getClass();
            C1296880jqw c1296880jqw = C1668040tVa.LJIIJJI;
            Function2 function2 = (Function2) aObjectS533S0100000_25.l0;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, c1296880jqw, interfaceC1680500tpg, 48);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, c1685760tyA);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg.LJJIII();
                if (interfaceC1680500tpg.LJJIIZ()) {
                    interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, c1688120u1yLIZ, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                interfaceC1680500tpg.LJJIIJZLJL(-1656244969);
                if (function2 != null) {
                    function2.invoke(interfaceC1680500tpg, 0);
                }
                interfaceC1680500tpg.LJ();
                interfaceC1680500tpg.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS533S0100000_25 aObjectS533S0100000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            InterfaceC1668050tVb.LIZ.getClass();
            C1296880jqw c1296880jqw = C1668040tVa.LJIIJJI;
            Function2 function2 = (Function2) aObjectS533S0100000_25.l0;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, c1296880jqw, interfaceC1680500tpg, 48);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, c1685760tyA);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg.LJJIII();
                if (interfaceC1680500tpg.LJJIIZ()) {
                    interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, c1688120u1yLIZ, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                interfaceC1680500tpg.LJJIIJZLJL(-997862186);
                if (function2 != null) {
                    function2.invoke(interfaceC1680500tpg, 0);
                }
                interfaceC1680500tpg.LJ();
                interfaceC1680500tpg.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }
}
