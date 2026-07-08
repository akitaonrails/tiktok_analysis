package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: renamed from: X.0yoH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1871830yoH {
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
