package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0QLI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QLI {
    public static final C0QLI LIZ = new C0QLI();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(385));

    public static Keva LIZ() {
        User curUser;
        String uid;
        String str = "";
        try {
            curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (curUser != null) {
            uid = curUser.getUid();
            if (uid == null) {
            }
            return Keva.getRepo("search_keva_repo_".concat(str));
        }
        uid = "";
        str = uid;
        return Keva.getRepo("search_keva_repo_".concat(str));
    }

    public static void LIZIZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("popup_type", "add_widget");
        c2344009Gk.LJIIIIZZ("action_type", str);
        C20684815ws.LJIILLIIL("widget_popup", c2344009Gk.LIZ);
    }
}
