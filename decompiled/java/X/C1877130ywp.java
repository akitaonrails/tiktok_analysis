package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: renamed from: X.0ywp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1877130ywp {
    public static final C1877130ywp LIZ = new C1877130ywp();

    public static Activity LIZ(Context context) {
        while (context != null) {
            if (C1388190mED.LIZ(context) != null) {
                return C1388190mED.LIZ(context);
            }
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return null;
            }
        }
        return null;
    }
}
