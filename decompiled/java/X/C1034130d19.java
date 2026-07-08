package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0d19, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1034130d19 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(View view) {
        if (view.getVisibility() != 0) {
            return false;
        }
        for (Object parent = view.getParent(); parent instanceof ViewGroup; parent = ((View) parent).getParent()) {
            if (((View) parent).getVisibility() != 0) {
                return false;
            }
        }
        return true;
    }
}
