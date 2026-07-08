package X;

import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import kotlin.jvm.internal.AFwS189S0000000_3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0g07, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1148810g07 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1734));

    public static JSONObject LIZ(C1148820g08 c1148820g08) throws JSONException {
        Object jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        GiftMessage giftMessage = c1148820g08.LIZ;
        if (giftMessage != null) {
            jSONObject = new JSONObject(GsonProtectorUtils.toJson((Gson) LIZ.getValue(), giftMessage));
        } else {
            jSONObject = JSONObject.NULL;
        }
        jSONObject2.put("gift_message", jSONObject);
        jSONObject2.put("target", c1148820g08.LIZIZ);
        jSONObject2.put("current_process", c1148820g08.LIZJ);
        jSONObject2.put("signature", c1148820g08.LIZLLL);
        jSONObject2.put("is_local", c1148820g08.LJ);
        jSONObject2.put("total_amount", c1148820g08.LJFF);
        jSONObject2.put("receive_ms", c1148820g08.LJI);
        jSONObject2.put("enter_queue_ms", c1148820g08.LJII);
        jSONObject2.put("out_of_queue_ms", c1148820g08.LJIIIIZZ);
        return jSONObject2;
    }
}
