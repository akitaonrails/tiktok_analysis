package X;

import com.bytedance.crash.Npth;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0rPN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587310rPN {
    public static final Map<String, String> LIZ(String str, Throwable th) {
        Exception exc;
        HashMap map = new HashMap();
        if (th instanceof C1494690ozz) {
            C1494690ozz c1494690ozz = (C1494690ozz) th;
            map.put("status_code", String.valueOf(c1494690ozz.getStatusCode()));
            map.put("request_id", c1494690ozz.traceCode);
            map.put("cronet_internal_error_code", String.valueOf(c1494690ozz.getCronetInternalErrorCode()));
            exc = new Exception(c1494690ozz.traceCode);
        } else if (th instanceof C0XIR) {
            C0XIR c0xir = (C0XIR) th;
            map.put("status_code", String.valueOf(c0xir.getErrorCode()));
            map.put("status_msg", c0xir.getErrorMsg());
            exc = new Exception(c0xir.getResponse());
        } else {
            exc = new Exception(th);
        }
        map.put("api_path", str);
        map.put("http_request_status_code", String.valueOf(C1498560p6E.LIZIZ(th, null)));
        map.put("sub_status_code", String.valueOf(C1498560p6E.LIZJ(exc)));
        C844470XAv.LIZ.getClass();
        map.put("api_exception_status_code", String.valueOf(C1498560p6E.LIZ(C844470XAv.LIZ(), exc)));
        map.put("cause_http_request_status_code", String.valueOf(C1498560p6E.LIZIZ(th, null)));
        map.put("cause_sub_status_code", String.valueOf(C1498560p6E.LIZJ(th)));
        map.put("cause_api_exception_status_code", String.valueOf(C1498560p6E.LIZ(C844470XAv.LIZ(), th)));
        Npth.reportBizException("explore", exc, "request api error", map);
        return map;
    }
}
