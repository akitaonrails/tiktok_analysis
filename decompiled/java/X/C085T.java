package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: renamed from: X.085T, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C085T {
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
