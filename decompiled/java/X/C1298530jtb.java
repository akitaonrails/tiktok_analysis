package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import j27.s;

/* JADX INFO: renamed from: X.0jtb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298530jtb {
    public static Activity LIZ(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static s LIZIZ(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof s) {
                return (s) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
