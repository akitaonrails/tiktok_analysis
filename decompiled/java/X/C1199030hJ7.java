package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.model.PoiSearchRequestBody;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiEnableExperiment;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0hJ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1199030hJ7 {
    public static final /* synthetic */ C1199030hJ7 LIZ = new C1199030hJ7();

    public static String LIZLLL(long j) {
        C844470XAv.LIZ.getClass();
        return C2084808Es.LIZ(String.valueOf(C844470XAv.LJIIJ) + PoiEnableExperiment.LIZIZ() + j);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.poi.creator.PoiCreatorApi.PoiCreatorBaseConfigResponse> r17) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1199030hJ7.LIZ(X.05Vn):java.lang.Object");
    }

    public static PoiSearchRequestBody LIZJ(long j, C1199140hJI c1199140hJI) {
        C1199590hK1 c1199590hK1LIZIZ;
        Long lValueOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            double d = c1199140hJI.LIZIZ;
            double d2 = c1199140hJI.LIZ;
            TokenCert tokenCertWith = TokenCert.Companion.with("bpea-poi_search_encrypt_location_data");
            tokenCertWith.auth("hyqv");
            c1199590hK1LIZIZ = C839940WxE.LIZIZ(d, d2, tokenCertWith);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1199590hK1LIZIZ = null;
        }
        if (c1199590hK1LIZIZ != null && !C305410By7.LIZ) {
            linkedHashMap.put("encrypt_location", c1199590hK1LIZIZ.LIZIZ + ',' + c1199590hK1LIZIZ.LIZ);
        } else {
            linkedHashMap.put("encrypt_location", "");
        }
        String str = c1199140hJI.LJ;
        if (str != null) {
            linkedHashMap.put("keywords", str);
        }
        String strLIZ = C2088308Gb.LIZ(C2365509Or.LJ(linkedHashMap));
        C1194110hBB.LIZ.getClass();
        C1194110hBB.LIZIZ = strLIZ;
        C1367960lha.LIZ.getClass();
        String strLIZIZ = C1367960lha.LIZIZ();
        String appLanguage = ((IAVSettingService) ServiceManager.get().getService(IAVSettingService.class)).getAppLanguage();
        String str2 = c1199140hJI.LJFF;
        long j2 = c1199140hJI.LIZLLL;
        long j3 = c1199140hJI.LJI;
        if (j3 <= 0) {
            j3 = 20;
        }
        long j4 = c1199140hJI.LJII;
        if (j4 <= 0) {
            j4 = 1;
        }
        C844470XAv.LIZ.getClass();
        int i = C844470XAv.LJIIJ;
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        String strValueOf = String.valueOf(C844470XAv.LJ());
        boolean z = c1199140hJI.LJIIIIZZ;
        String strLIZ2 = C292490BdH.LIZ();
        long j5 = c1199140hJI.LJIIIZ;
        if (j5 > 0) {
            lValueOf = Long.valueOf(j5);
        } else {
            lValueOf = null;
        }
        return new PoiSearchRequestBody(strLIZIZ, appLanguage, str2, j2, j3, j4, 0, i, strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, strValueOf, "1.2.0-rc.5", j, z ? 1 : 0, 0, 4, strLIZ2, strLIZ, lValueOf, c1199140hJI.LJIIJ, c1199140hJI.LJIIJJI, c1199140hJI.LJIIL, c1199140hJI.LJIILIIL, c1199140hJI.LJIILJJIL, c1199140hJI.LJIILL, null, null, null, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C1197660hGu r18, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.poi.creator.PoiCreatorApi.PoiCreatorPromoteStoresResponse> r19) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1199030hJ7.LIZIZ(X.0hGu, X.05Vn):java.lang.Object");
    }
}
