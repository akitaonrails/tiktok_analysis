package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.network.model.LogPbBean;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Oqv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632190Oqv {
    public static final int LIZ(Throwable th) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C632140Oqq.LJ(th).getFirst().intValue());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int LIZIZ(Throwable th) {
        if (th instanceof C23112093u) {
            return ((C23112093u) th).getErrorCode();
        }
        if (th instanceof C632200Oqw) {
            return ((C632200Oqw) th).getErrorCode();
        }
        return -1;
    }

    public static final String LIZJ(Throwable th) {
        LogPbBean logPb;
        String str;
        BaseResponse baseResponse;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        if (th instanceof C0XIR) {
            C0XIR c0xir = (C0XIR) th;
            Object rawResponse = c0xir.getRawResponse();
            String str2 = null;
            if (rawResponse instanceof BaseResponse) {
                baseResponse = (BaseResponse) rawResponse;
            } else {
                baseResponse = null;
            }
            if (baseResponse != null && (serverTimeExtra = baseResponse.extra) != null) {
                str2 = serverTimeExtra.logid;
            }
            if (C123100dR.LIZ(str2)) {
                return str2;
            }
            String response = c0xir.getResponse();
            if (response == null) {
                response = "";
            }
            try {
                JSONObject jSONObjectOptJSONObject = new JSONObject(response).optJSONObject("log_pb");
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("impr_id");
                    if (strOptString != null) {
                        return strOptString;
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            return "unknown";
        }
        if (!(th instanceof C632200Oqw) || (logPb = ((C632200Oqw) th).getRawResponse().getLogPb()) == null || (str = logPb.imprId) == null) {
            return "unknown";
        }
        return str;
    }
}
