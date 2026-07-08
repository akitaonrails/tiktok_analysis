package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.086J, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C086J {
    public static Activity LIZ(WeakReference<Context> weakReference) {
        if (weakReference == null) {
            return null;
        }
        for (Context baseContext = weakReference.get(); baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            Activity activityLIZ = C1388190mED.LIZ(baseContext);
            if (activityLIZ != null) {
                return activityLIZ;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public static Context LIZIZ(WeakReference<Context> weakReference) {
        if (weakReference == null) {
            return null;
        }
        for (Context baseContext = weakReference.get(); baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            Activity activityLIZ = C1388190mED.LIZ(baseContext);
            if (activityLIZ != null) {
                return activityLIZ;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                return baseContext;
            }
        }
        return null;
    }
}
