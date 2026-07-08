package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.AutofillApi;
import com.ss.android.ugc.aweme.pipo.common.network.partener.PipoNetworkMonitor;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0pHn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505730pHn {
    public static final /* synthetic */ C1505730pHn LIZ = new C1505730pHn();

    public static AutofillApi LIZ(String str) {
        C1499850p8J c1499850p8JCreateBuilder;
        if (!u.LJJIIJZLJL(str, "http", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("https://");
            sbLIZ.append(str);
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory != null && (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(str)) != null) {
            c1499850p8JCreateBuilder.LIZIZ(new PipoNetworkMonitor("CASHIER"));
            return (AutofillApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(AutofillApi.class);
        }
        return null;
    }
}
