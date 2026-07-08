package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0c7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC999780c7k {
    public int LIZ;
    public View LIZIZ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZJ;
    public View LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public int LJI;
    public int LJII;

    public abstract void LIZ();

    public abstract String LIZIZ();

    public abstract String LIZJ();

    public final void LJ() {
        int i = this.LIZ;
        if (i == 1) {
            String strLIZJ = LIZJ();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(0, "is_successful");
            c2344009Gk.LIZJ(this.LJI, "is_ever_failed");
            c2344009Gk.LIZJ(2, "failed_reason");
            LIZ();
            c2344009Gk.LJIIIIZZ("is_spark", "1");
            C20684815ws.LJIILLIIL(strLIZJ, c2344009Gk.LIZ);
            return;
        }
        if (i == 2) {
            String strLIZJ2 = LIZJ();
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LIZJ(0, "is_successful");
            c2344009Gk2.LIZJ(this.LJI, "is_ever_failed");
            c2344009Gk2.LIZJ(3, "failed_reason");
            LIZ();
            c2344009Gk2.LJIIIIZZ("is_spark", "1");
            C20684815ws.LJIILLIIL(strLIZJ2, c2344009Gk2.LIZ);
            return;
        }
        if (i == 3) {
            String strLIZJ3 = LIZJ();
            C2344009Gk c2344009Gk3 = new C2344009Gk();
            c2344009Gk3.LIZJ(1, "is_successful");
            c2344009Gk3.LIZJ(this.LJI, "is_ever_failed");
            LIZ();
            c2344009Gk3.LJIIIIZZ("is_spark", "1");
            C20684815ws.LJIILLIIL(strLIZJ3, c2344009Gk3.LIZ);
            return;
        }
        String strLIZJ4 = LIZJ();
        C2344009Gk c2344009Gk4 = new C2344009Gk();
        c2344009Gk4.LIZJ(0, "is_successful");
        c2344009Gk4.LIZJ(this.LJI, "is_ever_failed");
        c2344009Gk4.LIZJ(0, "failed_reason");
        LIZ();
        c2344009Gk4.LJIIIIZZ("is_spark", "1");
        C20684815ws.LJIILLIIL(strLIZJ4, c2344009Gk4.LIZ);
    }

    public final void LIZLLL(int i) {
        if (i != this.LIZ) {
            String strLIZIZ = LIZIZ();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c2344009Gk.LIZJ(this.LJI, "is_ever_failed");
            LIZ();
            c2344009Gk.LJIIIIZZ("is_spark", "1");
            C20684815ws.LJIILLIIL(strLIZIZ, c2344009Gk.LIZ);
        }
        this.LIZ = i;
    }
}
