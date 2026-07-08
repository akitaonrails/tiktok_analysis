package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Rqs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708600Rqs {
    public static JSONObject LIZ(int i, Aweme aweme, String str, String str2) {
        String str3;
        JSONObject jSONObjectLIZJ = ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).LIZJ(i, aweme);
        if (str != null) {
            if (jSONObjectLIZJ == null) {
                jSONObjectLIZJ = new JSONObject();
            }
            try {
                if (!"update_tips".equals(str2)) {
                    jSONObjectLIZJ.put("enter_from", str2);
                }
                if ("like_banner".equals(str)) {
                    jSONObjectLIZJ.put("previous_page", str);
                } else {
                    jSONObjectLIZJ.put("enter_method", str);
                }
                if (aweme != null && aweme.getAwemeType() == 2) {
                    jSONObjectLIZJ.put("is_photo", 1);
                }
                if (aweme != null) {
                    if (AwemeExtKt.isAdTraffic(aweme)) {
                        str3 = "1";
                    } else {
                        str3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    jSONObjectLIZJ.put("is_ad", str3);
                }
                if (aweme != null && (aweme.getAwemeType() == 160 || (C729510SjV.LJJIJIL(aweme) && aweme.getStoryType() == 2))) {
                    jSONObjectLIZJ.put("aweme_type", 160);
                    return jSONObjectLIZJ;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            return jSONObjectLIZJ;
        }
        throw new IllegalArgumentException();
    }
}
