package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0yEf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849750yEf {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("request_type", "referral");
        linkedHashMap.put("widget_type", str);
        linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "referral");
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("widget_response", linkedHashMap);
        }
    }

    public static void LIZ(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("widget_type", str2);
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("widget_action", linkedHashMap);
        }
    }
}
