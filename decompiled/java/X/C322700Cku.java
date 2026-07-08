package X;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: renamed from: X.0Cku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C322700Cku {
    public static final boolean LIZ(Context context) {
        Activity activityLIZ;
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null || activityLIZ.isDestroyed() || activityLIZ.isFinishing()) {
            return false;
        }
        return true;
    }
}
