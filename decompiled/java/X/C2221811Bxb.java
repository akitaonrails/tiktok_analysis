package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageDispatchSamplingConfig;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMonitor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bxb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221811Bxb implements IMonitor {
    public static final Map<String, Object> LIZJ = new HashMap();
    public final EnumC19379710rr LIZ;
    public final C2222431Byb LIZIZ = new C2222431Byb();

    public static boolean LJFF() {
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        Map map = (Map) DataChannelGlobal.LLILZ.gg0(C1148040fys.class);
        return map != null && String.valueOf(currentUserId).equals(map.get("anchor_id"));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMonitor
    public final InterfaceC2222261ByK capacityTracker() {
        return this.LIZIZ;
    }

    public C2221811Bxb(EnumC19379710rr enumC19379710rr) {
        this.LIZ = enumC19379710rr;
    }

    public static void LIZLLL(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                int effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
                C1497140p3w networkQuality = TTNetInit.getNetworkQuality();
                int i = networkQuality.LIZIZ;
                int i2 = networkQuality.LIZ;
                jSONObject.put("nqe_score", effectiveConnectionType);
                jSONObject.put("http_rtt", i);
                jSONObject.put("trans_rtt", i2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("LiveMessageMonitor", e);
            }
        }
    }

    public static void LJIIIIZZ(long j) {
        if (Math.random() < LiveMessageDispatchSamplingConfig.INSTANCE.commonSamplingRate()) {
            HashMap map = new HashMap();
            map.put("status_code", 1);
            map.put("delay", Long.valueOf(j));
            map.put("time_diff", Long.valueOf(C963140bAe.LIZLLL));
            C1CC2.LJII(0, "ttlive_message_stream_sei_delay", map);
        }
    }

    public final void LIZ(Map<String, Object> map) {
        HashMap map2 = (HashMap) map;
        map2.put("ws_reuse", 1);
        map2.put("is_anchor_common", Integer.valueOf(LJFF() ? 1 : 0));
        map2.put("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        map2.put("imsdk_scene", Integer.valueOf(C2221841Bxe.LIZ(this.LIZ)));
    }

    public final void LIZIZ(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                int i = 1;
                jSONObject.put("ws_reuse", 1);
                if (!LJFF()) {
                    i = 0;
                }
                jSONObject.put("is_anchor_common", i);
                jSONObject.put("device_score", TTliveAnchorDeviceScoreSetting.INSTANCE.getValue());
                jSONObject.put("imsdk_scene", C2221841Bxe.LIZ(this.LIZ));
                int effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
                C1497140p3w networkQuality = TTNetInit.getNetworkQuality();
                int i2 = networkQuality.LIZIZ;
                int i3 = networkQuality.LIZ;
                jSONObject.put("nqe_score", effectiveConnectionType);
                jSONObject.put("http_rtt", i2);
                jSONObject.put("trans_rtt", i3);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("LiveMessageMonitor", e);
            }
        }
    }

    public final void LIZJ(JSONObject jSONObject) {
        int i;
        try {
            if (LJFF()) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_anchor", i);
            jSONObject.put("imsdk_scene", C2221841Bxe.LIZ(this.LIZ));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("LiveMessageMonitor", e);
        }
    }

    public final void LJIIIZ(String str, Throwable th) {
        HashMap map = new HashMap();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        map.put("status_code", -10001);
        map.put("error_type", "ParseError");
        map.put("error_code", "1");
        map.put("method_name", str);
        map.put("error_msg", th.getMessage());
        map.put("stack_trace", stringWriter.toString());
        LIZ(map);
        C1CC2.LJII(1, C0KQH.LIZIZ("ttlive_fetch_message"), map);
        map.put("event_name", C0KQH.LIZIZ("ttlive_fetch_message").toUpperCase(Locale.getDefault()));
        C1143300frE.LJIIJJI().LJ("ttlive_msg", map);
    }

    public static void LJ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (str == null || jSONObject == null || !str.contains("message_first_dispatch") || LJFF()) {
            return;
        }
        long jLIZIZ = C1256004vm.LIZIZ("enter_room_start");
        long jLIZIZ2 = C1256004vm.LIZIZ("enter_room_api_start");
        long jLIZIZ3 = C1256004vm.LIZIZ("enter_room_api_end");
        long jLIZIZ4 = C1256004vm.LIZIZ("first_frame_show");
        long jLIZIZ5 = C1256004vm.LIZIZ("live_message_start");
        try {
            long j = JSONObjectProtectorUtils.getLong(jSONObject, "message_first_dispatch_total");
            long j2 = jLIZIZ2 - jLIZIZ;
            jSONObject.put("enter_room_api", j2);
            long j3 = jLIZIZ3 - jLIZIZ2;
            jSONObject.put("enter_room_api_end", j3);
            long j4 = jLIZIZ4 - jLIZIZ;
            jSONObject.put("first_frame_show", j4);
            long j5 = jLIZIZ5 - jLIZIZ3;
            jSONObject.put("im_message_start", j5);
            long j6 = jLIZIZ5 - jLIZIZ;
            jSONObject.put("message_first_dispatch_total", j6 + j);
            if (jSONObject2 != null) {
                jSONObject2.put("enter_room_api_2_start_room", j2);
                jSONObject2.put("enter_room_api_duration", j3);
                jSONObject2.put("first_frame_show_2_start_room", j4);
                jSONObject2.put("im_message_start_2_enter_room", j5);
                jSONObject2.put("enter_room_api_end_2_start_room", jLIZIZ3 - jLIZIZ);
                jSONObject2.put("im_message_start_2_start_room", j6);
                jSONObject2.put("im_message_first_dispatch_2_start_room", SystemClock.elapsedRealtime() - jLIZIZ);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("LiveMessageMonitor", e);
        }
    }

    public static void LJI(long j, String str, String str2) {
        Map<String, ?> map = LIZJ;
        HashMap map2 = (HashMap) map;
        map2.put("event_name", str);
        map2.put("method", str2);
        map2.put("msg_id", Long.valueOf(j));
        C1143300frE.LJIIJJI().LIZIZ("ttlive_msg", map);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMonitor
    public final void monitorStatus(String str, int i, JSONObject jSONObject) {
        LIZIZ(jSONObject);
        LJ(str, jSONObject, null);
        C1CC2.LJIIIIZZ(str, i, jSONObject);
    }

    public final void LJII(int i, String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("error_code", CardStruct.IStatusCode.DEFAULT);
        map.put("status_code", Integer.valueOf(i));
        map.put("error_type", str);
        if (!TextUtils.isEmpty(str3)) {
            map.put("stack_trace", str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put("error_msg", str2);
        }
        LIZ(map);
        C1CC2.LJII(1, C0KQH.LIZIZ("ttlive_fetch_message"), map);
        map.put("event_name", C0KQH.LIZIZ("ttlive_fetch_message").toUpperCase(Locale.getDefault()));
        C1143300frE.LJIIJJI().LJ("ttlive_msg", map);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMonitor
    public final void monitor(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        LIZIZ(jSONObject3);
        LIZJ(jSONObject);
        LIZLLL(jSONObject2);
        LJ(str, jSONObject3, jSONObject2);
        C1CC2.LJI(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMonitor
    public final void monitorLatency(String str, long j, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        LIZIZ(jSONObject3);
        LIZJ(jSONObject);
        LIZLLL(jSONObject2);
        LJ(str, jSONObject3, jSONObject2);
        if (jSONObject3 == null) {
            try {
                jSONObject3 = new JSONObject();
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("LiveMessageMonitor", e.getMessage());
            }
        }
        if (j > 0) {
            jSONObject2.put("latency", j);
            jSONObject3.put("latency", j);
        }
        jSONObject3.put("event_module", "live_message");
        jSONObject3.put("event_type", "bussiness_api_call");
        C1CC2.LJI(str, jSONObject, jSONObject2, jSONObject3);
    }
}
