package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.creative.model.MediaLocationMetaDataModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.experiment.PoiExpandScopeMetaDataExp;
import com.ss.android.ugc.aweme.poi.model.PoiSearchRequestBody;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiEnableExperiment;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0hJA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1199060hJA implements InterfaceC736910SvR<InterfaceC1197610hGp> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(314));
    public final C1199070hJB LLILLJJLI = new C1199070hJB(this);

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LLILLJJLI;
    }

    public static String LIZIZ(long j) {
        C844470XAv.LIZ.getClass();
        return C2084808Es.LIZ(String.valueOf(C844470XAv.LJIIJ) + PoiEnableExperiment.LIZIZ() + j);
    }

    public static PoiSearchRequestBody LIZ(long j, C1199140hJI c1199140hJI) {
        C1199590hK1 c1199590hK1LIZIZ;
        Long lValueOf;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            double d = c1199140hJI.LIZIZ;
            double d2 = c1199140hJI.LIZ;
            TokenCert tokenCertWith = TokenCert.Companion.with("bpea-poi_creator_encrypt_location_data");
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
        String str2 = c1199140hJI.LJ;
        if (str2 != null) {
            linkedHashMap.put("keywords", str2);
        }
        PoiExpandScopeMetaDataExp.LIZ.getClass();
        if (PoiExpandScopeMetaDataExp.LIZ()) {
            ArrayList arrayList = new ArrayList();
            List<MediaLocationMetaDataModel> list = c1199140hJI.LIZJ;
            if (list != null) {
                for (MediaLocationMetaDataModel mediaLocationMetaDataModel : list) {
                    if (mediaLocationMetaDataModel.encryptLatitude == null || mediaLocationMetaDataModel.encryptLongitude == null) {
                        str = "";
                    } else {
                        str = mediaLocationMetaDataModel.encryptLongitude + ',' + mediaLocationMetaDataModel.encryptLatitude;
                    }
                    arrayList.add(str);
                }
            }
            linkedHashMap.put("encrypt_meta_location", arrayList);
        }
        C1186030gy9.LIZ(new AwS562S0100000_18(linkedHashMap, (Map<String, Object>) 990));
        String strLIZ = C2088308Gb.LIZ(C2365509Or.LJ(linkedHashMap));
        C1367960lha.LIZ.getClass();
        String strLIZIZ = C1367960lha.LIZIZ();
        String appLanguage = ((IAVSettingService) ServiceManager.get().getService(IAVSettingService.class)).getAppLanguage();
        String str3 = c1199140hJI.LJFF;
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
        return new PoiSearchRequestBody(strLIZIZ, appLanguage, str3, j2, j3, j4, 0, i, strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, strValueOf, "1.2.0-rc.5", j, z ? 1 : 0, 0, 4, strLIZ2, strLIZ, lValueOf, c1199140hJI.LJIIJ, c1199140hJI.LJIIJJI, c1199140hJI.LJIIL, c1199140hJI.LJIILIIL, c1199140hJI.LJIILJJIL, c1199140hJI.LJIILL, null, null, null, null, null, null);
    }
}
