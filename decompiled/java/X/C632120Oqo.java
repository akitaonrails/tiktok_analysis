package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.o;
import com.google.gson.s;
import com.ss.android.ugc.aweme.music.ab.MusicNetworkMonitorConfig;
import com.ss.android.ugc.aweme.music.model.MusicBaseResponse;
import java.io.EOFException;
import java.io.IOException;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Oqo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632120Oqo {
    public static final C632120Oqo LIZ = new C632120Oqo();
    public static final List<String> LIZIZ = Collections.synchronizedList(new ArrayList());

    public static void LIZ(String str) {
        if (!((MusicNetworkMonitorConfig) C632110Oqn.LIZIZ.getValue()).getNetworkLogEnable()) {
            return;
        }
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("music_biz_network", str);
        LIZIZ.add(str);
    }

    public static String LIZIZ(Throwable th) {
        MusicBaseResponse musicBaseResponse;
        boolean z;
        MusicBaseResponse.ServerTimeExtra serverTimeExtra;
        if (th instanceof C0XIR) {
            C0XIR c0xir = (C0XIR) th;
            Object rawResponse = c0xir.getRawResponse();
            String str = null;
            if (rawResponse instanceof MusicBaseResponse) {
                musicBaseResponse = (MusicBaseResponse) rawResponse;
            } else {
                musicBaseResponse = null;
            }
            if (musicBaseResponse != null && (serverTimeExtra = musicBaseResponse.extra) != null) {
                str = serverTimeExtra.logid;
            }
            if (C123100dR.LIZ(str)) {
                return str;
            }
            String response = c0xir.getResponse();
            if (response != null && response.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return "unknown";
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
        }
        return "unknown";
    }

    public static Pair LJ(Throwable th) {
        int cronetInternalErrorCode;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        if (th instanceof C09HQ) {
            C09HQ c09hq = (C09HQ) th;
            cronetInternalErrorCode = c09hq.code();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HttpException(");
            sbLIZ.append(c09hq.message());
            sbLIZ.append(')');
            message = C2188811AlT.LIZIZ(sbLIZ);
        } else if (th instanceof EOFException) {
            cronetInternalErrorCode = -10010;
        } else if (th instanceof IllegalArgumentException) {
            cronetInternalErrorCode = -10011;
        } else if (th instanceof C0XIO) {
            cronetInternalErrorCode = -10012;
        } else if (th instanceof s) {
            cronetInternalErrorCode = -10013;
        } else if (th instanceof o) {
            cronetInternalErrorCode = -10015;
        } else if (th instanceof JSONException) {
            cronetInternalErrorCode = -10016;
        } else if (th instanceof SSLHandshakeException) {
            cronetInternalErrorCode = -10017;
        } else if (th instanceof ConnectException) {
            cronetInternalErrorCode = -10018;
        } else if (th instanceof C23112093u) {
            cronetInternalErrorCode = ((C23112093u) th).getErrorCode();
            if (th instanceof C0XIR) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ApiServerException(");
                sbLIZ2.append(((C0XIR) th).getErrorMsg());
                sbLIZ2.append(')');
                message = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                message = "ApiException";
            }
        } else if (th instanceof C1494690ozz) {
            C1494690ozz c1494690ozz = (C1494690ozz) th;
            if (c1494690ozz.getStatusCode() > 0) {
                cronetInternalErrorCode = c1494690ozz.getStatusCode();
            } else {
                cronetInternalErrorCode = c1494690ozz.getCronetInternalErrorCode();
            }
            message = "CronetIOException";
        } else if (th instanceof IOException) {
            cronetInternalErrorCode = -10014;
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("UnknownError(");
            sbLIZ3.append(th.getMessage());
            sbLIZ3.append(')');
            message = C2188811AlT.LIZIZ(sbLIZ3);
            cronetInternalErrorCode = -1;
        }
        return new Pair(Integer.valueOf(cronetInternalErrorCode), message);
    }

    public static void LIZLLL(String str, MusicBaseResponse musicBaseResponse) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request success, path: ");
        sbLIZ.append(str);
        sbLIZ.append(", response: ");
        sbLIZ.append(musicBaseResponse);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("music_biz_network", strLIZIZ);
        LIZIZ.add(strLIZIZ);
    }

    public static void LIZJ(String str, int i, long j, int i2, String str2, String str3, Map map) {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("total_duration", Long.valueOf(j));
        JSONObject jSONObjectLJ = c2241008qG.LJ();
        C2241008qG c2241008qG2 = new C2241008qG();
        c2241008qG2.LIZ.put("url_path", str);
        c2241008qG2.LIZ.put("status_code", Integer.valueOf(i));
        c2241008qG2.LIZ.put("error_code", Integer.valueOf(i2));
        c2241008qG2.LIZ.put("error_msg", str2);
        if (str3.length() > 0) {
            c2241008qG2.LIZLLL("log_id", str3);
        }
        C2241008qG c2241008qG3 = new C2241008qG();
        if (map != null) {
            for (String str4 : map.keySet()) {
                c2241008qG3.LIZLLL(str4, (String) map.get(str4));
            }
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request fail, category = ");
        sbLIZ.append(c2241008qG2.LJ());
        sbLIZ.append(", metric = ");
        sbLIZ.append(jSONObjectLJ);
        sbLIZ.append(", extra = ");
        sbLIZ.append(c2241008qG3.LJ());
        C1720106oR.LJI("music_biz_network", C2188811AlT.LIZIZ(sbLIZ));
        List<String> list = LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("request fail, category = ");
        sbLIZ2.append(c2241008qG2.LJ());
        sbLIZ2.append(", metric = ");
        sbLIZ2.append(jSONObjectLJ);
        sbLIZ2.append(", extra = ");
        sbLIZ2.append(c2241008qG3.LJ());
        list.add(C2188811AlT.LIZIZ(sbLIZ2));
        c2241008qG2.LIZLLL("error_log", C13LP.LJJLIIIJ(list, "\n", null, null, 0, null, null, 62));
        list.clear();
        C793770VBv.LJII("music_biz_network", c2241008qG2.LJ(), jSONObjectLJ, c2241008qG3.LJ());
    }
}
