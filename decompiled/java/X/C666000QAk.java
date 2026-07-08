package X;

import android.view.View;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0QAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C666000QAk {
    public static final C666000QAk LIZ = new C666000QAk();

    public static boolean LIZ() {
        if (((Number) C0BRE.LIZ.getValue()).intValue() == 1 && C288110BQz.LIZ()) {
            return true;
        }
        return C0BRE.LIZIZ() ? C640810PBn.LIZIZ() : ComplianceServiceProvider.LJI().LJJIJLIJ(true);
    }

    public static boolean LIZJ(boolean z) {
        if (!ComplianceServiceProvider.LJI().LJJIJLIJ(z) && !C0BRE.LIZ()) {
            return false;
        }
        return true;
    }

    public static void LJ(String str) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "general_search");
        if (ComplianceServiceProvider.LJI().LJJII()) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        c2344009Gk.LJIIIIZZ("personalized_status", str2);
        c2344009Gk.LJIIIIZZ("search_id", str);
        C20684815ws.LJIILLIIL("personalized_toast_click", c2344009Gk.LIZ);
    }

    public static void LIZIZ(C1389910mGz c1389910mGz, View.OnClickListener onClickListener) {
        c1389910mGz.LIZ.LIZIZ = 4;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_personalization;
        c419910GdJ.LIZIZ = (int) C418040GaI.LIZ(24);
        c419910GdJ.LIZJ = (int) C418040GaI.LIZ(24);
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c1389910mGz.LJIIL(c419910GdJ);
        C1360890lWB c1360890lWB = c1389910mGz.LIZ;
        c1360890lWB.LIZLLL = 0;
        c1360890lWB.LJIIIIZZ = onClickListener;
        c1389910mGz.LJ(3000L);
        c1389910mGz.LIZLLL(AFwS196S0000000_10.get$arr$(646));
    }

    public static void LIZLLL(C1389910mGz c1389910mGz, CharSequence charSequence, String str) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "general_search");
        if (ComplianceServiceProvider.LJI().LJJII()) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        c2344009Gk.LJIIIIZZ("personalized_status", str2);
        c2344009Gk.LJIIIIZZ("search_id", str);
        C20684815ws.LJIILLIIL("personalized_toast_show", c2344009Gk.LIZ);
        c1389910mGz.LJIIJ(charSequence);
        c1389910mGz.LJIIJJI();
    }
}
