package X;

import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerSettings;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;
import webcast.api.creator.StreamResolution;

/* JADX INFO: renamed from: X.1D4I, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D4I {
    public static C2250021D4u LIZ;
    public static C1D47 LIZIZ;
    public static volatile Pair<Integer, Boolean> LIZJ;
    public static boolean LIZLLL;

    public static C1D47 LIZ() {
        C1D49 c1d49;
        C2250021D4u c2250021D4u = LIZ;
        EnumC1277260jLI enumC1277260jLI = null;
        C1D47 c1d47LJ = c2250021D4u != null ? c2250021D4u.LIZIZ().LJ(new C776580UdE()) : null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getDefaultVQResult ProbeCache -> ");
        if (c1d47LJ != null && (c1d49 = c1d47LJ.LJIIIIZZ) != null) {
            enumC1277260jLI = c1d49.LJIIL;
        }
        sbLIZ.append(enumC1277260jLI);
        C20441214yg.LIZIZ("LiveSpeedTestAdapter", C2188811AlT.LIZIZ(sbLIZ));
        return c1d47LJ;
    }

    public static JSONObject LIZIZ() {
        C2250021D4u c2250021D4u = LIZ;
        JSONObject jSONObjectLJIIJJI = c2250021D4u != null ? c2250021D4u.LIZIZ().LJIIJJI() : null;
        C20441214yg.LJIIIZ("LiveSpeedTestAdapter#live_take", String.valueOf(jSONObjectLJIIJJI));
        return jSONObjectLJIIJJI;
    }

    public static C1D47 LIZLLL() {
        C1D47 c1d47LJIJI;
        C1D49 c1d49;
        C2250021D4u c2250021D4u = LIZ;
        EnumC1277260jLI enumC1277260jLI = null;
        if (c2250021D4u != null) {
            C1D4C c1d4cLIZIZ = c2250021D4u.LIZIZ();
            C776580UdE c776580UdE = new C776580UdE();
            c776580UdE.LIZ = false;
            c1d47LJIJI = c1d4cLIZIZ.LJIJI(c776580UdE);
        } else {
            c1d47LJIJI = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRecommendVQResult ProbeCache -> ");
        if (c1d47LJIJI != null && (c1d49 = c1d47LJIJI.LJIIIIZZ) != null) {
            enumC1277260jLI = c1d49.LJIIL;
        }
        sbLIZ.append(enumC1277260jLI);
        C20441214yg.LIZIZ("LiveSpeedTestAdapter", C2188811AlT.LIZIZ(sbLIZ));
        return c1d47LJIJI;
    }

    public static C1D47 LJFF() {
        InterfaceC1269880j9O logIODevice;
        C2250021D4u c2250021D4u = LIZ;
        C1D47 c1d47LJ = c2250021D4u != null ? c2250021D4u.LIZIZ().LJ(new C776580UdE()) : null;
        LIZIZ = c1d47LJ;
        C20441214yg.LJIIIZ("LiveSpeedTestAdapter#room/create", String.valueOf(c1d47LJ));
        C1282680jU2 c1282680jU2 = C0USS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRoomCreateParam -> ");
        sbLIZ.append(LIZIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1282680jU2.LIZ(4, "LiveSpeedTestAdapter", strLIZIZ);
        if (c1282680jU2.LIZJ && 4 >= c1282680jU2.LIZIZ && (logIODevice = AVLog.getLogIODevice()) != null) {
            logIODevice.LIZIZ(4, "LiveSpeedTestAdapter", "video_quality_log", strLIZIZ, null);
        }
        return LIZIZ;
    }

    public static List LJIIIIZZ() {
        List<C1283050jUd> listLJIIZILJ;
        ArrayList arrayList = new ArrayList();
        C2250021D4u c2250021D4u = LIZ;
        if (c2250021D4u != null && ((c2250021D4u.LJIIJJI || c2250021D4u.LJIILIIL) && (listLJIIZILJ = c2250021D4u.LIZIZ().LJIIZILJ()) != null && (r4 = listLJIIZILJ.iterator()) != null)) {
            for (C1283050jUd c1283050jUd : listLJIIZILJ) {
                StreamResolution streamResolution = new StreamResolution();
                streamResolution.resolutionText = c1283050jUd.LIZJ;
                streamResolution.resolutionDescribe = c1283050jUd.LIZLLL;
                streamResolution.streamResolution = c1283050jUd.LIZIZ;
                streamResolution.minBitRate = (int) c1283050jUd.LIZ;
                arrayList.add(streamResolution);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static int LIZJ() {
        return C804420Vh2.LJ(GlobalContext.getApplicationContext()).getValue();
    }

    public static C1D47 LJI() {
        C1D49 c1d49;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRoomCreateVQResult ProbeCache -> ");
        C1D47 c1d47 = LIZIZ;
        EnumC1277260jLI enumC1277260jLI = null;
        if (c1d47 != null && (c1d49 = c1d47.LJIIIIZZ) != null) {
            enumC1277260jLI = c1d49.LJIIL;
        }
        sbLIZ.append(enumC1277260jLI);
        C20441214yg.LIZIZ("LiveSpeedTestAdapter", C2188811AlT.LIZIZ(sbLIZ));
        return LIZIZ;
    }

    public static C1D47 LJII() {
        C1D49 c1d49;
        EnumC2249801D3y enumC2249801D3y;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRoomCreateVQResultValidCache ProbeCache -> ");
        C1D47 c1d47 = LIZIZ;
        sbLIZ.append(c1d47 != null ? c1d47.LJIIIIZZ : null);
        C20441214yg.LIZIZ("LiveSpeedTestAdapter", C2188811AlT.LIZIZ(sbLIZ));
        TTLHVideoQualityStrategyManagerSettings tTLHVideoQualityStrategyManagerSettings = TTLHVideoQualityStrategyManagerSettings.INSTANCE;
        if (tTLHVideoQualityStrategyManagerSettings.enableNewStructure()) {
            return null;
        }
        C1D5C serverGlobalSettings = tTLHVideoQualityStrategyManagerSettings.getServerGlobalSettings();
        if (serverGlobalSettings.LJIIJJI == 1) {
            return null;
        }
        int i = serverGlobalSettings.LJIIJ;
        C1D47 c1d472 = LIZIZ;
        if (c1d472 == null || (c1d49 = c1d472.LJIIIIZZ) == null || c1d49.LIZ() <= 0 || ((i != 1 && c1d472.LIZJ() < c1d472.LJIIIIZZ.LJII) || !((enumC2249801D3y = c1d472.LJIIIIZZ.LJ) == EnumC2249801D3y.CURRENT_RESULT || enumC2249801D3y == EnumC2249801D3y.FROM_MEMORY_CACHE))) {
            return null;
        }
        return c1d472;
    }

    public static Pair LJ(boolean z) {
        C1D47 c1d47LJIJI;
        Integer numValueOf;
        EnumC2249801D3y enumC2249801D3y;
        boolean z2;
        EnumC2249801D3y enumC2249801D3y2;
        C2250021D4u c2250021D4u = LIZ;
        Boolean boolValueOf = null;
        if (c2250021D4u != null) {
            C1D4C c1d4cLIZIZ = c2250021D4u.LIZIZ();
            C776580UdE c776580UdE = new C776580UdE();
            c776580UdE.LIZ = z;
            c1d47LJIJI = c1d4cLIZIZ.LJIJI(c776580UdE);
        } else {
            c1d47LJIJI = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRecommendVideoQualityResult()-> ");
        if (c1d47LJIJI != null) {
            numValueOf = Integer.valueOf(c1d47LJIJI.LIZJ());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(' ');
        boolean z3 = false;
        if (c1d47LJIJI != null) {
            if (c1d47LJIJI.LJIILL) {
                z2 = !c1d47LJIJI.LJIILLIIL;
            } else {
                C1D49 c1d49 = c1d47LJIJI.LJIIIIZZ;
                if (c1d49 != null && ((enumC2249801D3y2 = c1d49.LJ) == EnumC2249801D3y.CURRENT_RESULT || enumC2249801D3y2 == EnumC2249801D3y.FROM_MEMORY_CACHE)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            boolValueOf = Boolean.valueOf(z2);
        }
        sbLIZ.append(boolValueOf);
        C20441214yg.LIZIZ("LiveSpeedTestController", C2188811AlT.LIZIZ(sbLIZ));
        if (c1d47LJIJI != null) {
            Integer numValueOf2 = Integer.valueOf(c1d47LJIJI.LIZJ());
            if (c1d47LJIJI.LJIILL) {
                z3 = !c1d47LJIJI.LJIILLIIL;
            } else {
                C1D49 c1d492 = c1d47LJIJI.LJIIIIZZ;
                if (c1d492 != null && ((enumC2249801D3y = c1d492.LJ) == EnumC2249801D3y.CURRENT_RESULT || enumC2249801D3y == EnumC2249801D3y.FROM_MEMORY_CACHE)) {
                    z3 = true;
                }
            }
            return new Pair(numValueOf2, Boolean.valueOf(z3));
        }
        return new Pair(-1, Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0108 A[PHI: r9
      0x0108: PHI (r9v1 boolean) = (r9v0 boolean), (r9v3 boolean) binds: [B:35:0x009d, B:39:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(boolean r13) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1D4I.LJIIIZ(boolean):void");
    }
}
