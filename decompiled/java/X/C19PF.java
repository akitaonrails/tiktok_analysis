package X;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: renamed from: X.19PF, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19PF {
    public static TypedValue LIZ(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static int LIZIZ(Context context, int i, String str) {
        TypedValue typedValueLIZ = LIZ(i, context);
        if (typedValueLIZ != null) {
            return typedValueLIZ.data;
        }
        throw new IllegalArgumentException(C786410Ut5.j4("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }
}
