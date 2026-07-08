package X;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.ad.reuse.experiment.CommerceLandPageReuseModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.FeatureCenterModel;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0d75, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037810d75 extends C09AY implements Function0<C1036670d5F> {
    public final /* synthetic */ C1037780d72 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1037810d75(C1037780d72 c1037780d72) {
        super(0);
        this.LL = c1037780d72;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0d5F] */
    @Override // kotlin.jvm.functions.Function0
    public final C1036670d5F invoke() {
        final C1037870d7B c1037870d7B = this.LL.LLJIJIL;
        return new InterfaceC1030370cv5(c1037870d7B) { // from class: X.0d5F
            public final C01GW LL;

            @Override // X.InterfaceC1030370cv5
            public final void AN2() {
            }

            @Override // X.InterfaceC1037760d70
            public final void Fd1(SparkContext sparkContext) {
            }

            @Override // X.InterfaceC1037760d70
            public final void Ou(SparkContext sparkContext, Context context) {
            }

            @Override // X.InterfaceC1037760d70
            public final void Ox0(JSONObject jSONObject, SparkContext sparkContext) {
            }

            @Override // X.InterfaceC1030370cv5
            public final void P90() {
            }

            @Override // X.InterfaceC1037760d70
            public final void TQ1(Aweme aweme) {
            }

            @Override // X.InterfaceC1037760d70
            public final void Yi0(int i, List<? extends Aweme> list) {
            }

            @Override // X.InterfaceC1030370cv5
            public final void getPage() {
            }

            @Override // X.InterfaceC1037760d70
            public final void gz1(C0SCL c0scl, SparkContext sparkContext) {
            }

            @Override // X.InterfaceC1037760d70
            public final void hv(SparkContext sparkContext, int i, String str) {
            }

            @Override // X.InterfaceC1037910d7F
            public final void initialize() {
            }

            @Override // X.InterfaceC1037760d70
            public final void mf1(C1035880d3y c1035880d3y, WebView webView, SparkContext sparkContext) {
            }

            @Override // X.InterfaceC1037760d70
            public final void r3(Aweme aweme) {
            }

            @Override // X.InterfaceC1037760d70
            public final void tU(C1035880d3y c1035880d3y, SparkContext sparkContext) {
            }

            @Override // X.InterfaceC1037760d70
            public final void wK1(SparkContext sparkContext, String str) {
            }

            @Override // X.InterfaceC1030370cv5
            public final String xp1(String str) {
                return str;
            }

            {
                new C1036700d5I();
                this.LL = C452501pT.LIZIZ(new C1036720d5K());
            }

            @Override // X.InterfaceC1030370cv5
            public final boolean nr(C1035880d3y c1035880d3y) {
                EnumC1036690d5H enumC1036690d5H;
                C1035890d3z adCommonData;
                C1035920d42 reuseDataModel;
                if (c1035880d3y == null || (reuseDataModel = c1035880d3y.getReuseDataModel()) == null || (enumC1036690d5H = reuseDataModel.webReuseMode) == null) {
                    enumC1036690d5H = EnumC1036690d5H.NORMAL;
                }
                int i = C1036680d5G.LIZ[enumC1036690d5H.ordinal()];
                boolean z = false;
                if (i == 1) {
                    return false;
                }
                if (i != 2) {
                    if (i == 3) {
                        return true;
                    }
                    throw new C1954807lC();
                }
                if (c1035880d3y != null && (adCommonData = c1035880d3y.getAdCommonData()) != null) {
                    z = adCommonData.hasLoad;
                }
                return !z;
            }

            @Override // X.InterfaceC1030370cv5
            public final boolean r42(AwemeRawAd awemeRawAd) {
                FeatureCenterModel feature;
                Integer num;
                if (!((CommerceLandPageReuseModel) this.LL.getValue()).enableReuseLandPage || awemeRawAd == null || (feature = awemeRawAd.getFeature()) == null || (num = feature.enableIabReuse) == null || num.intValue() != 1) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1030370cv5
            public final void HT0(WebView webView, C1035880d3y c1035880d3y, boolean z) {
                if (c1035880d3y == null || !r42(c1035880d3y.getAwemeRawAd())) {
                    return;
                }
                if (z || (c1035880d3y.getAdCommonData().hasLoadFinishOrError && c1035880d3y.getAdCommonData().isHide())) {
                    if (C1111304Wh.LIZ()) {
                        if (webView != null) {
                            C1544770qIl.LIZ(webView, new AbstractC1043210dFn() { // from class: X.0d64
                                @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                                public final String LJFF(Uri uri, WebView webView2) throws JSONException {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("reactId", "ad_web");
                                    return C786410Ut5.J3(jSONObject);
                                }
                            });
                        }
                    } else {
                        if (webView == null) {
                            return;
                        }
                        webView.evaluateJavascript("[].forEach.call(document.querySelectorAll('audio,video'),function(audio){try{audio.pause();}catch(e){}})", null);
                    }
                }
            }

            @Override // X.InterfaceC1037760d70
            public final void cT(C1035880d3y c1035880d3y, WebView webView, SparkContext sparkContext) {
                if (!(c1035880d3y instanceof C1035880d3y)) {
                    return;
                }
                HT0(webView, c1035880d3y, false);
            }

            @Override // X.InterfaceC1037760d70
            public final void z82(String str, String str2, InterfaceC1041500dD2 interfaceC1041500dD2, SparkContext sparkContext) {
                C1035890d3z adCommonData;
                C1035880d3y c1035880d3y;
                Long l = null;
                if ((interfaceC1041500dD2 instanceof C1035880d3y) && (c1035880d3y = (C1035880d3y) interfaceC1041500dD2) != null) {
                    adCommonData = c1035880d3y.getAdCommonData();
                    if (adCommonData != null) {
                        adCommonData.setExitWebViewTimeStamp(Long.valueOf(SystemClock.elapsedRealtime()));
                    }
                } else {
                    adCommonData = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("exit web page, ts ");
                if (adCommonData != null) {
                    l = adCommonData.exitWebViewTimeStamp;
                }
                sbLIZ.append(l);
                C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1037760d70
            public final void vE0(String str, InterfaceC1041500dD2 interfaceC1041500dD2, boolean z, AwemeRawAd awemeRawAd, String str2, String str3, String str4) {
                C1035890d3z adCommonData;
                C1035880d3y c1035880d3y;
                Long l = null;
                if ((interfaceC1041500dD2 instanceof C1035880d3y) && (c1035880d3y = (C1035880d3y) interfaceC1041500dD2) != null) {
                    adCommonData = c1035880d3y.getAdCommonData();
                    if (adCommonData != null) {
                        adCommonData.setEnterWebViewTimeStamp(Long.valueOf(SystemClock.elapsedRealtime()));
                        adCommonData.setExitWebViewTimeStamp(null);
                    }
                } else {
                    adCommonData = null;
                }
                if (interfaceC1041500dD2 != null) {
                    interfaceC1041500dD2.setVisible(EnumC1037150d61.VISIBLE);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("enter web page, ts ");
                if (adCommonData != null) {
                    l = adCommonData.enterWebViewTimeStamp;
                }
                sbLIZ.append(l);
                sbLIZ.append(", reset exit web ts");
                C2188811AlT.LIZIZ(sbLIZ);
            }
        };
    }
}
