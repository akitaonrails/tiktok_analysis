package X;

import com.bytedance.android.livesdk.model.message.OecLiveCreatorMessage;
import com.bytedance.android.livesdk.model.message.OecLiveCreatorMessageMeta;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdk.model.message.ext.TraceInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.oec_msg.AuctionInfo;
import webcast.data.oec_msg.CommerceInfo;
import webcast.data.oec_msg.OecLiveShoppingMessageV2;
import webcast.data.oec_msg.PopCardInfo;

/* JADX INFO: renamed from: X.00bO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C110400bO {
    public static final C110400bO LIZ = new C110400bO();
    public static final Map<ECommerceMessage, Pair<Long, Long>> LIZIZ = new HashMap();

    public static long LJ() {
        try {
            return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJJJZI();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return System.currentTimeMillis();
        }
    }

    public static JSONObject LIZLLL(ECommerceMessage eCommerceMessage) {
        Pair pair = (Pair) ((HashMap) LIZIZ).remove(eCommerceMessage);
        JSONObject jSONObject = new JSONObject();
        TraceInfo traceInfo = eCommerceMessage.traceInfo;
        if (traceInfo != null) {
            jSONObject.put("operation_time", traceInfo.operateTime);
        }
        TraceInfo traceInfo2 = eCommerceMessage.traceInfo;
        if (traceInfo2 != null) {
            jSONObject.put("arrival_time", traceInfo2.arrivalTime);
        }
        TraceInfo traceInfo3 = eCommerceMessage.traceInfo;
        if (traceInfo3 != null) {
            jSONObject.put("send_time", traceInfo3.sendTime);
        }
        if (pair != null) {
            jSONObject.put("get_message_time", ((Number) pair.getFirst()).longValue());
            jSONObject.put("call_time", ((Number) pair.getSecond()).longValue());
        }
        return jSONObject;
    }

    public static void LIZ(ECommerceMessage eCommerceMessage, Long l, Long l2) {
        long jLongValue;
        Map<ECommerceMessage, Pair<Long, Long>> map = LIZIZ;
        long jLongValue2 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Long lValueOf = Long.valueOf(jLongValue);
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        }
        ((HashMap) map).put(eCommerceMessage, new Pair(lValueOf, Long.valueOf(jLongValue2)));
    }

    public static JSONObject LIZIZ(OecLiveCreatorMessage oecLiveCreatorMessage, Long l, Integer num) throws JSONException {
        Map<String, String> map;
        JSONObject jSONObject = new JSONObject();
        OecLiveCreatorMessageMeta oecLiveCreatorMessageMeta = oecLiveCreatorMessage.meta;
        if (oecLiveCreatorMessageMeta != null && (map = oecLiveCreatorMessageMeta.traceInfoMap) != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        if (l != null) {
            jSONObject.put("client_receive_time", String.valueOf(l.longValue()));
        }
        if (num != null) {
            jSONObject.put("message_type", String.valueOf(num.intValue()));
        }
        return jSONObject;
    }

    public static JSONObject LIZJ(OecLiveShoppingMessageV2 oecLiveShoppingMessageV2, Long l, Integer num, Long l2) throws JSONException {
        PopCardInfo popCardInfo;
        AuctionInfo auctionInfo;
        Map<String, String> map;
        JSONObject jSONObject = new JSONObject();
        CommerceInfo commerceInfo = oecLiveShoppingMessageV2.commerceInfo;
        if (commerceInfo != null && (auctionInfo = commerceInfo.auctionInfo) != null && (map = auctionInfo.traceTimeMap) != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        if (l != null) {
            jSONObject.put("client_receive_time", String.valueOf(l.longValue()));
        }
        if (l2 != null) {
            jSONObject.put("video_delay_time", String.valueOf(l2.longValue()));
        }
        if (num != null) {
            jSONObject.put("message_type", String.valueOf(num.intValue()));
        }
        CommerceInfo commerceInfo2 = oecLiveShoppingMessageV2.commerceInfo;
        if (commerceInfo2 != null && (popCardInfo = commerceInfo2.popCardInfo) != null) {
            jSONObject.put("card_type", String.valueOf(popCardInfo.popCardType));
        }
        return jSONObject;
    }
}
