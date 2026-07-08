package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.task.dm.ldp.LDPCalculateParams;
import com.ss.android.ugc.aweme.legoImp.task.dm.ldp.URLUploadResponseBody;
import com.ss.android.ugc.aweme.legoImp.task.dm.ldp.UrlUploadServiceV2;
import com.tiktok.pns.ldp.api.model.FrequencyRequestParams;
import com.tiktok.pns.ldp.api.model.UnknownRequestParams;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WSj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823550WSj implements InterfaceC823540WSi {
    public static final C823550WSj LIZ = new C823550WSj();
    public static final Keva LIZIZ;
    public static final IRetrofitFactory LIZJ;
    public static final Gson LIZLLL;

    static {
        LIZIZ = LJIIIZ().LIZ ? Keva.getRepo("tiktok_pns_ldp_store_v2") : null;
        LIZJ = LJIIIZ().LIZ ? (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class) : null;
        LIZLLL = LJIIIZ().LIZ ? new Gson() : null;
    }

    @Override // X.InterfaceC823540WSi
    public final Set<String> LJ() {
        Set<String> allKey;
        Keva keva = LIZIZ;
        return (keva == null || (allKey = keva.getAllKey()) == null) ? C08CX.INSTANCE : allKey;
    }

    public static final C823580WSm LJIIIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        LDPCalculateParams lDPCalculateParams = C823510WSf.LIZ;
        LDPCalculateParams lDPCalculateParams2 = (LDPCalculateParams) settingsManagerLIZLLL.LJIIIIZZ("tiktok_pns_pet_ldp_config", LDPCalculateParams.class, lDPCalculateParams);
        if (lDPCalculateParams2 != null) {
            lDPCalculateParams = lDPCalculateParams2;
        }
        return new C823580WSm(lDPCalculateParams.enable, lDPCalculateParams.maxCacheSize, lDPCalculateParams.isUUIDUpload, lDPCalculateParams.eventSamplingMap);
    }

    @Override // X.InterfaceC823540WSi
    public final void LIZ(String str) {
        Keva keva = LIZIZ;
        if (keva != null) {
            keva.erase(str);
        }
    }

    @Override // X.InterfaceC823540WSi
    public final String LIZJ(Object obj) {
        String json;
        Gson gson = LIZLLL;
        if (gson == null || (json = GsonProtectorUtils.toJson(gson, obj)) == null) {
            return "";
        }
        return json;
    }

    @Override // X.InterfaceC823540WSi
    public final void LJFF(UnknownRequestParams unknownRequestParams) {
        InterfaceC2661011f interfaceC2661011fLIZ;
        UrlUploadServiceV2 urlUploadServiceV2;
        C0X9S<URLUploadResponseBody> unknownDataRequestBody;
        IRetrofitFactory iRetrofitFactory = LIZJ;
        if (iRetrofitFactory != null && (interfaceC2661011fLIZ = iRetrofitFactory.LIZ(C0CQT.LIZJ)) != null && (urlUploadServiceV2 = (UrlUploadServiceV2) interfaceC2661011fLIZ.create(UrlUploadServiceV2.class)) != null && (unknownDataRequestBody = urlUploadServiceV2.getUnknownDataRequestBody(unknownRequestParams)) != null) {
            unknownDataRequestBody.enqueue(new InterfaceC594300NSq<URLUploadResponseBody>() { // from class: X.0WSl
                @Override // X.InterfaceC594300NSq
                public final void onFailure(C0X9S<URLUploadResponseBody> c0x9s, Throwable th) {
                }

                @Override // X.InterfaceC594300NSq
                public final void onResponse(C0X9S<URLUploadResponseBody> c0x9s, C0X52<URLUploadResponseBody> c0x52) {
                }
            });
        }
    }

    @Override // X.InterfaceC823540WSi
    public final String LJIIIIZZ(String str) {
        String string;
        Keva keva = LIZIZ;
        if (keva == null || (string = keva.getString(str, "")) == null) {
            return "";
        }
        return string;
    }

    @Override // X.InterfaceC823540WSi
    public final void LIZIZ(String str, String str2) {
        Keva keva = LIZIZ;
        if (keva != null) {
            keva.storeString(str, str2);
        }
    }

    @Override // X.InterfaceC823540WSi
    public final <T> T LIZLLL(String str, Class<T> cls) {
        try {
            Gson gson = LIZLLL;
            if (gson != null) {
                return (T) gson.LJII(str, cls);
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC823540WSi
    public final void LJI(FrequencyRequestParams frequencyRequestParams, C823560WSk c823560WSk) {
        InterfaceC2661011f interfaceC2661011fLIZ;
        UrlUploadServiceV2 urlUploadServiceV2;
        C0X9S<URLUploadResponseBody> dataRequestBody;
        IRetrofitFactory iRetrofitFactory = LIZJ;
        if (iRetrofitFactory != null && (interfaceC2661011fLIZ = iRetrofitFactory.LIZ(C0CQT.LIZJ)) != null && (urlUploadServiceV2 = (UrlUploadServiceV2) interfaceC2661011fLIZ.create(UrlUploadServiceV2.class)) != null && (dataRequestBody = urlUploadServiceV2.getDataRequestBody(frequencyRequestParams)) != null) {
            dataRequestBody.enqueue(new C854750Xg1(c823560WSk, 1));
        }
    }

    @Override // X.InterfaceC823540WSi
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        C793770VBv.LJII("pns_ldp_perf_metric", jSONObject, jSONObject2, null);
    }
}
