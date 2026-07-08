package X;

import com.bytedance.geckox.model.UpdatePackage;
import java.util.concurrent.Callable;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09ZE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09ZE<V> implements Callable {
    public final /* synthetic */ C09ZM LL;
    public final /* synthetic */ UpdatePackage LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Throwable LLILZ;

    public C09ZE(C09ZM c09zm, UpdatePackage updatePackage, boolean z, Throwable th) {
        this.LL = c09zm;
        this.LLILLJJLI = updatePackage;
        this.LLILLL = z;
        this.LLILZ = th;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws JSONException {
        String channel;
        String message;
        C1C7U.LIZ("BridgeGeckoUpdateListener@90e1.sendUpdateResultEvent$1");
        JSONObject jSONObject = new JSONObject();
        UpdatePackage updatePackage = this.LLILLJJLI;
        C09ZM c09zm = this.LL;
        boolean z = this.LLILLL;
        Throwable th = this.LLILZ;
        if (updatePackage == null || (channel = updatePackage.getChannel()) == null) {
            channel = c09zm.LIZIZ;
        }
        jSONObject.put("channel", channel);
        jSONObject.put("failed", z);
        if (th == null || (message = th.getMessage()) == null) {
            message = "";
        }
        jSONObject.put("failedMsg", message);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.LIZIZ);
        sbLIZ.append("_getGeckoUpdateResult");
        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(jSONObject), C2188811AlT.LIZIZ(sbLIZ)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BridgeGeckoUpdateListener@90e1.sendUpdateResultEvent$1");
        return unit;
    }
}
