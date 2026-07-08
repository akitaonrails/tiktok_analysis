package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.108R, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C108R {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 0) {
                return "everyone";
            }
            if (num.intValue() == 1) {
                return "friends";
            }
            if (num.intValue() == 3) {
                return "no_one";
            }
            return "";
        }
        return "";
    }

    public static String LIZIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "everyone";
            }
            if (num.intValue() == 4) {
                return "friends";
            }
            if (num.intValue() == 5) {
                return "no_one";
            }
            return "";
        }
        return "";
    }

    public static void LIZJ(String str, String str2, Integer num, Integer num2, boolean z, boolean z2, boolean z3) {
        String str3;
        String str4;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("enter_from", str);
        pairArr[1] = new Pair("action", str2);
        pairArr[2] = new Pair("business", "privacy");
        if (z) {
            str3 = "can_choose";
        } else {
            str3 = "cannot_choose";
        }
        pairArr[3] = new Pair("style", str3);
        if (z2) {
            if (z3) {
                str4 = "comment_reuse";
            } else {
                str4 = "comment";
            }
        } else if (z3) {
            str4 = "reuse";
        } else {
            str4 = "";
        }
        pairArr[4] = new Pair("popup_key", str4);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (num != null) {
            mapLJIIJ.put("comment_permission_status", LIZ(Integer.valueOf(num.intValue())));
        }
        if (num2 != null) {
            mapLJIIJ.put("reuse_permission_status", LIZIZ(Integer.valueOf(num2.intValue())));
        }
        C1163504gr.LIZIZ.onEventV3("pns_popup_click", mapLJIIJ);
    }
}
