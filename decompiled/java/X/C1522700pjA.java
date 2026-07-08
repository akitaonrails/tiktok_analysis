package X;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import com.bytedance.bpea.net3rd.api.I3rdNetworkIdentifier;
import com.bytedance.forest.experiments.ForestExperiment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.hybridkit.forest.ForestSecurityStrategy;
import com.ss.android.ugc.aweme.hybridkit.forest.TTNetRetrofitApi;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0pjA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522700pjA extends AbstractC1522670pj7 implements InterfaceC1502280pCE {
    public static final C1522700pjA LIZ = new C1522700pjA();

    public static Map LJ(AbstractC1522680pj8 abstractC1522680pj8) {
        boolean zLIZ;
        String str;
        boolean z = true;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("sandbox_add_dfid_in_forest", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            zLIZ = true;
        }
        if (zLIZ) {
            ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
            String str2 = "";
            if (iSparkHostApi == null || iSparkHostApi.LLIL() == null) {
                str = "";
            } else {
                str = "x-tt-dataflow-id";
            }
            Map<String, String> map = abstractC1522680pj8.LJ;
            if (map == null || !map.containsKey(str)) {
                z = false;
            }
            if (z) {
                Map<String, String> map2 = abstractC1522680pj8.LJ;
                if (map2 == null) {
                    return C2097608Jq.LJ();
                }
                return map2;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, String> mapLJ = abstractC1522680pj8.LJ;
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            linkedHashMap.putAll(mapLJ);
            ISparkHostApi iSparkHostApi2 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
            if (iSparkHostApi2 != null && iSparkHostApi2.LLIL() != null) {
                str2 = "671088653";
            }
            linkedHashMap.put(str, str2);
            return linkedHashMap;
        }
        Map<String, String> map3 = abstractC1522680pj8.LJ;
        if (map3 == null) {
            return C2097608Jq.LJ();
        }
        return map3;
    }

    @Override // X.AbstractC1522670pj7
    public final AbstractC1522730pjD LIZLLL(AbstractC1522680pj8 abstractC1522680pj8) {
        String str;
        String str2;
        int i;
        boolean z;
        C1522690pj9 c1522690pj9;
        C1537480q70 c1537480q70LJ;
        String str3 = abstractC1522680pj8.LIZ;
        C1E6N c1e6n = ((C1522690pj9) abstractC1522680pj8).LJIIJJI;
        Map<String, Object> mapLJ = abstractC1522680pj8.LIZJ;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C828420Wee c828420Wee = new C828420Wee(c1e6n, C1E6N.SparkSecuritySolutionEndpointRemoteServer, C1E6B.SparkSecuritySolutionChannelNetwork);
        C828590Wev.LIZLLL(c828420Wee, "URL", str3);
        Object obj = mapLJ.get("hybrid_channel");
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = "forest";
        }
        C828590Wev.LIZLLL(c828420Wee, "hybrid_channel", str);
        Object obj2 = mapLJ.get("source_location");
        if (!(obj2 instanceof String) || (str2 = (String) obj2) == null) {
            str2 = "com.ss.android.ugc.aweme.hybridkit.forest.ForestTTNetApi#get";
        }
        C828590Wev.LIZLLL(c828420Wee, "source_location", str2);
        Object obj3 = mapLJ.get("rl_container_uuid");
        if (obj3 != null) {
            String str4 = (String) obj3;
            C1529870puj.LIZ.getClass();
            InterfaceC1541990qEH interfaceC1541990qEHLJFF = C1529870puj.LJFF(str4);
            if ((interfaceC1541990qEHLJFF != null && (c1537480q70LJ = interfaceC1541990qEHLJFF.getHybridContext()) != null) || (c1537480q70LJ = C1529870puj.LJ(str4)) != null) {
                C828590Wev.LIZLLL(c828420Wee, "origin_url", C1520080pew.LIZIZ(c1537480q70LJ.LJIJI()));
            }
        }
        int iIntValue = 499;
        try {
            I3rdNetworkIdentifier i3rdNetworkIdentifier = (I3rdNetworkIdentifier) PluggableExtentionKt.pluggableSpi$default(I3rdNetworkIdentifier.class, false, false, false, 14, null);
            if (i3rdNetworkIdentifier != null && i3rdNetworkIdentifier.LIZ(abstractC1522680pj8.LIZ)) {
                i = 2;
            } else {
                C1522710pjB.LIZ.getClass();
                if (((ForestSecurityStrategy) C1522710pjB.LIZJ.getValue()).allowUntrustedZone && ((C1522690pj9) abstractC1522680pj8).LJIIIZ) {
                    i = 3;
                } else {
                    i = 0;
                }
            }
            C1499850p8J c1499850p8J = (C1499850p8J) C09S2.LIZIZ(abstractC1522680pj8.LIZ);
            c1499850p8J.LJIIIIZZ(i);
            c1499850p8J.LIZJ = true;
            TTNetRetrofitApi tTNetRetrofitApi = (TTNetRetrofitApi) c1499850p8J.build().retrofit.LIZ(TTNetRetrofitApi.class);
            C1493620oyG c1493620oyG = new C1493620oyG();
            c1493620oyG.LJIIIZ = true;
            c1493620oyG.LJIIZILJ = false;
            C1533590q0j.LIZ.getClass();
            c1493620oyG.LIZLLL = C1533590q0j.LJ;
            if (ForestExperiment.INSTANCE.getFollowTTNetRedirect() && ((C1522690pj9) abstractC1522680pj8).LJII) {
                z = true;
            } else {
                z = false;
            }
            c1493620oyG.LJIILLIIL = z;
            if (((C1522690pj9) abstractC1522680pj8).LJIIJ) {
                c1493620oyG.LJIIJJI = 1;
            }
            C0X9S<TypedInput> streamRequest = tTNetRetrofitApi.getStreamRequest(C828590Wev.LIZJ(abstractC1522680pj8.LIZ, c828420Wee), LJ(abstractC1522680pj8), c1493620oyG);
            if ((abstractC1522680pj8 instanceof C1522690pj9) && (c1522690pj9 = (C1522690pj9) abstractC1522680pj8) != null) {
                c1522690pj9.LJIIIIZZ = streamRequest;
            }
            return new C1522610pj1(streamRequest.execute(), abstractC1522680pj8);
        } catch (C1494430ozZ e) {
            TryCatchGuardChecker.doCheck(e);
            Integer numValueOf = Integer.valueOf(e.getStatusCode());
            if (numValueOf.intValue() != 0) {
                iIntValue = numValueOf.intValue();
            }
            HashMap map = new HashMap();
            String errorResponse = e.getErrorResponse();
            if (errorResponse == null) {
                errorResponse = e.getMessage();
            }
            return new C1522610pj1(iIntValue, map, abstractC1522680pj8, errorResponse);
        } catch (C1494690ozz e2) {
            TryCatchGuardChecker.doCheck(e2);
            Integer numValueOf2 = Integer.valueOf(e2.getStatusCode());
            if (numValueOf2.intValue() != 0) {
                iIntValue = numValueOf2.intValue();
            } else {
                Integer numValueOf3 = Integer.valueOf(e2.getCronetInternalErrorCode());
                if (numValueOf3.intValue() != 0) {
                    iIntValue = numValueOf3.intValue();
                }
            }
            return new C1522610pj1(iIntValue, new HashMap(), abstractC1522680pj8, e2.getMessage());
        }
    }

    @Override // X.AbstractC1522670pj7
    public final AbstractC1522680pj8 LIZIZ(WebResourceRequest webResourceRequest, C1534070q1V c1534070q1V) {
        Set<String> setKeySet;
        if (!u.LJIJI(webResourceRequest.getMethod(), "get", true)) {
            return null;
        }
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        if (requestHeaders != null && (setKeySet = requestHeaders.keySet()) != null && (setKeySet.contains("If-None-Match") || setKeySet.contains("If-Modified-Since"))) {
            return null;
        }
        String str = c1534070q1V.LJII.LIZLLL;
        String strLJJLL = a0.LJJLL('#', str, str);
        Map<String, String> requestHeaders2 = webResourceRequest.getRequestHeaders();
        if (requestHeaders2 == null) {
            requestHeaders2 = new HashMap<>();
        }
        return new C1522690pj9(strLJJLL, requestHeaders2, webResourceRequest, c1534070q1V);
    }

    @Override // X.AbstractC1522670pj7
    public final AbstractC1522680pj8 LIZJ(C1534070q1V c1534070q1V, Map<String, String> map) {
        String str = c1534070q1V.LJII.LIZLLL;
        return new C1522690pj9(a0.LJJLL('#', str, str), map, null, c1534070q1V);
    }

    @Override // X.InterfaceC1502280pCE
    public final InterfaceC1529320ptq LIZ(String str, Uri uri, Map<String, String> map, C1532710pzJ c1532710pzJ) {
        LinkedHashMap linkedHashMap;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        if (c1532710pzJ.LJIJ == EnumC1533980q1M.LYNX_TEMPLATE && ForestExperiment.INSTANCE.getAddCSRFHeadersForLynxMainTemplate()) {
            linkedHashMap.put("x-security-argus", "StaticResource/page/Spark");
        }
        return new C1522690pj9(str, uri, linkedHashMap, c1532710pzJ.LJ, c1532710pzJ.LIZJ, null, c1532710pzJ.LJIJ, c1532710pzJ.LIZ);
    }
}
