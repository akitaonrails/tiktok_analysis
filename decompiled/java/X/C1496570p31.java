package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ttnet.org.chromium.net.impl.NetworkExceptionImpl;
import com.ttnet.org.chromium.net.urlconnection.i;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0p31, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496570p31 {
    public static C1496580p32 LIZ(Throwable th) {
        i iVar;
        try {
            if (th instanceof C1494430ozZ) {
                C1494430ozZ c1494430ozZ = (C1494430ozZ) th;
                Integer numValueOf = Integer.valueOf(c1494430ozZ.getStatusCode());
                String strLIZIZ = LIZIZ(String.valueOf(c1494430ozZ.getCause()));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("HttpResponseException_net_http_");
                sbLIZ.append(c1494430ozZ.getStatusCode());
                return new C1496580p32(numValueOf, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ));
            }
            if (th instanceof C1494690ozz) {
                if (th.getCause() instanceof i) {
                    Throwable cause = th.getCause();
                    if (cause instanceof i) {
                        iVar = (i) cause;
                    } else {
                        iVar = null;
                    }
                    return LJ(iVar);
                }
                return LIZJ((C1494690ozz) th);
            }
            if (th instanceof C0XIR) {
                C0XIR c0xir = (C0XIR) th;
                Integer numValueOf2 = Integer.valueOf(c0xir.getErrorCode());
                String strLIZIZ2 = LIZIZ(String.valueOf(c0xir.getCause()));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ApiServerException_net_server_");
                sbLIZ2.append(c0xir.getErrorCode());
                return new C1496580p32(numValueOf2, strLIZIZ2, C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (th instanceof TimeoutException) {
                return new C1496580p32(-1, LIZIZ(String.valueOf(((TimeoutException) th).getCause())), "TimeoutException_net_timeout");
            }
            if (th instanceof C1494450ozb) {
                return new C1496580p32(-106, LIZIZ(String.valueOf(((C1494450ozb) th).getCause())), "NetworkNotAvailableException_net_no_network");
            }
            if (th instanceof i) {
                return LJ((i) th);
            }
            if (th instanceof NetworkExceptionImpl) {
                NetworkExceptionImpl networkExceptionImpl = (NetworkExceptionImpl) th;
                Integer numValueOf3 = Integer.valueOf(networkExceptionImpl.getErrorCode());
                String strLIZIZ3 = LIZIZ(String.valueOf(networkExceptionImpl.getCause()));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("NetworkExceptionImpl_net_exception_");
                sbLIZ3.append(networkExceptionImpl.getErrorCode());
                return new C1496580p32(numValueOf3, strLIZIZ3, C2188811AlT.LIZIZ(sbLIZ3));
            }
            C1496580p32 c1496580p32LIZLLL = LIZLLL(th);
            if (c1496580p32LIZLLL == null) {
                return new C1496580p32(-1, LIZIZ(String.valueOf(th.getCause())), "UnknownException_net_unknown");
            }
            return c1496580p32LIZLLL;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return new C1496580p32(-1, LIZIZ(String.valueOf(th.getCause())), "UnknownException_net_unknown");
        }
    }

    public static String LIZIZ(String str) {
        if (str.length() > 500) {
            return str.substring(0, 500);
        }
        return str;
    }

    public static C1496580p32 LIZJ(C1494690ozz c1494690ozz) {
        JSONObject jSONObjectOptJSONObject;
        if (c1494690ozz.getStatusCode() > 0) {
            Integer numValueOf = Integer.valueOf(c1494690ozz.getStatusCode());
            String strLIZIZ = LIZIZ(String.valueOf(c1494690ozz.getCause()));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CronetIOException_net_http_");
            sbLIZ.append(c1494690ozz.getStatusCode());
            return new C1496580p32(numValueOf, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ));
        }
        String requestLog = c1494690ozz.getRequestLog();
        if (requestLog != null && (jSONObjectOptJSONObject = new JSONObject(requestLog).optJSONObject("base")) != null) {
            int iOptInt = jSONObjectOptJSONObject.optInt("net_error", c1494690ozz.getStatusCode());
            Integer numValueOf2 = Integer.valueOf(iOptInt);
            String strLIZIZ2 = LIZIZ(String.valueOf(c1494690ozz.getCause()));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("CronetIOException_net_error_");
            sbLIZ2.append(iOptInt);
            return new C1496580p32(numValueOf2, strLIZIZ2, C2188811AlT.LIZIZ(sbLIZ2));
        }
        Integer numValueOf3 = Integer.valueOf(c1494690ozz.getCronetInternalErrorCode());
        String strLIZIZ3 = LIZIZ(String.valueOf(c1494690ozz.getCause()));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("CronetIOException_net_cronet_");
        sbLIZ3.append(c1494690ozz.getCronetInternalErrorCode());
        return new C1496580p32(numValueOf3, strLIZIZ3, C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static C1496580p32 LIZLLL(Throwable th) {
        if (!(th instanceof C0XIO) && !(th.getCause() instanceof C0XIO)) {
            if (!(th instanceof s) && !(th.getCause() instanceof s)) {
                return null;
            }
            return new C1496580p32(-1, LIZIZ(String.valueOf(th.getCause())), "JsonSyntaxException_net_json_parse");
        }
        return new C1496580p32(-5, LIZIZ(String.valueOf(th.getCause())), "JsonException_net_json_parse");
    }

    public static C1496580p32 LJ(i iVar) {
        if (iVar == null) {
            return new C1496580p32(-1, "throwable is null", "");
        }
        return new C1496580p32(-999, LIZIZ(String.valueOf(iVar.getCause())), "TTRequestCanceledException_net_request_canceled");
    }
}
