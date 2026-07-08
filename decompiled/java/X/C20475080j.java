package X;

import Y.ARunnableS9S1100000_3;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ab.EcMobSpliceCheckNetworkInterceptConfigV2;
import com.ss.android.ugc.aweme.ecommerce.network.EcomPbRequestHandler;
import com.ss.android.ugc.aweme.ecommerce.preloader.experiment.ECCommonPreloadConfig;
import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadApiData;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourcePreloadModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS10S3100000_3;
import kotlin.jvm.internal.AwS247S0300000_3;
import kotlin.jvm.internal.AwS28S2000000_3;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.080j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20475080j extends C09AY implements Function0<ArrayList<InterfaceC2027307wt>> {
    public C20475080j() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ArrayList<InterfaceC2027307wt> invoke() {
        ArrayList<InterfaceC2027307wt> arrayList = new ArrayList<>();
        arrayList.add(EcomPbRequestHandler.LIZ);
        arrayList.add(new C1507680pKw());
        arrayList.add(new InterfaceC2027307wt() { // from class: X.07wr
            public static final /* synthetic */ int LIZ = 0;

            @Override // X.InterfaceC2027307wt
            public final boolean LIZIZ(String str, Request request, boolean z) {
                String url;
                String strLIZJ;
                String strLIZ;
                String url2 = request.getUrl();
                if (url2 != null && a0.LJJIIZI(url2, "ec_native_prefetch_multi", false) && (url = request.getUrl()) != null && (strLIZJ = C1946007jm.LIZJ(C1946007jm.LJ(url), "ec_native_prefetch_multi")) != null && strLIZJ.length() != 0 && (strLIZ = C1946207jo.LIZ(request)) != null && strLIZ.length() != 0) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC2027307wt
            public final void LJ(Map<String, ? extends Object> map, Request request, String str, boolean z, Object obj, List<C080U> list, C07WL c07wl) {
                String url;
                String strLIZJ;
                String strLIZ;
                if (request == null || (url = request.getUrl()) == null || (strLIZJ = C1946007jm.LIZJ(C1946007jm.LJ(url), "ec_native_prefetch_multi")) == null || strLIZJ.length() == 0 || strLIZJ == null || (strLIZ = C1946207jo.LIZ(request)) == null) {
                    return;
                }
                if (map == null) {
                    new AwS28S2000000_3(strLIZJ, str, 1);
                    C034Y.LIZ();
                } else {
                    new AwS10S3100000_3(strLIZJ, strLIZ, str, map, 1);
                    C034Y.LIZ();
                    ConcurrentHashMap<String, ConcurrentHashMap<String, C2124208Tw>> concurrentHashMap = C2123008Tk.LIZ;
                    C2123008Tk.LIZLLL.execute(new ARunnableS9S1100000_3(new C2124208Tw(strLIZ, str, System.currentTimeMillis(), map, obj, list), strLIZJ, 13));
                }
            }
        });
        if (!((Map) C20160313uT.LIZJ.getValue()).isEmpty()) {
            arrayList.add(new InterfaceC2027307wt() { // from class: X.080i
                @Override // X.InterfaceC2027307wt
                public final boolean LIZIZ(String str, Request request, boolean z) {
                    if (z) {
                        if (request.isResponseStreaming()) {
                            EcomResourcePreloadModel[] ecomResourcePreloadModelArr = C20160313uT.LIZ;
                            if (C20160313uT.LIZJ(request.getPath())) {
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    EcomResourceBystander.LIZ.getClass();
                    if (!request.isResponseStreaming()) {
                        String url = request.getUrl();
                        if (url != null && a0.LJJIIZI(url, "preload=1", false)) {
                            return false;
                        }
                        EcomResourcePreloadModel[] ecomResourcePreloadModelArr2 = C20160313uT.LIZ;
                        if (C20160313uT.LIZJ(request.getPath())) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }

                @Override // X.InterfaceC2027307wt
                public final void LJ(Map<String, ? extends Object> map, Request request, String str, boolean z, Object obj, List<C080U> list, C07WL c07wl) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    EcomResourceBystander ecomResourceBystander = EcomResourceBystander.LIZ;
                    String path = request.getPath();
                    Boolean boolValueOf = Boolean.valueOf(z);
                    ecomResourceBystander.getClass();
                    EcomResourceBystander.LJIILLIIL(map, path, boolValueOf, null, null);
                    if (jCurrentTimeMillis % ((long) 100) == 0) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        int i = C1505950pI9.LIZ;
                        C1505950pI9.LIZJ(jCurrentTimeMillis2 - jCurrentTimeMillis, "i_dispatch_handler_response_dur", request.getPath());
                    }
                }
            });
        }
        if (((ECCommonPreloadConfig) C20476080k.LIZIZ.getValue()).enable) {
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C2127208Va(null), 3);
            arrayList.add(new InterfaceC2027307wt() { // from class: X.080Z
                @Override // X.InterfaceC2027307wt
                public final boolean LIZIZ(String str, Request request, boolean z) {
                    if (z) {
                        if (request.isResponseStreaming() && C20466080a.LIZ().LIZIZ.LIZIZ().contains(str)) {
                            return true;
                        }
                        return false;
                    }
                    if (!request.isResponseStreaming()) {
                        C2130208We c2130208WeLIZ = C20466080a.LIZ();
                        String url = request.getUrl();
                        if (c2130208WeLIZ.LIZIZ.LIZIZ().contains(str) && (url == null || !a0.LJJIIZI(url, "preload=1", false))) {
                            return true;
                        }
                    }
                    return false;
                }

                @Override // X.InterfaceC2027307wt
                public final void LJ(Map<String, ? extends Object> map, Request request, String str, boolean z, Object obj, List<C080U> list, C07WL c07wl) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C2130208We c2130208WeLIZ = C20466080a.LIZ();
                    c2130208WeLIZ.getClass();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    C080X c080x = c2130208WeLIZ.LIZIZ;
                    if (c080x.LIZIZ().contains(str)) {
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        try {
                            ArrayList arrayListLIZ = C080X.LIZ(request, str);
                            if (!arrayListLIZ.isEmpty()) {
                                long jLIZLLL = C1743690vTb.LIZLLL(new AwS247S0300000_3((Map) map, (Map<String, ? extends Object>) c080x, (C080X) arrayListLIZ, (ArrayList<ECPreloadApiData>) 7));
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("ECPreloadApiConditionHandler.onPreloadIntercept  responseCostTime= ");
                                sbLIZ.append(jLIZLLL);
                                C2188811AlT.LIZIZ(sbLIZ);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C1019103yf.LIZ(EnumC1014603xw.ERR82, th, null);
                        }
                        if (jCurrentTimeMillis3 % ((long) 10) == 0) {
                            C1505950pI9.LIZJ(System.currentTimeMillis() - jCurrentTimeMillis3, "p_lynx_response_2", str);
                        }
                    }
                    long j = 100;
                    if (jCurrentTimeMillis2 % j == 0) {
                        C1505950pI9.LIZJ(System.currentTimeMillis() - jCurrentTimeMillis2, "p_native_response_async_n", str);
                    }
                    if (jCurrentTimeMillis % j == 0) {
                        long jCurrentTimeMillis4 = System.currentTimeMillis();
                        int i = C1505950pI9.LIZ;
                        C1505950pI9.LIZJ(jCurrentTimeMillis4 - jCurrentTimeMillis, "p_dispatch_handler_response_dur", request.getPath());
                    }
                }
            });
        }
        arrayList.add(new InterfaceC2027307wt() { // from class: X.07ws
            @Override // X.InterfaceC2027307wt
            public final boolean LIZIZ(String str, Request request, boolean z) {
                if (z && EcMobSpliceCheckNetworkInterceptConfigV2.LIZ(str) != null) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC2027307wt
            public final void LJ(Map<String, ? extends Object> map, Request request, String str, boolean z, Object obj, List<C080U> list, C07WL c07wl) {
                EcMobSpliceCheckNetworkInterceptConfigV2.InterceptConfig interceptConfigLIZ;
                if (map == null || (interceptConfigLIZ = EcMobSpliceCheckNetworkInterceptConfigV2.LIZ(request.getPath())) == null) {
                    return;
                }
                C080S.LIZ(interceptConfigLIZ, request, map);
            }
        });
        return arrayList;
    }
}
