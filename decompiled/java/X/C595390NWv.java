package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.outreach.dispersion.ab.FetchNetworkConfig;

/* JADX INFO: renamed from: X.0NWv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C595390NWv {
    public static final /* synthetic */ C595390NWv LIZ = new C595390NWv();
    public static final long LIZIZ;
    public static final InterfaceC595380NWu LIZJ;

    static {
        InterfaceC595380NWu interfaceC595380NWu;
        C1499850p8J c1499850p8JCreateBuilder;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C01GW c01gw = C595400NWw.LIZIZ;
        int i = ((FetchNetworkConfig) c01gw.getValue()).retry;
        LIZIZ = ((long) ((FetchNetworkConfig) c01gw.getValue()).timeout) * 1000;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory == null || (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(strLIZIZ)) == null) {
            interfaceC595380NWu = null;
        } else {
            c1499850p8JCreateBuilder.LJIIIZ = i;
            interfaceC595380NWu = (InterfaceC595380NWu) c1499850p8JCreateBuilder.build().retrofit.LIZ(InterfaceC595380NWu.class);
        }
        LIZJ = interfaceC595380NWu;
    }
}
