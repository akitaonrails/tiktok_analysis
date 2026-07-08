package Y;

import X.C1474810oTv;
import X.C1477130oXf;
import X.C1477400oY6;
import X.C1478160oZK;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1481310oeP;
import X.C1481530oel;
import X.C1481690of1;
import X.C1481720of4;
import X.C1481950ofR;
import X.C1481970ofT;
import X.C1482520ogM;
import X.C1946807ju;
import X.C1C7U;
import X.C2188811AlT;
import X.C582130MsN;
import X.EnumC585580Mxw;
import X.InterfaceC1481730of5;
import X.InterfaceC1481780ofA;
import X.InterfaceC1481870ofJ;
import X.InterfaceC585470Mxl;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes24.dex */
public class ACallableS0S1800000_23 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public Object l8;
    public String s0;

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
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    public static final Object call$0(ACallableS0S1800000_23 aCallableS0S1800000_23) {
        ?? IsCache;
        int iLIZLLL;
        String strLIZIZ;
        int i;
        InterfaceC1481780ofA interfaceC1481780ofA = (InterfaceC1481780ofA) aCallableS0S1800000_23.l1;
        SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) aCallableS0S1800000_23.l2;
        EnumC585580Mxw enumC585580Mxw = (EnumC585580Mxw) aCallableS0S1800000_23.l3;
        InterfaceC1481730of5 interfaceC1481730of5 = (InterfaceC1481730of5) aCallableS0S1800000_23.l4;
        String str = aCallableS0S1800000_23.s0;
        Long l = (Long) aCallableS0S1800000_23.l5;
        C1480430ocz c1480430ocz = (C1480430ocz) aCallableS0S1800000_23.l6;
        InterfaceC585470Mxl interfaceC585470Mxl = (InterfaceC585470Mxl) aCallableS0S1800000_23.l7;
        HashMap map = (HashMap) aCallableS0S1800000_23.l8;
        C1C7U.LIZ("SimReporterSdkImpl@afcb.reportVideoPause$1L");
        int iLJIIJ = 0;
        if (interfaceC1481780ofA != null) {
            IsCache = interfaceC1481780ofA.isCache(simVideoUrlModel);
        } else {
            IsCache = 0;
        }
        C1481950ofR c1481950ofR = new C1481950ofR();
        c1481950ofR.LIZ.LIZ = IsCache;
        c1481950ofR.LIZ.LJIIIIZZ = C1481310oeP.LJIIIIZZ(interfaceC1481730of5);
        if (interfaceC1481780ofA != null) {
            iLIZLLL = interfaceC1481780ofA.LIZLLL();
        } else {
            iLIZLLL = 0;
        }
        c1481950ofR.LIZ.LJ = iLIZLLL;
        if (interfaceC1481730of5 != null) {
            iLJIIJ = interfaceC1481730of5.LJIIJ();
        }
        c1481950ofR.LIZ.LIZIZ = iLJIIJ;
        if (C1474810oTv.LLJJJJ()) {
            strLIZIZ = C1481310oeP.LJIIJJI(str);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(l);
            sbLIZ.append("");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        C1481690of1 c1481690of1 = c1481950ofR.LIZ;
        c1481690of1.LJII = strLIZIZ;
        if (EnumC585580Mxw.T_FEED == enumC585580Mxw) {
            if (c1480430ocz == null) {
                i = -1;
            } else {
                i = c1480430ocz.LJIIIZ;
            }
            c1481690of1.LIZ(Integer.valueOf(i), "url_type");
        }
        if (interfaceC585470Mxl != null) {
            c1481690of1.LIZ(interfaceC585470Mxl.LJIIJJI(), "play_type");
            c1481690of1.LIZIZ(interfaceC585470Mxl.LJIIJ(str, true));
        }
        c1481690of1.LIZIZ(map);
        C1C7U.LIZIZ("SimReporterSdkImpl@afcb.reportVideoPause$1L");
        return c1481690of1;
    }

    public static final Object call$1(ACallableS0S1800000_23 aCallableS0S1800000_23) throws InterruptedException {
        long duration;
        String strLIZIZ;
        int iLJJJJL;
        long jLJJIZ;
        String string;
        String strLIZIZ2;
        int i;
        C1C7U.LIZ("SimReporterImpl@9443.reportVideoPlayFailEvent$1");
        C1481970ofT c1481970ofT = new C1481970ofT();
        InterfaceC1481730of5 interfaceC1481730of5 = (InterfaceC1481730of5) aCallableS0S1800000_23.l1;
        if (interfaceC1481730of5 != null) {
            duration = interfaceC1481730of5.getDuration();
        } else {
            duration = -1;
        }
        C1481530oel c1481530oel = (C1481530oel) aCallableS0S1800000_23.l8;
        InterfaceC1481730of5 interfaceC1481730of52 = (InterfaceC1481730of5) aCallableS0S1800000_23.l1;
        c1481530oel.getClass();
        Session sessionLJI = null;
        if (interfaceC1481730of52 != null) {
            strLIZIZ = interfaceC1481730of52.LIZIZ();
        } else {
            strLIZIZ = null;
        }
        C1481530oel c1481530oel2 = (C1481530oel) aCallableS0S1800000_23.l8;
        SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) aCallableS0S1800000_23.l2;
        c1481530oel2.getClass();
        int i2 = -1;
        if (simVideoUrlModel != null) {
            iLJJJJL = C1478160oZK.LIZ().LJJJJL(simVideoUrlModel);
        } else {
            iLJJJJL = -1;
        }
        c1481970ofT.LIZ.LJIIIZ = iLJJJJL;
        C1481530oel c1481530oel3 = (C1481530oel) aCallableS0S1800000_23.l8;
        SimVideoUrlModel simVideoUrlModel2 = (SimVideoUrlModel) aCallableS0S1800000_23.l2;
        c1481530oel3.getClass();
        if (simVideoUrlModel2 != null) {
            jLJJIZ = C1478160oZK.LIZ().LJJIZ(simVideoUrlModel2);
        } else {
            jLJJIZ = 0;
        }
        c1481970ofT.LIZ.LJIIJ = jLJJIZ;
        c1481970ofT.LIZ.LJIIIIZZ = String.valueOf(C582130MsN.LIZ().LJ().LIZLLL());
        InterfaceC1481730of5 interfaceC1481730of53 = (InterfaceC1481730of5) aCallableS0S1800000_23.l1;
        if (interfaceC1481730of53 != null) {
            string = interfaceC1481730of53.getPlayerType().toString();
        } else {
            string = null;
        }
        c1481970ofT.LIZ.LJIILIIL = string;
        if (((C1481530oel) aCallableS0S1800000_23.l8).LJFF()) {
            ((C1481530oel) aCallableS0S1800000_23.l8).LIZJ.await();
        }
        SimVideoUrlModel simVideoUrlModel3 = (SimVideoUrlModel) aCallableS0S1800000_23.l2;
        if (simVideoUrlModel3 != null) {
            sessionLJI = C1477400oY6.LJJJJI.LJI(simVideoUrlModel3.getUri());
            if (duration <= 0) {
                duration = (long) ((SimVideoUrlModel) aCallableS0S1800000_23.l2).getDuration();
            }
            if (strLIZIZ == null && sessionLJI != null) {
                strLIZIZ = sessionLJI.url;
            }
        }
        c1481970ofT.LIZ.LIZ = String.valueOf(((C1481290oeN) aCallableS0S1800000_23.l3).LJ);
        c1481970ofT.LIZ.LIZIZ = String.valueOf(((C1481290oeN) aCallableS0S1800000_23.l3).LJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1481290oeN) aCallableS0S1800000_23.l3).LJI);
        sbLIZ.append(", surface_diff_");
        sbLIZ.append(((C1481290oeN) aCallableS0S1800000_23.l3).LJII);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ);
        C1481720of4 c1481720of4 = c1481970ofT.LIZ;
        c1481720of4.LIZJ = strLIZIZ3;
        c1481720of4.LJ = aCallableS0S1800000_23.s0;
        c1481720of4.LJIIJJI = duration;
        c1481720of4.LJIIL = strLIZIZ;
        c1481970ofT.LIZ.LJFF = C1946807ju.LIZ;
        c1481970ofT.LIZ.LJI = String.valueOf(((C1481290oeN) aCallableS0S1800000_23.l3).LIZJ);
        c1481970ofT.LIZ.LJII = String.valueOf(((C1481290oeN) aCallableS0S1800000_23.l3).LIZLLL ? 1 : 0);
        if (C1474810oTv.LLJJJJ()) {
            strLIZIZ2 = C1477400oY6.LJJJJI.LJIILJJIL(aCallableS0S1800000_23.s0);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append((Long) aCallableS0S1800000_23.l4);
            sbLIZ2.append("");
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        }
        C1481720of4 c1481720of42 = c1481970ofT.LIZ;
        c1481720of42.LJIILJJIL = strLIZIZ2;
        InterfaceC1481870ofJ interfaceC1481870ofJ = ((C1482520ogM) aCallableS0S1800000_23.l5).LLILZ;
        if (interfaceC1481870ofJ != null) {
            c1481720of42.LIZIZ(interfaceC1481870ofJ.LJIIIIZZ());
        }
        SimVideoUrlModel simVideoUrlModel4 = (SimVideoUrlModel) aCallableS0S1800000_23.l2;
        if (simVideoUrlModel4 != null) {
            c1481720of42.LIZ(Integer.valueOf(C1477130oXf.LJI(simVideoUrlModel4.getCreateTime(), ((SimVideoUrlModel) aCallableS0S1800000_23.l2).getCdnUrlExpired(), strLIZIZ) ? 1 : 0), "is_cdn_expired");
            if (sessionLJI != null) {
                i = sessionLJI.cdnUrlCandidatesNum;
            } else {
                i = 0;
            }
            c1481720of42.LIZ(Integer.valueOf(i), "cdn_url_num");
        }
        c1481720of42.LIZIZ((HashMap) aCallableS0S1800000_23.l6);
        C1480430ocz c1480430ocz = (C1480430ocz) aCallableS0S1800000_23.l7;
        if (c1480430ocz != null) {
            i2 = c1480430ocz.LJIIIZ;
        }
        c1481720of42.LIZ(Integer.valueOf(i2), "url_type");
        C1C7U.LIZIZ("SimReporterImpl@9443.reportVideoPlayFailEvent$1");
        return c1481720of42;
    }

    public ACallableS0S1800000_23(Object obj, Object obj2, Object obj3, Object obj4, String str, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.l4 = obj4;
        this.s0 = str;
        this.l5 = obj5;
        this.l6 = obj6;
        this.l7 = obj7;
        this.l8 = obj8;
    }
}
