package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0agx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C944730agx extends C0K04 {
    public static final void LJIILIIL(JSONObject jSONObject) {
        if (!jSONObject.has("server_timestamp")) {
            C0K04.LJ("server_timestamp", C158B.LIZ(), jSONObject);
        }
        if (!jSONObject.has("client_and_server_diff_time")) {
            C0K04.LJ("client_and_server_diff_time", C963140bAe.LIZLLL, jSONObject);
        }
        if (!jSONObject.has("client_timestamp")) {
            C0K04.LJ("client_timestamp", System.currentTimeMillis(), jSONObject);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.HashMap<java.lang.String, java.lang.Object> LJIILJJIL(boolean r9) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C944730agx.LJIILJJIL(boolean):java.util.HashMap");
    }

    public static void LJIIJ(Throwable th, JSONObject jSONObject) {
        String idStr;
        long ownerUserId;
        if (th != null) {
            if (th instanceof C501470JlZ) {
                C0K04.LJFF("error_type", "api_error", jSONObject);
                C0K04.LJ("error_code", r4.getErrorCode(), jSONObject);
                C0K04.LJFF("error_msg", ((C501470JlZ) th).getErrorMsg(), jSONObject);
            } else if (th instanceof C1811850xFX) {
                C0K04.LJFF("error_type", "net_error", jSONObject);
                C0K04.LJ("error_code", r4.statusCode, jSONObject);
                C0K04.LJFF("error_msg", ((C1811850xFX) th).getMessage(), jSONObject);
            } else {
                C0K04.LJFF("error_type", "unknow", jSONObject);
                C0K04.LJ("error_code", -1L, jSONObject);
                C0K04.LJFF("error_msg", th.getClass().getName(), jSONObject);
            }
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (Room.isValid(room)) {
            idStr = room.getIdStr();
        } else {
            idStr = CardStruct.IStatusCode.DEFAULT;
        }
        if (Room.isValid(room)) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        C0K04.LJFF("room_id", idStr, jSONObject);
        C0K04.LJ("anchor_id", ownerUserId, jSONObject);
    }

    public static final void LJIIL(Throwable th, JSONObject jSONObject) {
        String message;
        int cronetInternalErrorCode;
        if (th != null) {
            message = th.toString();
        } else {
            message = null;
        }
        if (th instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            cronetInternalErrorCode = c501470JlZ.getErrorCode();
            message = c501470JlZ.getErrorMsg();
        } else if (th instanceof C1811850xFX) {
            C1811850xFX c1811850xFX = (C1811850xFX) th;
            cronetInternalErrorCode = c1811850xFX.statusCode;
            message = c1811850xFX.getMessage();
        } else if (th instanceof C501520Jle) {
            C501520Jle c501520Jle = (C501520Jle) th;
            cronetInternalErrorCode = c501520Jle.getErrorCode();
            message = c501520Jle.getMessage();
        } else if (th instanceof C1494690ozz) {
            C1494690ozz c1494690ozz = (C1494690ozz) th;
            cronetInternalErrorCode = c1494690ozz.getCronetInternalErrorCode();
            message = c1494690ozz.getMessage();
        } else {
            cronetInternalErrorCode = 100001;
        }
        C0K04.LJ("error_msg", cronetInternalErrorCode, jSONObject);
        C0K04.LJFF("error_detail", message, jSONObject);
        if (th != null) {
            C0K04.LJFF("error_class", th.getClass().getName(), jSONObject);
        }
    }

    public final void LJIIJJI(JSONObject jSONObject, boolean z) {
        Object value;
        for (Map.Entry<String, Object> entry : LJIILJJIL(z).entrySet()) {
            if (!jSONObject.has(entry.getKey()) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                if (value instanceof Long) {
                    C0K04.LJ(key, ((Number) value).longValue(), jSONObject);
                } else if (value instanceof Float) {
                    C0K04.LJIIIIZZ(jSONObject, key, ((Number) value).floatValue());
                } else if (value instanceof Double) {
                    C0K04.LIZJ(((Number) value).doubleValue(), key, jSONObject);
                } else if (value instanceof JSONObject) {
                    C0K04.LJII(key, jSONObject, (JSONObject) value);
                } else if (value instanceof String) {
                    C0K04.LJFF(key, (String) value, jSONObject);
                } else {
                    C0K04.LJFF(key, value.toString(), jSONObject);
                }
            }
        }
        LJIILIIL(jSONObject);
    }
}
