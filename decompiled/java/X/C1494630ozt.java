package X;

import Y.ARunnableS0S1400200_23;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ozt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1494630ozt implements InterfaceC2222831BzF {
    @Override // X.InterfaceC2222831BzF
    public final void LIZ() {
    }

    public static void LJ(C1494850p0F c1494850p0F, JSONObject jSONObject) {
        if (c1494850p0F != null) {
            try {
                jSONObject.put("nt_band_width", C1494500ozg.LIZ.LIZIZ());
                jSONObject.put("cdn_nt_band_width", C1494540ozk.LIZ.LIZIZ());
                C844470XAv.LIZ.getClass();
                jSONObject.put("cronet_open", C1493400oxu.LJIIJ(C844470XAv.LIZ()).LJFF());
                C0X2E c0x2e = C0X2E.LIZJ;
                jSONObject.put("cronet_plugin_install", false);
                jSONObject.put("cronet_plugin_version", -1);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            try {
                jSONObject.put("requestStart", c1494850p0F.LJI);
                jSONObject.put("responseBack", c1494850p0F.LJII);
                jSONObject.put("completeReadResponse", c1494850p0F.LJIIIIZZ);
                jSONObject.put("appLevelRequestStart", c1494850p0F.LJ);
                jSONObject.put("beforeAllInterceptors", c1494850p0F.LJFF);
                jSONObject.put("requestEnd", c1494850p0F.LJIIIZ);
                jSONObject.put("recycleCount", c1494850p0F.LJJ);
                jSONObject.put("netClientType", "MIOClient");
                if (c1494850p0F.LJJIFFI == 2) {
                    jSONObject.put("timing_dns", c1494850p0F.LJIIJ);
                    jSONObject.put("timing_connect", c1494850p0F.LJIIJJI);
                    jSONObject.put("timing_ssl", c1494850p0F.LJIIL);
                    jSONObject.put("timing_send", c1494850p0F.LJIILIIL);
                    jSONObject.put("timing_waiting", c1494850p0F.LJIILJJIL);
                    jSONObject.put("timing_receive", c1494850p0F.LJIILL);
                    jSONObject.put("timing_total", c1494850p0F.LJIILLIIL);
                    jSONObject.put("timing_isSocketReused", c1494850p0F.LJJI);
                    jSONObject.put("timing_totalSendBytes", c1494850p0F.LJIJI);
                    jSONObject.put("timing_totalReceivedBytes", c1494850p0F.LJIJJ);
                    jSONObject.put("timing_remoteIP", c1494850p0F.LJIJ);
                    jSONObject.put("request_log", c1494850p0F.LJJIIJ);
                }
                JSONObject jSONObject2 = c1494850p0F.LJJIIJZLJL;
                if (jSONObject2 != null) {
                    jSONObject.put("req_info", jSONObject2);
                }
                jSONObject.put("download", c1494850p0F.LJJIIZ);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC2222831BzF
    public final void LIZJ(long j, long j2, String str, C1494850p0F c1494850p0F, JSONObject jSONObject) {
        C794240VDq.LIZIZ("aweme_image_api", "", LIZLLL(true, j, j2, str, c1494850p0F, null));
        try {
            C2093608Ic.LJ(new String[1][0]);
            LJ(c1494850p0F, jSONObject);
            C1494910p0L.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final JSONObject LIZLLL(boolean z, long j, long j2, String str, C1494850p0F c1494850p0F, Throwable th) {
        int iLIZIZ;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                if (str.contains("&config_retry=b")) {
                    jSONObject.put("log_config_retry", 1);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return jSONObject;
            }
        }
        String[] strArr = new String[1];
        if (TextUtils.isEmpty(strArr[0]) && c1494850p0F != null) {
            strArr[0] = c1494850p0F.LJIJ;
            T t = c1494850p0F.LIZJ;
            if (t != 0) {
                ((C1493620oyG) t).getClass();
            }
        }
        if (c1494850p0F != null) {
            jSONObject.put("requestStart", c1494850p0F.LJI);
            jSONObject.put("responseBack", c1494850p0F.LJII);
            jSONObject.put("completeReadResponse", c1494850p0F.LJIIIIZZ);
            jSONObject.put("requestEnd", c1494850p0F.LJIIIZ);
            jSONObject.put("recycleCount", c1494850p0F.LJJ);
            if (c1494850p0F.LJJIFFI == 0) {
                jSONObject.put("timing_dns", c1494850p0F.LJIIJ);
                jSONObject.put("timing_connect", c1494850p0F.LJIIJJI);
                jSONObject.put("timing_ssl", c1494850p0F.LJIIL);
                jSONObject.put("timing_send", c1494850p0F.LJIILIIL);
                jSONObject.put("timing_waiting", c1494850p0F.LJIILJJIL);
                jSONObject.put("timing_receive", c1494850p0F.LJIILL);
                jSONObject.put("timing_total", c1494850p0F.LJIILLIIL);
                jSONObject.put("timing_isSocketReused", c1494850p0F.LJJI);
                jSONObject.put("timing_totalSendBytes", c1494850p0F.LJIJI);
                jSONObject.put("timing_totalReceivedBytes", c1494850p0F.LJIJJ);
                jSONObject.put("timing_remoteIP", c1494850p0F.LJIJ);
                jSONObject.put("request_log", c1494850p0F.LJJIIJ);
            }
            jSONObject.put("download", c1494850p0F.LJJIIZ);
        }
        jSONObject.put("netClientType", "MIOClient");
        C1494470ozd c1494470ozd = C1494500ozg.LIZ;
        jSONObject.put("networkQuality", c1494470ozd.LIZIZ().toString());
        jSONObject.put("downloadSpeed", (int) c1494470ozd.LIZJ());
        if (!z && th != null) {
            jSONObject.put("errorDesc", Log.getStackTraceString(th));
        }
        jSONObject.put("duration", j);
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("uri", UriProtector.parse(str));
        }
        if (j2 > 0) {
            jSONObject.put("timestamp", j2);
        }
        if (z) {
            iLIZIZ = 200;
        } else {
            iLIZIZ = C1498560p6E.LIZIZ(th, strArr);
        }
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, iLIZIZ);
        if (!TextUtils.isEmpty(strArr[0])) {
            jSONObject.put("ip", strArr[0]);
        }
        C844470XAv.LIZ.getClass();
        jSONObject.put("network_type", NetworkUtils.getNetworkType(C786410Ut5.N3(C844470XAv.LIZ())).getValue());
        return jSONObject;
    }

    @Override // X.InterfaceC2222831BzF
    public final void LIZIZ(long j, long j2, String str, C1494850p0F c1494850p0F, Throwable th, JSONObject jSONObject) {
        C823050WQl.LIZJ().execute(new ARunnableS0S1400200_23(this, j, j2, str, c1494850p0F, th, jSONObject, 0));
    }
}
