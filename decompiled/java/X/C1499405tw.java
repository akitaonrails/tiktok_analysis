package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.05tw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1499405tw {
    public static final C054G LIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static final Set<String> LIZIZ = new LinkedHashSet();

    public static void LIZ() {
        Set<String> set = LIZIZ;
        synchronized (set) {
            try {
                set.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(long j, String str, String str2) {
        C23250099c.LIZLLL(LIZ, null, null, new C1499305tv(str, j, str2, null), 3);
    }
}
