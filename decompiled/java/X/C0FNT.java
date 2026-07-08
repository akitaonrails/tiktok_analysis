package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: renamed from: X.0FNT, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FNT {
    public static Activity LIZ(Context context) {
        if (context == null || (context instanceof Application)) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return LIZ(((ContextWrapper) context).getBaseContext());
    }

    public static boolean LIZIZ(Activity activity) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return false;
        }
        return true;
    }
}
