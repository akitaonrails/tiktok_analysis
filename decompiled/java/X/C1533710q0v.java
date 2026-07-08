package X;

import android.net.Uri;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.tiktok.forestx.RequestParamsX;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533710q0v {
    public static JSONArray LIZ;
    public static List<Pattern> LIZIZ;

    static {
        if (C1535630q41.LJIILIIL) {
            C086F c086f = C086F.LIZ;
            ExecutorService executorService = C2281108wj.LIZ;
            ExecutorService executorServiceLIZ = C2281108wj.LIZ(EnumC2281308wl.Blocked);
            c086f.getClass();
            C086F.LIZJ = executorServiceLIZ;
        }
        new ConcurrentHashMap();
    }

    public static void LIZ(C1537480q70 c1537480q70) {
        C1533840q18 c1533840q18;
        C1533900q1E c1533900q1E;
        IResourceServiceX iResourceServiceXLIZIZ = LIZIZ(c1537480q70, false);
        if ((iResourceServiceXLIZIZ instanceof C1533840q18) && (c1533840q18 = (C1533840q18) iResourceServiceXLIZIZ) != null && (c1533900q1E = c1533840q18.LIZ) != null) {
            c1533900q1E.LJIILL = true;
            C1533900q1E.LIZ(c1533900q1E, false, 3);
        }
    }

    public static C1533680q0s LJIIJ(n nVar) {
        String strLJIL;
        String strLJIL2;
        C1533700q0u c1533700q0u;
        String strLJIL3;
        String strLJIL4;
        try {
            if (nVar.LJJIIZ("switch").LJIIJJI() != 1) {
                return new C1533680q0s(false, C13BV.INSTANCE, C2097608Jq.LJ());
            }
            ArrayList arrayList = new ArrayList();
            Iterator<k> it2 = nVar.LJJIIZ("buckets").LJIIL().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LJIL());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it3 = nVar.LJJIIZ("area_infos").LJIILIIL().entrySet().iterator();
            while (it3.hasNext()) {
                n nVarLJIILIIL = ((k) ((Map.Entry) it3.next()).getValue()).LJIILIIL();
                try {
                    n nVarLJIILIIL2 = nVarLJIILIIL.LJJIIZ("config").LJIILIIL();
                    k kVarLJJIIZ = nVarLJIILIIL2.LJJIIZ("domain");
                    Unit unit = null;
                    if (kVarLJJIIZ != null) {
                        strLJIL = kVarLJJIIZ.LJIL();
                    } else {
                        strLJIL = null;
                    }
                    k kVarLJJIIZ2 = nVarLJIILIIL2.LJJIIZ("bucket");
                    if (kVarLJJIIZ2 != null) {
                        strLJIL2 = kVarLJJIIZ2.LJIL();
                    } else {
                        strLJIL2 = null;
                    }
                    C1533700q0u c1533700q0u2 = new C1533700q0u(strLJIL, strLJIL2);
                    k kVarLJJIIZ3 = nVarLJIILIIL.LJJIIZ("fallback_config");
                    if (kVarLJJIIZ3 != null) {
                        n nVarLJIILIIL3 = kVarLJJIIZ3.LJIILIIL();
                        k kVarLJJIIZ4 = nVarLJIILIIL3.LJJIIZ("domain");
                        if (kVarLJJIIZ4 != null) {
                            strLJIL3 = kVarLJJIIZ4.LJIL();
                        } else {
                            strLJIL3 = null;
                        }
                        k kVarLJJIIZ5 = nVarLJIILIIL3.LJJIIZ("bucket");
                        if (kVarLJJIIZ5 != null) {
                            strLJIL4 = kVarLJJIIZ5.LJIL();
                        } else {
                            strLJIL4 = null;
                        }
                        c1533700q0u = new C1533700q0u(strLJIL3, strLJIL4);
                    } else {
                        c1533700q0u = null;
                    }
                    C1533690q0t c1533690q0t = new C1533690q0t(c1533700q0u2, c1533700q0u);
                    k kVarLJJIIZ6 = nVarLJIILIIL.LJJIIZ("default");
                    if (kVarLJJIIZ6 != null && kVarLJJIIZ6.LJIIJJI() == 1) {
                        linkedHashMap.put("default", c1533690q0t);
                    }
                    k kVarLJJIIZ7 = nVarLJIILIIL.LJJIIZ("regions");
                    if (kVarLJJIIZ7 != null) {
                        Iterator<k> it4 = kVarLJJIIZ7.LJIIL().iterator();
                        while (it4.hasNext()) {
                            linkedHashMap.put(it4.next().LJIL(), c1533690q0t);
                        }
                        unit = Unit.LIZ;
                    }
                    C189200o6.m2constructorimpl(unit);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            return new C1533680q0s(true, arrayList, linkedHashMap);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1534250q1n.LIZJ("AreaInfo", "failed to parse config", th2, true);
            return new C1533680q0s(false, C13BV.INSTANCE, C2097608Jq.LJ());
        }
    }

    public static void LJIILIIL(C1537480q70 c1537480q70) {
        C1533840q18 c1533840q18;
        C1533900q1E c1533900q1E;
        if (!c1537480q70.autoReleaseResourceGroup || c1537480q70.LIZJ("kitview")) {
            return;
        }
        IResourceServiceX iResourceServiceXLIZIZ = LIZIZ(c1537480q70, false);
        if ((iResourceServiceXLIZIZ instanceof C1533840q18) && (c1533840q18 = (C1533840q18) iResourceServiceXLIZIZ) != null && (c1533900q1E = c1533840q18.LIZ) != null) {
            C1533900q1E.LIZ(c1533900q1E, false, 3);
        }
    }

    public static void LJIILL(List list) {
        LIZIZ = list;
    }

    public static IResourceServiceX LIZIZ(C1537480q70 c1537480q70, boolean z) {
        String str;
        IResourceServiceX iResourceServiceX;
        C1533840q18 c1533840q18;
        if (c1537480q70 != null && (c1533840q18 = (C1533840q18) c1537480q70.LJFF(C1533840q18.class)) != null) {
            return c1533840q18;
        }
        if (c1537480q70 == null || ((iResourceServiceX = (IResourceServiceX) c1537480q70.LJFF(IResourceServiceX.class)) == null && (iResourceServiceX = (C1533850q19) c1537480q70.LJFF(C1533850q19.class)) == null)) {
            C01GW<C1075480e5q> c01gw = C1075480e5q.LIZIZ;
            C1075480e5q c1075480e5qLIZIZ = C1075530e5v.LIZIZ();
            if (c1537480q70 == null || (str = c1537480q70.bid) == null) {
                str = "hybridkit_default_bid";
            }
            iResourceServiceX = (C1533850q19) c1075480e5qLIZIZ.LIZIZ(C1533850q19.class, str);
            if (iResourceServiceX == null) {
                return null;
            }
        }
        if (!(iResourceServiceX instanceof C1533840q18) && c1537480q70 != null) {
            C1533900q1E c1533900q1E = (C1533900q1E) c1537480q70.LJFF(C1533900q1E.class);
            if (c1533900q1E != null) {
                c1533900q1E.LIZ = iResourceServiceX.getForest();
                C1533840q18 c1533840q182 = new C1533840q18(c1533900q1E);
                c1537480q70.LJJ(C1533840q18.class, c1533840q182);
                return c1533840q182;
            }
            if (z || C1535630q41.LJFF) {
                synchronized (c1537480q70) {
                    try {
                        C1533840q18 c1533840q183 = (C1533840q18) c1537480q70.LJFF(C1533840q18.class);
                        if (c1533840q183 != null) {
                            return c1533840q183;
                        }
                        C1533840q18 c1533840q184 = new C1533840q18(new C1533900q1E(iResourceServiceX.getForest(), null, false, 6));
                        c1537480q70.LJJ(C1533840q18.class, c1533840q184);
                        return c1533840q184;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
        return iResourceServiceX;
    }

    public static void LJ(RequestParams requestParams, C1537480q70 c1537480q70) {
        InterfaceC1531560pxS interfaceC1531560pxS;
        HybridSchemaParam hybridSchemaParamLIZJ;
        String sessionId;
        HybridSchemaParam hybridSchemaParamLIZJ2;
        if (c1537480q70 != null && (interfaceC1531560pxS = c1537480q70.hybridParams) != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null && hybridSchemaParamLIZJ.getLockResource()) {
            InterfaceC1531560pxS interfaceC1531560pxS2 = c1537480q70.hybridParams;
            if (interfaceC1531560pxS2 == null || (hybridSchemaParamLIZJ2 = interfaceC1531560pxS2.LIZJ()) == null || (sessionId = hybridSchemaParamLIZJ2.getSessionId()) == null) {
                sessionId = c1537480q70.containerId;
            }
            requestParams.sessionId = sessionId;
        }
    }

    public static void LJFF(RequestParamsX requestParamsX, C1537480q70 c1537480q70) {
        InterfaceC1531560pxS interfaceC1531560pxS;
        HybridSchemaParam hybridSchemaParamLIZJ;
        String sessionId;
        if (c1537480q70 != null && (interfaceC1531560pxS = c1537480q70.hybridParams) != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null && (sessionId = hybridSchemaParamLIZJ.getSessionId()) != null) {
            requestParamsX.sessionId = sessionId;
        }
    }

    public static void LJIIIIZZ(RequestParams requestParams, HybridSchemaParam hybridSchemaParam) {
        String str;
        if (hybridSchemaParam == null) {
            return;
        }
        LJIIJJI(requestParams, hybridSchemaParam);
        if (a0.LJJJIL(requestParams.accessKey)) {
            String accessKey = hybridSchemaParam.getAccessKey();
            if (accessKey == null && (accessKey = hybridSchemaParam.getAccessKeyBp()) == null) {
                accessKey = "";
            }
            requestParams.accessKey = accessKey;
        }
        String str2 = requestParams.channel;
        boolean z = false;
        if (str2 == null || str2.length() == 0 || (str = requestParams.bundle) == null || str.length() == 0) {
            String channel = hybridSchemaParam.getChannel();
            String bundle = hybridSchemaParam.getBundle();
            if (channel.length() > 0 && bundle.length() > 0) {
                requestParams.channel = channel;
                requestParams.bundle = bundle;
            }
        }
        requestParams.ignoredQueryParams = C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(hybridSchemaParam.getIgnoredQueryParams(), new String[]{","}, 0, 6));
        if (hybridSchemaParam.getIgnoreAllQueryParams() || (C1535630q41.LJIILLIIL && C1533950q1J.LJ(requestParams.channel) && C1533950q1J.LJ(requestParams.bundle))) {
            z = true;
        }
        requestParams.ignoreAllQueryParams = z;
    }

    public static void LJIIIZ(RequestParamsX requestParamsX, HybridSchemaParam hybridSchemaParam) {
        String str;
        if (hybridSchemaParam == null) {
            return;
        }
        LJIIL(requestParamsX, hybridSchemaParam);
        String str2 = requestParamsX.accessKey;
        boolean z = false;
        if (str2 == null || a0.LJJJIL(str2)) {
            String accessKey = hybridSchemaParam.getAccessKey();
            if (accessKey == null && (accessKey = hybridSchemaParam.getAccessKeyBp()) == null) {
                accessKey = "";
            }
            requestParamsX.accessKey = accessKey;
        }
        String str3 = requestParamsX.channel;
        if (str3 == null || str3.length() == 0 || (str = requestParamsX.bundle) == null || str.length() == 0) {
            String channel = hybridSchemaParam.getChannel();
            String bundle = hybridSchemaParam.getBundle();
            if (channel.length() > 0 && bundle.length() > 0) {
                requestParamsX.channel = channel;
                requestParamsX.bundle = bundle;
            }
        }
        requestParamsX.ignoredQueryParams = C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(hybridSchemaParam.getIgnoredQueryParams(), new String[]{","}, 0, 6));
        if (hybridSchemaParam.getIgnoreAllQueryParams() || (C1533950q1J.LJ(requestParamsX.channel) && C1533950q1J.LJ(requestParamsX.bundle))) {
            z = true;
        }
        requestParamsX.ignoreAllQueryParams = z;
    }

    public static void LJIIJJI(RequestParams requestParams, HybridSchemaParam hybridSchemaParam) {
        int iIntValue;
        EnumC825980Wai enumC825980Wai;
        if (hybridSchemaParam == null) {
            return;
        }
        Integer netWorker = hybridSchemaParam.getNetWorker();
        boolean z = true;
        if (netWorker != null) {
            int iIntValue2 = netWorker.intValue();
            if (iIntValue2 != 1) {
                if (iIntValue2 != 2) {
                    enumC825980Wai = null;
                } else {
                    enumC825980Wai = EnumC825980Wai.Downloader;
                }
            } else {
                enumC825980Wai = EnumC825980Wai.TTNet;
            }
            requestParams.netWorker = enumC825980Wai;
        }
        Boolean disableCDN = hybridSchemaParam.getDisableCDN();
        if (disableCDN != null) {
            requestParams.disableCdn = disableCDN.booleanValue();
        }
        Boolean disableBuiltin = hybridSchemaParam.getDisableBuiltin();
        if (disableBuiltin != null) {
            requestParams.disableBuiltin = disableBuiltin.booleanValue();
        }
        Boolean disableGeckoUpdate = hybridSchemaParam.getDisableGeckoUpdate();
        if (disableGeckoUpdate != null) {
            requestParams.disableGeckoUpdate = disableGeckoUpdate.booleanValue();
        }
        Boolean disableOffline = hybridSchemaParam.getDisableOffline();
        if (disableOffline != null || (disableOffline = hybridSchemaParam.getDisableGecko()) != null) {
            requestParams.disableOffline = disableOffline.booleanValue();
        }
        Boolean onlyLocal = hybridSchemaParam.getOnlyLocal();
        if (onlyLocal != null) {
            requestParams.onlyLocal = onlyLocal.booleanValue();
        }
        Boolean enableMemoryCache = hybridSchemaParam.getEnableMemoryCache();
        if (enableMemoryCache != null) {
            requestParams.enableMemoryCache = Boolean.valueOf(enableMemoryCache.booleanValue());
        }
        Integer dynamic = hybridSchemaParam.getDynamic();
        if (dynamic != null) {
            iIntValue = dynamic.intValue();
        } else if (!(!a0.LJJJIL(hybridSchemaParam.getFallbackUrl())) && !(!a0.LJJJIL(hybridSchemaParam.getSurl())) && !(!a0.LJJJIL(hybridSchemaParam.getUrl()))) {
            iIntValue = 1;
        } else {
            iIntValue = 0;
        }
        Boolean waitGeckoUpdate = hybridSchemaParam.getWaitGeckoUpdate();
        if ((waitGeckoUpdate == null || !waitGeckoUpdate.booleanValue()) && !C1533400q0Q.LIZ(iIntValue)) {
            z = false;
        }
        requestParams.waitGeckoUpdate = z;
        requestParams.cdnRegionRedirect = hybridSchemaParam.getCdnRegionRedirect();
        requestParams.waitLowStorageUpdate = hybridSchemaParam.getWaitLowStorageUpdate();
        requestParams.geckoUrlRedirect = hybridSchemaParam.getGeckoUrlRedirection();
        requestParams.redirectRegions = a0.LJJLIIIJILLIZJL(hybridSchemaParam.getRedirectRegions(), new String[]{","}, 0, 6);
    }

    public static void LJIIL(RequestParamsX requestParamsX, HybridSchemaParam hybridSchemaParam) {
        int iIntValue;
        if (hybridSchemaParam == null) {
            return;
        }
        Boolean disableCDN = hybridSchemaParam.getDisableCDN();
        if (disableCDN != null) {
            requestParamsX.disableCdn = disableCDN.booleanValue();
        }
        Boolean disableBuiltin = hybridSchemaParam.getDisableBuiltin();
        if (disableBuiltin != null) {
            requestParamsX.disableAssets = disableBuiltin.booleanValue();
        }
        Boolean disableGeckoUpdate = hybridSchemaParam.getDisableGeckoUpdate();
        if (disableGeckoUpdate != null) {
            requestParamsX.disableGeckoUpdate = disableGeckoUpdate.booleanValue();
        }
        Boolean disableOffline = hybridSchemaParam.getDisableOffline();
        if (disableOffline != null || (disableOffline = hybridSchemaParam.getDisableGecko()) != null) {
            requestParamsX.disableGecko = disableOffline.booleanValue();
        }
        Boolean onlyLocal = hybridSchemaParam.getOnlyLocal();
        if (onlyLocal != null) {
            requestParamsX.onlyLocal = onlyLocal.booleanValue();
        }
        Boolean enableMemoryCache = hybridSchemaParam.getEnableMemoryCache();
        if (enableMemoryCache != null) {
            requestParamsX.enableMemoryCache = enableMemoryCache.booleanValue();
        }
        Integer dynamic = hybridSchemaParam.getDynamic();
        boolean z = true;
        if (dynamic != null) {
            iIntValue = dynamic.intValue();
        } else if (!(!a0.LJJJIL(hybridSchemaParam.getFallbackUrl())) && !(!a0.LJJJIL(hybridSchemaParam.getSurl())) && !(!a0.LJJJIL(hybridSchemaParam.getUrl()))) {
            iIntValue = 1;
        } else {
            iIntValue = 0;
        }
        Boolean waitGeckoUpdate = hybridSchemaParam.getWaitGeckoUpdate();
        if ((waitGeckoUpdate == null || !waitGeckoUpdate.booleanValue()) && !C1533400q0Q.LIZ(iIntValue)) {
            z = false;
        }
        requestParamsX.waitGeckoUpdate = z;
        requestParamsX.cdnRegionRedirect = hybridSchemaParam.getCdnRegionRedirect();
        requestParamsX.waitLowStorageUpdate = hybridSchemaParam.getWaitLowStorageUpdate();
        requestParamsX.geckoUrlRedirect = hybridSchemaParam.getGeckoUrlRedirection();
        requestParamsX.redirectRegions = a0.LJJLIIIJILLIZJL(hybridSchemaParam.getRedirectRegions(), new String[]{","}, 0, 6);
    }

    public static String LIZJ(HybridSchemaParam hybridSchemaParam, String str, boolean z) {
        if (str != null && u.LJJIIJZLJL(str, "http", false)) {
            return str;
        }
        if (z) {
            if (!a0.LJJJIL(hybridSchemaParam.getUrl())) {
                return hybridSchemaParam.getUrl();
            }
            if (!a0.LJJJIL(hybridSchemaParam.getSurl())) {
                return hybridSchemaParam.getSurl();
            }
            return "";
        }
        if (!a0.LJJJIL(hybridSchemaParam.getUrl())) {
            return hybridSchemaParam.getUrl();
        }
        if (!a0.LJJJIL(hybridSchemaParam.getSurl())) {
            return hybridSchemaParam.getSurl();
        }
        return hybridSchemaParam.getFallbackUrl();
    }

    public static String LIZLLL(Uri uri, Object obj, String str) {
        Integer numLJIIJJI;
        String str2;
        Integer numLJIIJJI2;
        String str3;
        Uri uri2 = uri;
        if (u.LJJIIJZLJL(str, "http", false)) {
            return str;
        }
        if (uri2 == null) {
            uri2 = UriProtector.parse(str);
        }
        if (obj instanceof RequestParamsX) {
            RequestParamsX requestParamsX = (RequestParamsX) obj;
            String strLIZIZ = C1942307jB.LIZIZ(uri2, "disable_builtin");
            if (strLIZIZ != null) {
                requestParamsX.disableAssets = Intrinsics.LJFF(strLIZIZ, "1");
            }
            String strLIZIZ2 = C1942307jB.LIZIZ(uri2, "disable_offline");
            if (strLIZIZ2 != null) {
                requestParamsX.disableGecko = Intrinsics.LJFF(strLIZIZ2, "1");
            }
            String strLIZIZ3 = C1942307jB.LIZIZ(uri2, "disable_gecko");
            if (strLIZIZ3 != null) {
                requestParamsX.disableGecko = Intrinsics.LJFF(strLIZIZ3, "1");
            }
            String strLIZIZ4 = C1942307jB.LIZIZ(uri2, "disable_gecko_update");
            if (strLIZIZ4 != null) {
                requestParamsX.disableGeckoUpdate = Intrinsics.LJFF(strLIZIZ4, "1");
            }
            String strLIZIZ5 = C1942307jB.LIZIZ(uri2, "disable_cdn");
            if (strLIZIZ5 != null) {
                requestParamsX.disableCdn = Intrinsics.LJFF(strLIZIZ5, "1");
            }
            String strLIZIZ6 = C1942307jB.LIZIZ(uri2, "only_local");
            if (strLIZIZ6 != null) {
                requestParamsX.onlyLocal = Intrinsics.LJFF(strLIZIZ6, "1");
            }
            String strLIZIZ7 = C1942307jB.LIZIZ(uri2, "enable_memory_cache");
            if (strLIZIZ7 != null) {
                requestParamsX.enableMemoryCache = Intrinsics.LJFF(strLIZIZ7, "1");
            }
            String strLIZIZ8 = C1942307jB.LIZIZ(uri2, "wait_gecko_update");
            if (strLIZIZ8 != null) {
                requestParamsX.waitGeckoUpdate = Intrinsics.LJFF(strLIZIZ8, "1");
            } else {
                String strLIZIZ9 = C1942307jB.LIZIZ(uri2, "dynamic");
                if (strLIZIZ9 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(strLIZIZ9)) != null) {
                    requestParamsX.waitGeckoUpdate = C1533400q0Q.LIZ(numLJIIJJI2.intValue());
                }
            }
            String str4 = requestParamsX.accessKey;
            if (str4 == null || a0.LJJJIL(str4)) {
                String strLIZIZ10 = C1942307jB.LIZIZ(uri2, "accessKey");
                if (strLIZIZ10 == null && (strLIZIZ10 = C1942307jB.LIZIZ(uri2, "access_key")) == null) {
                    strLIZIZ10 = "";
                }
                requestParamsX.accessKey = strLIZIZ10;
            }
            String str5 = requestParamsX.channel;
            if (str5 == null || str5.length() == 0 || (str3 = requestParamsX.bundle) == null || str3.length() == 0) {
                String strLIZIZ11 = C1942307jB.LIZIZ(uri2, "channel");
                String strLIZIZ12 = C1942307jB.LIZIZ(uri2, "bundle");
                if (strLIZIZ11 != null && strLIZIZ11.length() != 0 && strLIZIZ12 != null && strLIZIZ12.length() != 0) {
                    requestParamsX.channel = strLIZIZ11;
                    requestParamsX.bundle = strLIZIZ12;
                }
            }
            String strLIZIZ13 = C1942307jB.LIZIZ(uri2, "redirect_cdn_by_region");
            if (strLIZIZ13 != null) {
                requestParamsX.cdnRegionRedirect = Intrinsics.LJFF(strLIZIZ13, "1");
            }
            String strLIZIZ14 = C1942307jB.LIZIZ(uri2, "gecko_url_redirection");
            if (strLIZIZ14 != null) {
                requestParamsX.geckoUrlRedirect = Intrinsics.LJFF(strLIZIZ14, "1");
            }
            String strLIZIZ15 = C1942307jB.LIZIZ(uri2, "redirect_regions");
            if (strLIZIZ15 != null) {
                requestParamsX.redirectRegions = a0.LJJLIIIJILLIZJL(strLIZIZ15, new String[]{","}, 0, 6);
            }
        } else if (obj instanceof RequestParams) {
            RequestParams requestParams = (RequestParams) obj;
            String strLIZIZ16 = C1942307jB.LIZIZ(uri2, "disable_builtin");
            if (strLIZIZ16 != null) {
                requestParams.disableBuiltin = Intrinsics.LJFF(strLIZIZ16, "1");
            }
            String strLIZIZ17 = C1942307jB.LIZIZ(uri2, "disable_offline");
            if (strLIZIZ17 != null) {
                requestParams.disableOffline = Intrinsics.LJFF(strLIZIZ17, "1");
            }
            String strLIZIZ18 = C1942307jB.LIZIZ(uri2, "disable_gecko");
            if (strLIZIZ18 != null) {
                requestParams.disableOffline = Intrinsics.LJFF(strLIZIZ18, "1");
            }
            String strLIZIZ19 = C1942307jB.LIZIZ(uri2, "disable_gecko_update");
            if (strLIZIZ19 != null) {
                requestParams.disableGeckoUpdate = Intrinsics.LJFF(strLIZIZ19, "1");
            }
            String strLIZIZ20 = C1942307jB.LIZIZ(uri2, "disable_cdn");
            if (strLIZIZ20 != null) {
                requestParams.disableCdn = Intrinsics.LJFF(strLIZIZ20, "1");
            }
            String strLIZIZ21 = C1942307jB.LIZIZ(uri2, "only_local");
            if (strLIZIZ21 != null) {
                requestParams.onlyLocal = Intrinsics.LJFF(strLIZIZ21, "1");
            }
            String strLIZIZ22 = C1942307jB.LIZIZ(uri2, "enable_memory_cache");
            if (strLIZIZ22 != null) {
                requestParams.enableMemoryCache = Boolean.valueOf(Intrinsics.LJFF(strLIZIZ22, "1"));
            }
            String strLIZIZ23 = C1942307jB.LIZIZ(uri2, "wait_gecko_update");
            if (strLIZIZ23 != null) {
                requestParams.waitGeckoUpdate = Intrinsics.LJFF(strLIZIZ23, "1");
            } else {
                String strLIZIZ24 = C1942307jB.LIZIZ(uri2, "dynamic");
                if (strLIZIZ24 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strLIZIZ24)) != null) {
                    requestParams.waitGeckoUpdate = C1533400q0Q.LIZ(numLJIIJJI.intValue());
                }
            }
            if (requestParams.accessKey.length() == 0) {
                String strLIZIZ25 = C1942307jB.LIZIZ(uri2, "accessKey");
                if (strLIZIZ25 == null && (strLIZIZ25 = C1942307jB.LIZIZ(uri2, "access_key")) == null) {
                    strLIZIZ25 = "";
                }
                requestParams.accessKey = strLIZIZ25;
            }
            String str6 = requestParams.channel;
            if (str6 == null || str6.length() == 0 || (str2 = requestParams.bundle) == null || str2.length() == 0) {
                String strLIZIZ26 = C1942307jB.LIZIZ(uri2, "channel");
                String strLIZIZ27 = C1942307jB.LIZIZ(uri2, "bundle");
                if (strLIZIZ26 != null && strLIZIZ26.length() != 0 && strLIZIZ27 != null && strLIZIZ27.length() != 0) {
                    requestParams.channel = strLIZIZ26;
                    requestParams.bundle = strLIZIZ27;
                }
            }
            String strLIZIZ28 = C1942307jB.LIZIZ(uri2, "redirect_cdn_by_region");
            if (strLIZIZ28 != null) {
                requestParams.cdnRegionRedirect = Intrinsics.LJFF(strLIZIZ28, "1");
            }
            String strLIZIZ29 = C1942307jB.LIZIZ(uri2, "gecko_url_redirection");
            if (strLIZIZ29 != null) {
                requestParams.geckoUrlRedirect = Intrinsics.LJFF(strLIZIZ29, "1");
            }
            String strLIZIZ30 = C1942307jB.LIZIZ(uri2, "redirect_regions");
            if (strLIZIZ30 != null) {
                requestParams.redirectRegions = a0.LJJLIIIJILLIZJL(strLIZIZ30, new String[]{","}, 0, 6);
            }
        }
        String strLIZIZ31 = C1942307jB.LIZIZ(uri2, "url");
        if (strLIZIZ31 == null && (strLIZIZ31 = C1942307jB.LIZIZ(uri2, "surl")) == null && (strLIZIZ31 = C1942307jB.LIZIZ(uri2, "res_url")) == null) {
            return "";
        }
        return strLIZIZ31;
    }

    public static void LJII(JSONObject jSONObject, C1532310pyf c1532310pyf, long j, long j2) throws JSONException {
        String str;
        jSONObject.put("res_from", c1532310pyf.LJIIJJI);
        jSONObject.put("is_memory", c1532310pyf.LIZLLL);
        jSONObject.put("res_version", c1532310pyf.LJIIIZ());
        C1529350ptt c1529350ptt = c1532310pyf.LIZ.LJJIIJ;
        String str2 = null;
        if (c1529350ptt != null) {
            str = c1529350ptt.LIZIZ;
        } else {
            str = null;
        }
        jSONObject.put("gecko_channel", str);
        C1529350ptt c1529350ptt2 = c1532310pyf.LIZ.LJJIIJ;
        if (c1529350ptt2 != null) {
            str2 = c1529350ptt2.LIZJ;
        }
        jSONObject.put("gecko_bundle", str2);
        jSONObject.put("res_load_cost", j2 - j);
        Long lValueOf = Long.valueOf(jSONObject.optLong("container_init_cost"));
        if (0 != lValueOf.longValue()) {
            jSONObject.put("container_init_cost", j - lValueOf.longValue());
        }
    }

    public static void LJIILJJIL(String str, String str2, String str3, String str4, boolean z) throws JSONException {
        String str5;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", str);
        if (str2 != null) {
            jSONObject.put("content-type", str2);
        }
        if (z) {
            str5 = "blocked";
        } else {
            str5 = "pass";
        }
        jSONObject.put("state", str5);
        C1520360pfO c1520360pfO = new C1520360pfO("tiktok_font_request");
        c1520360pfO.LIZIZ = str3;
        c1520360pfO.LIZ = str;
        c1520360pfO.LJIIIIZZ = str4;
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
        C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
        C1520200pf8.LIZ.getClass();
        C1520200pf8.LIZ(c1520350pfNLIZ);
    }

    public static void LJI(String str, JSONObject jSONObject, C1533790q13 c1533790q13, long j, long j2, boolean z) throws JSONException {
        boolean z2;
        JSONArray jSONArray;
        if (!z && (jSONArray = LIZ) != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = JSONArrayProtectorUtils.getString(jSONArray, i);
                if (a0.LJJIIZI(str, string, false) || Intrinsics.LJFF(string, "*")) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        if (z2) {
            jSONObject.put("res_from", c1533790q13.LJII(c1533790q13.LJ));
            jSONObject.put("is_memory", Intrinsics.LJFF(c1533790q13.LJ, "memory"));
        } else if (Intrinsics.LJFF(c1533790q13.LJ, "memory")) {
            jSONObject.put("is_memory", 1);
            jSONObject.put("res_from", c1533790q13.LJII(c1533790q13.LJFF));
        } else {
            jSONObject.put("is_memory", 0);
            jSONObject.put("res_from", c1533790q13.LJII(c1533790q13.LJ));
        }
        jSONObject.put("res_version", c1533790q13.LJIIIZ);
        jSONObject.put("gecko_channel", c1533790q13.LIZ.LJJJJLI.LIZIZ);
        jSONObject.put("gecko_bundle", c1533790q13.LIZ.LJJJJLI.LIZJ);
        jSONObject.put("res_load_cost", j2 - j);
        Long lValueOf = Long.valueOf(jSONObject.optLong("container_init_cost"));
        if (0 != lValueOf.longValue()) {
            jSONObject.put("container_init_cost", j - lValueOf.longValue());
        }
    }
}
