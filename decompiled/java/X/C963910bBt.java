package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.message.IMessageService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963910bBt implements InterfaceC1115810f8t {
    public static final C925000aB8 LIZ;
    public static Room LIZIZ;

    static {
        C963910bBt c963910bBt = new C963910bBt();
        LIZ = new C925000aB8();
        ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).addOnMessageParsedListener(c963910bBt);
    }

    public static void LIZJ() {
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus roomAuthStatus2;
        if (SlardarSampleSetting.INSTANCE.isReport("ttlive_message_link_overall_state", 0.1d)) {
            JSONObject jSONObject = new JSONObject();
            try {
                Room room = LIZIZ;
                int publicScreenAuth = 0;
                jSONObject.put("chat_state", ((room == null || (roomAuthStatus2 = room.getRoomAuthStatus()) == null || roomAuthStatus2.enableChat) ? 0 : 1) ^ 1);
                Room room2 = LIZIZ;
                if (room2 != null && (roomAuthStatus = room2.getRoomAuthStatus()) != null) {
                    publicScreenAuth = roomAuthStatus.getPublicScreenAuth();
                }
                jSONObject.put("public_screen_state", publicScreenAuth);
                jSONObject.put("user_id", C501590Jll.LIZ());
                Room room3 = LIZIZ;
                jSONObject.put("room_id", room3 != null ? Long.valueOf(room3.getId()) : null);
                Room room4 = LIZIZ;
                jSONObject.put("anchor_id", room4 != null ? Long.valueOf(room4.getOwnerUserId()) : null);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1CC2.LJI("ttlive_message_link_overall_state", new JSONObject(), null, jSONObject);
        }
    }

    public static void LIZIZ(int i) {
        Long lValueOf;
        Long lValueOf2;
        if (!LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_chat", 0.2d)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("send_precondition_error_code", i);
            jSONObject.put("user_id", C501590Jll.LIZ());
            Room room = LIZIZ;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            jSONObject.put("room_id", lValueOf);
            Room room2 = LIZIZ;
            if (room2 != null) {
                lValueOf2 = Long.valueOf(room2.getOwnerUserId());
            } else {
                lValueOf2 = null;
            }
            jSONObject.put("anchor_id", lValueOf2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1CC2.LJI("ttlive_chat", new JSONObject(), null, jSONObject);
    }

    @Override // X.InterfaceC1115810f8t
    public final void LIZ(ChatMessage chatMessage) {
        long j;
        long j2;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        long[] jArr;
        if (!LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_chat_message_metrics", 0.1d)) {
            return;
        }
        C925000aB8 c925000aB8 = LIZ;
        CommonMessageData commonMessageData = chatMessage.baseMessage;
        if (commonMessageData != null) {
            j = commonMessageData.messageId;
        } else {
            j = 0;
        }
        int iBinarySearch = Arrays.binarySearch(c925000aB8.LL, 0, c925000aB8.LLILLL, j);
        if (iBinarySearch >= 0 && (jArr = c925000aB8.LLILLJJLI) != null) {
            j2 = jArr[iBinarySearch];
        } else {
            j2 = 0;
        }
        Long lValueOf4 = Long.valueOf(j2);
        if (lValueOf4.longValue() > 0 && 1 != 0) {
            long jLongValue = lValueOf4.longValue();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("message_send_receive_duration", SystemClock.uptimeMillis() - jLongValue);
                jSONObject.put("user_id", C501590Jll.LIZ());
                Room room = LIZIZ;
                if (room != null) {
                    lValueOf = Long.valueOf(room.getId());
                } else {
                    lValueOf = null;
                }
                jSONObject.put("room_id", lValueOf);
                Room room2 = LIZIZ;
                if (room2 != null) {
                    lValueOf2 = Long.valueOf(room2.getOwnerUserId());
                } else {
                    lValueOf2 = null;
                }
                jSONObject.put("anchor_id", lValueOf2);
                CommonMessageData commonMessageData2 = chatMessage.baseMessage;
                if (commonMessageData2 != null) {
                    lValueOf3 = Long.valueOf(commonMessageData2.messageId);
                } else {
                    lValueOf3 = null;
                }
                jSONObject.put("msg_id", lValueOf3);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1CC2.LJI("ttlive_chat_message_metrics", new JSONObject(), null, jSONObject);
        }
    }
}
