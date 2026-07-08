package X;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: X.13h6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20077413h6 {
    public static C20078613hI LIZ(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new C20078613hI(view.getAutofillId());
        }
        return null;
    }
}
