package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: renamed from: X.0CcW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C317500CcW {
    public static Activity LIZ(Context context) {
        while (context != null) {
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                return activityLIZ;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
