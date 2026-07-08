package X;

import Y.ARunnableS17S0210000_16;
import Y.ARunnableS20S1200000_16;
import Y.ARunnableS49S0300000_16;
import Y.ARunnableS85S0200000_16;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ad.preload.interfaces.IWebAdUserAgentService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.FeatureCenterModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.realtime.ICommerceLandPageRealtimeResourceModule;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dEm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042580dEm implements InterfaceC1042230dED {
    public static final C01GW<ICommerceLandPageRealtimeResourceModule> LJIIIZ;
    public static final C01GW<InterfaceC1040510dBR> LJIIJ;
    public static final C01GW<IWebAdUserAgentService> LJIIJJI;
    public static final C01GW<ConcurrentHashMap<String, InterfaceC1042230dED>> LJIIL;
    public static final C01GW<String> LJIILIIL;
    public final String LIZ;
    public final String LIZIZ;
    public boolean LIZLLL;
    public volatile C1042650dEt LJ;
    public WebView LJFF;
    public Boolean LJI;
    public Long LJIIIIZZ;
    public String LIZJ = "";
    public final ArrayList<C1042770dF5> LJII = new ArrayList<>();

    static {
        new C1042600dEo();
        LJIIIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(93));
        LJIIJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(90));
        LJIIJJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(91));
        LJIIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(92));
        LJIILIIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(89));
    }

    public final EnumC1042630dEr LJIILL() {
        Long l = this.LJIIIIZZ;
        if (l == null) {
            return EnumC1042630dEr.NO_BOOT;
        }
        long jLongValue = l.longValue();
        Long l2 = (Long) ((LinkedHashMap) C1042220dEC.LLILZ).get(this.LIZIZ);
        return l2 != null ? l2.longValue() < jLongValue ? EnumC1042630dEr.PRECONNECT_BEFORE_ENTER : EnumC1042630dEr.PRECONNET_AFTER_ENTER : EnumC1042630dEr.NO_PRECONNET;
    }

    @Override // X.InterfaceC1042230dED
    public final String LJIIIIZZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1042230dED
    public final boolean LIZ(String str) {
        C1042650dEt c1042650dEt = this.LJ;
        if (c1042650dEt != null) {
            return c1042650dEt.LIZ(str);
        }
        return false;
    }

    @Override // X.InterfaceC1042230dED
    public final void LJ(C1035880d3y c1035880d3y) {
        C1043040dFW.LIZ(new ARunnableS85S0200000_16(this, c1035880d3y, 5));
    }

    @Override // X.InterfaceC1042230dED
    public final void LJFF(JSONObject jSONObject) throws JSONException {
        Boolean boolValueOf;
        C1042650dEt c1042650dEt = this.LJ;
        if (c1042650dEt != null) {
            c1042650dEt.LJFF(jSONObject);
        }
        if (!jSONObject.has("is_ttweb")) {
            WebView webView = this.LJFF;
            if (webView != null) {
                boolValueOf = Boolean.valueOf(TTWebViewHelper.INSTANCE.isTTWebView(webView));
            } else {
                boolValueOf = null;
            }
            jSONObject.put("is_ttweb", boolValueOf);
        }
    }

    @Override // X.InterfaceC1042230dED
    public final void LJIIJJI(WebView webView) {
        C1043040dFW.LIZ(new ARunnableS85S0200000_16(this, webView, 4));
    }

    @Override // X.InterfaceC1042230dED
    public final void LJIIL(C1042770dF5 c1042770dF5) {
        this.LJII.add(c1042770dF5);
    }

    public C1042580dEm(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    @Override // X.InterfaceC1042230dED
    public final void LJII(WebView webView, InterfaceC1041500dD2 interfaceC1041500dD2) {
        C1043040dFW.LIZ(new ARunnableS49S0300000_16(this, webView, (C1035880d3y) interfaceC1041500dD2, 2));
    }

    @Override // X.InterfaceC1042230dED
    public final void LJIILIIL(InterfaceC1041500dD2 interfaceC1041500dD2, String str) {
        C1043040dFW.LIZ(new ARunnableS20S1200000_16(this, interfaceC1041500dD2, str, 1));
    }

    @Override // X.InterfaceC1042230dED
    public final void LIZJ(WebKitView webKitView, C1035880d3y c1035880d3y, boolean z) {
        this.LJFF = webKitView;
        this.LJI = Boolean.valueOf(z);
        C1043040dFW.LIZ(new ARunnableS17S0210000_16(this, z, c1035880d3y, 3));
    }

    @Override // X.InterfaceC1041350dCn
    public final void LJI(WebView webView, String str, boolean z) {
        C1042650dEt c1042650dEt = this.LJ;
        if (c1042650dEt != null) {
            c1042650dEt.LJI(webView, str, z);
        }
    }

    @Override // X.InterfaceC1041350dCn
    public final void LIZIZ(WebView webView, String str, boolean z, boolean z2, boolean z3) {
        C1042650dEt c1042650dEt = this.LJ;
        if (c1042650dEt != null) {
            c1042650dEt.LIZIZ(webView, str, z, z2, z3);
        }
    }

    @Override // X.InterfaceC1041350dCn
    public final void LJIIIZ(WebView webView, String str, boolean z, boolean z2, boolean z3) {
        C1042650dEt c1042650dEt = this.LJ;
        if (c1042650dEt != null) {
            c1042650dEt.LJIIIZ(webView, str, z, z2, z3);
        }
    }

    @Override // X.InterfaceC1042230dED
    public final void LIZLLL(final SSPResponse.Data data, final String str, final String str2, final boolean z, final AwemeRawAd awemeRawAd, final C1035880d3y c1035880d3y) {
        this.LJIIIIZZ = Long.valueOf(System.currentTimeMillis());
        C1043040dFW.LIZ(new Runnable() { // from class: X.0dEn
            public final void LIZ() {
                C1042650dEt c1042650dEt = this.LL.LJ;
                if (Intrinsics.LJFF(c1042650dEt != null ? c1042650dEt.LIZLLL : null, str)) {
                    C1490740otc c1490740otc = C1490740otc.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("duplicate boot, url: ");
                    sbLIZ.append(str);
                    c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.W, "CommerceLandPageSSPLifeCycle_");
                    return;
                }
                C1042580dEm c1042580dEm = this.LL;
                String str3 = str;
                String str4 = str2;
                boolean z2 = z;
                SSPResponse.Data data2 = data;
                AwemeRawAd awemeRawAd2 = awemeRawAd;
                C1035880d3y c1035880d3y2 = c1035880d3y;
                synchronized (c1042580dEm) {
                    try {
                        C1042650dEt c1042650dEt2 = c1042580dEm.LJ;
                        if (Intrinsics.LJFF(c1042650dEt2 != null ? c1042650dEt2.LIZLLL : null, str3)) {
                            C1490740otc c1490740otc2 = C1490740otc.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("duplicate boot, url: ");
                            sbLIZ2.append(str3);
                            C1490740otc.LIZIZ(c1490740otc2, C2188811AlT.LIZIZ(sbLIZ2), null, "CommerceLandPageSSPLifeCycle_", 2);
                            return;
                        }
                        c1042580dEm.LIZJ = str4;
                        c1042580dEm.LIZLLL = z2;
                        String str5 = c1042580dEm.LIZIZ;
                        c1042580dEm.LJ = c1042580dEm.LJIILJJIL(str5, str5, str5, data2, awemeRawAd2, c1035880d3y2);
                        C1042650dEt c1042650dEt3 = this.LL.LJ;
                        if (c1042650dEt3 != null) {
                            c1042650dEt3.LJIILL();
                        }
                        C1490740otc c1490740otc3 = C1490740otc.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("boot sspContext, sspContext ");
                        sbLIZ3.append(this.LL.LJ);
                        sbLIZ3.append(", url: ");
                        sbLIZ3.append(str);
                        C1490740otc.LIZIZ(c1490740otc3, C2188811AlT.LIZIZ(sbLIZ3), null, "CommerceLandPageSSPLifeCycle_", 2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CommerceLandPageSSPLifeCycle@86e2.boot$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CommerceLandPageSSPLifeCycle@86e2.boot$1");
            }
        });
    }

    @Override // X.InterfaceC1042230dED
    public final void LJIIJ(final String str, final String str2, final String str3, final WebView webView, final C1035880d3y c1035880d3y, final boolean z) {
        C1043040dFW.LIZ(new Runnable() { // from class: X.0dEl
            public final void LIZ() {
                String strTv;
                String string;
                String string2;
                String string3;
                C1035880d3y c1035880d3y2;
                String requestId;
                C1035880d3y c1035880d3y3;
                FeatureCenterModel feature;
                Integer num;
                FeatureCenterModel feature2;
                Integer num2;
                SSPResponse.Data dataZj0;
                EnumC1042620dEq enumC1042620dEq = z ? EnumC1042620dEq.REDIRECT : EnumC1042620dEq.NORMAL;
                AwemeRawAd rawAd = c1035880d3y.getRawAd();
                C1490740otc c1490740otc = C1490740otc.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("trigger redirect, navType: ");
                sbLIZ.append(enumC1042620dEq.getType());
                sbLIZ.append(", next url: ");
                sbLIZ.append(str2);
                sbLIZ.append(", release sspContext:");
                sbLIZ.append(this.LJ);
                C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "CommerceLandPageSSPLifeCycle_", 2);
                IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
                String str4 = "";
                if (iAdWebUtils == null || (strTv = iAdWebUtils.tv(webView)) == null) {
                    strTv = "";
                }
                C1042650dEt c1042650dEt = this.LJ;
                if (c1042650dEt != null) {
                    c1042650dEt.LJIILLIIL(strTv, enumC1042620dEq, this.LJII, c1035880d3y, TTWebViewHelper.INSTANCE.isTTWebView(webView), this.LJIILL());
                }
                this.LJ = null;
                InterfaceC1040510dBR value = C1042580dEm.LJIIJ.getValue();
                if (value != null && (dataZj0 = value.Zj0(str, str2)) != null) {
                    C1042580dEm c1042580dEm = this;
                    String str5 = str;
                    String str6 = str2;
                    String str7 = str3;
                    InterfaceC1041500dD2 interfaceC1041500dD2 = c1035880d3y;
                    c1042580dEm.LJ = c1042580dEm.LJIILJJIL(str5, str6, str7, dataZj0, rawAd, interfaceC1041500dD2 instanceof C1035880d3y ? (C1035880d3y) interfaceC1041500dD2 : null);
                    C1042650dEt c1042650dEt2 = this.LJ;
                    if (c1042650dEt2 != null) {
                        c1042650dEt2.LJIILL();
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("redirect and create sspcontext ");
                    sbLIZ2.append(this.LJ);
                    C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ2), null, "CommerceLandPageSSPLifeCycle_", 2);
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("redirect but ssp data is null! \n schemaUrl: ");
                sbLIZ3.append(str);
                sbLIZ3.append(" \n currentUrl: ");
                sbLIZ3.append(str2);
                c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ3), EnumC1490770otf.W, "CommerceLandPageSSPLifeCycle_");
                C1042600dEo.LIZIZ(-1, enumC1042620dEq, c1035880d3y, str, str2, "", null, false);
                String str8 = str2;
                String str9 = str;
                String str10 = str3;
                n nVar = new n();
                InterfaceC1041500dD2 interfaceC1041500dD22 = c1035880d3y;
                C1042690dEx.LIZ.getClass();
                nVar.LJJIIJ(C1042690dEx.LJIIIZ.LIZ, enumC1042620dEq.getType());
                String str11 = C1042690dEx.LJJJJLL.LIZ;
                String lpRefer = interfaceC1041500dD22.getLpRefer();
                if (lpRefer == null) {
                    lpRefer = "";
                }
                nVar.LJJIIJ(str11, lpRefer);
                String str12 = C1042690dEx.LJJJJZI.LIZ;
                AwemeRawAd rawAd2 = interfaceC1041500dD22.getRawAd();
                if (rawAd2 == null || (feature2 = rawAd2.getFeature()) == null || (num2 = feature2.landingPageSSPOptType) == null || (string = num2.toString()) == null) {
                    string = "";
                }
                nVar.LJJIIJ(str12, string);
                String str13 = C1042690dEx.LJJJJZ.LIZ;
                AwemeRawAd rawAd3 = interfaceC1041500dD22.getRawAd();
                if (rawAd3 == null || (feature = rawAd3.getFeature()) == null || (num = feature.landingPageRedirectType) == null || (string2 = num.toString()) == null) {
                    string2 = "";
                }
                nVar.LJJIIJ(str13, string2);
                String str14 = C1042690dEx.LJJJLIIL.LIZ;
                boolean z2 = interfaceC1041500dD22 instanceof C1035880d3y;
                if (!z2 || (c1035880d3y3 = (C1035880d3y) interfaceC1041500dD22) == null || (string3 = Integer.valueOf(c1035880d3y3.getRedirectTypeAtPageStart()).toString()) == null) {
                    string3 = "";
                }
                nVar.LJJIIJ(str14, string3);
                nVar.LJJIIJ(C1042690dEx.LJJJLL.LIZ, interfaceC1041500dD22.getRealCreativeIdStr());
                String str15 = C1042690dEx.LJJJLZIJ.LIZ;
                if (z2 && (c1035880d3y2 = (C1035880d3y) interfaceC1041500dD22) != null && (requestId = c1035880d3y2.getRequestId()) != null) {
                    str4 = requestId;
                }
                nVar.LJJIIJ(str15, str4);
                this.LJII.add(new C1042770dF5(str8, str9, str10, nVar));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CommerceLandPageSSPLifeCycle@86e2.onPageRedirect$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CommerceLandPageSSPLifeCycle@86e2.onPageRedirect$1");
            }
        });
    }

    public final C1042650dEt LJIILJJIL(String str, String str2, String str3, SSPResponse.Data data, AwemeRawAd awemeRawAd, C1035880d3y c1035880d3y) {
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create commerce ssp context successfully. url: ");
        sbLIZ.append(str2);
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "CommerceLandPageSSPLifeCycle_", 2);
        return new C1042650dEt(this.LIZ, str, str3, str2, data, this.LIZJ, this.LIZLLL, awemeRawAd, this.LJI, c1035880d3y);
    }
}
