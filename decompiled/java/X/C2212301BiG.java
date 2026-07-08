package X;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Locale;

/* JADX INFO: renamed from: X.1BiG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212301BiG {
    public static final String LIZ = Build.BRAND.toLowerCase(Locale.getDefault());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C2212581Bii());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C2212561Big());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C2212571Bih());
    public static final C01GW LJ = C452501pT.LIZIZ(new C2212491BiZ());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C2212551Bif());
    public static final C01GW LJI = C452501pT.LIZIZ(new C2212501Bia());
    public static final C01GW LJII = C452501pT.LIZIZ(new C2212481BiY());

    public static int LIZIZ(Context context) {
        int iN3;
        int iN32;
        if (!C2212231Bi9.LJIIIIZZ().LJIILIIL) {
            if (context == null || (iN32 = C786410Ut5.n3(context.getResources(), "status_bar_height", "dimen", "android")) <= 0) {
                return 0;
            }
            return context.getResources().getDimensionPixelSize(iN32);
        }
        if (context == null || (iN3 = C786410Ut5.n3(context.getResources(), "status_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(iN3);
    }

    public static int LIZ(Context context, boolean z) {
        int i;
        if (context == null) {
            return 0;
        }
        Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dzBzEhEpEcvSUUUuTBbKZy4FEza7J60guilFZQ3oDVAs1D8rwNwkiEX+", null));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayLLILZIL.getRealMetrics(displayMetrics);
        if (z) {
            i = displayMetrics.heightPixels;
            if (i == 0) {
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                if (displayMetrics2 == null) {
                    return 0;
                }
                return displayMetrics2.heightPixels;
            }
        } else {
            i = displayMetrics.widthPixels;
            if (i == 0) {
                if (!C2212231Bi9.LJIIIIZZ().LJIILIIL) {
                    DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    if (displayMetrics3 == null) {
                        return 0;
                    }
                    return displayMetrics3.widthPixels;
                }
                DisplayMetrics displayMetrics4 = context.getResources().getDisplayMetrics();
                if (displayMetrics4 == null) {
                    return 0;
                }
                return displayMetrics4.widthPixels;
            }
        }
        return i;
    }
}
