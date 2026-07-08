package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.main.spi.HomePageTabCompatServiceImpl;
import com.ss.android.ugc.aweme.spi.HomePageTabCompatService;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0rM6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1585280rM6 {
    public static ConcurrentHashMap<String, Object> LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static EnumC1585290rM7 LJFF;
    public static boolean LJII;
    public static final HomePageTabCompatService LIZ = HomePageTabCompatServiceImpl.LJI();
    public static boolean LJ = true;
    public static boolean LJI = true;
    public static final Map<String, Map<String, Boolean>> LJIIIIZZ = new LinkedHashMap();
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(new C1585560rMY());
    public static final C01GW LJIIJ = C452501pT.LIZIZ(new C1585570rMZ());
    public static final C01GW LJIIJJI = C452501pT.LIZIZ(new C1585550rMX());

    public static void LIZIZ(String str) {
        try {
            StringBuffer stringBuffer = (StringBuffer) LJIIJJI.getValue();
            stringBuffer.append(str);
            stringBuffer.append(" ");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("recordTabDuplicateLog exception:");
            sbLIZ.append(e.getMessage());
            C1720106oR.LJI("fcp_tab_monitor", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZJ(final String str) {
        LIZ.LIZ().execute(new Runnable() { // from class: X.0rMB
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TabProcessMonitor@51ee.recordTabLog$1");
                try {
                    StringBuffer stringBuffer = (StringBuffer) C1585280rM6.LJIIIZ.getValue();
                    stringBuffer.append(str);
                    stringBuffer.append(" | ");
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TabProcessMonitor@51ee.recordTabLog$1");
            }
        });
    }

    public static void LIZLLL(final String str) {
        LIZ.LIZ().execute(new Runnable() { // from class: X.0rMC
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TabProcessMonitor@51ee.recordTabOperatorLog$1");
                try {
                    StringBuffer stringBuffer = (StringBuffer) C1585280rM6.LJIIJ.getValue();
                    stringBuffer.append(str);
                    stringBuffer.append(" | ");
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TabProcessMonitor@51ee.recordTabOperatorLog$1");
            }
        });
    }

    public static void LIZ(EnumC1585320rMA enumC1585320rMA, EnumC1585880rN4 enumC1585880rN4, EnumC1585100rLo enumC1585100rLo, EnumC1585290rM7 enumC1585290rM7) {
        LJFF = enumC1585290rM7;
        if (!LIZJ && LIZIZ == null) {
            LIZIZ = new ConcurrentHashMap<>();
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZIZ;
        if (concurrentHashMap != null) {
            if (enumC1585320rMA != null) {
                concurrentHashMap.put(EnumC1585300rM8.ERROR_STAGE.getCateGoryStr(), enumC1585320rMA.getStageStr());
            }
            if (enumC1585880rN4 != null) {
                concurrentHashMap.put(EnumC1585300rM8.OPERATION_TYPE.getCateGoryStr(), enumC1585880rN4.getTypeStr());
            }
            if (enumC1585100rLo != null) {
                concurrentHashMap.put(EnumC1585300rM8.ERROR_TAB_PART.getCateGoryStr(), enumC1585100rLo.getPartStr());
            }
            concurrentHashMap.put(EnumC1585300rM8.ERROR_REASON.getCateGoryStr(), enumC1585290rM7);
            if (enumC1585290rM7 == EnumC1585290rM7.TAB_DUPLICATE) {
                LJII = true;
            }
        }
    }
}
