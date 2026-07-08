package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0THJ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0THJ {
    public static final C0THJ LIZ = new C0THJ();
    public static final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ);
    public static volatile int LIZJ = 3;
    public static final Set<String> LIZLLL = new LinkedHashSet();

    public static boolean LIZIZ() {
        try {
            C844470XAv.LIZ.getClass();
            return C804420Vh2.LJI(C844470XAv.LIZ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static void LIZ(String str, String str2) {
        C23250099c.LIZLLL(LIZIZ, null, null, new C1057360dcc(str, str2, null), 3);
    }
}
