package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: X.11VU, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11VU {
    public static final /* synthetic */ int LIZ = 0;

    public static final float LIZ(float f) {
        return (f * Resources.getSystem().getDisplayMetrics().density) + 0.5f;
    }

    public static final int LIZLLL(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.heightPixels;
    }

    public static final int LJ(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    public static final boolean LJFF(Context context) {
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJI(View view) {
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static final float LIZIZ(float f, Context context) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static int LIZJ(double d, Context context) {
        return (int) ((d * ((double) context.getResources().getDisplayMetrics().density)) + ((double) 0.5f));
    }

    public static final int LJII(float f, Context context) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
