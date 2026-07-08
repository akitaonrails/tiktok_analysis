package X;

import android.webkit.WebView;
import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dBR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1040510dBR extends InterfaceC1037760d70 {
    List<SSPResponse.PreConnect> H21(String str, String str2);

    void H80(String str, String str2, WebView webView, String str3, C1035880d3y c1035880d3y, String str4, boolean z);

    InterfaceC1042230dED JH1(InterfaceC1041500dD2 interfaceC1041500dD2);

    boolean Lr0(String str);

    JSONObject XT0(JSONObject jSONObject, InterfaceC1041500dD2 interfaceC1041500dD2);

    InterfaceC1042230dED ZK1(C1035880d3y c1035880d3y);

    SSPResponse.Data Zj0(String str, String str2);

    boolean eP0(AwemeRawAd awemeRawAd, String str);

    void o40(AwemeRawAd awemeRawAd, boolean z);

    void sg2(Aweme aweme);

    boolean vN(C1035880d3y c1035880d3y);
}
