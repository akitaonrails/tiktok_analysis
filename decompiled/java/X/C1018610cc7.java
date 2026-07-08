package X;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS204S0000000_16;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cc7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1018610cc7 implements InterfaceC1051760dTa {
    public static final C988400bpO LLILLL = new Object() { // from class: X.0bpO
    };
    public static Aweme LLILZ;
    public final WeakReference<Context> LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(415));

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0bpO] */
    static {
        new LinkedHashMap();
    }

    public C1018610cc7(WeakReference<Context> weakReference) {
        this.LL = weakReference;
    }

    public final void LIZ(C2203531BLz c2203531BLz) {
        Iterator it2 = C1697810uHb.LJIILJJIL("download_click").iterator();
        while (it2.hasNext()) {
            c2203531BLz.LIZIZ((String) it2.next(), this);
        }
        WebView webView = c2203531BLz.LIZ.get();
        if (webView != null) {
            webView.hashCode();
        }
    }

    @Override // X.InterfaceC1051760dTa
    public final void call(C1058910df7 c1058910df7, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        boolean z;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AwemeRawAd awemeRawAd4;
        if (TextUtils.equals(c1058910df7.LIZJ, "download_click")) {
            int i = 0;
            jSONObject.put("code", 0);
            if (c1058910df7.LIZLLL.has("app_id")) {
                AwemeRawAd awemeRawAd5 = null;
                clickId = null;
                String clickId = null;
                AwemeRawAd awemeRawAd6 = null;
                if (c1058910df7.LIZLLL.optInt("direct_download", 0) == 1) {
                    String string = JSONObjectProtectorUtils.getString(c1058910df7.LIZLLL, "app_id");
                    ICommercializeFromMainOutService iCommercializeFromMainOutService = (ICommercializeFromMainOutService) this.LLILLJJLI.getValue();
                    if (iCommercializeFromMainOutService != null) {
                        Context context = this.LL.get();
                        Aweme aweme = LLILZ;
                        if (aweme != null && (awemeRawAd4 = aweme.getAwemeRawAd()) != null) {
                            clickId = awemeRawAd4.getClickId();
                        }
                        if (iCommercializeFromMainOutService.LJIIJ(context, string, clickId)) {
                            i = 1;
                        }
                    }
                    jSONObject.put("code", i);
                    return;
                }
                Object objOpt = c1058910df7.LIZLLL.opt("extParam");
                if (objOpt instanceof JSONObject) {
                    jSONObject2 = (JSONObject) objOpt;
                } else {
                    jSONObject2 = null;
                }
                ICommercializeFromMainOutService iCommercializeFromMainOutService2 = (ICommercializeFromMainOutService) this.LLILLJJLI.getValue();
                if (iCommercializeFromMainOutService2 != null && iCommercializeFromMainOutService2.LJII(this.LL.get(), LLILZ)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    jSONObject.put("code", 1);
                    Aweme aweme2 = LLILZ;
                    if (aweme2 != null) {
                        awemeRawAd6 = aweme2.getAwemeRawAd();
                    }
                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "click", awemeRawAd6);
                    if (jSONObject2 != null) {
                        Iterator<String> itKeys = jSONObject2.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            c1022820ciuLIZLLL.LIZJ(jSONObject2.opt(next), next);
                        }
                    }
                    c1022820ciuLIZLLL.LJII();
                    Aweme aweme3 = LLILZ;
                    if (aweme3 != null && (awemeRawAd3 = aweme3.getAwemeRawAd()) != null) {
                        C2201701BEy c2201701BEy = C2201701BEy.LIZ;
                        UrlModel clickTrackUrlList = awemeRawAd3.getClickTrackUrlList();
                        Long creativeId = awemeRawAd3.getCreativeId();
                        String logExtra = awemeRawAd3.getLogExtra();
                        c2201701BEy.getClass();
                        C2201701BEy.LIZ("click", clickTrackUrlList, creativeId, logExtra);
                        return;
                    }
                    return;
                }
                if (C1021870chN.LIZ(this.LL.get(), LLILZ)) {
                    return;
                }
                String string2 = JSONObjectProtectorUtils.getString(c1058910df7.LIZLLL, "app_id");
                ICommercializeFromMainOutService iCommercializeFromMainOutService3 = (ICommercializeFromMainOutService) this.LLILLJJLI.getValue();
                if (iCommercializeFromMainOutService3 != null && iCommercializeFromMainOutService3.LIZIZ(this.LL.get(), string2)) {
                    i = 1;
                }
                jSONObject.put("code", i);
                Aweme aweme4 = LLILZ;
                if (aweme4 != null) {
                    awemeRawAd = aweme4.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "click", awemeRawAd);
                if (jSONObject2 != null) {
                    Iterator<String> itKeys2 = jSONObject2.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        c1022820ciuLIZLLL2.LIZJ(jSONObject2.opt(next2), next2);
                    }
                }
                c1022820ciuLIZLLL2.LJII();
                Aweme aweme5 = LLILZ;
                if (aweme5 != null && (awemeRawAd2 = aweme5.getAwemeRawAd()) != null) {
                    C2201701BEy c2201701BEy2 = C2201701BEy.LIZ;
                    UrlModel clickTrackUrlList2 = awemeRawAd2.getClickTrackUrlList();
                    Long creativeId2 = awemeRawAd2.getCreativeId();
                    String logExtra2 = awemeRawAd2.getLogExtra();
                    c2201701BEy2.getClass();
                    C2201701BEy.LIZ("click", clickTrackUrlList2, creativeId2, logExtra2);
                }
                Aweme aweme6 = LLILZ;
                if (aweme6 != null) {
                    awemeRawAd5 = aweme6.getAwemeRawAd();
                }
                C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL("draw_ad", "click_start", awemeRawAd5);
                if (jSONObject2 != null) {
                    Iterator<String> itKeys3 = jSONObject2.keys();
                    while (itKeys3.hasNext()) {
                        String next3 = itKeys3.next();
                        c1022820ciuLIZLLL3.LIZJ(jSONObject2.opt(next3), next3);
                    }
                }
                c1022820ciuLIZLLL3.LJII();
            }
        }
    }
}
