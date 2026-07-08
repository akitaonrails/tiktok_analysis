package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0uNP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701410uNP {
    public static int LIZIZ;
    public static final C1701410uNP LIZ = new C1701410uNP();
    public static int LIZJ = LSPassThroughRecordSizeConfig.DEFAULT;
    public static final ConcurrentHashMap<Integer, C14NL> LIZLLL = new ConcurrentHashMap<>();

    public static void LIZIZ(int i) {
        for (Map.Entry<Integer, C14NL> entry : LIZLLL.entrySet()) {
            if (entry.getValue().LIZ == i) {
                LIZLLL.remove(entry.getKey());
            }
        }
    }

    public final int LIZ(C14NL c14nl) {
        Object next;
        int i;
        Iterator<T> it2 = LIZLLL.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                Map.Entry entry = (Map.Entry) next;
                if (((C14NL) entry.getValue()).LIZ == c14nl.LIZ && ((C14NL) entry.getValue()).LIZIZ == c14nl.LIZIZ) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return ((Number) entry2.getKey()).intValue();
        }
        synchronized (this) {
            try {
                int i2 = LIZJ + 1;
                LIZJ = i2;
                i = i2 + 50000;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LIZLLL.put(Integer.valueOf(i), c14nl);
        return i;
    }
}
