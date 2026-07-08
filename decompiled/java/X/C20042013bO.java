package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS239S0300000_30;
import kotlin.jvm.internal.AwS63S0301000_30;

/* JADX INFO: renamed from: X.13bO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20042013bO implements InterfaceC20043013bY {
    public static final C1687100u0K LIZLLL = new C1687100u0K(AFwS274S0000000_30.get$arr$(285), new C20042113bP());
    public final Map<Object, Map<String, List<Object>>> LIZ;
    public final Map<Object, C20042213bQ> LIZIZ;
    public InterfaceC20041513bJ LIZJ;

    public C20042013bO() {
        this(0);
    }

    public C20042013bO(Map<Object, Map<String, List<Object>>> map) {
        this.LIZ = map;
        this.LIZIZ = new LinkedHashMap();
    }

    @Override // X.InterfaceC20043013bY
    public final void LJ(Object obj) {
        C20042213bQ c20042213bQ = (C20042213bQ) ((LinkedHashMap) this.LIZIZ).get(obj);
        if (c20042213bQ != null) {
            c20042213bQ.LIZIZ = false;
        } else {
            this.LIZ.remove(obj);
        }
    }

    public /* synthetic */ C20042013bO(int i) {
        this(new LinkedHashMap());
    }

    @Override // X.InterfaceC20043013bY
    public final void LIZLLL(Object obj, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1198538093);
        c13zcLJIIJ.LJJIJIIJIL(444418301);
        c13zcLJIIJ.LJIILL(obj);
        c13zcLJIIJ.LJJIJIIJIL(-492369756);
        Object objLJJ = c13zcLJIIJ.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        if (objLJJ == C1680510tph.LIZIZ) {
            InterfaceC20041513bJ interfaceC20041513bJ = this.LIZJ;
            if (interfaceC20041513bJ != null && !interfaceC20041513bJ.LIZ(obj)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Type of the key ");
                sbLIZ.append(obj);
                sbLIZ.append(" is not supported. On Android you can only use types which can be stored inside the Bundle.");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalArgumentException(strLIZIZ);
            }
            objLJJ = new C20042213bQ(this, obj);
            c13zcLJIIJ.LJJIJIIJI(objLJJ);
        }
        c13zcLJIIJ.LJJJJL(false);
        C20042213bQ c20042213bQ = (C20042213bQ) objLJJ;
        C13ZT.LIZIZ(new C13DO[]{C20043213ba.LIZ.LIZJ(c20042213bQ.LIZJ)}, function2, c13zcLJIIJ, (i & 112) | 8);
        C1680540tpk.LIZIZ(Unit.LIZ, new AwS239S0300000_30(c20042213bQ, this, obj, 11), c13zcLJIIJ);
        c13zcLJIIJ.LJIL();
        c13zcLJIIJ.LJJJJL(false);
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS63S0301000_30(this, (C20042013bO) obj, (Object) function2, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) i, 1);
        }
    }
}
