package X;

import android.os.Process;
import java.util.Iterator;
import java.util.Set;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08gG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2179008gG {
    public static final C2179008gG LIZ = new C2179008gG();
    public static final Set<Integer> LIZIZ = C093Y.LJ(Integer.valueOf(Process.myPid()));
    public static final Set<String> LIZJ = C093Y.LJ("HeapTaskDaemon", "FinalizerDaemon", "FinalizerWatchdogDaemon", "ReferenceQueueDaemon", "Profile Saver", "Signal Catcher");
    public static final Set<String> LIZLLL = C093Y.LJ("Jit thread", "Binder:", "HwBinder:", "hwui");
    public static final Set<String> LJ = C093Y.LJ("sleep", "Unsafe.park");

    public static boolean LIZ(String str, boolean z) {
        if (!LIZJ.contains(str)) {
            if (!z) {
                return false;
            }
            Iterator<T> it2 = LIZLLL.iterator();
            while (it2.hasNext()) {
                if (u.LJJIIJZLJL(str, (String) it2.next(), false)) {
                }
            }
            return false;
        }
        return true;
    }
}
