package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: X.0cVC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1014320cVC {
    public static final boolean LIZ(double d) {
        return -10000.0d < d && d < 0.0d;
    }

    public static final boolean LIZIZ(double d) {
        if (Math.abs(d + ((double) 10000)) <= 1.0E-4d) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(double d) {
        if (Math.abs(d + ((double) 1)) <= 1.0E-4d) {
            return true;
        }
        return false;
    }

    public static final void LIZLLL(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            C786410Ut5.LJJJLZIJ(view, (ViewGroup) parent);
        }
    }
}
