package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.gift.receiving.model.GiftQueueMessageModel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fdn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134970fdn {
    public static String LIZ;

    public static void LIZ(JSONObject jSONObject) throws JSONException {
        if (C500260Jjc.LJJIIZ(LIZ)) {
            jSONObject.put("revenue_unified_overload_score", LIZ);
        }
    }

    public static void LIZIZ(C1135810ff9 c1135810ff9) {
        c1135810ff9.LJJJIL = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJIIL();
    }

    public static void LIZJ(GiftQueueMessageModel giftQueueMessageModel) {
        C1136240ffq c1136240ffqLJJIFFI = giftQueueMessageModel.LJJIFFI();
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJIIL();
        c1136240ffqLJJIFFI.getClass();
    }
}
