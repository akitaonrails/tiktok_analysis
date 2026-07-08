package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: renamed from: X.09Zp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2393909Zp {
    public static void LIZ(Context context) {
        Fragment fragmentLIZIZ = LIZIZ(context);
        if (fragmentLIZIZ != null && (fragmentLIZIZ instanceof DialogFragment)) {
            ((DialogFragment) fragmentLIZIZ).dismissAllowingStateLoss();
        }
    }

    public static Fragment LIZIZ(Context context) {
        FragmentManager supportFragmentManager;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            return C2394009Zq.LIZ(supportFragmentManager);
        }
        return null;
    }
}
