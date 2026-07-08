package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0hmI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1217120hmI {
    public static int LJI;
    public static final C1217120hmI LIZ = new C1217120hmI();
    public static final Keva LIZIZ = Keva.getRepo("auth_popup_optimize_exp_repo");
    public static final Keva LIZJ = Keva.getRepo("popup_control_repo");
    public static final Keva LIZLLL = Keva.getRepo("vv_count_repo");
    public static final Keva LJ = Keva.getRepo("first_delayed_popup");
    public static final HashMap<String, Boolean> LJFF = new HashMap<>();
    public static final ArrayList<Integer> LJII = new ArrayList<>();

    public static boolean LIZIZ() {
        Boolean bool = LJFF.get(LIZ("has_block_onboarding_auth_popup"));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static String LIZ(String str) {
        String curSecUserId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        C0XQ7.LJ();
        if (C0XQ7.LIZ.LJIIJ().isLogin()) {
            curSecUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId();
        } else {
            curSecUserId = "";
        }
        sbLIZ.append(curSecUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
