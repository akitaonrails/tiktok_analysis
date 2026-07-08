package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;

/* JADX INFO: renamed from: X.0O2T, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O2T {
    public static final Typeface LIZ(Typeface typeface, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (typeface == null) {
                return null;
            }
            throw null;
        }
        return typeface;
    }
}
