package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: renamed from: X.06MM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06MM {
    public static final Activity LIZ(Context context) {
        Context baseContext;
        if (context == null || (context instanceof Application)) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper) || (baseContext = ((ContextWrapper) context).getBaseContext()) == null) {
            return null;
        }
        return LIZ(baseContext);
    }
}
