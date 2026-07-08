package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: renamed from: X.0lyU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1378440lyU {
    public static void LIZ(Context context) {
        Activity activityLIZIZ;
        Fragment fragmentLIZIZ = LIZIZ(context);
        if (fragmentLIZIZ == null) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            Activity activityLIZ = null;
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                activityLIZ = C1388190mED.LIZ(activityLIZIZ);
            }
            if (!(activityLIZ instanceof C19EG) || activityLIZ == null || (fragmentLIZIZ = LIZIZ(activityLIZ)) == null) {
                return;
            }
        }
        if (fragmentLIZIZ instanceof DialogFragment) {
            ((DialogFragment) fragmentLIZIZ).dismissAllowingStateLoss();
        }
    }

    public static Fragment LIZIZ(Context context) {
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        if (!(context instanceof C19GS) || (c19eg = (C19EG) context) == null || (supportFragmentManager = c19eg.getSupportFragmentManager()) == null) {
            return null;
        }
        return supportFragmentManager.LJJJJZI("share_sheet_panel");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004b A[PHI: r9
      0x004b: PHI (r9v6 java.lang.String) = (r9v0 java.lang.String), (r9v7 java.lang.String) binds: [B:27:0x0049, B:25:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053 A[PHI: r9
      0x0053: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v6 java.lang.String), (r9v6 java.lang.String) binds: [B:27:0x0049, B:29:0x004d, B:31:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056 A[PHI: r9 r11
      0x0056: PHI (r9v5 java.lang.String) = (r9v1 java.lang.String), (r9v6 java.lang.String) binds: [B:33:0x0054, B:31:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r11v3 java.lang.String) = (r11v0 java.lang.String), (r11v4 java.lang.String) binds: [B:33:0x0054, B:31:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005e A[PHI: r9 r11
      0x005e: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v5 java.lang.String), (r9v5 java.lang.String) binds: [B:33:0x0054, B:35:0x0058, B:37:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v3 java.lang.String), (r11v3 java.lang.String) binds: [B:33:0x0054, B:35:0x0058, B:37:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C1378700lyu r14) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1378440lyU.LIZJ(X.0lyu):void");
    }
}
