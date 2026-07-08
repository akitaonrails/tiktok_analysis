package X;

import android.content.Context;
import com.bytedance.ttnet.TTNetInit;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0pH8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505320pH8 {
    public static final C1505440pHK LIZ = new AbstractC1505210pGx() { // from class: X.0pHK
        public static final /* synthetic */ int LIZJ = 0;

        @Override // X.AbstractC1505150pGr
        public final void LIZIZ() {
            LJIIIIZZ().LIZIZ("cl_net_quality_level", new C1505460pHM(0));
            LJIIIIZZ().LIZIZ("cl_is_charging", null);
            LJIIIIZZ().LIZIZ("cl_battery_pct", null);
            LJIIIIZZ().LIZIZ("cl_is_wifi", null);
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

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v14, types: [int] */
        /* JADX WARN: Type inference failed for: r0v25 */
        /* JADX WARN: Type inference failed for: r2v3, types: [int] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        @Override // X.AbstractC1505150pGr
        public final String LIZJ(String str) {
            ?? LJ;
            if (str == null) {
                return null;
            }
            int iLIZIZ = 0;
            ?? r2 = 0;
            switch (str.hashCode()) {
                case -54408432:
                    if (str.equals("cl_is_charging")) {
                        C1505420pHI c1505420pHILJIIIIZZ = LJIIIIZZ();
                        C0VA1 c0va1LIZ = C0VAA.LIZ(C1505180pGu.LIZIZ);
                        if (c0va1LIZ != null) {
                            r2 = c0va1LIZ.LIZIZ.LIZLLL;
                        }
                        c1505420pHILJIIIIZZ.LJFF(Integer.valueOf((int) r2), str);
                    }
                    break;
                case 234045236:
                    if (str.equals("cl_is_wifi")) {
                        C1505420pHI c1505420pHILJIIIIZZ2 = LJIIIIZZ();
                        Context context = C1505180pGu.LIZIZ;
                        if (context != null) {
                            LJ = C0XF1.LJ(context);
                        } else {
                            LJ = -1;
                        }
                        c1505420pHILJIIIIZZ2.LJFF(Integer.valueOf((int) LJ), str);
                    }
                    break;
                case 1253160652:
                    if (str.equals("cl_net_quality_level")) {
                        LJIIIIZZ().LJFF(Integer.valueOf(TTNetInit.getEffectiveConnectionType()), str);
                    }
                    break;
                case 1268176089:
                    if (str.equals("cl_battery_pct")) {
                        C1505420pHI c1505420pHILJIIIIZZ3 = LJIIIIZZ();
                        C0VA1 c0va1LIZ2 = C0VAA.LIZ(C1505180pGu.LIZIZ);
                        if (c0va1LIZ2 != null) {
                            iLIZIZ = c0va1LIZ2.LIZIZ();
                        }
                        c1505420pHILJIIIIZZ3.LJFF(Integer.valueOf(iLIZIZ), str);
                    }
                    break;
            }
            return LJIIIIZZ().LIZJ(str);
        }
    };
}
