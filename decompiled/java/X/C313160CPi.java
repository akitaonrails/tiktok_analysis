package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0CPi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C313160CPi {
    public static final /* synthetic */ C313160CPi LIZ = new C313160CPi();
    public static final long LIZIZ;
    public static final InterfaceC315020CWm LIZJ;

    static {
        InterfaceC315020CWm interfaceC315020CWm;
        C1499850p8J c1499850p8JCreateBuilder;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LIZIZ = Mp4ScreenVideoLoadTimeout.CONTROL;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory == null || (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(strLIZIZ)) == null) {
            interfaceC315020CWm = null;
        } else {
            c1499850p8JCreateBuilder.LJIIIZ = 1;
            interfaceC315020CWm = (InterfaceC315020CWm) c1499850p8JCreateBuilder.build().retrofit.LIZ(InterfaceC315020CWm.class);
        }
        LIZJ = interfaceC315020CWm;
    }
}
