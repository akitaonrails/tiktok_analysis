package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.saas.core.ECBuildInfo;
import com.ss.android.ugc.aweme.ecommerce.saas.core.service.monitor.IECSaaSCoreMonitorService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1AQS, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AQS {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1AQT());

    public static final Map LIZ() {
        ECBuildInfo eCBuildInfo = (ECBuildInfo) LIZ.getValue();
        Pair[] pairArr = new Pair[8];
        String str = eCBuildInfo.ecomVersion;
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("ecom_version", str);
        String str2 = eCBuildInfo.appVersion;
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("ecomAppVersion", str2);
        String str3 = eCBuildInfo.versionCode;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[2] = new Pair("ecom_version_code", str3);
        String str4 = eCBuildInfo.versionName;
        if (str4 == null) {
            str4 = "";
        }
        pairArr[3] = new Pair("ecom_version_name", str4);
        String str5 = eCBuildInfo.appId;
        if (str5 == null) {
            str5 = "";
        }
        pairArr[4] = new Pair("ecom_appid", str5);
        String str6 = eCBuildInfo.buildNumber;
        if (str6 == null) {
            str6 = "";
        }
        pairArr[5] = new Pair("ecom_build_number", str6);
        String str7 = eCBuildInfo.gitSha;
        if (str7 == null) {
            str7 = "";
        }
        pairArr[6] = new Pair("ecom_commit_id", str7);
        String str8 = eCBuildInfo.aarVersion;
        pairArr[7] = new Pair("ecom_aar_version", str8 != null ? str8 : "");
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static final Map LIZIZ() {
        return C2097608Jq.LJIIL(LIZ(), C2097908Jt.LIZJ(new Pair("use_ecom_saas", CardStruct.IStatusCode.DEFAULT)));
    }

    public static final void LIZJ(long j, int i, String str, String str2, boolean z) {
        C1120604Zw.LIZ.getClass();
        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJIIL) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        IECSaaSCoreMonitorService iECSaaSCoreMonitorService = (IECSaaSCoreMonitorService) PluggableExtentionKt.pluggableSpi$default(IECSaaSCoreMonitorService.class, false, false, false, 14, null);
        if (iECSaaSCoreMonitorService != null) {
            iECSaaSCoreMonitorService.LIZIZ(z, Boolean.FALSE, str, i, jElapsedRealtime, str2);
        }
    }
}
