package X;

import com.ss.android.ugc.trill.feedback.api.CSPPageApi;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0u3a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689120u3a {
    public static final Map<String, String> LIZ(CSPPageApi.FaqRequestBody faqRequestBody) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("aid", faqRequestBody.aid);
        linkedHashMap.put("app_key", faqRequestBody.appKey);
        linkedHashMap.put("country", faqRequestBody.country);
        linkedHashMap.put("device_id", faqRequestBody.deviceId);
        linkedHashMap.put("entrance", faqRequestBody.entrance);
        linkedHashMap.put("lang", faqRequestBody.lang);
        linkedHashMap.put("uid", faqRequestBody.uid);
        return linkedHashMap;
    }
}
