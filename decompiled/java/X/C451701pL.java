package X;

import android.app.Activity;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.01pL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C451701pL {
    public static final C451701pL LIZ = new C451701pL();
    public static final Keva LIZIZ = Keva.getRepo("privacy_setting");
    public static final C054G LIZJ;
    public static final C01GW LIZLLL;

    static {
        C1DFH c1dfh = C0PEM.LIZ;
        LIZJ = C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ()));
        LIZLLL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(576));
    }

    public static void LIZ(Activity activity) {
        if (activity.isFinishing() || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return;
        }
        new Object() { // from class: X.01pM
        }.getClass();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("dont_show_display_profile_guide_notice", false)) {
            return;
        }
        C23250099c.LIZLLL(LIZJ, null, null, new C451601pK(activity, null), 3);
    }
}
