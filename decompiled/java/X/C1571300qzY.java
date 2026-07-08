package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qzY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1571300qzY {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1571290qzX());

    public static String LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Map<String, Boolean>> entry : C343720Ddi.LIZIZ.LJFF().entrySet()) {
            String key = entry.getKey();
            Map<String, Boolean> value = entry.getValue();
            if (!value.isEmpty()) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, Boolean> entry2 : value.entrySet()) {
                    jSONObject2.put(entry2.getKey(), entry2.getValue().booleanValue());
                }
                if (Intrinsics.LJFF(key, EnumC1584360rKc.ACTIVITY.getKey())) {
                    String strLJFF = C1586050rNL.LIZIZ.LJFF();
                    if (strLJFF.length() > 0) {
                        jSONObject2.put("msg", strLJFF);
                    }
                }
                jSONObject.put(key, jSONObject2);
            }
        }
        return C786410Ut5.J3(jSONObject);
    }

    public static String LIZIZ(String str) {
        if (Intrinsics.LJFF(str, EnumC1584350rKb.INBOX.getTag())) {
            return "notification_page";
        }
        if (Intrinsics.LJFF(str, EnumC1584350rKb.MY_PROFILE.getTag())) {
            return "personal_homepage";
        }
        if (Intrinsics.LJFF(str, EnumC1584350rKb.SEARCH.getTag())) {
            return "search";
        }
        if (Intrinsics.LJFF(str, EnumC1584350rKb.LIVE.getTag())) {
            return "live";
        }
        if (!Intrinsics.LJFF(str, EnumC1584350rKb.PUBLISH.getTag())) {
            return str;
        }
        return "shoot";
    }
}
