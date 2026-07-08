package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0byd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C994130byd {
    public static void LIZ(String str, String str2, JSONObject jSONObject, AwemeRawAd awemeRawAd) {
        JSONObject jSONObject2;
        String strValueOf;
        long jLongValue;
        JSONObject jSONObject3;
        String str3 = str;
        String pageFrom = awemeRawAd.getPageFrom();
        if (TextUtils.equals(pageFrom, "challenge") || TextUtils.equals(pageFrom, "challenge_fresh")) {
            if (TextUtils.equals(str3, "background_ad")) {
                str3 = "background_ads";
            } else {
                str3 = "topic_ads";
            }
        }
        if (TextUtils.equals("click", str2)) {
            C1019090cct.LIZIZ(awemeRawAd);
        }
        if (TextUtils.equals(str3, "background_ad") && (TextUtils.equals(str2, "click") || TextUtils.equals(str2, "othershow") || TextUtils.equals(str2, "replay"))) {
            try {
                String strOptString = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(strOptString)) {
                    jSONObject3 = new JSONObject();
                } else {
                    jSONObject3 = new JSONObject(strOptString);
                }
                jSONObject3.put("is_lynx", 0);
                jSONObject.put("ad_extra_data", C786410Ut5.J3(jSONObject3));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        if (C1017180cZo.LJJIFFI(awemeRawAd)) {
            try {
                String strOptString2 = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(strOptString2)) {
                    jSONObject2 = new JSONObject();
                } else {
                    jSONObject2 = new JSONObject(strOptString2);
                }
                jSONObject2.put("anchor_id", awemeRawAd.getSplashInfo().anchorId);
                jSONObject.put("ad_extra_data", C786410Ut5.J3(jSONObject2));
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1AF0.LJ(e2);
            }
        }
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId == null) {
            strValueOf = CardStruct.IStatusCode.DEFAULT;
        } else {
            strValueOf = String.valueOf(creativeId);
        }
        Long groupId = awemeRawAd.getGroupId();
        if (groupId == null) {
            jLongValue = 0;
        } else {
            jLongValue = groupId.longValue();
        }
        C1022500ciO.LIZ(str3, str2, strValueOf, jSONObject, jLongValue);
    }
}
