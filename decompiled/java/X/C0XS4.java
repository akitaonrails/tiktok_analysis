package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: renamed from: X.0XS4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XS4 {
    public static final /* synthetic */ int LIZ = 0;

    public static Activity LIZ(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
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
