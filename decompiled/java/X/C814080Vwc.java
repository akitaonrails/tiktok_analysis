package X;

import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0Vwc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814080Vwc {
    public static final AtomicInteger LIZ = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static boolean LIZ(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            return false;
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
