package X;

import com.bytedance.keva.Keva;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;
import lth.o;

/* JADX INFO: renamed from: X.0Xk9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857310Xk9 {
    public static final C857310Xk9 LIZ = new C857310Xk9();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(304));

    public static String LIZIZ() {
        String uid;
        C19292410dm currentUser = o.LJIIZILJ.getCurrentUser();
        return (currentUser == null || (uid = currentUser.getUid()) == null) ? "" : uid;
    }

    public static Keva LIZJ() {
        return (Keva) LIZIZ.getValue();
    }

    public static int LIZ() {
        Keva kevaLIZJ = LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("change_post_visibility_status_");
        sbLIZ.append(LIZIZ());
        return kevaLIZJ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public static int LIZLLL() {
        Keva kevaLIZJ = LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("post_visibility_sub_only_");
        sbLIZ.append(LIZIZ());
        return kevaLIZJ.getInt(C2188811AlT.LIZIZ(sbLIZ), -1);
    }

    public static void LJ(String str, boolean z) {
        String str2;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("enter_from", "video_post_page");
        if (z) {
            str2 = "show";
        } else {
            str2 = "click";
        }
        pairArr[1] = new Pair("action_type", str2);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (str != null && str.length() != 0) {
            mapLJIIJ.put("click_type", str);
        }
        C20684815ws.LJIILLIIL("video_visibility_popup_page", mapLJIIJ);
    }
}
