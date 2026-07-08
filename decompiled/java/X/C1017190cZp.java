package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0cZp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017190cZp {
    public static final C1017190cZp LIZ = new C1017190cZp();

    public static void LIZ(String str, Aweme aweme, EnumC992410bvr enumC992410bvr) {
        AwemeRawAd awemeRawAd;
        if (C212900rv.LIZ() && aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("card_type", Integer.valueOf(C1017180cZo.LJIIIIZZ(awemeRawAd)));
            C1017160cZm.LIZ(aweme, linkedHashMap, str, false);
            C998510c5h.LIZ(enumC992410bvr.getLabelName(), str, awemeRawAd, linkedHashMap);
        }
    }

    public static void LIZIZ(Aweme aweme, String str, String str2, String str3, boolean z) {
        AwemeRawAd awemeRawAd;
        String str4;
        if (C212900rv.LIZ() && aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            if (z) {
                str4 = "xiaomi_card_invoke_success";
            } else {
                str4 = "xiaomi_card_invoke_failed";
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("deeplink_url", str2);
            if (str3 != null) {
                linkedHashMap.put("failed_reason", str3);
            }
            C1017160cZm.LIZ(aweme, linkedHashMap, str, false);
            C998510c5h.LIZ(str4, str, awemeRawAd, linkedHashMap);
        }
    }
}
