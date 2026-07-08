package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0YjQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882340YjQ {
    public static final String LIZ(C0Y8T c0y8t) {
        String str;
        boolean z;
        Map<String, String> ext;
        if (c0y8t == null) {
            return "";
        }
        C0Y8Y coreInfo = c0y8t.getCoreInfo();
        if (coreInfo == null || (ext = coreInfo.getExt()) == null || (str = ext.get("a:conv_routing")) == null) {
            str = "";
        }
        boolean z2 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("biz_uid");
            if (strOptString != null && strOptString.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                C882400YjW.LIZ.getClass();
                C882400YjW.LIZ();
                C883250Ykt c883250Ykt = C883250Ykt.LL;
                if (Intrinsics.LJFF(strOptString, C461720I8s.LIZIZ())) {
                    return jSONObject.optString("chatbot");
                }
            }
            return "";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static final C882350YjR LIZIZ(C0Y8T c0y8t) {
        String str;
        Map<String, String> ext;
        if (c0y8t == null) {
            return new C882350YjR();
        }
        C0Y8Y coreInfo = c0y8t.getCoreInfo();
        if (coreInfo == null || (ext = coreInfo.getExt()) == null || (str = ext.get("a:conv_routing")) == null) {
            str = "";
        }
        if (str.length() == 0) {
            return new C882350YjR();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C882350YjR(jSONObject.optBoolean("chatbot_exist"), jSONObject.optString("chatbot"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new C882350YjR();
        }
    }

    public static final String LIZJ(C0Y8T c0y8t) {
        Map<String, String> localExt;
        if (c0y8t != null && (localExt = c0y8t.getLocalExt()) != null) {
            return localExt.get("request_state_to_chat_notice_code");
        }
        return null;
    }

    public static final boolean LIZLLL(C0Y8T c0y8t) {
        if (c0y8t == null || c0y8t.getInboxType() != 5) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(C0Y8T c0y8t) {
        IMHostApi.LIZ.getClass();
        IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
        if (iMHostApiLIZ != null && iMHostApiLIZ.LJIILJJIL(c0y8t)) {
            return true;
        }
        return false;
    }

    public static final boolean LJFF(C0Y8T c0y8t) {
        C0Y8W settingInfo;
        Map<String, String> ext;
        String str;
        if (c0y8t == null || (settingInfo = c0y8t.getSettingInfo()) == null || (ext = settingInfo.getExt()) == null || (str = ext.get("a:user_conversation_tag")) == null || !a0.LJJIIZI(str, "need_human", false)) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(C0Y8T c0y8t) {
        Map<String, String> ext;
        String str;
        C0Y8Y coreInfo = c0y8t.getCoreInfo();
        if (coreInfo == null || (ext = coreInfo.getExt()) == null || (str = ext.get("stranger")) == null || !C866950Xzh.LIZ(str) || Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(C0Y8T c0y8t) {
        C0Y8Y coreInfo;
        Map<String, String> ext;
        String str;
        Long lLJIILIIL;
        if (!c0y8t.isSingleChat() || (coreInfo = c0y8t.getCoreInfo()) == null || (ext = coreInfo.getExt()) == null || (str = ext.get("filtered")) == null || (lLJIILIIL = C2095008Iq.LJIILIIL(str)) == null) {
            return false;
        }
        long jLongValue = lLJIILIIL.longValue();
        if (jLongValue <= 0 || C461720I8s.LJFF(jLongValue)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIIZZ(C0Y8T c0y8t) {
        C0Y8Y coreInfo;
        Map<String, String> ext;
        String str;
        Long lLJIILIIL;
        if (!c0y8t.isSingleChat() || (coreInfo = c0y8t.getCoreInfo()) == null || (ext = coreInfo.getExt()) == null || (str = ext.get("stranger")) == null || (lLJIILIIL = C2095008Iq.LJIILIIL(str)) == null) {
            return false;
        }
        long jLongValue = lLJIILIIL.longValue();
        if (jLongValue <= 0 || C461720I8s.LJFF(jLongValue)) {
            return false;
        }
        return true;
    }
}
