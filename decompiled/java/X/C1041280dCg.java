package X;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dCg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041280dCg implements InterfaceC1008690cM7 {
    public static final void LJIIIZ(final List<? extends Aweme> list) {
        boolean zLJI = MethodIDManager.LJI(71774);
        if (!list.isEmpty()) {
            C15O7.LIZIZ(new Callable() { // from class: X.0MvB
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("MaskLogHelper@2f5e.feedAdLog$callable$1");
                    for (Aweme aweme : list) {
                        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
                            C614790O9l.LIZ(aweme, "feedApi");
                        }
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MaskLogHelper@2f5e.feedAdLog$callable$1");
                    return unit;
                }
            }, C15O7.LJI, null);
        }
        if (!list.isEmpty()) {
            C15O7.LIZIZ(new Callable() { // from class: X.05uB
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("FollowModelHelper@ff3c.addFollowStatus$callable$1");
                    for (Aweme aweme : list) {
                        if (aweme != null) {
                            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                            if (!TextUtils.isEmpty(awemeRawAd != null ? awemeRawAd.getLynxRawData() : null)) {
                                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                strOptString = new JSONObject(awemeRawAd2 != null ? awemeRawAd2.getLynxRawData() : null).optString("star_sec_uid");
                            }
                            if (!TextUtils.isEmpty(strOptString)) {
                                ((C830530Wi3) C1501005uC.LIZ.getValue()).put(strOptString, 0);
                            }
                        }
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FollowModelHelper@ff3c.addFollowStatus$callable$1");
                    return unit;
                }
            }, C15O7.LJI, null);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.0dFe] */
    public final void LJII(AwemeRawAd awemeRawAd) {
        String strK0 = ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).K0("feed");
        final String channelName = awemeRawAd.getChannelName();
        String strLJIIIIZZ = LJIIIIZZ(strK0, channelName);
        if (strLJIIIIZZ != null && strLJIIIIZZ.length() != 0) {
            C0VSJ c0vsj = new C0VSJ(strLJIIIIZZ, "resource.android.html");
            if (c0vsj.exists() && c0vsj.isFile()) {
                final long jLongValue = awemeRawAd.getCreativeId().longValue();
                final String absolutePath = c0vsj.getAbsolutePath();
                final String webUrl = awemeRawAd.getWebUrl();
                C1553670qX7.LIZ.getClass();
                C0VSJ c0vsj2 = new C0VSJ(C1553670qX7.LIZLLL().getPath(), strK0);
                C2354709Kn.LJI(c0vsj2);
                c0vsj2.getPath();
                final ?? r8 = new AbstractC1043470dGD(channelName) { // from class: X.0dFe
                    public final String LIZIZ;
                    public final SimpleDateFormat LIZJ;

                    @Override // X.AbstractC1043470dGD
                    public final InputStream LIZIZ(String str) {
                        return null;
                    }

                    @Override // X.AbstractC1043470dGD
                    public final String LIZLLL() {
                        return "";
                    }

                    {
                        super(true);
                        this.LIZIZ = channelName;
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss", Locale.getDefault());
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        this.LIZJ = simpleDateFormat;
                    }

                    @Override // X.AbstractC1043470dGD, X.InterfaceC1041260dCe
                    public final WebResourceResponse LIZ(String str) {
                        boolean z;
                        IAdLandPagePreloadService iAdLandPagePreloadService;
                        String strLJ;
                        IAdLandPagePreloadService iAdLandPagePreloadService2;
                        JSONObject jSONObjectW0;
                        JSONObject jSONObjectOptJSONObject;
                        String strLIZJ;
                        Map mapLJIIIIZZ;
                        int iLJJIZ;
                        String strSubstring = str;
                        String str2 = this.LIZIZ;
                        if (strSubstring != null && strSubstring.length() != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z || str2 == null || str2.length() == 0 || (iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)) == null || (strLJ = C1552050qUV.LJ(iAdLandPagePreloadService.K0("feed"), str2)) == null || strLJ.length() == 0 || (iAdLandPagePreloadService2 = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)) == null || (jSONObjectW0 = iAdLandPagePreloadService2.w0(strLJ)) == null || (jSONObjectOptJSONObject = jSONObjectW0.optJSONObject(C08HG.LIZ(strSubstring))) == null) {
                            return null;
                        }
                        C0VSJ c0vsj3 = new C0VSJ(strLJ, jSONObjectOptJSONObject.optString("fileName"));
                        if (c0vsj3.exists() && !c0vsj3.isFile()) {
                            if (!TextUtils.isEmpty(strSubstring) && (iLJJIZ = a0.LJJIZ(strSubstring, '?', 0, false, 6)) != -1) {
                                strSubstring = strSubstring.substring(0, iLJJIZ);
                            }
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("respHeader");
                            if (jSONObjectOptJSONObject2 == null || (strLIZJ = jSONObjectOptJSONObject2.optString("content-type")) == null) {
                                strLIZJ = LIZJ(strSubstring);
                            }
                            C0VSP c0vsp = new C0VSP(c0vsj3);
                            int prememCacheMaxAgeInDays = C0CLW.LIZIZ.LIZ.getAdLandingPageConfig().getPrememCacheMaxAgeInDays();
                            if (prememCacheMaxAgeInDays <= 0) {
                                mapLJIIIIZZ = C2097608Jq.LJ();
                            } else {
                                long j = ((long) prememCacheMaxAgeInDays) * 86400;
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                String str3 = this.LIZJ.format(new Date(jCurrentTimeMillis));
                                String str4 = this.LIZJ.format(new Date(jCurrentTimeMillis + (((long) LSPassThroughRecordSizeConfig.DEFAULT) * j)));
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("public, max-age=");
                                sbLIZ.append(j);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(str3);
                                sbLIZ2.append(" GMT");
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append(str4);
                                sbLIZ3.append(" GMT");
                                mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("access-control-allow-credentials", "true"), new Pair("access-control-allow-headers", "Origin, X-Requested-With, Content-Type, Accept, Access-Control-Allow-Credentials"), new Pair("access-control-allow-methods", "GET"), new Pair("access-control-allow-origin", "*"), new Pair("access-control-max-age", String.valueOf(j)), new Pair("x-content-type-options", "nosniff"), new Pair("x-xss-protection", CardStruct.IStatusCode.DEFAULT), new Pair("timing-allow-origin", "*"), new Pair("age", CardStruct.IStatusCode.DEFAULT), new Pair("cache-control", C2188811AlT.LIZIZ(sbLIZ)), new Pair("date", C2188811AlT.LIZIZ(sbLIZ2)), new Pair("expires", C2188811AlT.LIZIZ(sbLIZ3)));
                            }
                            return AbstractC1043470dGD.LJ(strLIZJ, "", c0vsp, mapLJIIIIZZ);
                        }
                        return null;
                    }

                    @Override // X.AbstractC1043470dGD
                    public final String LIZJ(String str) {
                        if (str != null && (u.LJIIZILJ(str, ".shtml", false) || u.LJIIZILJ(str, ".do", false))) {
                            return "text/html";
                        }
                        return super.LIZJ(str);
                    }
                };
                final int iIncrementAndGet = C1041300dCi.LIZ.incrementAndGet();
                C15O7.LJIIIIZZ(500L).LIZLLL(new InterfaceC2385309Wh() { // from class: X.0dCh
                    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
                    @Override // X.InterfaceC2385309Wh
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object then(X.C15O7 r4) throws java.lang.Throwable {
                        /*
                            r3 = this;
                            java.lang.String r2 = "PreMemWebManager@818c.prefetchToMemory$1"
                            X.C1C7U.LIZ(r2)
                            java.util.concurrent.atomic.AtomicInteger r0 = X.C1041300dCi.LIZ
                            int r1 = r0.get()
                            int r0 = r1
                            if (r1 != r0) goto L2a
                            X.0VSJ r1 = new X.0VSJ
                            java.lang.String r0 = r2
                            r1.<init>(r0)
                            boolean r0 = r1.exists()
                            if (r0 == 0) goto L2a
                            boolean r0 = r1.isFile()
                            if (r0 == 0) goto L2a
                            java.lang.String r0 = X.C09BH.LJII(r1)
                        L26:
                            X.C1C7U.LIZIZ(r2)
                            return r0
                        L2a:
                            r0 = 0
                            goto L26
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1041290dCh.then(X.15O7):java.lang.Object");
                    }
                }).LJ(new InterfaceC2385309Wh(iIncrementAndGet, jLongValue, webUrl, r8) { // from class: X.0dCk
                    public final /* synthetic */ int LIZ;
                    public final /* synthetic */ String LIZIZ;
                    public final /* synthetic */ InterfaceC1041260dCe LIZJ;

                    {
                        this.LIZIZ = webUrl;
                        this.LIZJ = r8;
                    }

                    @Override // X.InterfaceC2385309Wh
                    public final Object then(C15O7 c15o7) {
                        String str;
                        Object c098200Yq;
                        C1C7U.LIZ("PreMemWebManager@818c.prefetchToMemory$2");
                        if (C1041300dCi.LIZ.get() == this.LIZ && (str = (String) c15o7.LJIIL()) != null && str.length() != 0) {
                            String str2 = this.LIZIZ;
                            InterfaceC1041260dCe interfaceC1041260dCe = this.LIZJ;
                            if (C1041300dCi.LIZIZ == null) {
                                C844470XAv.LIZ.getClass();
                                WebView webView = new WebView(C844470XAv.LIZ());
                                webView.setNetworkAvailable(false);
                                webView.getSettings().setJavaScriptEnabled(C0CLW.LIZIZ.LIZ.getAdLandingPageConfig().isPrememCacheJsEnable());
                                webView.getSettings().setCacheMode(3);
                                webView.getSettings().setDatabaseEnabled(false);
                                webView.getSettings().setAllowContentAccess(false);
                                webView.getSettings().setAllowFileAccess(false);
                                webView.getSettings().setGeolocationEnabled(false);
                                webView.getSettings().setSaveFormData(false);
                                webView.getSettings().setSavePassword(false);
                                C1041300dCi.LIZIZ = webView;
                                C1041330dCl c1041330dCl = new C1041330dCl();
                                WebView webView2 = C1041300dCi.LIZIZ;
                                if (webView2 != null) {
                                    C786410Ut5.te(webView2, c1041330dCl);
                                }
                                C1041300dCi.LIZJ = c1041330dCl;
                            }
                            if (C1041300dCi.LIZIZ != null) {
                                C1041330dCl c1041330dCl2 = C1041300dCi.LIZJ;
                                if (c1041330dCl2 != null) {
                                    c1041330dCl2.LIZ = interfaceC1041260dCe;
                                }
                                try {
                                    Uri uri = UriProtector.parse(str2);
                                    c098200Yq = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).build().toString();
                                    C189200o6.m2constructorimpl(c098200Yq);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                }
                                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                    c098200Yq = null;
                                }
                                String str3 = (String) c098200Yq;
                                WebView webView3 = C1041300dCi.LIZIZ;
                                if (webView3 != null) {
                                    webView3.loadDataWithBaseURL(str3, str, "text/html", "utf-8", str2);
                                }
                                final int iIncrementAndGet2 = C1041300dCi.LIZ.incrementAndGet();
                                C15O7.LJIIIIZZ(60000L).LJ(new InterfaceC2385309Wh() { // from class: X.0dCj
                                    @Override // X.InterfaceC2385309Wh
                                    public final Object then(C15O7 c15o72) {
                                        WebView webView4;
                                        C1C7U.LIZ("PreMemWebManager@818c.startPrefetching$1");
                                        if (iIncrementAndGet2 == C1041300dCi.LIZ.get() && (webView4 = C1041300dCi.LIZIZ) != null) {
                                            C1041330dCl c1041330dCl3 = C1041300dCi.LIZJ;
                                            if (c1041330dCl3 != null) {
                                                c1041330dCl3.LIZ = null;
                                            }
                                            C1041300dCi.LIZJ = null;
                                            C1041300dCi.LIZIZ = null;
                                            webView4.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
                                            webView4.clearFormData();
                                            webView4.clearHistory();
                                            webView4.destroy();
                                        }
                                        Unit unit = Unit.LIZ;
                                        C1C7U.LIZIZ("PreMemWebManager@818c.startPrefetching$1");
                                        return unit;
                                    }
                                }, C15O7.LJIIIIZZ, null);
                            }
                        }
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("PreMemWebManager@818c.prefetchToMemory$2");
                        return unit;
                    }
                }, C15O7.LJIIIIZZ, null);
            }
        }
    }

    public static final void LJI(String str, List list) {
        C1537050q6J.LIZ.getClass();
        C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(str);
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (String str2 : (ArrayList) list) {
            CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
            targetChannel.channelName = str2;
            arrayList.add(targetChannel);
        }
        if (str != null) {
            map.put(str, arrayList);
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setChannelUpdatePriority(3);
            optionCheckUpdateParams.setLazyUpdate(true);
            if (c1551950qULLIZ != null) {
                c1551950qULLIZ.LIZ(null, map, optionCheckUpdateParams);
            }
        }
    }

    public static final String LJIIIIZZ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return C1552050qUV.LJ(str, str2);
        }
        return "";
    }

    public final void LIZLLL(String str, List list) {
        LJ(list, str, new C1024460clY());
    }

    public static final void LIZ(String str, AbstractC1552040qUU abstractC1552040qUU, OptionCheckUpdateParams optionCheckUpdateParams) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
        targetChannel.channelName = str;
        arrayList.add(targetChannel);
        if (optionCheckUpdateParams == null) {
            optionCheckUpdateParams = new OptionCheckUpdateParams();
        }
        optionCheckUpdateParams.setListener(abstractC1552040qUU);
        map.put(C1553670qX7.LIZ(), arrayList);
        C1551950qUL c1551950qULLJIILL = C1552050qUV.LJIILL();
        if (c1551950qULLJIILL != null) {
            c1551950qULLJIILL.LIZ(null, map, optionCheckUpdateParams);
        }
    }

    public static final void LIZIZ(String str, String str2, AbstractC1552040qUU abstractC1552040qUU) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
        targetChannel.channelName = str;
        arrayList.add(targetChannel);
        if (str2 != null) {
            map.put(str2, arrayList);
            C1551950qUL c1551950qULLJIILJJIL = C1552050qUV.LJIILJJIL(str2, null);
            if (c1551950qULLJIILJJIL != null) {
                if (abstractC1552040qUU == null) {
                    abstractC1552040qUU = new C1024460clY();
                }
                c1551950qULLJIILJJIL.LIZJ(map, abstractC1552040qUU);
            }
        }
    }

    public static final void LJ(List list, String str, AbstractC1552040qUU abstractC1552040qUU) {
        if (list == null) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
            targetChannel.channelName = str2;
            arrayList.add(targetChannel);
        }
        if (str != null) {
            map.put(str, arrayList);
            C1551950qUL c1551950qULLJIILJJIL = C1552050qUV.LJIILJJIL(str, null);
            if (c1551950qULLJIILJJIL != null) {
                c1551950qULLJIILJJIL.LIZJ(map, abstractC1552040qUU);
            }
        }
    }

    public final void LIZJ(final Aweme aweme, String str, List list) {
        LJ(list, str, new C1024460clY(aweme) { // from class: X.0clZ
            public final Aweme LIZ;
            public final C01GW LIZIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS204S0000000_16.get$arr$(324));
            public final List<String> LIZJ = new ArrayList();
            public boolean LIZLLL;

            public final void LJJIII() {
                if (!((ArrayList) this.LIZJ).isEmpty() || this.LIZLLL) {
                    return;
                }
                this.LIZLLL = true;
                InterfaceC1000440c8o interfaceC1000440c8o = (InterfaceC1000440c8o) this.LIZIZ.getValue();
                if (interfaceC1000440c8o != null) {
                    interfaceC1000440c8o.LIZ(this.LIZ, true);
                }
            }

            {
                this.LIZ = aweme;
            }

            @Override // X.C1024460clY, X.AbstractC1552040qUU
            public final void LJIIIIZZ(Map<String, List<android.util.Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("GeckoX---onCheckServerVersionSuccess, updateList empty: ");
                sbLIZ.append(((ArrayList) this.LIZJ).isEmpty());
                C2188811AlT.LIZIZ(sbLIZ);
                C1024460clY.LJJIFFI(map2, null);
                ((ArrayList) this.LIZJ).clear();
                if (map2 != null) {
                    Iterator<Map.Entry<String, List<UpdatePackage>>> it2 = map2.entrySet().iterator();
                    while (it2.hasNext()) {
                        List<UpdatePackage> value = it2.next().getValue();
                        if (value != null) {
                            for (UpdatePackage updatePackage : value) {
                                ((ArrayList) this.LIZJ).add(updatePackage.getChannel());
                            }
                        }
                    }
                }
                LJJIII();
            }

            @Override // X.AbstractC1552040qUU
            public final void LJJ(long j, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("GeckoX---onUpdateSuccess, channel: ");
                sbLIZ.append(str2);
                C2188811AlT.LIZIZ(sbLIZ);
                C19719512Dh.LIZ(this.LIZJ).remove(str2);
                LJJIII();
            }
        });
    }

    public static final void LJFF(List<String> list, String str, OptionCheckUpdateParams optionCheckUpdateParams, AbstractC1552040qUU abstractC1552040qUU) {
        if (list == null || str == null) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
            targetChannel.channelName = str2;
            arrayList.add(targetChannel);
        }
        if (optionCheckUpdateParams != null) {
            if (abstractC1552040qUU == null) {
                abstractC1552040qUU = new C1024460clY();
            }
            optionCheckUpdateParams.setListener(abstractC1552040qUU);
        }
        map.put(str, arrayList);
        C1551950qUL c1551950qULLJIILJJIL = C1552050qUV.LJIILJJIL(str, null);
        if (c1551950qULLJIILJJIL != null) {
            c1551950qULLJIILJJIL.LIZ("default", map, optionCheckUpdateParams);
        }
    }
}
