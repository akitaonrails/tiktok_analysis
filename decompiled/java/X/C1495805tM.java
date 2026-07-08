package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05tM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1495805tM {
    public static final C1495805tM LIZ = new C1495805tM();

    public static Map LIZIZ(String str, String str2) {
        boolean z;
        int followStatus;
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("conversation_id", str);
        linkedHashMap.put("chat_type", str2);
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        boolean z2 = true;
        if (c0y8tLIZ != null && c0y8tLIZ.isGroupChat()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String strLJI = C1229100i5c.LJI(str);
            if (strLJI.length() <= 0) {
                z2 = false;
            }
            if (!z2) {
                strLJI = null;
            }
            if (strLJI != null) {
                linkedHashMap.put("group_type", strLJI);
            }
            try {
                String strLJJIFFI = C0ZFW.LIZ.LJJIFFI(str);
                IMContactApi.LIZ.getClass();
                IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(strLJJIFFI, null, "im_local_db");
                if (iMUserLJIIL != null && (imUserBizInfo = iMUserLJIIL.getImUserBizInfo()) != null && (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) != null && (str3 = userB2CAccountInfo.userTags) != null) {
                    linkedHashMap.put("group_owner_account_type", str3);
                    return linkedHashMap;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            return linkedHashMap;
        }
        try {
            String strValueOf = String.valueOf(C0YNP.LJII(str));
            IMContactApi.LIZ.getClass();
            IMUser iMUserLJIIL2 = C069P.LIZ().LJ().LJIIL(strValueOf, null, "alert_tone");
            if (iMUserLJIIL2 != null) {
                followStatus = iMUserLJIIL2.getFollowStatus();
            } else {
                followStatus = -1;
            }
            linkedHashMap.put("relation_tag", String.valueOf(followStatus));
            return linkedHashMap;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return linkedHashMap;
        }
    }

    public static Map LIZJ(String str, String str2) {
        if (str.length() == 0) {
            return C2097608Jq.LJ();
        }
        Map mapLIZIZ = LIZIZ(str, str2);
        mapLIZIZ.remove("conversation_id");
        mapLIZIZ.remove("chat_type");
        return mapLIZIZ;
    }

    public static void LJ(String str, Map map) {
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL(str, map);
    }

    public static Map LIZ(String str, String str2, String str3, EnumC12978056a enumC12978056a) {
        String str4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "alert_tones_settings");
        linkedHashMap.put("previous_page", str);
        int i = C12979056b.LIZ[enumC12978056a.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str4 = "silent_mode_active";
            } else {
                throw new C1954807lC();
            }
        } else {
            str4 = "external_push_not_enabled";
        }
        linkedHashMap.put("banner_type", str4);
        if (!Intrinsics.LJFF(str, "notification_settings_page") && str2.length() > 0) {
            linkedHashMap.putAll(LIZIZ(str2, str3));
        }
        return linkedHashMap;
    }

    public static Map LIZLLL(String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "alert_tones_settings");
        linkedHashMap.put("previous_page", str);
        linkedHashMap.put("tones_id", str4);
        if (!Intrinsics.LJFF(str, "notification_settings_page") && str2.length() > 0) {
            linkedHashMap.putAll(LIZIZ(str2, str3));
        }
        return linkedHashMap;
    }

    public static void LJFF(String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("tones_id", str4);
        if (!Intrinsics.LJFF(str, "notification_settings_page") && str2.length() > 0) {
            linkedHashMap.putAll(LIZIZ(str2, str3));
        }
        LJ("ttsocial_alert_tones_settings_enter", linkedHashMap);
    }
}
