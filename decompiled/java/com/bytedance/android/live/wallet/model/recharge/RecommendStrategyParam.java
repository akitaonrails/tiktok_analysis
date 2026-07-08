package com.bytedance.android.live.wallet.model.recharge;

import X.C09CT;
import X.C786410Ut5;
import com.bytedance.scene.Scene;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class RecommendStrategyParam {

    @C09CT("coins_gap")
    public long coinsGap;

    @C09CT("gift_ids")
    public List<Long> giftIds;

    @C09CT("gift_total_coins")
    public long giftTotalCoins;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";

    @C09CT("charge_reason")
    public String chargeReason = "";

    public final String LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scene.SCENE_SERVICE, this.scene);
        jSONObject.put("charge_reason", this.chargeReason);
        jSONObject.put("gift_total_coins", this.giftTotalCoins);
        jSONObject.put("coins_gap", this.coinsGap);
        jSONObject.put("gift_ids", new JSONArray((Collection) this.giftIds));
        return C786410Ut5.J3(jSONObject);
    }
}
