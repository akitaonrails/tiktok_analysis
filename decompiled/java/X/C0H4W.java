package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: X.0H4W, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H4W {
    public static boolean LIZ() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static boolean LIZIZ(Context context) {
        if (context == null || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }
}
