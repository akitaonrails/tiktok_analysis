package X;

import Y.AkS472S0100000_8;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.metrics.MinisMetricsNetworkResponse;
import com.ss.android.ugc.aweme.minis.model.metrics.MinisMetricsRequest;
import com.ss.android.ugc.aweme.minis.model.metrics.MinisMetricsResponse;
import com.ss.android.ugc.aweme.minis.request.IMetricsApi;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0iBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1232830iBd {
    public static final C1232830iBd LIZ = new C1232830iBd();
    public static final IMetricsApi LIZIZ;

    static {
        IMetricsApi.LIZ.getClass();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("url host:");
        String str = C0CQT.LIZJ;
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        Gson gsonLIZ = new e().LIZ();
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(str);
        c1499850p8JCreateBuilder.LIZJ(new C2336109Dj(gsonLIZ));
        LIZIZ = (IMetricsApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(IMetricsApi.class);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, com.ss.android.ugc.aweme.minis.model.metrics.MinisMetricsNetworkResponse] */
    public static void LIZ(String str, String str2, String str3, String str4, Map map, Map map2, EnumC1236600iHi enumC1236600iHi, EnumC21632119lH enumC21632119lH, EnumC19415410xc enumC19415410xc) {
        String str5;
        int i = C2187451AjH.LIZ;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new MinisMetricsNetworkResponse(null, -1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        MinisMetaResp minisMetaResp = C2195221Avo.LJIIJ;
        if (minisMetaResp == null || (str5 = minisMetaResp.minisCategory) == null) {
            str5 = "";
        }
        linkedHashMap.put("minis_category", str5);
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        MinisMetricsRequest minisMetricsRequest = new MinisMetricsRequest(str, str2, str3, enumC1236600iHi.getValue(), enumC21632119lH.getValue(), str4, map, linkedHashMap, enumC19415410xc.getValue());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doSendMetricsData, request:");
        sbLIZ.append(minisMetricsRequest);
        C2188811AlT.LIZIZ(sbLIZ);
        AbstractC19484711Kz.LJIJJ(LIZIZ.reportMetrics(minisMetricsRequest)).LJIIZILJ(new AkS472S0100000_8(c259800zU, 15)).LJJI(new InterfaceC1487280oo2() { // from class: X.01Sn
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                String string;
                Throwable th = (Throwable) obj;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("doSendMetricsData, error occurred, cause:");
                Throwable cause = th.getCause();
                if (cause != null) {
                    string = cause.toString();
                } else {
                    string = null;
                }
                sbLIZ2.append(string);
                C2188811AlT.LIZIZ(sbLIZ2);
                return AbstractC19484711Kz.LJIILLIIL(th);
            }
        }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<MinisMetricsNetworkResponse<MinisMetricsResponse>>() { // from class: X.0LEM
            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("reportServerMetrics, onError:");
                sbLIZ2.append(th);
                C2188811AlT.LIZIZ(sbLIZ2);
                new MinisMetricsNetworkResponse(null, -1);
            }

            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                int i2 = C2187451AjH.LIZ;
            }

            @Override // X.InterfaceC19474811He
            public final void onSuccess(MinisMetricsNetworkResponse<MinisMetricsResponse> minisMetricsNetworkResponse) {
                int i2 = C2187451AjH.LIZ;
                Integer num = minisMetricsNetworkResponse.errorCode;
                if (num != null) {
                    num.intValue();
                }
            }
        });
    }
}
