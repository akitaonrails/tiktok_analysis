package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.preload.settings.LandPageGeckoOptimizeStrategyModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0clL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024330clL {
    public static volatile boolean LIZ;
    public static final LandPageGeckoOptimizeStrategyModel LIZIZ = (LandPageGeckoOptimizeStrategyModel) C1024360clO.LIZIZ.getValue();
    public static final Map<String, InterfaceC1024370clP> LIZJ = Collections.synchronizedMap(new LinkedHashMap());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(552));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(553));

    public static void LIZIZ() {
        LIZ = true;
        Map<String, InterfaceC1024370clP> map = LIZJ;
        synchronized (map) {
            try {
                Iterator<Map.Entry<String, InterfaceC1024370clP>> it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    it2.next().getValue().LIZIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZJ() {
        LIZ = true;
        Map<String, InterfaceC1024370clP> map = LIZJ;
        synchronized (map) {
            try {
                Iterator<Map.Entry<String, InterfaceC1024370clP>> it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    it2.next().getValue().LIZJ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZLLL() {
        LIZ = false;
        Map<String, InterfaceC1024370clP> map = LIZJ;
        synchronized (map) {
            try {
                Iterator<Map.Entry<String, InterfaceC1024370clP>> it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    it2.next().getValue().LIZLLL();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZ(int i) {
        if (i != 1) {
            if (i != 2) {
                EnumC1006810cJ5 enumC1006810cJ5 = C1BCA.LIZLLL().LIZ;
                EnumC1006810cJ5 enumC1006810cJ52 = EnumC1006810cJ5.Low;
                if (enumC1006810cJ5 == enumC1006810cJ52 && C1BCA.LJIILIIL().LIZ == enumC1006810cJ52) {
                    LIZIZ();
                    return;
                } else {
                    LIZLLL();
                    return;
                }
            }
            if (C1BCA.LIZLLL().LIZ == EnumC1006810cJ5.Low) {
                LIZIZ();
                return;
            } else {
                LIZLLL();
                return;
            }
        }
        if (C1BCA.LJIILIIL().LIZ == EnumC1006810cJ5.Low) {
            LIZIZ();
        } else {
            LIZLLL();
        }
    }

    public static void LJ(String str, InterfaceC1024370clP interfaceC1024370clP) {
        LIZJ.put(str, interfaceC1024370clP);
        C1BCA.LJIIZILJ((InterfaceC1702110uOX) LIZLLL.getValue(), true, 0L);
        C1BCA.LJJIIJ((C1BC3) LJ.getValue(), true, LIZIZ.trafficMonitorInterval * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
    }
}
