package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.outreach.dispersion.ab.ReportNetworkConfig;

/* JADX INFO: renamed from: X.15vc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20677015vc {
    public static final /* synthetic */ C20677015vc LIZ = new C20677015vc();
    public static final long LIZIZ;
    public static final InterfaceC20676615vY LIZJ;

    static {
        InterfaceC20676615vY interfaceC20676615vY;
        C1499850p8J c1499850p8JCreateBuilder;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C01GW c01gw = C20677115vd.LIZIZ;
        int i = ((ReportNetworkConfig) c01gw.getValue()).retry;
        LIZIZ = ((long) ((ReportNetworkConfig) c01gw.getValue()).timeout) * 1000;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory == null || (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(strLIZIZ)) == null) {
            interfaceC20676615vY = null;
        } else {
            c1499850p8JCreateBuilder.LJIIIZ = i;
            interfaceC20676615vY = (InterfaceC20676615vY) c1499850p8JCreateBuilder.build().retrofit.LIZ(InterfaceC20676615vY.class);
        }
        LIZJ = interfaceC20676615vY;
    }
}
