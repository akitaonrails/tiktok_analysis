package X;

import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0d9d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039390d9d {
    public boolean LIZ;
    public WebKitView LIZIZ;

    public final void LIZ(boolean z, boolean z2, C1035880d3y c1035880d3y) {
        AwemeRawAd awemeRawAd;
        if (this.LIZIZ != null && c1035880d3y != null && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null && awemeRawAd.getWebType() == 1) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_mute", z);
                jSONObject.put("endcard_show", z2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
            WebKitView webKitView = this.LIZIZ;
            if (webKitView != null) {
                webKitView.LIZ("endcard_control_event", jSONObject);
            }
        }
    }
}
