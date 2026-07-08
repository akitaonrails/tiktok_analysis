package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.poi.experiment.PoiWebViewGneSettings;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: renamed from: X.0hLP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200450hLP {
    public static final C1200450hLP LIZ = new C1200450hLP();

    public static void LIZ(final Context context, String str, String str2) {
        String str3;
        PoiWebViewGneSettings.SchemaConfig schemaConfig;
        Map<String, PoiWebViewGneSettings.SchemaConfig> map = PoiWebViewGneSettings.LIZJ().schemaConfig;
        if (map == null || (schemaConfig = map.get("poi_publish_gne_rule_url")) == null || (str3 = schemaConfig.url) == null) {
            str3 = "https://feedback.tiktokv.com/gne/rule?trans_status_bar=1&hide_nav_bar=1&use_spark=1&container_color_auto_dark=1&_pia_=1";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str3);
        sbLIZ.append("&enter_from=");
        sbLIZ.append(str);
        sbLIZ.append("&entrance=");
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("urlWithMobParam=");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(", encoded=");
        sbLIZ2.append(Uri.encode(str3));
        C2188811AlT.LIZIZ(sbLIZ2);
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("aweme://webview/?url=");
        sbLIZ3.append(Uri.encode(strLIZIZ));
        sparkContext.LJJLIIJ(C2188811AlT.LIZIZ(sbLIZ3));
        sparkContext.LJJJLIIL(new InterfaceC1542790qFZ() { // from class: X.0hLH
            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC1542790qFZ
            public final C1725480v0E LJJJJI() {
                return !C444960Hcc.LIZJ(context) ? new C1725480v0E(R.anim.g6, R.anim.ed) : new C1725480v0E(R.anim.g5, R.anim.ed);
            }

            @Override // X.InterfaceC1542790qFZ
            public final C1725480v0E LJJLI() {
                return !C444960Hcc.LIZJ(context) ? new C1725480v0E(0, R.anim.g8) : new C1725480v0E(0, R.anim.g7);
            }
        });
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
    }
}
