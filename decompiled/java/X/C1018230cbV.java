package X;

import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import com.ss.android.ugc.aweme.commercialize.topview.TopViewAwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cbV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1018230cbV {
    public static final void LIZIZ(InterfaceC1018210cbT interfaceC1018210cbT, String str, boolean z) {
        String creativeIdStr;
        if (interfaceC1018210cbT != null && interfaceC1018210cbT.LLZZZIL()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("failCode", str);
            TopViewAwemeRawAd topViewAwemeRawAdLIZIZ = interfaceC1018210cbT.LIZIZ();
            if (topViewAwemeRawAdLIZIZ != null) {
                creativeIdStr = topViewAwemeRawAdLIZIZ.getCreativeIdStr();
            } else {
                creativeIdStr = null;
            }
            jSONObject.put("creativeId", creativeIdStr);
            jSONObject.put("groupId", interfaceC1018210cbT.getAid());
            IMonitorDepend iMonitorDependLIZJ = C2214471Bll.LIZJ();
            if (iMonitorDependLIZJ != null) {
                iMonitorDependLIZJ.monitorStatusRate("aweme_ad_awesome_splash_show", !z ? 1 : 0, jSONObject);
            }
        }
    }

    public static final void LIZJ(String str, Long l, boolean z, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("failReason", str2);
        jSONObject.put("creativeId", l);
        jSONObject.put("logExtra", str);
        IMonitorDepend iMonitorDependLIZJ = C2214471Bll.LIZJ();
        if (iMonitorDependLIZJ != null) {
            iMonitorDependLIZJ.monitorStatusRate("aweme_ad_normal_splash_download", !z ? 1 : 0, jSONObject);
        }
    }

    public static final void LIZ(Aweme aweme, Integer num, String str, String str2, boolean z) throws JSONException {
        String creativeIdStr;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMsg", str);
            jSONObject.put("errorCode", num);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                creativeIdStr = awemeRawAd.getCreativeIdStr();
            } else {
                creativeIdStr = null;
            }
            jSONObject.put("creativeId", creativeIdStr);
            jSONObject.put("groupId", aweme.getAid());
            jSONObject.put("url", str2);
            IMonitorDepend iMonitorDependLIZJ = C2214471Bll.LIZJ();
            if (iMonitorDependLIZJ != null) {
                iMonitorDependLIZJ.monitorStatusRate("aweme_ad_awesome_splash_download", !z ? 1 : 0, jSONObject);
            }
        }
    }
}
