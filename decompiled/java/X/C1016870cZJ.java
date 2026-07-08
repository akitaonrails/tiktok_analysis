package X;

import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.offline.vm.ads.preview.service.IVMPreviewAdsOfflineService;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.AwS0S3001000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0cZJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1016870cZJ {
    public static void LIZJ(Aweme aweme, EnumC1018180cbQ enumC1018180cbQ) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportNoDownload reason=");
        sbLIZ.append(enumC1018180cbQ);
        C1022620cia.LIZ("TopViewMultiContent", C2188811AlT.LIZIZ(sbLIZ));
        new TopViewAdEventLogger().logAd(C1018060cbE.LJ, aweme.getAwemeRawAd(), new AwS595S0100000_16(enumC1018180cbQ, 216));
    }

    public static void LIZIZ(final String str, final String str2, final String str3, final String str4, IVMPreviewAdsOfflineService iVMPreviewAdsOfflineService, final TopViewAdEventLogger topViewAdEventLogger, final Aweme aweme) {
        iVMPreviewAdsOfflineService.isEnabled();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("download success name =");
        sbLIZ.append(str3);
        C1022620cia.LIZ("TopViewMultiContent", C2188811AlT.LIZIZ(sbLIZ));
        C15O7.LIZJ(new Callable() { // from class: X.0cZL
            @Override // java.util.concurrent.Callable
            public final Object call() throws JSONException {
                C1C7U.LIZ("TopViewMultiContentHelper@c54a.onDownloadSuccess$1");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str2);
                sbLIZ2.append(str3);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                long jLIZJ = C1293980jmG.LIZJ(strLIZIZ);
                int i = C0BSL.LIZ;
                if (i > 0) {
                    if (jLIZJ < i && c0vsj.exists()) {
                        c0vsj.delete();
                    }
                    TopViewAdEventLogger topViewAdEventLogger2 = topViewAdEventLogger;
                    C1018060cbE.LIZ.getClass();
                    topViewAdEventLogger2.logAd(C1018060cbE.LIZJ, new C1016900cZM(str, str4, jLIZJ));
                    C1018230cbV.LIZ(aweme, -1, null, str, true);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TopViewMultiContentHelper@c54a.onDownloadSuccess$1");
                return unit;
            }
        });
    }

    public static void LIZ(String str, String str2, String str3, String str4, IVMPreviewAdsOfflineService iVMPreviewAdsOfflineService, TopViewAdEventLogger topViewAdEventLogger, Aweme aweme, int i, String str5) throws JSONException {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("download failed name =");
        sbLIZ.append(str3);
        sbLIZ.append(",errorCode = ");
        sbLIZ.append(i);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(str5);
        C1022620cia.LIZ("TopViewMultiContent", C2188811AlT.LIZIZ(sbLIZ));
        topViewAdEventLogger.logAd(C1018060cbE.LIZLLL, new AwS0S3001000_16(str, str4, i, str5, 1));
        iVMPreviewAdsOfflineService.isEnabled();
        if (i == 1034) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append(str3);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            if (strLIZIZ != null && strLIZIZ.length() != 0) {
                C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                if (c0vsj.exists()) {
                    c0vsj.delete();
                }
            }
        }
        C1018230cbV.LIZ(aweme, Integer.valueOf(i), str5, str, false);
    }
}
