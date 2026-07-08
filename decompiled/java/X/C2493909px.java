package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: renamed from: X.09px, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2493909px {
    public static final Activity LIZ(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static final C19EG LIZIZ(Context context) {
        Activity activityLIZ = LIZ(context);
        if (activityLIZ instanceof C19EG) {
            return (C19EG) activityLIZ;
        }
        return null;
    }
}
