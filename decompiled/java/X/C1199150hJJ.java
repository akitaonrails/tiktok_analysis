package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.claim.model.AccountShop;
import com.ss.android.ugc.aweme.poi.claim.model.PoiClaimSearchRequest;
import com.ss.android.ugc.aweme.poi.experiment.PoiClaimCountryConfig;
import com.ss.android.ugc.aweme.poi.experiment.PoiExpandScopeMetaDataExp;
import com.ss.android.ugc.aweme.poi.model.PoiSearchRequestBody;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiEnableExperiment;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hJJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1199150hJJ {
    public static String LIZIZ(long j) {
        C844470XAv.LIZ.getClass();
        return C2084808Es.LIZ(String.valueOf(C844470XAv.LJIIJ) + PoiEnableExperiment.LIZIZ() + j);
    }

    public static PoiClaimSearchRequest LIZ(long j, C1199140hJI c1199140hJI) {
        C1199590hK1 c1199590hK1LIZIZ;
        String appLanguage;
        Long lValueOf;
        int i;
        int iIntValue;
        List<PoiClaimCountryConfig.PoiClaimCountryItem> list;
        PoiClaimCountryConfig.PoiClaimCountryItem next;
        Integer num;
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
        PoiExpandScopeMetaDataExp.LIZ.getClass();
        if (PoiExpandScopeMetaDataExp.LIZ()) {
            linkedHashMap.put("encrypt_meta_location", C1279604za.LIZ(c1199140hJI.LIZJ));
        }
        C1186030gy9.LIZ(new AwS562S0100000_18(linkedHashMap, (Map<String, Object>) 874));
        String strLIZ = C2088308Gb.LIZ(C2365509Or.LJ(linkedHashMap));
        C1367960lha.LIZ.getClass();
        String strLIZIZ = C1367960lha.LIZIZ();
        IAVSettingService iAVSettingService = (IAVSettingService) PluggableExtentionKt.pluggableSpi$default(IAVSettingService.class, false, false, false, 14, null);
        if (iAVSettingService != null) {
            appLanguage = iAVSettingService.getAppLanguage();
        } else {
            appLanguage = null;
        }
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
        int i2 = C844470XAv.LJIIJ;
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
        PoiClaimSearchRequest poiClaimSearchRequest = new PoiClaimSearchRequest(new PoiSearchRequestBody(strLIZIZ, appLanguage, str2, j2, j3, j4, 0, i2, strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, strValueOf, "1.2.0-rc.5", j, z ? 1 : 0, 0, 4, strLIZ2, strLIZ, lValueOf, c1199140hJI.LJIIJ, c1199140hJI.LJIIJJI, c1199140hJI.LJIIL, c1199140hJI.LJIILIIL, c1199140hJI.LJIILJJIL, null, c1199140hJI.LJIILLIIL, c1199140hJI.LJIIZILJ, null, null, null, null));
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        int i3 = 1;
        if (iLocationBaseServiceForMT != null && true == iLocationBaseServiceForMT.LJ(C844470XAv.LIZ())) {
            i = 1;
        } else {
            i = 0;
        }
        poiClaimSearchRequest.setSystemIsPrecise(i);
        if (iLocationBaseServiceForMT == null || true != iLocationBaseServiceForMT.LJJIJ()) {
            i3 = 0;
        }
        poiClaimSearchRequest.setInAppIsPrecise(i3);
        String strLIZIZ2 = C1367960lha.LIZIZ();
        C01GW c01gw = PoiClaimCountryConfig.LIZIZ;
        PoiClaimCountryConfig.PoiClaimCountryModel poiClaimCountryModel = (PoiClaimCountryConfig.PoiClaimCountryModel) c01gw.getValue();
        if (poiClaimCountryModel != null) {
            iIntValue = poiClaimCountryModel.f74default;
        } else {
            iIntValue = 1643084;
        }
        PoiClaimCountryConfig.PoiClaimCountryModel poiClaimCountryModel2 = (PoiClaimCountryConfig.PoiClaimCountryModel) c01gw.getValue();
        if (poiClaimCountryModel2 != null && (list = poiClaimCountryModel2.countryList) != null) {
            Iterator<PoiClaimCountryConfig.PoiClaimCountryItem> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.country, strLIZIZ2)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PoiClaimCountryConfig.PoiClaimCountryItem poiClaimCountryItem = next;
            if (poiClaimCountryItem != null && (num = poiClaimCountryItem.code) != null) {
                iIntValue = num.intValue();
            }
        }
        poiClaimSearchRequest.setAccountShop(new AccountShop(Integer.valueOf(iIntValue), c1199140hJI.LJIJJLI, c1199140hJI.LJIL, c1199140hJI.LJJ));
        return poiClaimSearchRequest;
    }
}
