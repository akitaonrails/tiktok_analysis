package X;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.FeatureCenterModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.realtime.ICommerceLandPageRealtimeResourceModule;
import com.ss.android.ugc.aweme.spark.IThirdPartyUtilService;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dEC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042220dEC implements InterfaceC1040510dBR {
    public static final Map<String, Long> LLILZ = new LinkedHashMap();
    public String LLILLJJLI;
    public final C603820NmG<String, Map<String, SSPResponse.Data>> LL = new C603820NmG<>(10);
    public final Map<String, SSPResponse.Data> LLILLL = new LinkedHashMap();

    @Override // X.InterfaceC1037760d70
    public final void Ou(SparkContext sparkContext, Context context) {
    }

    @Override // X.InterfaceC1037760d70
    public final void Ox0(JSONObject jSONObject, SparkContext sparkContext) {
    }

    @Override // X.InterfaceC1037760d70
    public final void Yi0(int i, List<? extends Aweme> list) {
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
    public final void wK1(SparkContext sparkContext, String str) {
    }

    public C1042220dEC(C1037870d7B c1037870d7B) {
    }

    public static Map LIZIZ(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map == null) {
            return linkedHashMap;
        }
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                linkedHashMap.put(entry.getKey(), value);
            }
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC1037760d70
    public final void Fd1(SparkContext sparkContext) {
        C1035880d3y c1035880d3y;
        WebView webView;
        if (!C293790BfN.LIZ() || sparkContext == null || (c1035880d3y = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class)) == null) {
            return;
        }
        C1529870puj c1529870puj = C1529870puj.LIZ;
        String str = sparkContext.containerId;
        c1529870puj.getClass();
        Object objLJFF = C1529870puj.LJFF(str);
        if ((objLJFF instanceof WebView) && (webView = (WebView) objLJFF) != null) {
            InterfaceC1042230dED interfaceC1042230dEDJH1 = JH1(c1035880d3y);
            if (interfaceC1042230dEDJH1 != null) {
                interfaceC1042230dEDJH1.LJII(webView, c1035880d3y);
            }
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLoadUrl. lifecycle: ");
            sbLIZ.append(interfaceC1042230dEDJH1);
            sbLIZ.append(" \n lifecycleId: ");
            sbLIZ.append(c1035880d3y.getRealCreativeIdStr());
            sbLIZ.append(" \n loadUrl: ");
            sbLIZ.append(c1035880d3y.getLoadUrl());
            C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "SSPModule", 2);
        }
    }

    @Override // X.InterfaceC1040510dBR
    public final InterfaceC1042230dED JH1(InterfaceC1041500dD2 interfaceC1041500dD2) {
        InterfaceC1042230dED interfaceC1042230dED = (InterfaceC1042230dED) C1042600dEo.LIZ().get(interfaceC1041500dD2.getRealCreativeIdStr());
        if (interfaceC1042230dED == null) {
            String loadUrl = interfaceC1041500dD2.getLoadUrl();
            if (loadUrl != null) {
                return (InterfaceC1042230dED) C1042600dEo.LIZ().get(loadUrl);
            }
            return null;
        }
        return interfaceC1042230dED;
    }

    public final Map<String, SSPResponse.Data> LJ(String str) {
        boolean z;
        Map<String, SSPResponse.Data> mapLIZJ = this.LL.LIZJ(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get schema data success? ");
        if (mapLIZJ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        return mapLIZJ;
    }

    @Override // X.InterfaceC1040510dBR
    public final boolean Lr0(String str) {
        if (Zj0(str, str) != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1037760d70
    public final void TQ1(Aweme aweme) {
        if (!C293790BfN.LIZ()) {
            return;
        }
        this.LLILLJJLI = null;
    }

    @Override // X.InterfaceC1040510dBR
    public final InterfaceC1042230dED ZK1(C1035880d3y c1035880d3y) {
        String realCreativeIdStr = c1035880d3y.getRealCreativeIdStr();
        String loadUrl = c1035880d3y.getLoadUrl();
        if (loadUrl == null) {
            loadUrl = "";
        }
        return LIZLLL(realCreativeIdStr, loadUrl, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0137 A[PHI: r2
      0x0137: PHI (r2v14 java.lang.String) = (r2v9 java.lang.String), (r2v15 java.lang.String) binds: [B:63:0x0135, B:61:0x0132] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013b A[PHI: r2
      0x013b: PHI (r2v13 java.lang.String) = (r2v9 java.lang.String), (r2v14 java.lang.String) binds: [B:63:0x0135, B:65:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013e A[PHI: r1 r2
      0x013e: PHI (r1v14 java.lang.String) = (r1v17 java.lang.String), (r1v18 java.lang.String) binds: [B:67:0x013c, B:65:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r2v10 java.lang.String) = (r2v13 java.lang.String), (r2v14 java.lang.String) binds: [B:67:0x013c, B:65:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0142 A[PHI: r1 r2
      0x0142: PHI (r1v16 java.lang.String) = (r1v14 java.lang.String), (r1v17 java.lang.String) binds: [B:69:0x0140, B:67:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r2v12 java.lang.String) = (r2v10 java.lang.String), (r2v13 java.lang.String) binds: [B:69:0x0140, B:67:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0156  */
    @Override // X.InterfaceC1040510dBR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sg2(com.ss.android.ugc.aweme.feed.model.Aweme r11) {
        /*
            Method dump skipped, instruction units count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1042220dEC.sg2(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // X.InterfaceC1040510dBR
    public final boolean vN(C1035880d3y c1035880d3y) {
        String webUrl;
        AwemeRawAd rawAd = c1035880d3y.getRawAd();
        AwemeRawAd rawAd2 = c1035880d3y.getRawAd();
        if (rawAd2 != null) {
            webUrl = rawAd2.getWebUrl();
        } else {
            webUrl = null;
        }
        return eP0(rawAd, webUrl);
    }

    public static SSPResponse.Data LIZJ(String str, Map map) {
        String strLIZJ = C1043460dGC.LIZJ(str);
        SSPResponse.Data data = (SSPResponse.Data) map.get(strLIZJ);
        if (data == null) {
            SSPResponse.Data data2 = (SSPResponse.Data) map.get(LJFF(strLIZJ, false));
            if (data2 == null) {
                return (SSPResponse.Data) map.get(LJFF(strLIZJ, true));
            }
            return data2;
        }
        return data;
    }

    public static String LJFF(String str, boolean z) {
        String path;
        if (a0.LJJJIL(str)) {
            return str;
        }
        Uri uri = UriProtector.parse(str);
        if (uri.isHierarchical() && (path = uri.getPath()) != null && !a0.LJJJIL(path)) {
            StringBuilder sb = new StringBuilder(uri.getPath());
            if (!Intrinsics.LJFF(uri.getPath(), "/")) {
                if (C13LN.LJLLL(sb) == '/') {
                    sb.deleteCharAt(sb.length() - 1);
                }
                int iLJJJJ = a0.LJJJJ(sb, '/', 0, 6);
                if (iLJJJJ != -1) {
                    sb.delete(iLJJJJ + 1, sb.length());
                }
            }
            if (z && C13LN.LJLLL(sb) == '/') {
                sb.deleteCharAt(sb.length() - 1);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(uri.getScheme());
            sbLIZ.append("://");
            sbLIZ.append(uri.getHost());
            sbLIZ.append((Object) sb);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    @Override // X.InterfaceC1040510dBR
    public final List<SSPResponse.PreConnect> H21(String str, String str2) {
        SSPResponse.Data dataZj0;
        SSPResponse.PreConnect[] preConnectArr;
        if (!C293790BfN.LIZ() || (dataZj0 = Zj0(str, str2)) == null || (preConnectArr = dataZj0.preConnectList) == null) {
            return null;
        }
        C1043460dGC.LIZ.getClass();
        return C1043460dGC.LIZIZ(preConnectArr);
    }

    @Override // X.InterfaceC1037760d70
    public final void V62(WebKitView webKitView, C1035880d3y c1035880d3y) {
        InterfaceC1042230dED interfaceC1042230dEDJH1;
        String strLJIIIIZZ;
        if (c1035880d3y == null || webKitView == null) {
            return;
        }
        if (!C293790BfN.LIZ() && !C2206681BYc.LIZ()) {
            return;
        }
        TTWebViewHelper tTWebViewHelper = TTWebViewHelper.INSTANCE;
        boolean zIsTTWebView = tTWebViewHelper.isTTWebView(webKitView);
        if (C293790BfN.LIZ()) {
            interfaceC1042230dEDJH1 = JH1(c1035880d3y);
        } else {
            interfaceC1042230dEDJH1 = null;
        }
        if (zIsTTWebView) {
            tTWebViewHelper.addResourceEventListener(webKitView, new AwS382S0200000_16(webKitView, c1035880d3y, 11));
        }
        if (interfaceC1042230dEDJH1 != null) {
            interfaceC1042230dEDJH1.LIZJ(webKitView, c1035880d3y, zIsTTWebView);
        }
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindWithView. lifecycle: ");
        sbLIZ.append(interfaceC1042230dEDJH1);
        sbLIZ.append(" \n lifecycleId: ");
        if (interfaceC1042230dEDJH1 != null) {
            strLJIIIIZZ = interfaceC1042230dEDJH1.LJIIIIZZ();
        } else {
            strLJIIIIZZ = null;
        }
        sbLIZ.append(strLJIIIIZZ);
        sbLIZ.append(" \n schemaUrl: ");
        sbLIZ.append(c1035880d3y.getLoadUrl());
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "SSPModule", 2);
    }

    @Override // X.InterfaceC1040510dBR
    public final JSONObject XT0(JSONObject jSONObject, InterfaceC1041500dD2 interfaceC1041500dD2) throws JSONException {
        jSONObject.put("enable_ssp", C293790BfN.LIZ());
        InterfaceC1042230dED interfaceC1042230dEDJH1 = JH1(interfaceC1041500dD2);
        if (interfaceC1042230dEDJH1 != null) {
            interfaceC1042230dEDJH1.LJFF(jSONObject);
        }
        return jSONObject;
    }

    @Override // X.InterfaceC1040510dBR
    public final SSPResponse.Data Zj0(String str, String str2) {
        if (!C293790BfN.LIZ() || !C992820bwW.LIZ().enableConsumeSSPData) {
            return null;
        }
        Map<String, SSPResponse.Data> mapLJ = LJ(str);
        if (mapLJ != null) {
            return LIZJ(str2, mapLJ);
        }
        return LIZJ(str2, this.LLILLL);
    }

    @Override // X.InterfaceC1040510dBR
    public final boolean eP0(AwemeRawAd awemeRawAd, String str) {
        FeatureCenterModel feature;
        Integer num;
        if (!C293790BfN.LIZ() || awemeRawAd == null || (feature = awemeRawAd.getFeature()) == null || (num = feature.landingPageSSPOptType) == null || num.intValue() != 1) {
            return false;
        }
        C1953307kx.LIZ.getClass();
        if (!C1953307kx.LIZLLL(str) || !((IThirdPartyUtilService) ServiceManager.get().getService(IThirdPartyUtilService.class)).LIZLLL(str)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1040510dBR
    public final void o40(AwemeRawAd awemeRawAd, boolean z) {
        if (awemeRawAd.getWebUrl() == null) {
            return;
        }
        if (z) {
            LLILZ.put(awemeRawAd.getWebUrl(), Long.valueOf(System.currentTimeMillis()));
        } else {
            LLILZ.remove(awemeRawAd.getWebUrl());
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void tU(C1035880d3y c1035880d3y, SparkContext sparkContext) {
        String strLJIIIIZZ;
        if (!C293790BfN.LIZ() || c1035880d3y == null) {
            return;
        }
        InterfaceC1042230dED interfaceC1042230dEDJH1 = JH1(c1035880d3y);
        if (interfaceC1042230dEDJH1 != null) {
            interfaceC1042230dEDJH1.LJ(c1035880d3y);
        }
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy. lifecycle: ");
        sbLIZ.append(interfaceC1042230dEDJH1);
        sbLIZ.append(" \n lifecycleId: ");
        if (interfaceC1042230dEDJH1 != null) {
            strLJIIIIZZ = interfaceC1042230dEDJH1.LJIIIIZZ();
        } else {
            strLJIIIIZZ = null;
        }
        sbLIZ.append(strLJIIIIZZ);
        sbLIZ.append(" \n schemaUrl: ");
        sbLIZ.append(c1035880d3y.getLoadUrl());
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "SSPModule", 2);
    }

    public static InterfaceC1042230dED LIZLLL(String str, String str2, boolean z) {
        boolean z2;
        InterfaceC1042230dED interfaceC1042230dED;
        if (str != null && str.length() != 0 && (interfaceC1042230dED = (InterfaceC1042230dED) C1042600dEo.LIZ().get(str)) != null) {
            return interfaceC1042230dED;
        }
        InterfaceC1042230dED interfaceC1042230dED2 = (InterfaceC1042230dED) C1042600dEo.LIZ().get(str2);
        if (interfaceC1042230dED2 != null) {
            return interfaceC1042230dED2;
        }
        if (str2.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return null;
        }
        if (z || str == null || str.length() == 0) {
            str = str2;
        }
        C1042580dEm c1042580dEm = new C1042580dEm(str, str2);
        C1042600dEo.LIZ().putIfAbsent(str, c1042580dEm);
        InterfaceC1042230dED interfaceC1042230dED3 = (InterfaceC1042230dED) C1042600dEo.LIZ().get(str);
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init_ssp_lifecycle, lifecycle: ");
        sbLIZ.append(c1042580dEm);
        sbLIZ.append(" \n lifecycleId: ");
        sbLIZ.append(str);
        sbLIZ.append(",  url: ");
        sbLIZ.append(str2);
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "SSPModule", 2);
        return interfaceC1042230dED3;
    }

    @Override // X.InterfaceC1037760d70
    public final void cT(C1035880d3y c1035880d3y, WebView webView, SparkContext sparkContext) {
        String strLJIIIIZZ;
        if (!C293790BfN.LIZ() || webView == null || c1035880d3y == null) {
            return;
        }
        InterfaceC1042230dED interfaceC1042230dEDJH1 = JH1(c1035880d3y);
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadFinish. lifecycle: ");
        sbLIZ.append(interfaceC1042230dEDJH1);
        sbLIZ.append(" \n lifecycleId: ");
        if (interfaceC1042230dEDJH1 != null) {
            strLJIIIIZZ = interfaceC1042230dEDJH1.LJIIIIZZ();
        } else {
            strLJIIIIZZ = null;
        }
        sbLIZ.append(strLJIIIIZZ);
        sbLIZ.append(" \n schemaUrl: ");
        sbLIZ.append(c1035880d3y.getLoadUrl());
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "SSPModule", 2);
        if (interfaceC1042230dEDJH1 != null) {
            interfaceC1042230dEDJH1.LJIIJJI(webView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, X.0dE5, java.lang.Runnable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ(final String str, final boolean z, final EnumC1042210dEB enumC1042210dEB, final AwemeRawAd awemeRawAd) {
        if (str == null) {
            return;
        }
        int i = C992820bwW.LIZ().source;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final C259800zU c259800zU = new C259800zU();
        if (!enumC1042210dEB.isPrefetch() && z) {
            ?? c1042150dE5 = new C1042150dE5();
            c259800zU.element = c1042150dE5;
            C1042130dE3.LIZ.getClass();
            C1042130dE3.LJ.LIZ(c1042150dE5);
        }
        C1042900dFI c1042900dFI = C1042900dFI.LIZ;
        C1042900dFI.LIZIZ(new InterfaceC1042180dE8() { // from class: X.0dE7
            @Override // X.InterfaceC1042180dE8
            public final void LIZ(String str2, Map<String, SSPResponse.Data> map, Map<String, ? extends List<SSPResponse.Rule>> map2) {
                boolean z2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetch ssp data result , data is null: ");
                if (map == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sbLIZ.append(z2);
                sbLIZ.append(", url ");
                sbLIZ.append(str2);
                C2188811AlT.LIZIZ(sbLIZ);
                C1042220dEC c1042220dEC = this.LIZ;
                String str3 = str;
                c1042220dEC.getClass();
                if (map != null) {
                    c1042220dEC.LL.LIZLLL(str3, C1042220dEC.LIZIZ(map));
                }
                if (z) {
                    C1042130dE3 c1042130dE3 = C1042130dE3.LIZ;
                    String str4 = str;
                    String str5 = enumC1042210dEB.getStr();
                    long j = jCurrentTimeMillis;
                    AwemeRawAd awemeRawAd2 = awemeRawAd;
                    c1042130dE3.getClass();
                    C1042130dE3.LJIIIIZZ(str4, map2, str5, j, awemeRawAd2);
                    C1042150dE5 c1042150dE52 = c259800zU.element;
                    if (c1042150dE52 != null) {
                        c1042150dE52.LIZ();
                    }
                }
            }
        }, new C1042950dFN("tt_hybrid_commerce", i, z, false, 36), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c A[PHI: r3
      0x007c: PHI (r3v1 X.0dED) = (r3v5 X.0dED), (r3v7 X.0dED) binds: [B:22:0x0064, B:25:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1037760d70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z82(java.lang.String r7, java.lang.String r8, X.InterfaceC1041500dD2 r9, com.bytedance.hybrid.spark.SparkContext r10) {
        /*
            r6 = this;
            boolean r0 = X.C293790BfN.LIZ()
            if (r0 != 0) goto L7
            return
        L7:
            r5 = 0
            if (r9 == 0) goto L80
            java.lang.String r1 = r9.getRealCreativeIdStr()
        Le:
            java.lang.String r4 = "SSPModule"
            if (r7 != 0) goto L55
            if (r1 != 0) goto L70
            X.0otc r2 = X.C1490740otc.LIZ
            X.0otf r1 = X.EnumC1490770otf.W
            java.lang.String r0 = "getSSPLifeCycle1 null."
            r2.LIZ(r0, r1, r4)
            r3 = r5
        L1e:
            X.0otc r2 = X.C1490740otc.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onExitWebPage. lifecycle: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", lifecycleID: "
            r1.append(r0)
            if (r9 == 0) goto L53
            int r0 = r9.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r0.toString()
        L3f:
            r1.append(r0)
            java.lang.String r0 = ", schemaUrl: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r0 = 2
            X.C1490740otc.LIZIZ(r2, r1, r5, r4, r0)
            return
        L53:
            r0 = r5
            goto L3f
        L55:
            if (r1 != 0) goto L70
            r3 = r5
        L58:
            if (r7 == 0) goto L66
            java.util.concurrent.ConcurrentHashMap r0 = X.C1042600dEo.LIZ()
            java.lang.Object r3 = r0.get(r7)
            X.0dED r3 = (X.InterfaceC1042230dED) r3
            if (r3 != 0) goto L7c
        L66:
            X.0otc r2 = X.C1490740otc.LIZ
            X.0otf r1 = X.EnumC1490770otf.W
            java.lang.String r0 = "getSSPLifeCycle2 null."
            r2.LIZ(r0, r1, r4)
            goto L1e
        L70:
            java.util.concurrent.ConcurrentHashMap r0 = X.C1042600dEo.LIZ()
            java.lang.Object r3 = r0.get(r1)
            X.0dED r3 = (X.InterfaceC1042230dED) r3
            if (r3 == 0) goto L58
        L7c:
            r3.LJIILIIL(r9, r8)
            goto L1e
        L80:
            r1 = r5
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1042220dEC.z82(java.lang.String, java.lang.String, X.0dD2, com.bytedance.hybrid.spark.SparkContext):void");
    }

    @Override // X.InterfaceC1040510dBR
    public final void H80(String str, String str2, WebView webView, String str3, C1035880d3y c1035880d3y, String str4, boolean z) {
        if (!C293790BfN.LIZ() || !C992820bwW.LIZ().enableConsumeSSPData || !((IThirdPartyUtilService) ServiceManager.get().getService(IThirdPartyUtilService.class)).LIZLLL(str3)) {
            return;
        }
        ConcurrentHashMap concurrentHashMapLIZ = C1042600dEo.LIZ();
        if (str4 == null) {
            str4 = str;
        }
        InterfaceC1042230dED interfaceC1042230dED = (InterfaceC1042230dED) concurrentHashMapLIZ.get(str4);
        if (interfaceC1042230dED == null) {
            interfaceC1042230dED = (InterfaceC1042230dED) C1042600dEo.LIZ().get(str);
        }
        if (interfaceC1042230dED != null) {
            interfaceC1042230dED.LJIIJ(str, str3, str2, webView, c1035880d3y, z);
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void vE0(String str, InterfaceC1041500dD2 interfaceC1041500dD2, boolean z, AwemeRawAd awemeRawAd, String str2, String str3, String str4) {
        AwemeRawAd rawAd;
        C1035880d3y c1035880d3y;
        String channelName;
        String strP0;
        String channelName2;
        String realCreativeIdStr;
        String lpRefer;
        String string;
        String string2;
        String string3;
        String realCreativeIdStr2;
        C1035880d3y c1035880d3y2;
        String requestId;
        C1035880d3y c1035880d3y3;
        AwemeRawAd rawAd2;
        FeatureCenterModel feature;
        Integer num;
        AwemeRawAd rawAd3;
        FeatureCenterModel feature2;
        Integer num2;
        C1035880d3y c1035880d3y4;
        C1035890d3z adCommonData;
        boolean z2;
        C1035880d3y c1035880d3y5;
        C1035890d3z adCommonData2;
        C013C c013c = new C013C();
        AwS382S0200000_16 awS382S0200000_16 = new AwS382S0200000_16(interfaceC1041500dD2, c013c, 12);
        String strLJIIIIZZ = null;
        Boolean boolValueOf = null;
        if (C293790BfN.LIZ() && C992820bwW.LIZ().enableConsumeSSPData) {
            IAdWebUtils iAdWebUtils = (IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class);
            boolean z3 = interfaceC1041500dD2 instanceof C1035880d3y;
            if (z3) {
                c1035880d3y = (C1035880d3y) interfaceC1041500dD2;
            } else {
                c1035880d3y = null;
            }
            if (iAdWebUtils.nr(c1035880d3y)) {
                if (!eP0(awemeRawAd, str)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onUserEnterWebPage, block page ");
                    sbLIZ.append(str);
                    sbLIZ.append(" \n openSystemBrowser=");
                    if (awemeRawAd != null) {
                        boolValueOf = Boolean.valueOf(awemeRawAd.isOpenSystemBrowser());
                    }
                    sbLIZ.append(boolValueOf);
                    C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    if (awemeRawAd != null) {
                        channelName = awemeRawAd.getChannelName();
                    } else {
                        channelName = null;
                    }
                    ICommerceLandPageRealtimeResourceModule value = C1042580dEm.LJIIIZ.getValue();
                    if (value != null) {
                        strP0 = value.p0(str2, channelName);
                    } else {
                        strP0 = null;
                    }
                    this.LLILLJJLI = strP0;
                    C1490740otc c1490740otc = C1490740otc.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("updateChannelPath, channelName:");
                    sbLIZ2.append(channelName);
                    sbLIZ2.append(", scene:");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(", path:");
                    sbLIZ2.append(this.LLILLJJLI);
                    C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ2), null, "SSPModule", 2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onUserEnterWebPage. ");
                    sbLIZ3.append(awemeRawAd);
                    sbLIZ3.append(" url ");
                    sbLIZ3.append(str);
                    sbLIZ3.append(", channel name ");
                    if (awemeRawAd != null) {
                        channelName2 = awemeRawAd.getChannelName();
                    } else {
                        channelName2 = null;
                    }
                    sbLIZ3.append(channelName2);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    SSPResponse.Data dataZj0 = Zj0(str, str);
                    if (interfaceC1041500dD2 == null || (realCreativeIdStr = interfaceC1041500dD2.getRealCreativeIdStr()) == null) {
                        realCreativeIdStr = str;
                    }
                    if (dataZj0 != null) {
                        InterfaceC1042230dED interfaceC1042230dEDLIZLLL = LIZLLL(realCreativeIdStr, str, false);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("hit data, try boot ssp,lifecycle: ");
                        sbLIZ4.append(interfaceC1042230dEDLIZLLL);
                        sbLIZ4.append(" \n lifeCycleId = ");
                        if (interfaceC1042230dEDLIZLLL != null) {
                            strLJIIIIZZ = interfaceC1042230dEDLIZLLL.LJIIIIZZ();
                        }
                        sbLIZ4.append(strLJIIIIZZ);
                        sbLIZ4.append(". \n url: ");
                        sbLIZ4.append(str);
                        sbLIZ4.append(" \n channelPath: ");
                        sbLIZ4.append(this.LLILLJJLI);
                        C2188811AlT.LIZIZ(sbLIZ4);
                        if (interfaceC1042230dEDLIZLLL != null) {
                            z2 = false;
                            interfaceC1042230dEDLIZLLL.LIZLLL(dataZj0, str, this.LLILLJJLI, z, awemeRawAd, (C1035880d3y) interfaceC1041500dD2);
                        } else {
                            z2 = false;
                        }
                        if (z3 && (c1035880d3y5 = (C1035880d3y) interfaceC1041500dD2) != null && (adCommonData2 = c1035880d3y5.getAdCommonData()) != null) {
                            adCommonData2.setHitSSPDataWhenEnter(true);
                        }
                        SettingsManager.LIZLLL().getClass();
                        if (SettingsManager.LIZ("enable_ssp_use_pack_data", z2) && LJ(str) == null) {
                            LIZ(str, ((Boolean) awS382S0200000_16.invoke(str)).booleanValue(), EnumC1042210dEB.USER_ENTER_1, awemeRawAd);
                        }
                    } else {
                        if (z3 && (c1035880d3y4 = (C1035880d3y) interfaceC1041500dD2) != null && (adCommonData = c1035880d3y4.getAdCommonData()) != null) {
                            adCommonData.setHitSSPDataWhenEnter(false);
                        }
                        EnumC1042620dEq enumC1042620dEq = EnumC1042620dEq.UNKNOWN;
                        C1042600dEo.LIZIZ(-1, enumC1042620dEq, interfaceC1041500dD2, str, str, "", null, false);
                        n nVar = new n();
                        C1042690dEx.LIZ.getClass();
                        nVar.LJJIIJ(C1042690dEx.LJIIIZ.LIZ, enumC1042620dEq.getType());
                        String str5 = C1042690dEx.LJJJJLL.LIZ;
                        String str6 = "";
                        if (interfaceC1041500dD2 == null || (lpRefer = interfaceC1041500dD2.getLpRefer()) == null) {
                            lpRefer = "";
                        }
                        nVar.LJJIIJ(str5, lpRefer);
                        String str7 = C1042690dEx.LJJJJZI.LIZ;
                        if (interfaceC1041500dD2 == null || (rawAd3 = interfaceC1041500dD2.getRawAd()) == null || (feature2 = rawAd3.getFeature()) == null || (num2 = feature2.landingPageSSPOptType) == null || (string = num2.toString()) == null) {
                            string = "";
                        }
                        nVar.LJJIIJ(str7, string);
                        String str8 = C1042690dEx.LJJJJZ.LIZ;
                        if (interfaceC1041500dD2 == null || (rawAd2 = interfaceC1041500dD2.getRawAd()) == null || (feature = rawAd2.getFeature()) == null || (num = feature.landingPageRedirectType) == null || (string2 = num.toString()) == null) {
                            string2 = "";
                        }
                        nVar.LJJIIJ(str8, string2);
                        String str9 = C1042690dEx.LJJJLIIL.LIZ;
                        if (!z3 || (c1035880d3y3 = (C1035880d3y) interfaceC1041500dD2) == null || (string3 = Integer.valueOf(c1035880d3y3.getRedirectTypeAtPageStart()).toString()) == null) {
                            string3 = "";
                        }
                        nVar.LJJIIJ(str9, string3);
                        String str10 = C1042690dEx.LJJJLL.LIZ;
                        if (interfaceC1041500dD2 != null) {
                            realCreativeIdStr2 = interfaceC1041500dD2.getRealCreativeIdStr();
                        } else {
                            realCreativeIdStr2 = null;
                        }
                        nVar.LJJIIJ(str10, realCreativeIdStr2);
                        String str11 = C1042690dEx.LJJJLZIJ.LIZ;
                        if (z3 && (c1035880d3y2 = (C1035880d3y) interfaceC1041500dD2) != null && (requestId = c1035880d3y2.getRequestId()) != null) {
                            str6 = requestId;
                        }
                        nVar.LJJIIJ(str11, str6);
                        C1042770dF5 c1042770dF5 = new C1042770dF5(str, str, str, nVar);
                        if (LJ(str) == null) {
                            LIZ(str, ((Boolean) awS382S0200000_16.invoke(str)).booleanValue(), EnumC1042210dEB.USER_ENTER_2, awemeRawAd);
                            C1042900dFI c1042900dFI = C1042900dFI.LIZ;
                            C2283708x9.LIZ(new RunnableC1042780dF6(new C1042280dEI(new C1042770dF5[]{c1042770dF5})));
                        } else {
                            InterfaceC1042230dED interfaceC1042230dEDLIZLLL2 = LIZLLL(realCreativeIdStr, str, false);
                            if (interfaceC1042230dEDLIZLLL2 != null) {
                                interfaceC1042230dEDLIZLLL2.LJIIL(c1042770dF5);
                            } else {
                                interfaceC1042230dEDLIZLLL2 = null;
                            }
                            if (interfaceC1042230dEDLIZLLL2 != null) {
                                interfaceC1042230dEDLIZLLL2.hashCode();
                            }
                        }
                    }
                }
            }
        }
        if (!c013c.element) {
            C1042130dE3 c1042130dE3 = C1042130dE3.LIZ;
            if (interfaceC1041500dD2 != null) {
                rawAd = interfaceC1041500dD2.getRawAd();
            } else {
                rawAd = null;
            }
            if (C1042130dE3.LJIIJJI(rawAd, str, true)) {
                c1042130dE3.LJ(awemeRawAd, str, "user_enter", true);
            }
        }
    }
}
