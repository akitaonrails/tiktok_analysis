package X;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0d70, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1037760d70 extends InterfaceC1037910d7F {
    void Fd1(SparkContext sparkContext);

    void Ou(SparkContext sparkContext, Context context);

    void Ox0(JSONObject jSONObject, SparkContext sparkContext);

    void TQ1(Aweme aweme);

    void V62(WebKitView webKitView, C1035880d3y c1035880d3y);

    void Yi0(int i, List<? extends Aweme> list);

    void cT(C1035880d3y c1035880d3y, WebView webView, SparkContext sparkContext);

    void gz1(C0SCL c0scl, SparkContext sparkContext);

    void hv(SparkContext sparkContext, int i, String str);

    void jB(Aweme aweme);

    void mf1(C1035880d3y c1035880d3y, WebView webView, SparkContext sparkContext);

    void r3(Aweme aweme);

    void tU(C1035880d3y c1035880d3y, SparkContext sparkContext);

    void vE0(String str, InterfaceC1041500dD2 interfaceC1041500dD2, boolean z, AwemeRawAd awemeRawAd, String str2, String str3, String str4);

    void wK1(SparkContext sparkContext, String str);

    void z82(String str, String str2, InterfaceC1041500dD2 interfaceC1041500dD2, SparkContext sparkContext);
}
