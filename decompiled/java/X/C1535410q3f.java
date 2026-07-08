package X;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.bytedance.forest.model.GeckoSource;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.forestx.RequestParamsX;
import java.io.File;
import java.io.InputStream;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS389S0200000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0q3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535410q3f implements InterfaceC1535500q3o {
    public final IResourceServiceX LIZ;
    public final C1530150pvB LIZIZ;

    public static C1532610pz9 LIZJ(C1533790q13 c1533790q13) {
        EnumC1535440q3i enumC1535440q3i;
        if (c1533790q13.LIZIZ) {
            if (c1533790q13.LJI) {
                enumC1535440q3i = EnumC1535440q3i.Offline;
            } else {
                enumC1535440q3i = EnumC1535440q3i.Online;
            }
            WebResourceResponse webResourceResponseLJIIL = c1533790q13.LJIIL(true);
            if (webResourceResponseLJIIL != null) {
                return new C1532610pz9(webResourceResponseLJIIL, enumC1535440q3i, c1533790q13.LJ);
            }
            return null;
        }
        return null;
    }

    public static C1532610pz9 LIZLLL(C1532310pyf c1532310pyf) {
        EnumC1535440q3i enumC1535440q3i;
        AbstractC1532350pyj<?> abstractC1532350pyjLJII;
        Object c098200Yq;
        if (!c1532310pyf.isSuccess()) {
            return null;
        }
        if (c1532310pyf.LJIIJ) {
            enumC1535440q3i = EnumC1535440q3i.Offline;
        } else {
            enumC1535440q3i = EnumC1535440q3i.Online;
        }
        if (c1532310pyf.LJFF != null && c1532310pyf.LJIIIIZZ(File.class) == null && c1532310pyf.LJIIIIZZ(byte[].class) == null && (abstractC1532350pyjLJII = c1532310pyf.LJII()) != null && (abstractC1532350pyjLJII.LIZ instanceof InputStream)) {
            try {
                c098200Yq = abstractC1532350pyjLJII.LIZIZ(c1532310pyf.LIZ);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        WebResourceResponse webResourceResponseLJIILIIL = c1532310pyf.LJIILIIL();
        if (webResourceResponseLJIILIIL == null) {
            return null;
        }
        return new C1532610pz9(webResourceResponseLJIILIIL, enumC1535440q3i, c1532310pyf.LJIIJJI);
    }

    public C1535410q3f(IResourceServiceX iResourceServiceX, C1530150pvB c1530150pvB) {
        this.LIZ = iResourceServiceX;
        this.LIZIZ = c1530150pvB;
    }

    @Override // X.InterfaceC1535500q3o
    public final InterfaceC1532650pzD LIZ(EnumC1535440q3i enumC1535440q3i, C1535560q3u c1535560q3u) {
        C1533790q13 c1533790q13LIZIZ;
        C1533020pzo c1533020pzoLJIILJJIL;
        C1532310pyf c1532310pyfLIZ;
        C1537480q70 c1537480q70 = this.LIZIZ.LIZ;
        if (c1537480q70 != null && (c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL(c1537480q70, false, null, 3)) != null) {
            Pair<String, RequestParamsX> pairLJFF = LJFF(c1535560q3u, enumC1535440q3i, c1537480q70);
            C1532970pzj c1532970pzjLIZIZ = c1533020pzoLJIILJJIL.LIZIZ(pairLJFF.getFirst(), pairLJFF.getSecond());
            if (c1532970pzjLIZIZ == null || (c1532310pyfLIZ = c1532970pzjLIZIZ.LIZ()) == null) {
                return null;
            }
            return LIZLLL(c1532310pyfLIZ);
        }
        Pair<String, RequestParams> pairLJ = LJ(c1535560q3u, enumC1535440q3i, c1537480q70);
        C1533910q1F c1533910q1FCreateSyncRequest = this.LIZ.createSyncRequest(pairLJ.getFirst(), pairLJ.getSecond());
        if (c1533910q1FCreateSyncRequest == null || (c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ()) == null) {
            return null;
        }
        return LIZJ(c1533790q13LIZIZ);
    }

    public final Pair<String, RequestParams> LJ(final InterfaceC1535470q3l interfaceC1535470q3l, EnumC1535440q3i enumC1535440q3i, C1537480q70 c1537480q70) {
        HybridSchemaParam hybridSchemaParam;
        String strLIZLLL;
        C1533760q10 c1533760q10;
        String str;
        String string = interfaceC1535470q3l.getUrl().toString();
        C1541480qDS c1541480qDS = this.LIZIZ.LIZIZ;
        C1533760q10 c1533760q102 = null;
        if (c1541480qDS != null) {
            hybridSchemaParam = c1541480qDS.LJIIL;
        } else {
            hybridSchemaParam = null;
        }
        RequestParams requestParams = new RequestParams(EnumC1533980q1M.WEB_CHILD_RESOURCE);
        requestParams.source = "PIA";
        int i = C1535430q3h.LIZ[enumC1535440q3i.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new C1954807lC();
                }
            } else {
                requestParams.disableOffline = true;
            }
        } else {
            requestParams.disableCdn = true;
        }
        requestParams.customParams.put("hybrid_channel", "PIA");
        if (c1537480q70 != null && (str = c1537480q70.containerId) != null) {
            requestParams.customParams.put("rl_container_uuid", str);
        }
        requestParams.needLocalFile = Boolean.FALSE;
        requestParams.enableProcessChain = true;
        requestParams.webResourceRequest = new WebResourceRequest() { // from class: X.0q3g
            @Override // android.webkit.WebResourceRequest
            public final String getMethod() {
                return "GET";
            }

            @Override // android.webkit.WebResourceRequest
            public final boolean hasGesture() {
                return false;
            }

            @Override // android.webkit.WebResourceRequest
            public final boolean isForMainFrame() {
                return false;
            }

            @Override // android.webkit.WebResourceRequest
            public final boolean isRedirect() {
                return false;
            }

            @Override // android.webkit.WebResourceRequest
            public final Map<String, String> getRequestHeaders() {
                return interfaceC1535470q3l.getRequestHeaders();
            }

            @Override // android.webkit.WebResourceRequest
            public final Uri getUrl() {
                return interfaceC1535470q3l.getUrl();
            }
        };
        if (hybridSchemaParam != null && (!a0.LJJJIL(hybridSchemaParam.getChannel())) && (!a0.LJJJIL(hybridSchemaParam.getBundle())) && a0.LJJIIZI(string, hybridSchemaParam.getChannel(), false) && a0.LJJIIZI(string, hybridSchemaParam.getBundle(), false)) {
            JSONArray jSONArray = C1533710q0v.LIZ;
            C1533710q0v.LJIIIIZZ(requestParams, hybridSchemaParam);
            strLIZLLL = C1533710q0v.LIZJ(hybridSchemaParam, string, false);
        } else {
            JSONArray jSONArray2 = C1533710q0v.LIZ;
            strLIZLLL = C1533710q0v.LIZLLL(null, requestParams, string);
        }
        if (!Intrinsics.LJFF(strLIZLLL, string)) {
            requestParams.customParams.put("resource_url", string);
        }
        if ((c1537480q70 == null || c1537480q70.mainDocumentGeckoInfo == null) && interfaceC1535470q3l.isForMainFrame()) {
            C1533720q0w.LJ(C1533720q0w.LIZ, strLIZLLL, c1537480q70);
        }
        if (interfaceC1535470q3l.isForMainFrame()) {
            requestParams.allowRedirectInternally = false;
            if (c1537480q70 != null && (c1533760q10 = c1537480q70.mainDocumentGeckoInfo) != null) {
                requestParams.accessKey = c1533760q10.LIZ;
                requestParams.bundle = c1533760q10.LIZJ;
                requestParams.channel = c1533760q10.LIZIZ;
                requestParams.geckoSource = GeckoSource.SPARK_MANIFEST;
            }
        } else {
            C1533720q0w c1533720q0w = C1533720q0w.LIZ;
            if (c1537480q70 != null) {
                c1533760q102 = c1537480q70.mainDocumentGeckoInfo;
            }
            c1533720q0w.getClass();
            C1533510q0b c1533510q0bLIZJ = C1533720q0w.LIZJ(strLIZLLL, c1533760q102);
            if (c1533510q0bLIZJ != null) {
                requestParams.accessKey = c1533510q0bLIZJ.LIZ;
                requestParams.bundle = c1533510q0bLIZJ.LIZJ;
                requestParams.channel = c1533510q0bLIZJ.LIZIZ;
                requestParams.geckoSource = GeckoSource.SPARK_MANIFEST;
            }
        }
        requestParams.netWorker = EnumC825980Wai.TTNet;
        return new Pair<>(strLIZLLL, requestParams);
    }

    public final Pair<String, RequestParamsX> LJFF(InterfaceC1535470q3l interfaceC1535470q3l, EnumC1535440q3i enumC1535440q3i, C1537480q70 c1537480q70) {
        HybridSchemaParam hybridSchemaParam;
        String strLIZLLL;
        String string = interfaceC1535470q3l.getUrl().toString();
        C1541480qDS c1541480qDS = this.LIZIZ.LIZIZ;
        if (c1541480qDS != null) {
            hybridSchemaParam = c1541480qDS.LJIIL;
        } else {
            hybridSchemaParam = null;
        }
        RequestParamsX requestParamsX = new RequestParamsX(EnumC1533980q1M.WEB_CHILD_RESOURCE, InputStream.class);
        requestParamsX.source = "PIA";
        requestParamsX.groupId = c1537480q70.containerId;
        int i = C1535430q3h.LIZ[enumC1535440q3i.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new C1954807lC();
                }
            } else {
                requestParamsX.disableGecko = true;
            }
        } else {
            requestParamsX.disableCdn = true;
        }
        requestParamsX.customParams = C2097608Jq.LJIIJ(new Pair("hybrid_channel", "PIA"), new Pair("rl_container_uuid", c1537480q70.containerId));
        requestParamsX.httpRequestHeaders = interfaceC1535470q3l.getRequestHeaders();
        if (hybridSchemaParam != null && (!a0.LJJJIL(hybridSchemaParam.getChannel())) && (!a0.LJJJIL(hybridSchemaParam.getBundle())) && a0.LJJIIZI(string, hybridSchemaParam.getChannel(), false) && a0.LJJIIZI(string, hybridSchemaParam.getBundle(), false)) {
            JSONArray jSONArray = C1533710q0v.LIZ;
            C1533710q0v.LJIIIZ(requestParamsX, hybridSchemaParam);
            strLIZLLL = C1533710q0v.LIZJ(hybridSchemaParam, string, false);
        } else {
            JSONArray jSONArray2 = C1533710q0v.LIZ;
            strLIZLLL = C1533710q0v.LIZLLL(null, requestParamsX, string);
        }
        if (c1537480q70.mainDocumentGeckoInfo == null && interfaceC1535470q3l.isForMainFrame()) {
            C1533720q0w.LJ(C1533720q0w.LIZ, strLIZLLL, c1537480q70);
        }
        if (interfaceC1535470q3l.isForMainFrame()) {
            requestParamsX.allowRedirectInternally = false;
            C1533760q10 c1533760q10 = c1537480q70.mainDocumentGeckoInfo;
            if (c1533760q10 != null) {
                requestParamsX.accessKey = c1533760q10.LIZ;
                requestParamsX.bundle = c1533760q10.LIZJ;
                requestParamsX.channel = c1533760q10.LIZIZ;
                requestParamsX.setGeckoSource(EnumC1507260pKG.SPARK_MANIFEST);
            }
        } else {
            C1533720q0w c1533720q0w = C1533720q0w.LIZ;
            C1533760q10 c1533760q102 = c1537480q70.mainDocumentGeckoInfo;
            c1533720q0w.getClass();
            C1533510q0b c1533510q0bLIZJ = C1533720q0w.LIZJ(strLIZLLL, c1533760q102);
            if (c1533510q0bLIZJ != null) {
                requestParamsX.accessKey = c1533510q0bLIZJ.LIZ;
                requestParamsX.bundle = c1533510q0bLIZJ.LIZJ;
                requestParamsX.channel = c1533510q0bLIZJ.LIZIZ;
                requestParamsX.setGeckoSource(EnumC1507260pKG.SPARK_MANIFEST);
            }
        }
        return new Pair<>(strLIZLLL, requestParamsX);
    }

    @Override // X.InterfaceC1535500q3o
    public final InterfaceC1542530qF9 LIZIZ(EnumC1535440q3i enumC1535440q3i, InterfaceC1535470q3l interfaceC1535470q3l, InterfaceC1530550pvp<InterfaceC1532650pzD> interfaceC1530550pvp, InterfaceC1530550pvp<Throwable> interfaceC1530550pvp2) {
        Object c098200Yq;
        C1533020pzo c1533020pzoLJIILJJIL;
        Object obj = null;
        try {
            C1537480q70 c1537480q70 = this.LIZIZ.LIZ;
            if (c1537480q70 != null && (c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL(c1537480q70, false, null, 3)) != null) {
                Pair<String, RequestParamsX> pairLJFF = LJFF(interfaceC1535470q3l, enumC1535440q3i, c1537480q70);
                final C1541080qCo<C1532310pyf> c1541080qCoLIZ = c1533020pzoLJIILJJIL.LIZ(pairLJFF.getFirst(), pairLJFF.getSecond(), new AwS389S0200000_23((InterfaceC1530550pvp) interfaceC1530550pvp, (InterfaceC1530550pvp<InterfaceC1532650pzD>) this, (C1535410q3f) 28));
                c098200Yq = new InterfaceC1542530qF9() { // from class: X.0q3j
                    @Override // X.InterfaceC1542530qF9
                    public final void release() {
                        C1541080qCo<C1532310pyf> c1541080qCo = c1541080qCoLIZ;
                        if (c1541080qCo != null) {
                            c1541080qCo.cancel();
                        }
                    }
                };
            } else {
                Pair<String, RequestParams> pairLJ = LJ(interfaceC1535470q3l, enumC1535440q3i, c1537480q70);
                final C1533910q1F c1533910q1FFetchResourceAsyncIfNeed = this.LIZ.fetchResourceAsyncIfNeed(pairLJ.getFirst(), pairLJ.getSecond(), new AwS389S0200000_23((InterfaceC1530550pvp) interfaceC1530550pvp, (InterfaceC1530550pvp<InterfaceC1532650pzD>) this, (C1535410q3f) 29));
                c098200Yq = new InterfaceC1542530qF9() { // from class: X.0q3k
                    @Override // X.InterfaceC1542530qF9
                    public final void release() {
                        C1533910q1F c1533910q1F = c1533910q1FFetchResourceAsyncIfNeed;
                        if (c1533910q1F != null) {
                            c1533910q1F.LIZ();
                        }
                    }
                };
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            interfaceC1530550pvp2.accept(thM5exceptionOrNullimpl);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (InterfaceC1542530qF9) obj;
    }
}
