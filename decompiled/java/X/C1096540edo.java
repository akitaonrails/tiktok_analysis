package X;

import com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformBubbleConfig;
import com.bytedance.android.livesdkapi.avoidance.setting.LiveTooltipStrategySlardarSampleRateSetting;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0edo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1096540edo {
    public static void LIZ(String str, String str2, LiveMessagePlatformBubbleConfig liveMessagePlatformBubbleConfig, Map map) throws JSONException {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key: ");
        sbLIZ.append(str2);
        sbLIZ.append(", strategyScene: ");
        sbLIZ.append(liveMessagePlatformBubbleConfig.strategyScene);
        sbLIZ.append(", strategyDecisionKey: ");
        sbLIZ.append(liveMessagePlatformBubbleConfig.strategyDecisionKey);
        sbLIZ.append(", msg: ");
        sbLIZ.append(str);
        C20441214yg.LJ("tooltip_strategy", C2188811AlT.LIZIZ(sbLIZ));
        if (C1103150eoT.LJIIIIZZ || AbstractC19994813Le.Default.nextDouble() < LiveTooltipStrategySlardarSampleRateSetting.getValue()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", str2);
            jSONObject.put("strategyScene", liveMessagePlatformBubbleConfig.strategyScene);
            jSONObject.put("strategyDecisionKey", liveMessagePlatformBubbleConfig.strategyDecisionKey);
            jSONObject.put("msg", str);
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            C1CC2.LJIIL(0, "tooltip_strategy", jSONObject);
        }
    }
}
