package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.pipo.ttpay.network.TTPayApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.common.network.partener.PipoNetworkMonitor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0pHk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505700pHk {
    public static final /* synthetic */ C1505700pHk LIZ = new C1505700pHk();
    public static String LIZIZ = "";
    public static TTPayApi LIZJ;

    public static TTPayApi LIZ() {
        C1499850p8J c1499850p8JCreateBuilder;
        String strLIZIZ = C1505710pHl.LIZIZ;
        if (!u.LJJIIJZLJL(strLIZIZ, "http", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("https://");
            sbLIZ.append(strLIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (LIZJ != null && Intrinsics.LJFF(strLIZIZ, LIZIZ)) {
            return LIZJ;
        }
        TTPayApi tTPayApi = null;
        if (strLIZIZ == null || strLIZIZ.length() == 0) {
            return null;
        }
        LIZIZ = strLIZIZ;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory != null && (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(LIZIZ)) != null) {
            c1499850p8JCreateBuilder.LIZIZ(new PipoNetworkMonitor());
            tTPayApi = (TTPayApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(TTPayApi.class);
        }
        LIZJ = tTPayApi;
        return tTPayApi;
    }
}
