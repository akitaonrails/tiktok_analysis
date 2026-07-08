package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: X.0VTM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VTM {
    public static final Set<String> LIZ = Collections.singleton("google");

    public static boolean LIZ(Context context) {
        try {
            C089E c089e = new C089E(((DisplayManager) C786410Ut5.H2(context, "display")).getDisplays());
            while (c089e.hasNext()) {
                Display display = (Display) c089e.next();
                if (display != null && ((int) display.getRefreshRate()) > 60) {
                    return true;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }
}
