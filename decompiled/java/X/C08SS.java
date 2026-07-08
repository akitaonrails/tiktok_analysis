package X;

import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.08SS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08SS<V> implements Callable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    public C08SS(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object objExecute;
        C1C7U.LIZ("BusinessAdsReportHelper@39e2.tryReportServicePlusOptInAdsEvent$1");
        try {
            objExecute = ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).do3rdPartPost("https://business-api.tiktok.com/open_api/v1.3/event/track/", C2097608Jq.LJIIIIZZ(new Pair("Access-Token", this.LL), new Pair("Content-Type", "application/json")), "application/json", this.LLILLJJLI.getBytes(Charsets.UTF_8)).execute();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("https://business-api.tiktok.com/open_api/v1.3/event/track/ failed ");
            sbLIZ.append(e);
            C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            objExecute = Unit.LIZ;
        }
        C1C7U.LIZIZ("BusinessAdsReportHelper@39e2.tryReportServicePlusOptInAdsEvent$1");
        return objExecute;
    }
}
