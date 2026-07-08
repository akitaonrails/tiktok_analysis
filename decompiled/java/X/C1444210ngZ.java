package X;

import android.os.Build;
import com.bef.effectsdk.EffectSDKBuildConfig;
import com.ss.android.common.applog.AppLog;
import com.ss.android.vesdk.VEVersionUtil;
import lth.o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ngZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444210ngZ {
    public static final /* synthetic */ int LIZ = 0;

    public static JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("did", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
        jSONObject.put("uid", o.LJIIZILJ.getCurrentUserID());
        jSONObject.put("os", 1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Android ");
        sbLIZ.append(Build.VERSION.RELEASE);
        jSONObject.put("system", C2188811AlT.LIZIZ(sbLIZ));
        jSONObject.put("device", Build.MODEL);
        jSONObject.put("effect_version", EffectSDKBuildConfig.getAarVersion());
        jSONObject.put("ve_version", VEVersionUtil.getVESDKVersion());
        jSONObject.put("publish_type", 0);
        jSONObject.put("fast_import", 0);
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONArray LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1444210ngZ.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):org.json.JSONArray");
    }
}
