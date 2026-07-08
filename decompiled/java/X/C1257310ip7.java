package X;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: X.0ip7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257310ip7 {
    public static int LIZ(View view) {
        C20244914Jj c20244914JjLIZ;
        Insets insets;
        if (Build.VERSION.SDK_INT > 30) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null || (insets = rootWindowInsets.getInsets(WindowInsets.Type.navigationBars())) == null) {
                return 0;
            }
            return insets.bottom;
        }
        C20246014Ju c20246014JuLIZ = C14K4.LIZ(view);
        if (c20246014JuLIZ == null || (c20244914JjLIZ = c20246014JuLIZ.LIZ(2)) == null) {
            return 0;
        }
        return c20244914JjLIZ.LIZLLL;
    }
}
