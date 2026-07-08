package X;

import com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService;
import com.ss.android.ugc.aweme.ml.api.SmartHARService;
import com.ss.android.ugc.aweme.ml.api.SmartOHRService;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0pH5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505290pH5 {
    public static final C1505430pHJ LIZ = new AbstractC1505210pGx() { // from class: X.0pHJ
        public static final /* synthetic */ int LIZJ = 0;

        @Override // X.AbstractC1505150pGr
        public final void LIZIZ() {
            LJIIIIZZ().LIZIZ("cl_ai_fast_slow_predict", new C1505460pHM(0));
            LJIIIIZZ().LIZIZ("cl_ai_ohr", null);
            LJIIIIZZ().LIZIZ("cl_ai_har", null);
        }

        @Override // X.AbstractC1505150pGr
        public final ConcurrentHashMap<String, String> LJI() {
            Set<String> setKeySet = LJIIIIZZ().LIZIZ.keySet();
            if (setKeySet != null) {
                Iterator<String> it2 = setKeySet.iterator();
                while (it2.hasNext()) {
                    LIZJ(it2.next());
                }
            }
            return LJIIIIZZ().LIZLLL();
        }

        @Override // X.AbstractC1505150pGr
        public final String LIZJ(String str) {
            InterfaceC1513720pUg interfaceC1513720pUgLIZIZ;
            String strValueOf = null;
            if (str == null) {
                return null;
            }
            int iHashCode = str.hashCode();
            if (iHashCode != -1697181347) {
                if (iHashCode != 1986024088) {
                    if (iHashCode == 1986031032 && str.equals("cl_ai_ohr")) {
                        C1505420pHI c1505420pHILJIIIIZZ = LJIIIIZZ();
                        SmartOHRService smartOHRService = C1513230pTt.LIZ;
                        if (smartOHRService != null && (interfaceC1513720pUgLIZIZ = smartOHRService.LIZIZ()) != null) {
                            strValueOf = String.valueOf(interfaceC1513720pUgLIZIZ.LIZIZ());
                        }
                        c1505420pHILJIIIIZZ.LJFF(strValueOf, str);
                    }
                } else if (str.equals("cl_ai_har")) {
                    C1505420pHI c1505420pHILJIIIIZZ2 = LJIIIIZZ();
                    SmartHARService.Companion.getClass();
                    c1505420pHILJIIIIZZ2.LJFF(Integer.valueOf(C1511980pRs.LIZ().getLastStatus()), str);
                }
            } else if (str.equals("cl_ai_fast_slow_predict")) {
                C1505420pHI c1505420pHILJIIIIZZ3 = LJIIIIZZ();
                SmartFeedPreloadService.Companion.getClass();
                c1505420pHILJIIIIZZ3.LJFF(Integer.valueOf(C1505530pHT.LIZ.obtainAiFastSlowPredict()), str);
            }
            return LJIIIIZZ().LIZJ(str);
        }
    };
}
