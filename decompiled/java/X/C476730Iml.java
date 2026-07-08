package X;

import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.o;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Iml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476730Iml {
    public static final void LIZ(Object obj, Long l, String str, String str2, String str3) {
        int i;
        int statusCode;
        JSONObject jSONObjectOptJSONObject;
        Integer numValueOf;
        String message;
        Throwable th;
        if (l == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("room_id", l.toString());
        if (str != null) {
            linkedHashMap.put("action_type", str);
        }
        if (str2 != null) {
            linkedHashMap.put("enter_from_merge", str2);
        }
        linkedHashMap.put("is_ecom", str3);
        if (obj instanceof o) {
            i = 1001;
        } else {
            i = 1002;
        }
        if (obj instanceof C501470JlZ) {
            statusCode = ((C501520Jle) obj).getErrorCode();
            message = ((C501470JlZ) obj).getErrorMsg();
        } else {
            if (obj instanceof C1494430ozZ) {
                statusCode = ((C1494430ozZ) obj).getStatusCode();
            } else if (obj instanceof C1494690ozz) {
                try {
                    String requestLog = ((C1494690ozz) obj).getRequestLog();
                    if (requestLog != null && (jSONObjectOptJSONObject = new JSONObject(requestLog).optJSONObject("base")) != null && (numValueOf = Integer.valueOf(jSONObjectOptJSONObject.optInt("net_error"))) != null) {
                        statusCode = numValueOf.intValue();
                    } else {
                        statusCode = ((C1494690ozz) obj).getStatusCode();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    statusCode = ((C1494690ozz) obj).getStatusCode();
                }
            } else {
                statusCode = 0;
            }
            if (!(obj instanceof Exception) || (th = (Throwable) obj) == null || (message = th.getMessage()) == null) {
                message = "";
            }
        }
        linkedHashMap.put("sub_error_code", Integer.valueOf(statusCode));
        ((IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class)).fw(Integer.valueOf(i), message, linkedHashMap);
    }
}
