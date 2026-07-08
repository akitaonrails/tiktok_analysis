package X;

import Y.ACallableS16S2200000_16;
import Y.AfS0S0201100_3;
import Y.AfS0S1201100_16;
import Y.AfS172S0100000_3;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.pns.crypto.Ecies;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.autofill.api.AdAutofillApi;
import com.ss.android.ugc.aweme.autofill.api.AdAutofillPipoFillInfo;
import com.ss.android.ugc.aweme.autofill.api.AdAutofillPipoResponse;
import com.ss.android.ugc.aweme.autofill.api.MaskInstrumentInfo;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS30S0001000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0duw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1068720duw {
    public static boolean LJFF;
    public static boolean LJI;
    public static boolean LJII;
    public static String LJIIIIZZ;
    public static String LJIIIZ;
    public static boolean LJIIJ;
    public static String LJIIJJI;
    public static DialogC1389620mGW LJIIL;
    public static String LJIILIIL;
    public static final C1068720duw LIZ = new C1068720duw();
    public static final Ecies LIZIZ = Ecies.LIZIZ();
    public static final HashMap<String, List<MaskInstrumentInfo>> LIZJ = new HashMap<>();
    public static final HashMap<String, HashMap<String, AdAutofillPipoFillInfo>> LIZLLL = new HashMap<>();
    public static int LJ = -1;
    public static final C01GW LJIILJJIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1812));

    public static AdAutofillApi LJI() {
        return (AdAutofillApi) LJIILJJIL.getValue();
    }

    public static final int LJII() {
        if (!C1067990dtl.LJJI()) {
            return 1;
        }
        int i = LJ;
        if (i == -1) {
            return 3;
        }
        return i == 0 ? 2 : 0;
    }

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
    public static void LJIILJJIL(JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Object obj = jSONArray;
        if (jSONArray == null) {
            obj = "[]";
        }
        jSONObject.put("payment_info", obj);
        C1067990dtl.LIZ.getClass();
        SparkContext sparkContext = C1067990dtl.LJIJ;
        if (sparkContext != null) {
            sparkContext.LJJIIJZLJL(jSONObject, "update_pipo_payment_info");
        }
    }

    public static String LIZ(JSONObject jSONObject, C1035880d3y c1035880d3y) throws JSONException {
        HashMap<String, Object> mapLJJLIIIJLJLI;
        String advId;
        String creativeIdStr;
        IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
        if (iProbeService != null) {
            mapLJJLIIIJLJLI = iProbeService.LJJLIIIJLJLI();
        } else {
            mapLJJLIIIJLJLI = null;
        }
        if (c1035880d3y != null) {
            String str = "";
            if (mapLJJLIIIJLJLI != null) {
                String url = c1035880d3y.getUrl();
                if (url == null) {
                    url = "";
                }
                mapLJJLIIIJLJLI.put("landing_page_url", url);
                String currentUrl = c1035880d3y.getCurrentUrl();
                if (currentUrl == null) {
                    currentUrl = "";
                }
                mapLJJLIIIJLJLI.put("pi_autofill_url", currentUrl);
                AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
                if (awemeRawAd == null || (advId = awemeRawAd.getAdvId()) == null) {
                    advId = "";
                }
                mapLJJLIIIJLJLI.put("advid", advId);
                AwemeRawAd awemeRawAd2 = c1035880d3y.getAwemeRawAd();
                if (awemeRawAd2 != null && (creativeIdStr = awemeRawAd2.getCreativeIdStr()) != null) {
                    str = creativeIdStr;
                }
                mapLJJLIIIJLJLI.put("creative_plan_id", str);
            }
        }
        String str2 = "{}";
        if (mapLJJLIIIJLJLI != null) {
            String strLIZIZ = C20485080t.LIZIZ(mapLJJLIIIJLJLI);
            if (strLIZIZ != null) {
                str2 = strLIZIZ;
            }
            jSONObject.put("risk_info", C20485080t.LIZIZ(mapLJJLIIIJLJLI));
        }
        return str2;
    }

    public static void LJFF(WebView webView, Function2 function2) {
        if (function2 == null) {
            return;
        }
        function2.invoke(null, 0);
        DialogC1389620mGW dialogC1389620mGW = LJIIL;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
        if (webView != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(webView);
            c1389890mGx.LJIIIZ(2131840459);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
        }
    }

    public static String LJIIIZ(C1035880d3y c1035880d3y, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("merchant_id", LJIIIZ);
        jSONObject.put("merchant_user_id", str);
        Ecies ecies = LIZIZ;
        String str2 = ecies.LIZIZ;
        jSONObject.put("client_pk", str2);
        String strLIZ = LIZ(jSONObject, c1035880d3y);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("client_pk=");
        sbLIZ.append(str2);
        sbLIZ.append("&merchant_id=");
        sbLIZ.append(LJIIIZ);
        sbLIZ.append("&merchant_user_id=");
        sbLIZ.append(str);
        sbLIZ.append("&risk_info=");
        sbLIZ.append(strLIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String strLIZJ = ecies.LIZJ(strLIZIZ);
        Ecies.LIZLLL(strLIZIZ, strLIZJ);
        jSONObject.put("sign", strLIZJ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str3 = simpleDateFormat.format(new Date(jCurrentTimeMillis));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("biz_content=");
        sbLIZ2.append(URLEncoder.encode(C786410Ut5.J3(jSONObject), "UTF-8"));
        sbLIZ2.append("&merchant_id=");
        sbLIZ2.append(LJIIIZ);
        sbLIZ2.append("&request_time=");
        sbLIZ2.append(str3);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static final void LJIIIIZZ(WebView webView, int i, C1035880d3y c1035880d3y) {
        String uid;
        String str;
        AdAutofillApi adAutofillApiLIZIZ;
        User currentUser;
        LJFF = true;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null) {
            uid = "default";
        }
        if (LIZJ.get(uid) == null && LJIIIIZZ != null && (str = LJIILIIL) != null && str.length() != 0) {
            LJFF = false;
            C1068190du5 c1068190du5 = new C1068190du5(new Object[0]);
            C1068210du7.LIZ.getClass();
            c1068190du5.log(C1068210du7.LJIIL, new AwS30S0001000_16(i, 45));
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str2 = LJIIIIZZ;
            if (str2 != null) {
                if (((Boolean) C0A7B.LIZ.getValue()).booleanValue()) {
                    AdAutofillApi.LIZ.getClass();
                    adAutofillApiLIZIZ = C1068770dv1.LIZJ(str2);
                } else {
                    AdAutofillApi.LIZ.getClass();
                    adAutofillApiLIZIZ = C1068770dv1.LIZIZ(str2);
                }
                C11NZ.LJJ(new ACallableS16S2200000_16(adAutofillApiLIZIZ, uid, str, c1035880d3y, 1)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS0S1201100_16(i, jCurrentTimeMillis, webView, c1035880d3y, uid, 0), new AfS0S1201100_16(i, jCurrentTimeMillis, webView, c1035880d3y, uid, 1));
            }
        }
    }

    public static void LJIILIIL(final String str, final String str2, final Function1 function1) {
        final AdAutofillApi adAutofillApiLIZIZ;
        String str3 = LJIIIIZZ;
        if (str3 == null) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        if (((Boolean) C0A7B.LIZ.getValue()).booleanValue()) {
            AdAutofillApi.LIZ.getClass();
            adAutofillApiLIZIZ = C1068770dv1.LIZJ(str3);
        } else {
            AdAutofillApi.LIZ.getClass();
            adAutofillApiLIZIZ = C1068770dv1.LIZIZ(str3);
        }
        C11NZ.LJJ(new Callable() { // from class: X.0dv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("AdAutofillPipoManager@24f6.requestResolvedValidPiList$1");
                AdAutofillApi adAutofillApi = adAutofillApiLIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("https://uid.");
                sbLIZ.append(str);
                sbLIZ.append(".com");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                String str4 = str2;
                C1068720duw c1068720duw = C1068720duw.LIZ;
                String str5 = str;
                c1068720duw.getClass();
                C11NZ<C0X52<AdAutofillPipoResponse>> validPiList = adAutofillApi.getValidPiList(strLIZIZ, str4, "application/x-www-form-urlencoded; charset=utf-8", AbstractC842530X3j.LIZJ(null, C1068720duw.LJIIIZ(null, str5)));
                C1C7U.LIZIZ("AdAutofillPipoManager@24f6.requestResolvedValidPiList$1");
                return validPiList;
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0duz
            /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.String r3 = "AdAutofillPipoManager@24f6.requestResolvedValidPiList$2"
                    X.C1C7U.LIZ(r3)
                    X.0X52 r5 = (X.C0X52) r5
                    T r0 = r5.LIZIZ
                    com.ss.android.ugc.aweme.autofill.api.AdAutofillPipoResponse r0 = (com.ss.android.ugc.aweme.autofill.api.AdAutofillPipoResponse) r0
                    java.lang.String r1 = r0.response
                    java.lang.Class<com.ss.android.ugc.aweme.autofill.api.AdAutofillGetValidPiListResponse> r0 = com.ss.android.ugc.aweme.autofill.api.AdAutofillGetValidPiListResponse.class
                    java.lang.Object r2 = X.C20485080t.LIZ(r1, r0)
                    com.ss.android.ugc.aweme.autofill.api.AdAutofillGetValidPiListResponse r2 = (com.ss.android.ugc.aweme.autofill.api.AdAutofillGetValidPiListResponse) r2
                    java.lang.String r1 = r2.resultCode
                    java.lang.String r0 = "success"
                    boolean r0 = android.text.TextUtils.equals(r1, r0)
                    if (r0 == 0) goto L6b
                    X.0duw r0 = X.C1068720duw.LIZ
                    r0.getClass()
                    com.bytedance.pns.crypto.Ecies r1 = X.C1068720duw.LIZIZ
                    java.lang.String r0 = r2.maskInstrumentInfo
                    java.lang.String r1 = r1.LIZ(r0)
                    if (r1 == 0) goto L6b
                    int r0 = r1.length()
                    if (r0 != 0) goto L5e
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                L39:
                    X.0duw r0 = X.C1068720duw.LIZ
                    r0.getClass()
                    java.util.HashMap<java.lang.String, java.util.List<com.ss.android.ugc.aweme.autofill.api.MaskInstrumentInfo>> r1 = X.C1068720duw.LIZJ
                    java.lang.String r0 = r1
                    r1.put(r0, r2)
                    int r0 = r2.size()
                    X.C1068720duw.LJ = r0
                    kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r1 = r2
                    boolean r0 = r2.isEmpty()
                    r0 = r0 ^ 1
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    r1.invoke(r0)
                L5a:
                    X.C1C7U.LIZIZ(r3)
                    return
                L5e:
                    java.lang.Class<com.ss.android.ugc.aweme.autofill.api.MaskInstrumentInfo[]> r0 = com.ss.android.ugc.aweme.autofill.api.MaskInstrumentInfo[].class
                    java.lang.Object r0 = X.C20485080t.LIZ(r1, r0)
                    java.lang.Object[] r0 = (java.lang.Object[]) r0
                    java.util.List r2 = X.C13LQ.LJJLL(r0)
                    goto L39
                L6b:
                    kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r1 = r2
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r1.invoke(r0)
                    goto L5a
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1068750duz.accept(java.lang.Object):void");
            }
        }, new AfS172S0100000_3(function1, 116));
    }

    public static final void LIZIZ(boolean z, WebView webView, final int i, C1035880d3y c1035880d3y) {
        IUserService iUserService;
        User currentUser;
        String uid;
        User currentUser2;
        boolean zLJI = MethodIDManager.LJI(137987);
        LIZ.getClass();
        if (C305310Bxx.LIZ() && (iUserService = (IUserService) ServiceManager.get().getService(IUserService.class)) != null && (currentUser = iUserService.getCurrentUser()) != null && currentUser.getUid() != null && !((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ() && z && C1067990dtl.LJJI() && C1068370duN.LIZ()) {
            IUserService iUserService2 = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService2 == null || (currentUser2 = iUserService2.getCurrentUser()) == null || (uid = currentUser2.getUid()) == null) {
                uid = "default";
            }
            if (!TextUtils.equals(uid, LJIIJJI)) {
                LJIIIIZZ = null;
                LJIIIZ = null;
                LJIIJJI = uid;
            }
            LIZJ(webView, uid, i, null, null, c1035880d3y);
            boolean zLJI2 = MethodIDManager.LJI(137988);
            LJII = true;
            if (C123100dR.LIZ(LJIIIIZZ)) {
                if (zLJI2) {
                    MethodIDManager.LJ();
                }
            } else {
                C1068190du5 c1068190du5 = new C1068190du5(new Object[0]);
                C1068210du7.LIZ.getClass();
                c1068190du5.log(C1068210du7.LJIIIIZZ, new AwS30S0001000_16(i, 46));
                final long jCurrentTimeMillis = System.currentTimeMillis();
                LJII = false;
                AdAutofillApi.LIZ.getClass();
                C1068770dv1.LIZ().getPipoDomainQuery().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS0S0201100_3(webView, i, c1035880d3y, jCurrentTimeMillis, 1), new C09JN() { // from class: X.08lA
                    @Override // X.C09JN
                    public final void accept(Object obj) throws JSONException {
                        int cronetInternalErrorCode;
                        C1C7U.LIZ("AdAutofillPipoManager@24f6.fetchGetPipoDomainQuery$3");
                        Throwable th = (Throwable) obj;
                        C1068720duw c1068720duw = C1068720duw.LIZ;
                        c1068720duw.getClass();
                        C1068720duw.LJII = true;
                        String message = null;
                        C1068720duw.LJIILJJIL(null);
                        if (th instanceof C1494690ozz) {
                            C1494690ozz c1494690ozz = (C1494690ozz) th;
                            cronetInternalErrorCode = c1494690ozz.getStatusCode();
                            Throwable cause = c1494690ozz.getCause();
                            if (cause != null) {
                                message = cause.getMessage();
                            }
                        } else if (th instanceof C1494450ozb) {
                            C1494450ozb c1494450ozb = (C1494450ozb) th;
                            cronetInternalErrorCode = c1494450ozb.getCronetInternalErrorCode();
                            Throwable cause2 = c1494450ozb.getCause();
                            if (cause2 != null) {
                                message = cause2.getMessage();
                            }
                        } else {
                            cronetInternalErrorCode = -1;
                        }
                        C1068210du7.LIZ.getClass();
                        C1068720duw.LJIIL(c1068720duw, C1068210du7.LJIIIZ, jCurrentTimeMillis, i, false, String.valueOf(cronetInternalErrorCode), message);
                        C1C7U.LIZIZ("AdAutofillPipoManager@24f6.fetchGetPipoDomainQuery$3");
                    }
                });
                if (zLJI2) {
                    MethodIDManager.LJ();
                }
            }
            LJIIIIZZ(webView, i, c1035880d3y);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LJIIJ(int i, int i2, long j, long j2) {
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - j) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        C1068190du5 c1068190du5 = new C1068190du5(new Object[0]);
        C1068210du7.LIZ.getClass();
        c1068190du5.log(C1068210du7.LJIILLIIL, new C1068280duE(i, jElapsedRealtimeNanos, i2, j2));
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [T, com.ss.android.ugc.aweme.autofill.api.MaskInstrumentInfo] */
    public static final void LJ(final WebView webView, final String str, final int i, final C1035880d3y c1035880d3y, final Function2<? super AdAutofillPipoFillInfo, ? super Integer, Unit> function2) {
        final String uid;
        AdAutofillPipoFillInfo adAutofillPipoFillInfo;
        final String str2;
        final AdAutofillApi adAutofillApiLIZIZ;
        DialogC1389620mGW dialogC1389620mGW;
        User currentUser;
        if (str == null) {
            return;
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null) {
            uid = "default";
        }
        HashMap<String, AdAutofillPipoFillInfo> map = LIZLLL.get(uid);
        DialogC1389620mGW dialogC1389620mGW2 = null;
        if (map != null) {
            adAutofillPipoFillInfo = map.get(str);
        } else {
            adAutofillPipoFillInfo = null;
        }
        if (adAutofillPipoFillInfo != null) {
            if (function2 != null) {
                function2.invoke(adAutofillPipoFillInfo, 1);
                return;
            }
            return;
        }
        if (LJIIIIZZ != null && (str2 = LJIILIIL) != null && str2.length() != 0) {
            final C259800zU c259800zU = new C259800zU();
            List<MaskInstrumentInfo> list = LIZJ.get(uid);
            if (list != null) {
                for (MaskInstrumentInfo maskInstrumentInfo : list) {
                    if (Intrinsics.LJFF(maskInstrumentInfo.getInstrumentId(), str)) {
                        c259800zU.element = maskInstrumentInfo;
                    }
                }
            }
            if (c259800zU.element == 0) {
                return;
            }
            C1068190du5 c1068190du5 = new C1068190du5(new Object[0]);
            C1068210du7.LIZ.getClass();
            c1068190du5.log(C1068210du7.LJIILJJIL, new AwS30S0001000_16(i, 44));
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (function2 != null && webView != null && ((dialogC1389620mGW = LJIIL) == null || !dialogC1389620mGW.isShowing())) {
                C1068720duw c1068720duw = LIZ;
                Context context = webView.getContext();
                c1068720duw.getClass();
                if (context != null) {
                    dialogC1389620mGW2 = new DialogC1389620mGW(context);
                    dialogC1389620mGW2.LJJLL(false);
                    dialogC1389620mGW2.LJJLJ(2131836757);
                    dialogC1389620mGW2.setCancelable(false);
                    dialogC1389620mGW2.LJJLIIJ(false);
                }
                LJIIL = dialogC1389620mGW2;
                if (dialogC1389620mGW2 != null) {
                    C786410Ut5.J4(dialogC1389620mGW2);
                }
                C786410Ut5.LJLIIL(8000L, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0dv2
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        DialogC1389620mGW dialogC1389620mGW3;
                        C1C7U.LIZ("AdAutofillPipoManager@24f6.getCardNumber$3");
                        try {
                            DialogC1389620mGW dialogC1389620mGW4 = C1068720duw.LJIIL;
                            if (dialogC1389620mGW4 != null && dialogC1389620mGW4.isShowing() && (dialogC1389620mGW3 = C1068720duw.LJIIL) != null) {
                                dialogC1389620mGW3.dismiss();
                                C785410UrT.LIZ(dialogC1389620mGW3);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AdAutofillPipoManager@24f6.getCardNumber$3");
                    }
                });
            }
            String str3 = LJIIIIZZ;
            if (str3 != null) {
                if (((Boolean) C0A7B.LIZ.getValue()).booleanValue()) {
                    AdAutofillApi.LIZ.getClass();
                    adAutofillApiLIZIZ = C1068770dv1.LIZJ(str3);
                } else {
                    AdAutofillApi.LIZ.getClass();
                    adAutofillApiLIZIZ = C1068770dv1.LIZIZ(str3);
                }
                final String str4 = uid;
                C11O8 c11o8LJJJLZIJ = C11NZ.LJJ(new Callable() { // from class: X.0dux
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws JSONException {
                        C1C7U.LIZ("AdAutofillPipoManager@24f6.getCardNumber$4$1");
                        AdAutofillApi adAutofillApi = adAutofillApiLIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("https://uid.");
                        sbLIZ.append(str4);
                        sbLIZ.append(".com");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        String str5 = str2;
                        C1068720duw c1068720duw2 = C1068720duw.LIZ;
                        String str6 = str4;
                        MaskInstrumentInfo maskInstrumentInfo2 = c259800zU.element;
                        C1035880d3y c1035880d3y2 = c1035880d3y;
                        c1068720duw2.getClass();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("merchant_id", C1068720duw.LJIIIZ);
                        jSONObject.put("merchant_user_id", str6);
                        jSONObject.put("pipo_user_id", maskInstrumentInfo2 != null ? maskInstrumentInfo2.getPipoUserId() : null);
                        String strLIZ = C1068720duw.LIZ(jSONObject, c1035880d3y2);
                        Ecies ecies = C1068720duw.LIZIZ;
                        String str7 = ecies.LIZIZ;
                        jSONObject.put("client_pk", str7);
                        jSONObject.put("instrument_id", maskInstrumentInfo2 != null ? maskInstrumentInfo2.getInstrumentId() : null);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("client_pk=");
                        sbLIZ2.append(str7);
                        sbLIZ2.append("&instrument_id=");
                        sbLIZ2.append(maskInstrumentInfo2 != null ? maskInstrumentInfo2.getInstrumentId() : null);
                        sbLIZ2.append("&merchant_id=");
                        sbLIZ2.append(C1068720duw.LJIIIZ);
                        sbLIZ2.append("&merchant_user_id=");
                        sbLIZ2.append(str6);
                        sbLIZ2.append("&pipo_user_id=");
                        sbLIZ2.append(maskInstrumentInfo2 != null ? maskInstrumentInfo2.getPipoUserId() : null);
                        sbLIZ2.append("&risk_info=");
                        sbLIZ2.append(strLIZ);
                        jSONObject.put("sign", ecies.LIZJ(C2188811AlT.LIZIZ(sbLIZ2)));
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                        String str8 = simpleDateFormat.format(new Date(jCurrentTimeMillis2));
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("biz_content=");
                        sbLIZ3.append(URLEncoder.encode(C786410Ut5.J3(jSONObject), "UTF-8"));
                        sbLIZ3.append("&merchant_id=");
                        sbLIZ3.append(C1068720duw.LJIIIZ);
                        sbLIZ3.append("&request_time=");
                        sbLIZ3.append(str8);
                        C11NZ<AdAutofillPipoResponse> cardNumber = adAutofillApi.getCardNumber(strLIZIZ, str5, "application/x-www-form-urlencoded; charset=utf-8", AbstractC842530X3j.LIZJ(null, C2188811AlT.LIZIZ(sbLIZ3)));
                        C1C7U.LIZIZ("AdAutofillPipoManager@24f6.getCardNumber$4$1");
                        return cardNumber;
                    }
                }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
                final String str5 = uid;
                c11o8LJJJLZIJ.LJJLL(new C09JN() { // from class: X.0duy
                    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
                    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
                    @Override // X.C09JN
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void accept(java.lang.Object r24) {
                        /*
                            Method dump skipped, instruction units count: 235
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1068740duy.accept(java.lang.Object):void");
                    }
                }, new C09JN() { // from class: X.08lB
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        int cronetInternalErrorCode;
                        int i2;
                        C1C7U.LIZ("AdAutofillPipoManager@24f6.getCardNumber$4$3");
                        Throwable th = (Throwable) obj;
                        boolean z = th instanceof C1494690ozz;
                        if (z && ((C1494690ozz) th).getStatusCode() == 400 && !C1068720duw.LJIIJ) {
                            C1068720duw.LJIIJ = true;
                            C1068720duw.LJIILIIL = "";
                            Keva.getRepo("autofill_pipo_cert").storeString(uid, "");
                            C1068720duw c1068720duw2 = C1068720duw.LIZ;
                            WebView webView2 = webView;
                            String str6 = uid;
                            Function2<AdAutofillPipoFillInfo, Integer, Unit> function22 = function2;
                            if (function22 == null) {
                                i2 = 3;
                            } else {
                                i2 = 4;
                            }
                            String str7 = str;
                            C1035880d3y c1035880d3y2 = c1035880d3y;
                            c1068720duw2.getClass();
                            C1068720duw.LIZJ(webView2, str6, i2, str7, function22, c1035880d3y2);
                        } else {
                            Function2<AdAutofillPipoFillInfo, Integer, Unit> function23 = function2;
                            if (function23 != null) {
                                C1068720duw c1068720duw3 = C1068720duw.LIZ;
                                WebView webView3 = webView;
                                c1068720duw3.getClass();
                                C1068720duw.LJFF(webView3, function23);
                            }
                        }
                        String message = null;
                        if (z) {
                            C1494690ozz c1494690ozz = (C1494690ozz) th;
                            cronetInternalErrorCode = c1494690ozz.getStatusCode();
                            Throwable cause = c1494690ozz.getCause();
                            if (cause != null) {
                                message = cause.getMessage();
                            }
                        } else if (th instanceof C1494450ozb) {
                            C1494450ozb c1494450ozb = (C1494450ozb) th;
                            cronetInternalErrorCode = c1494450ozb.getCronetInternalErrorCode();
                            Throwable cause2 = c1494450ozb.getCause();
                            if (cause2 != null) {
                                message = cause2.getMessage();
                            }
                        } else {
                            cronetInternalErrorCode = -1;
                        }
                        C1068720duw c1068720duw4 = C1068720duw.LIZ;
                        C1068210du7.LIZ.getClass();
                        C1068720duw.LJIIL(c1068720duw4, C1068210du7.LJIILL, jCurrentTimeMillis, i, false, String.valueOf(cronetInternalErrorCode), message);
                        C1C7U.LIZIZ("AdAutofillPipoManager@24f6.getCardNumber$4$3");
                    }
                });
            }
        }
    }

    public static void LJIIJJI(long j, int i, String str, String str2, boolean z) {
        String uid;
        User currentUser;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null) {
            uid = "default";
        }
        C1068190du5 c1068190du5 = new C1068190du5(new Object[0]);
        C1068210du7.LIZ.getClass();
        c1068190du5.log(C1068210du7.LJIILIIL, new C1068260duC(i, str, j, str2, uid, z));
    }

    public static void LIZJ(final WebView webView, final String str, final int i, final String str2, final Function2 function2, final C1035880d3y c1035880d3y) {
        boolean zLJI = MethodIDManager.LJI(137991);
        String string = Keva.getRepo("autofill_pipo_cert").getString(str, "");
        LJIILIIL = string;
        boolean z = true;
        if (C123100dR.LIZ(string)) {
            LJI = true;
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C1068190du5 c1068190du5 = new C1068190du5(new Object[0]);
        C1068210du7.LIZ.getClass();
        c1068190du5.log(C1068210du7.LJIIJ, new AwS30S0001000_16(i, 43));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("x-ttnet-protocol-handler", "1");
        linkedHashMap.put("x-ttnet-action-cert-act", "csr");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CN=");
        sbLIZ.append(str);
        sbLIZ.append('+');
        sbLIZ.append(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
        linkedHashMap.put("x-ttnet-action-cert-csr-info", C2188811AlT.LIZIZ(sbLIZ));
        LJI = false;
        final C013C c013c = new C013C();
        if (str2 == null || (i != 3 && i != 4)) {
            z = false;
        }
        c013c.element = z;
        C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.08l9
            public final void LIZ() throws JSONException {
                int cronetInternalErrorCode;
                try {
                    C1068720duw.LIZ.getClass();
                    C1068720duw.LJI = true;
                    String str3 = CardStruct.IStatusCode.DEFAULT;
                    C0X52<String> c0x52Execute = C1068720duw.LJI().getCert("https://cert", linkedHashMap).execute();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    String str4 = null;
                    for (C080U c080u : c0x52Execute.LIZ.LIZLLL) {
                        if (Intrinsics.LJFF(c080u.LIZ, "x-ttnet-action-cert-csr-data")) {
                            linkedHashMap2.put("pipo-csr", c080u.LIZIZ);
                        }
                        if (Intrinsics.LJFF(c080u.LIZ, "x-ttnet-cert-id")) {
                            str4 = c080u.LIZIZ;
                        }
                    }
                    C1068720duw.LIZ.getClass();
                    AdAutofillApi adAutofillApiLJI = C1068720duw.LJI();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(C0CQT.LIZJ);
                    sbLIZ2.append("/aweme/v1/ad/pipo/client/certificate/query/");
                    C0X52<String> c0x52Execute2 = adAutofillApiLJI.getCert(C2188811AlT.LIZIZ(sbLIZ2), linkedHashMap2).execute();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.put("x-ttnet-protocol-handler", "1");
                    linkedHashMap3.put("x-ttnet-action-cert-act", "add");
                    linkedHashMap3.put("x-ttnet-cert-id", str4 == null ? "" : str4);
                    linkedHashMap3.put("x-ttnet-action-cert-add", new JSONObject(c0x52Execute2.LIZIZ).optString("client_certificate", ""));
                    List<C080U> list = C1068720duw.LJI().getCert("https://cert", linkedHashMap3).execute().LIZ.LIZLLL;
                    C013C c013c2 = c013c;
                    WebView webView2 = webView;
                    int i2 = i;
                    String str5 = str2;
                    C1035880d3y c1035880d3y2 = c1035880d3y;
                    Function2<AdAutofillPipoFillInfo, Integer, Unit> function22 = function2;
                    boolean z2 = true;
                    for (C080U c080u2 : list) {
                        if (Intrinsics.LJFF(c080u2.LIZ, "x-ttnet-cert-id")) {
                            str4 = c080u2.LIZIZ;
                            C1068720duw.LJIILIIL = str4;
                            if (c013c2.element) {
                                C1068720duw.LIZ.getClass();
                                if (str5 != null) {
                                    C1068720duw.LJ(webView2, str5, i2, c1035880d3y2, function22);
                                }
                                c013c2.element = false;
                            } else {
                                C1068720duw.LJIIIIZZ(webView2, i2, c1035880d3y2);
                            }
                        }
                        if (Intrinsics.LJFF(c080u2.LIZ, "x-ttnet-action-cert-wrv")) {
                            str3 = c080u2.LIZIZ;
                            z2 = false;
                        }
                    }
                    if (C123100dR.LIZ(str4) && z2) {
                        Keva.getRepo("autofill_pipo_cert").storeString(str, str4);
                    }
                    C013C c013c3 = c013c;
                    C1068720duw c1068720duw = C1068720duw.LIZ;
                    boolean z3 = c013c3.element;
                    WebView webView3 = webView;
                    int i3 = i;
                    String str6 = str2;
                    C1035880d3y c1035880d3y3 = c1035880d3y;
                    Function2<AdAutofillPipoFillInfo, Integer, Unit> function23 = function2;
                    c1068720duw.getClass();
                    if (z3) {
                        C1068720duw.LJFF(webView3, function23);
                        if (str6 != null) {
                            C1068720duw.LJ(webView3, str6, i3, c1035880d3y3, function23);
                        }
                    }
                    c013c3.element = false;
                    C1068210du7.LIZ.getClass();
                    C1068720duw.LJIIL(c1068720duw, C1068210du7.LJIIJJI, jCurrentTimeMillis, i, true, str3, null);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1068720duw c1068720duw2 = C1068720duw.LIZ;
                    c1068720duw2.getClass();
                    C1068720duw.LJI = true;
                    String message = null;
                    C1068720duw.LJIILJJIL(null);
                    if (th instanceof C1494690ozz) {
                        C1494690ozz c1494690ozz = (C1494690ozz) th;
                        cronetInternalErrorCode = c1494690ozz.getStatusCode();
                        message = th.getMessage();
                        c1494690ozz.getCause();
                    } else if (th instanceof C1494450ozb) {
                        cronetInternalErrorCode = ((C1494450ozb) th).getCronetInternalErrorCode();
                        message = th.getMessage();
                    } else {
                        cronetInternalErrorCode = -1;
                    }
                    C1068210du7.LIZ.getClass();
                    C1068720duw.LJIIL(c1068720duw2, C1068210du7.LJIIJJI, jCurrentTimeMillis, i, false, String.valueOf(cronetInternalErrorCode), message);
                    C013C c013c4 = c013c;
                    boolean z4 = c013c4.element;
                    WebView webView4 = webView;
                    int i4 = i;
                    String str7 = str2;
                    C1035880d3y c1035880d3y4 = c1035880d3y;
                    Function2<AdAutofillPipoFillInfo, Integer, Unit> function24 = function2;
                    if (z4) {
                        C1068720duw.LJFF(webView4, function24);
                        if (str7 != null) {
                            C1068720duw.LJ(webView4, str7, i4, c1035880d3y4, function24);
                        }
                    }
                    c013c4.element = false;
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AdAutofillPipoManager@24f6.fetchCertAndValidPiList$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AdAutofillPipoManager@24f6.fetchCertAndValidPiList$2");
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZLLL(String str, AtomicBoolean atomicBoolean, Function1 function1, C259800zU c259800zU, C259800zU c259800zU2, C259800zU c259800zU3) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (!atomicBoolean.get() && (charSequence = (CharSequence) c259800zU.element) != null && charSequence.length() != 0 && (charSequence2 = (CharSequence) c259800zU2.element) != null && charSequence2.length() != 0) {
            LJIIIIZZ = (String) c259800zU.element;
            LJIIIZ = (String) c259800zU3.element;
            LJIILIIL = (String) c259800zU2.element;
            if (atomicBoolean.compareAndSet(false, true)) {
                C1068720duw c1068720duw = LIZ;
                String str2 = (String) c259800zU2.element;
                if (str2 == null) {
                    str2 = "";
                }
                c1068720duw.getClass();
                LJIILIIL(str, str2, function1);
            }
        }
    }

    public static void LJIIL(C1068720duw c1068720duw, C1007810cKh c1007810cKh, long j, int i, boolean z, String str, String str2) {
        c1068720duw.getClass();
        new C1068190du5(new Object[0]).log(c1007810cKh, new C1068270duD(str2, j, z, str, i, false));
    }
}
