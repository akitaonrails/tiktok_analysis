package X;

import com.bytedance.android.livesdk.livesetting.gift.GiftEventTrackSamplingSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ffA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135820ffA {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(GiftMessage giftMessage, long j, long j2) {
        long j3;
        if (C1101370elb.LIZ.LJIILJJIL("live_gift_overload_downgrade_tracking_enable")) {
            return;
        }
        CommonMessageData commonMessageData = giftMessage.baseMessage;
        long j4 = 0;
        if (commonMessageData != null) {
            j3 = commonMessageData.createTime;
        } else {
            j3 = 0;
        }
        long j5 = j - j3;
        GiftMonitorInfo giftMonitorInfo = giftMessage.giftMonitorInfo;
        if (giftMonitorInfo != null) {
            j4 = giftMonitorInfo.send_gift_req_start_ms;
        }
        long j6 = j - j4;
        boolean zLJJII = C1135800ff8.LJJII();
        boolean zLJJIII = C1135800ff8.LJJIII();
        boolean zLJJIIZ = C1135800ff8.LJJIIZ(giftMessage);
        if (GiftEventTrackSamplingSetting.shouldBlock(giftMessage)) {
            return;
        }
        if (GiftEventTrackSamplingSetting.enable()) {
            if (zLJJII || zLJJIII || zLJJIIZ) {
                return;
            }
        } else if (zLJJII) {
            C1131800fYg.LIZ.getClass();
            if (C781880Ulm.LIZLLL) {
                return;
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_msg_receive");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(C1135800ff8.LJIIIIZZ(giftMessage, j, j2));
        c474500IjALIZ.LJJII(Long.valueOf(j5), "msg_create_receive_dur");
        c474500IjALIZ.LJJII(Long.valueOf(j6), "send_receive_im_dur");
        c474500IjALIZ.LJJII(Long.valueOf(C1135800ff8.LJIILLIIL(giftMessage, j2, j)), "send_receive_dur");
        for (Map.Entry entry : ((LinkedHashMap) C1135800ff8.LJII(giftMessage)).entrySet()) {
            c474500IjALIZ.LJJII(entry.getValue(), (String) entry.getKey());
        }
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJL();
        }
        if (!C1127020fQy.LIZ(0.01f, "ttlive_gift_msg_receive") || !LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_gift_msg_receive", 0.0d)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject2.put("msg_create_receive_dur", j5);
            jSONObject2.put("send_receive_im_dur", j6);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZIZ("GiftPerformanceMonitor", String.valueOf(e.getMessage()));
        }
        C1135800ff8.LJIIJJI(giftMessage, jSONObject, jSONObject2, j, j2);
        C1CC2.LJ("ttlive_gift_msg_receive", jSONObject, jSONObject3, jSONObject2);
    }
}
