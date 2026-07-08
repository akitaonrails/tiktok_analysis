package X;

import android.content.Context;
import android.util.DisplayMetrics;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;

/* JADX INFO: renamed from: X.0Jfg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497820Jfg {
    public static final int LIZ(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.heightPixels;
        }
        return 0;
    }

    public static final int LIZIZ(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.widthPixels;
        }
        return 0;
    }

    public static final int LIZJ(Context context) {
        int iN3 = C786410Ut5.n3(context.getResources(), "status_bar_height", "dimen", "android");
        if (iN3 > 0) {
            return context.getResources().getDimensionPixelSize(iN3);
        }
        return 0;
    }

    public static final boolean LIZLLL(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(Context context) {
        if (Math.min(r3.widthPixels, r3.heightPixels) > context.getResources().getDisplayMetrics().density * 650) {
            return true;
        }
        return false;
    }

    public static final boolean LJFF(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels) <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(OppoPermissionPopupMaskDelayExp.DEFAULT)))) {
            return true;
        }
        return false;
    }
}
