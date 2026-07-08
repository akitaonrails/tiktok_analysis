package Y;

import X.C1472520oQE;
import X.C1473080oR8;
import X.C1474810oTv;
import X.C1477400oY6;
import X.C1478160oZK;
import X.C1480430ocz;
import X.C1481310oeP;
import X.C1481530oel;
import X.C1481690of1;
import X.C1481950ofR;
import X.C1482520ogM;
import X.C1C7U;
import X.C2188811AlT;
import X.C582130MsN;
import X.EnumC585580Mxw;
import X.InterfaceC1481730of5;
import X.InterfaceC1481780ofA;
import X.InterfaceC1481870ofJ;
import X.InterfaceC585470Mxl;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes24.dex */
public class ACallableS0S1710000_23 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public String s0;
    public boolean z8;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    public static final Object call$0(ACallableS0S1710000_23 aCallableS0S1710000_23) {
        ?? IsCache;
        int i;
        int iLIZLLL;
        String strLIZIZ;
        int i2;
        HashMap<String, Object> mapLJ;
        Object obj;
        Float f;
        InterfaceC1481780ofA interfaceC1481780ofA = (InterfaceC1481780ofA) aCallableS0S1710000_23.l1;
        SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) aCallableS0S1710000_23.l2;
        InterfaceC1481730of5 interfaceC1481730of5 = (InterfaceC1481730of5) aCallableS0S1710000_23.l3;
        boolean z = aCallableS0S1710000_23.z8;
        String str = aCallableS0S1710000_23.s0;
        Long l = (Long) aCallableS0S1710000_23.l4;
        C1480430ocz c1480430ocz = (C1480430ocz) aCallableS0S1710000_23.l5;
        InterfaceC585470Mxl interfaceC585470Mxl = (InterfaceC585470Mxl) aCallableS0S1710000_23.l6;
        HashMap map = (HashMap) aCallableS0S1710000_23.l7;
        C1C7U.LIZ("SimReporterSdkImpl@afcb.reportVideoBufferingEvent$1L");
        if (interfaceC1481780ofA != null) {
            IsCache = interfaceC1481780ofA.isCache(simVideoUrlModel);
        } else {
            IsCache = 0;
        }
        float f2 = 1.0f;
        if (interfaceC1481730of5 != null && (f = (Float) interfaceC1481730of5.LJIJI(C1473080oR8.LIZLLL)) != null) {
            float fFloatValue = f.floatValue();
            if (fFloatValue != 1.0f) {
                i = 1;
            } else {
                i = 0;
            }
            f2 = fFloatValue;
        } else {
            i = 0;
        }
        C1481950ofR c1481950ofR = new C1481950ofR();
        C1481690of1 c1481690of1 = c1481950ofR.LIZ;
        c1481690of1.LJI = z;
        c1481690of1.LIZ = IsCache;
        c1481950ofR.LIZ.LIZIZ = interfaceC1481730of5.LJIIJ();
        c1481950ofR.LIZ.LJIIIIZZ = C1481310oeP.LJIIIIZZ(interfaceC1481730of5);
        c1481950ofR.LIZ.LIZJ = interfaceC1481730of5.getCurrentPosition();
        if (interfaceC1481780ofA != null) {
            iLIZLLL = interfaceC1481780ofA.LIZLLL();
        } else {
            iLIZLLL = 0;
        }
        c1481950ofR.LIZ.LJ = iLIZLLL;
        if (C1474810oTv.LLJJJJ()) {
            strLIZIZ = C1481310oeP.LJIIJJI(str);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(l);
            sbLIZ.append("");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        c1481950ofR.LIZ.LJII = strLIZIZ;
        c1481950ofR.LIZ.LJIIL = C1481310oeP.LJI(str);
        int iLJFF = C1481310oeP.LJFF(str);
        C1481690of1 c1481690of12 = c1481950ofR.LIZ;
        c1481690of12.LJIILIIL = iLJFF;
        c1481690of12.LJIILL = f2;
        c1481690of12.LJIILJJIL = i;
        if (c1480430ocz == null) {
            i2 = -1;
        } else {
            i2 = c1480430ocz.LJIIIZ;
        }
        c1481690of12.LIZ(Integer.valueOf(i2), "url_type");
        if (interfaceC585470Mxl != null) {
            c1481690of12.LIZ(interfaceC585470Mxl.LJIIJJI(), "play_type");
            c1481690of12.LIZIZ(interfaceC585470Mxl.LJIIJ(str, z));
        }
        Map map2 = (Map) interfaceC1481730of5.LJIJI(C1472520oQE.LIZLLL);
        if (map2 != null && !map2.isEmpty()) {
            for (String str2 : map2.keySet()) {
                c1481690of12.LIZ(map2.get(str2), str2);
            }
        }
        if (interfaceC585470Mxl != null && (mapLJ = interfaceC585470Mxl.LJ(str)) != null && (obj = mapLJ.get("story_type")) != null && (obj instanceof String)) {
            c1481690of12.LIZ(obj, "story_type");
        }
        c1481690of12.LIZIZ(map);
        C1C7U.LIZIZ("SimReporterSdkImpl@afcb.reportVideoBufferingEvent$1L");
        return c1481690of12;
    }

    public static final Object call$1(ACallableS0S1710000_23 aCallableS0S1710000_23) throws InterruptedException {
        String strLIZIZ;
        int i;
        C1C7U.LIZ("SimReporterImpl@9443.reportVideoBufferingEvent$1");
        C1481950ofR c1481950ofR = new C1481950ofR();
        c1481950ofR.LIZ.LIZJ = ((InterfaceC1481730of5) aCallableS0S1710000_23.l1).getCurrentPosition();
        c1481950ofR.LIZ.LIZIZ = ((InterfaceC1481730of5) aCallableS0S1710000_23.l1).LJIIJ();
        c1481950ofR.LIZ.LJIIIIZZ = ((InterfaceC1481730of5) aCallableS0S1710000_23.l1).getPlayerType().toString();
        c1481950ofR.LIZ.LJ = C582130MsN.LIZ().LJ().LIZLLL();
        boolean zIsCache = C1478160oZK.LIZ().isCache((SimVideoUrlModel) aCallableS0S1710000_23.l2);
        c1481950ofR.LIZ.LIZ = zIsCache ? 1 : 0;
        C1478160oZK.LIZ().LJJLIIIJJIZ((SimVideoUrlModel) aCallableS0S1710000_23.l2);
        if (((C1481530oel) aCallableS0S1710000_23.l7).LJFF()) {
            ((C1481530oel) aCallableS0S1710000_23.l7).LIZJ.await();
        }
        c1481950ofR.LIZ.LJI = aCallableS0S1710000_23.z8;
        if (C1474810oTv.LLJJJJ()) {
            strLIZIZ = C1477400oY6.LJJJJI.LJIILJJIL(aCallableS0S1710000_23.s0);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((Long) aCallableS0S1710000_23.l3);
            sbLIZ.append("");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        C1481690of1 c1481690of1 = c1481950ofR.LIZ;
        c1481690of1.LJII = strLIZIZ;
        InterfaceC1481870ofJ interfaceC1481870ofJ = ((C1482520ogM) aCallableS0S1710000_23.l4).LLILZ;
        if (interfaceC1481870ofJ != null) {
            c1481690of1.LIZIZ(interfaceC1481870ofJ.LJI());
        }
        c1481690of1.LIZIZ((HashMap) aCallableS0S1710000_23.l5);
        C1480430ocz c1480430ocz = (C1480430ocz) aCallableS0S1710000_23.l6;
        if (c1480430ocz == null) {
            i = -1;
        } else {
            i = c1480430ocz.LJIIIZ;
        }
        c1481690of1.LIZ(Integer.valueOf(i), "url_type");
        C1C7U.LIZIZ("SimReporterImpl@9443.reportVideoBufferingEvent$1");
        return c1481690of1;
    }

    public ACallableS0S1710000_23(C1481530oel c1481530oel, InterfaceC1481730of5 interfaceC1481730of5, SimVideoUrlModel simVideoUrlModel, String str, Long l, C1482520ogM c1482520ogM, HashMap map, C1480430ocz c1480430ocz, int i) {
        this.$t = i;
        this.l7 = c1481530oel;
        this.l1 = interfaceC1481730of5;
        this.l2 = simVideoUrlModel;
        this.z8 = true;
        this.s0 = str;
        this.l3 = l;
        this.l4 = c1482520ogM;
        this.l5 = map;
        this.l6 = c1480430ocz;
    }

    public ACallableS0S1710000_23(InterfaceC1481780ofA interfaceC1481780ofA, SimVideoUrlModel simVideoUrlModel, InterfaceC1481730of5 interfaceC1481730of5, boolean z, EnumC585580Mxw enumC585580Mxw, String str, Long l, C1480430ocz c1480430ocz, InterfaceC585470Mxl interfaceC585470Mxl, HashMap map, int i) {
        this.$t = i;
        this.l1 = interfaceC1481780ofA;
        this.l2 = simVideoUrlModel;
        this.l3 = interfaceC1481730of5;
        this.z8 = z;
        this.s0 = str;
        this.l4 = l;
        this.l5 = c1480430ocz;
        this.l6 = interfaceC585470Mxl;
        this.l7 = map;
    }
}
