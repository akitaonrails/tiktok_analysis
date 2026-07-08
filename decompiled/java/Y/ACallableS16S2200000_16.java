package Y;

import X.AbstractC842530X3j;
import X.C0BSL;
import X.C0VSJ;
import X.C0X52;
import X.C1018060cbE;
import X.C1018150cbN;
import X.C1030680cva;
import X.C1035880d3y;
import X.C1068720duw;
import X.C11NZ;
import X.C1293980jmG;
import X.C1AF0;
import X.C1C7U;
import X.C2188811AlT;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.autofill.api.AdAutofillApi;
import com.ss.android.ugc.aweme.autofill.api.AdAutofillPipoResponse;
import com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes17.dex */
public class ACallableS16S2200000_16 implements Callable {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS16S2200000_16 aCallableS16S2200000_16) throws Throwable {
        String strLJ;
        String str = aCallableS16S2200000_16.s0;
        String str2 = aCallableS16S2200000_16.s1;
        TopViewAdEventLogger topViewAdEventLogger = (TopViewAdEventLogger) aCallableS16S2200000_16.l2;
        DownloadInfo downloadInfo = (DownloadInfo) aCallableS16S2200000_16.l3;
        C1C7U.LIZ("TopViewPreloadManager@b174.downloadWithVideoUrl$1$onSuccessed$1L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1018150cbN.LIZLLL);
        sbLIZ.append(C1030680cva.LJIIIIZZ(str, str2, false, false));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C0VSJ c0vsj = new C0VSJ(strLIZIZ);
        long jLIZJ = C1293980jmG.LIZJ(strLIZIZ);
        int i = C0BSL.LIZ;
        if (i == 0) {
            C1018060cbE.LIZ.getClass();
            topViewAdEventLogger.logAd(C1018060cbE.LIZJ, new AObjectS33S0100100_16(downloadInfo, jLIZJ, 2));
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download succeed");
        } else if (jLIZJ < i) {
            long length = 0;
            if (c0vsj.exists()) {
                try {
                    if (c0vsj.isFile()) {
                        length = c0vsj.length();
                    }
                    strLJ = C1293980jmG.LJ(strLIZIZ);
                    if (strLJ != null) {
                        try {
                            if (strLJ.length() > 200) {
                                strLJ = strLJ.substring(0, 200);
                            }
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            C1AF0.LJ(e);
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    strLJ = null;
                }
                c0vsj.delete();
            } else {
                strLJ = null;
            }
            topViewAdEventLogger.logAd(C1018060cbE.LIZLLL, new AObjectS8S1100100_16(downloadInfo, length, strLJ, 1));
        } else {
            C1018060cbE.LIZ.getClass();
            topViewAdEventLogger.logAd(C1018060cbE.LIZJ, new AObjectS33S0100100_16(downloadInfo, jLIZJ, 3));
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download succeed");
        }
        C1C7U.LIZIZ("TopViewPreloadManager@b174.downloadWithVideoUrl$1$onSuccessed$1L");
        return null;
    }

    public static final Object call$1(ACallableS16S2200000_16 aCallableS16S2200000_16) {
        C1C7U.LIZ("AdAutofillPipoManager@24f6.getValidPiList$2$1");
        AdAutofillApi adAutofillApi = (AdAutofillApi) aCallableS16S2200000_16.l2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://uid.");
        sbLIZ.append(aCallableS16S2200000_16.s0);
        sbLIZ.append(".com");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String str = aCallableS16S2200000_16.s1;
        C1068720duw c1068720duw = C1068720duw.LIZ;
        String str2 = aCallableS16S2200000_16.s0;
        C1035880d3y c1035880d3y = (C1035880d3y) aCallableS16S2200000_16.l3;
        c1068720duw.getClass();
        C11NZ<C0X52<AdAutofillPipoResponse>> validPiList = adAutofillApi.getValidPiList(strLIZIZ, str, "application/x-www-form-urlencoded; charset=utf-8", AbstractC842530X3j.LIZJ(null, C1068720duw.LJIIIZ(c1035880d3y, str2)));
        C1C7U.LIZIZ("AdAutofillPipoManager@24f6.getValidPiList$2$1");
        return validPiList;
    }

    public ACallableS16S2200000_16(Object obj, String str, String str2, Object obj2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = obj2;
    }
}
