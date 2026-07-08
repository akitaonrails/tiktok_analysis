package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1BLO, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BLO {
    public static final List<InterfaceC2457409k4> LIZ = new CopyOnWriteArrayList();
    public static final ConcurrentHashMap<String, InterfaceC2203391BLl> LIZIZ = new ConcurrentHashMap<>();
    public static final C1BLY LIZJ;

    static {
        C844470XAv.LIZ.getClass();
        C1BLY c1blyLIZ = C1BZ3.LIZ(C844470XAv.LIZ());
        LIZJ = c1blyLIZ;
        c1blyLIZ.LIZ();
    }

    public static void LIZ(final C1BLC c1blc, final String str) {
        C2459909kT c2459909kT = new C2459909kT();
        if (str != null && str.startsWith("com.ss.android.ugc.aweme.dflanguage")) {
            ((ArrayList) c2459909kT.LIZIZ).add(new Locale(C13LN.LJLJLJ(36, str)));
        } else {
            Map<String, String> map = C1BLV.LIZ;
            ((ArrayList) c2459909kT.LIZ).add(C1BLV.LIZ(str));
        }
        LIZJ.LIZIZ(new C2459809kS(c2459909kT)).LJFF(new InterfaceC835710WqP() { // from class: X.14fe
            @Override // X.InterfaceC835710WqP
            public final void onSuccess(Object obj) {
                int iIntValue = ((Number) obj).intValue();
                Map<String, String> map2 = C1BLV.LIZ;
                String strLIZ = C1BLV.LIZ(str);
                ConcurrentHashMap<String, Integer> concurrentHashMap = C20338014i2.LIZ;
                synchronized (concurrentHashMap) {
                    try {
                        concurrentHashMap.put(strLIZ, Integer.valueOf(iIntValue));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }).LIZLLL(new InterfaceC835730WqR() { // from class: X.1BLc
            @Override // X.InterfaceC835730WqR
            public final void onFailure(Exception exc) {
                C1BLC c1blc2 = c1blc;
                if (c1blc2 != null && (c1blc2 instanceof C1BLX)) {
                    c1blc2.LIZ(1, c1blc2.LJIIIIZZ, exc.getMessage());
                }
                List<InterfaceC2457409k4> list = C1BLO.LIZ;
                C1BLO.LIZIZ(str, exc);
            }
        });
    }

    public static void LIZIZ(String str, Exception exc) {
        C1BLM c1blm = new C1BLM(str, C08PT.LJ(), 6);
        if (exc instanceof C812870Vuf) {
            c1blm.LJI = ((C812870Vuf) exc).getErrorCode();
        } else {
            c1blm.LJI = 1;
        }
        c1blm.LJIIIIZZ = exc;
        C1BLN.LIZ(c1blm);
    }
}
