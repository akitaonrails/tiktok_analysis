package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W3T, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W3T {
    public static void LIZ(Throwable th, JSONObject jSONObject) {
        if (th != null) {
            try {
                String message = th.getMessage();
                if (C2093608Ic.LJ(message)) {
                    return;
                }
                int length = message.length();
                int iLJJJ = a0.LJJJ(message, "ErrorCode=", 0, false, 6);
                if (iLJJJ != -1) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = iLJJJ + 10; i < length; i++) {
                        char cCharAt = message.charAt(i);
                        if (!Character.isSpaceChar(cCharAt)) {
                            if (cCharAt != '-' && !Character.isDigit(cCharAt)) {
                                break;
                            } else {
                                sb.append(cCharAt);
                            }
                        }
                    }
                    if (sb.length() > 0) {
                        jSONObject.put("cronet_error_code", sb.toString());
                    }
                }
                if (th instanceof C1494690ozz) {
                    jSONObject.put("cronet_internal_error_code", ((C1494690ozz) th).getCronetInternalErrorCode());
                    return;
                }
                int iLJJJ2 = a0.LJJJ(message, "InternalErrorCode=", 0, false, 6);
                if (iLJJJ2 != -1) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i2 = iLJJJ2 + 18; i2 < length; i2++) {
                        char cCharAt2 = message.charAt(i2);
                        if (!Character.isSpaceChar(cCharAt2)) {
                            if (cCharAt2 != '-' && !Character.isDigit(cCharAt2)) {
                                break;
                            } else {
                                sb2.append(cCharAt2);
                            }
                        }
                    }
                    if (sb2.length() > 0) {
                        jSONObject.put("cronet_internal_error_code", sb2.toString());
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }
}
