package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.pipo.ttpay.recharge.network.RechargeApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.common.network.partener.PipoNetworkMonitor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pHm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505720pHm {
    public static final /* synthetic */ C1505720pHm LIZ = new C1505720pHm();
    public static String LIZIZ = "";
    public static RechargeApi LIZJ;

    public static RechargeApi LIZ(String str) {
        boolean z;
        C1499850p8J c1499850p8JCreateBuilder;
        if (LIZJ != null && Intrinsics.LJFF(str, LIZIZ)) {
            return LIZJ;
        }
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        RechargeApi rechargeApi = null;
        if (z) {
            return null;
        }
        LIZIZ = str;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory != null && (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(LIZIZ)) != null) {
            c1499850p8JCreateBuilder.LIZIZ(new PipoNetworkMonitor("tiktokpay"));
            rechargeApi = (RechargeApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(RechargeApi.class);
        }
        LIZJ = rechargeApi;
        return rechargeApi;
    }
}
