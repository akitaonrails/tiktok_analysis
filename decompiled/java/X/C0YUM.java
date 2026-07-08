package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0YUM, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YUM {
    public static String LIZ() {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZ();
        C883250Ykt c883250Ykt = C883250Ykt.LL;
        if (!C461720I8s.LJ()) {
            C882400YjW.LIZLLL();
            C882690Yjz.LJIIIZ("TokenManager", "getToken not login");
            return "";
        }
        C882400YjW.LIZ();
        if (C883250Ykt.LIZJ()) {
            C882400YjW.LIZLLL();
            C882690Yjz.LJIIIZ("TokenManager", "doFetchTask forbid by ftc");
            return "";
        }
        String string = Keva.getRepo("ies_im_core").getString("token", "");
        C882400YjW.LIZ();
        String strLJI = C847400XMc.LJI();
        if (strLJI == null || strLJI.length() == 0) {
            return string;
        }
        if (!Intrinsics.LJFF(strLJI, string)) {
            Keva.getRepo("ies_im_core").storeString("token", strLJI != null ? strLJI : "");
            C882400YjW.LIZLLL();
            C882690Yjz.LJIIIZ("TokenManager", "updateLocalToken, in getToken");
        }
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getToken: Using TikTok-Token is not empty: ");
        sbLIZ.append(C123100dR.LIZ(strLJI));
        C882690Yjz.LJIIIZ("TokenManager", C2188811AlT.LIZIZ(sbLIZ));
        return strLJI;
    }

    public static boolean LIZIZ() {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZ();
        C883250Ykt c883250Ykt = C883250Ykt.LL;
        return C123100dR.LIZ(C847400XMc.LJI()) || C123100dR.LIZ(Keva.getRepo("ies_im_core").getString("token", ""));
    }

    public static void LIZJ(boolean z) {
        boolean z2 = false;
        if (z) {
            C882400YjW.LIZ.getClass();
            C882400YjW.LIZ();
            C883250Ykt c883250Ykt = C883250Ykt.LL;
            if (C847400XMc.LIZ) {
                C0XMV.LLJJJIL.LJIIIZ(false);
            }
        }
        Keva.getRepo("ies_im_core").storeString("token", "");
        String strLIZ = LIZ();
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshToken, in onAccountChange. new token is empty: ");
        if (strLIZ.length() == 0) {
            z2 = true;
        }
        sbLIZ.append(z2);
        C882690Yjz.LJIIIZ("TokenManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZLLL(int i, int i2, boolean z, boolean z2) throws JSONException {
        int length;
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        C882690Yjz.LJFF("TokenManager", "onSDKTokenInvalid");
        C0YUF c0yufLIZLLL = C882400YjW.LIZLLL();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("imcmd", i);
        jSONObject.put("error_code", i2);
        C882400YjW.LIZ();
        C883250Ykt c883250Ykt = C883250Ykt.LL;
        jSONObject.put("isFtc", C883250Ykt.LIZJ());
        C882400YjW.LIZ();
        jSONObject.put("is_login", C461720I8s.LJ());
        jSONObject.put("keva_token_length", Keva.getRepo("ies_im_core").getString("token", "").length());
        C882400YjW.LIZ();
        String strLJI = C847400XMc.LJI();
        if (strLJI != null) {
            length = strLJI.length();
        } else {
            length = 0;
        }
        jSONObject.put("tt_token_length", length);
        jSONObject.put("is_ws", z);
        jSONObject.put("server_refresh", z2);
        ((C882690Yjz) c0yufLIZLLL).LIZJ("im_sdk_invalid_token", jSONObject);
    }
}
