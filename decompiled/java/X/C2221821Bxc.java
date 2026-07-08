package X;

import com.bytedance.android.livesdk.TrackMessage;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageMonitorSamplingConfig;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageSampleRatio;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageServerSample;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageTrackerSwitchSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* JADX INFO: renamed from: X.1Bxc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221821Bxc {
    public static final Map<String, Object> LIZ = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJI(X.AbstractC1136060ffY r12) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221821Bxc.LJI(X.0ffY):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJII(com.ss.ugc.live.sdk.message.data.IMessage r14) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221821Bxc.LJII(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    public static final void LJIIJJI(LiveWsMessage liveWsMessage) {
        if (!C13LQ.LJIILLIIL("ttlive_message_web_socket_message_success", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        HashMap map = new HashMap(LIZ);
        map.put("status_code", 10000);
        map.put("seq_id", Long.valueOf(liveWsMessage.seqId));
        map.put("log_id", Long.valueOf(liveWsMessage.logId));
        map.put("service", Integer.valueOf(liveWsMessage.service));
        map.put("method", Integer.valueOf(liveWsMessage.method));
        map.put("payload_type", liveWsMessage.payloadType);
        LJIIL(0, "ttlive_message_web_socket_message_success", map);
    }

    public static final void LIZIZ(String str, String str2) {
        if (!C13LQ.LJIILLIIL("ttlive_message_zstd_init_error", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        HashMap map = new HashMap(LIZ);
        map.put("error", str);
        map.put("zstd_dict_version", str2);
        LJIIL(1, "ttlive_message_zstd_init_all", map);
        LJIIL(1, "ttlive_message_zstd_init_error", map);
    }

    public static final void LIZJ(long j, String str) {
        if (!C13LQ.LJIILLIIL("ttlive_message_zstd_init_all", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        HashMap map = new HashMap(LIZ);
        map.put("zstd_dict_version", str);
        map.put("duration", Long.valueOf(j));
        LJIIL(0, "ttlive_message_zstd_init_all", map);
    }

    public static final void LIZLLL(Exception exc, int i) {
        int i2;
        if (!C13LQ.LJIILLIIL("ttlive_message_api_call_failed", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        HashMap map = new HashMap(LIZ);
        map.put("fetch_rule", Integer.valueOf(i));
        if (exc instanceof C1811850xFX) {
            i2 = ((C1811850xFX) exc).statusCode;
        } else {
            i2 = -10000;
        }
        map.put("status_code", Integer.valueOf(i2));
        map.put("error_code", 0);
        map.put("error_type", exc.getClass().getName());
        String message = exc.getMessage();
        if (message != null) {
            map.put("error_msg", message);
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        map.put("stack_trace", stringWriter.toString());
        LJIIL(1, "ttlive_message_api_call_failed", map);
    }

    public static final void LJ(ProtoApiResult protoApiResult, int i) {
        if (!C13LQ.LJIILLIIL("ttlive_message_api_call_success", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        HashMap map = new HashMap(LIZ);
        map.put("fetch_rule", Integer.valueOf(i));
        map.put("fetch_type", Integer.valueOf(protoApiResult.fetchType));
        map.put("status_code", 10000);
        ArrayList arrayList = new ArrayList();
        for (IMessage iMessage : protoApiResult.messages) {
            if (iMessage instanceof AbstractC1136060ffY) {
                AbstractC1136060ffY abstractC1136060ffY = (AbstractC1136060ffY) iMessage;
                arrayList.add(new TrackMessage(Long.valueOf(abstractC1136060ffY.getMessageId()), Integer.valueOf(abstractC1136060ffY.getGeneralMessageType()), abstractC1136060ffY.getMethodName(), Integer.valueOf(abstractC1136060ffY.getMessageFrom())));
            }
        }
        map.put("message_list", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, arrayList));
        LJIIL(0, "ttlive_message_api_call_success", map);
    }

    public static final void LJIIIIZZ(String str, Map<String, ? extends Object> map) {
        if (!C13LQ.LJIILLIIL("ttlive_message_decompress_error", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        HashMap map2 = new HashMap(LIZ);
        map2.put("error", str);
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            map2.put(entry.getKey(), entry.getValue());
        }
        LJIIL(1, "ttlive_message_decompress_error", map2);
        if (new Random().nextDouble() < LiveMessageMonitorSamplingConfig.INSTANCE.zstdSamplingRate()) {
            C501590Jll.LIZLLL(map2);
            LJIIL(1, "ttlive_message_decompress_all", map2);
        }
    }

    public static final void LJIIJ(LiveWsMessage liveWsMessage, Exception exc) {
        if (!C13LQ.LJIILLIIL("ttilve_message_web_socket_message_failed", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        HashMap map = new HashMap(LIZ);
        map.put("status_code", -10002);
        map.put("seq_id", Long.valueOf(liveWsMessage.seqId));
        map.put("log_id", Long.valueOf(liveWsMessage.logId));
        map.put("service", Integer.valueOf(liveWsMessage.service));
        map.put("method", Integer.valueOf(liveWsMessage.method));
        map.put("payload_type", liveWsMessage.payloadType);
        map.put("error_type", exc.getClass().getName());
        map.put("error_code", 2);
        String message = exc.getMessage();
        if (message != null) {
            map.put("error_msg", message);
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        map.put("stack_trace", stringWriter.toString());
        LJIIL(1, "ttilve_message_web_socket_message_failed", map);
    }

    public static final boolean LIZ(AbstractC1136060ffY abstractC1136060ffY, boolean z, LiveMessageServerSample liveMessageServerSample) {
        long j;
        LiveMessageSampleRatio roomRatio;
        String serverDeviceId;
        long outerMessageId = abstractC1136060ffY.getOuterMessageId();
        int i = abstractC1136060ffY.sampleFlag;
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        try {
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            if (iHostAppContext == null || (serverDeviceId = iHostAppContext.getServerDeviceId()) == null) {
                serverDeviceId = "";
            }
            j = CastLongProtector.parseLong(serverDeviceId);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            j = 0;
        }
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        if (outerMessageId == 0 || j == 0 || currentUserId == 0) {
            return false;
        }
        boolean zLIZJ = C2221841Bxe.LIZJ(abstractC1136060ffY.getGeneralMessageType());
        if (z) {
            if (zLIZJ) {
                roomRatio = liveMessageServerSample.getAnchorRatio().getP2pRatio();
            } else {
                roomRatio = liveMessageServerSample.getAnchorRatio().getRoomRatio();
            }
        } else if (zLIZJ) {
            roomRatio = liveMessageServerSample.getAudienceRatio().getP2pRatio();
        } else {
            roomRatio = liveMessageServerSample.getAudienceRatio().getRoomRatio();
        }
        long msgRatio = roomRatio.getMsgRatio();
        long deviceRatio = roomRatio.getDeviceRatio();
        long userRatio = roomRatio.getUserRatio();
        long baseRatio = roomRatio.getBaseRatio();
        if (baseRatio > 0 && outerMessageId % baseRatio < msgRatio) {
            if (j % baseRatio < deviceRatio || currentUserId % baseRatio < userRatio) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final void LJIIIZ(String str, String str2, boolean z) {
        if (!C13LQ.LJIILLIIL("ttlive_message_web_socket_connect_start", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        HashMap map = new HashMap(LIZ);
        map.put("cursor", str);
        map.put("ws_reuse", Boolean.valueOf(z));
        map.put("url", str2);
        LJIIL(0, "ttlive_message_web_socket_connect_start", map);
    }

    public static void LJIIL(int i, String str, Map map) {
        HashMap map2 = (HashMap) map;
        map2.put("date_time", new SimpleDateFormat("yyyy-MM-dd, HH:mm:ss.SSS", Locale.ENGLISH).format(new Date()));
        C1CC2.LJII(i, str, map);
        if (new Random().nextDouble() < LiveMessageMonitorSamplingConfig.INSTANCE.logSamplingRate()) {
            map2.put("event_name", str);
            if (i == 0) {
                C1143300frE.LJIIJJI().LJII("ttlive_msg", map);
            } else {
                C1143300frE.LJIIJJI().LJ("ttlive_msg", map);
            }
        }
    }

    public static final void LJFF(Throwable th, ProtoApiResult.ProtoMessage protoMessage, List<ProtoApiResult.ProtoMessage> list, int i) {
        if (!C13LQ.LJIILLIIL("ttlive_message_decode_failed", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        HashMap map = new HashMap(LIZ);
        map.put("status_code", -10001);
        map.put("error_type", "Decode failed");
        map.put("error_code", 1);
        String message = th.getMessage();
        if (message != null) {
            map.put("error_msg", message);
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        map.put("stack_trace", stringWriter.toString());
        map.put("message_id", Long.valueOf(protoMessage.msgId));
        map.put("message_type", Integer.valueOf(protoMessage.msgType));
        map.put("message_method", protoMessage.method);
        map.put("message_strategy", Integer.valueOf(i));
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (ProtoApiResult.ProtoMessage protoMessage2 : list) {
                arrayList.add(new TrackMessage(Long.valueOf(protoMessage2.msgId), Integer.valueOf(protoMessage2.msgType), protoMessage2.method, Integer.valueOf(i)));
            }
        }
        map.put("total_message_list", arrayList);
        LJIIL(1, "ttlive_message_decode_failed", map);
    }
}
