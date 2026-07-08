package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0wwp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1800250wwp {
    public static final C1800250wwp LIZ = new C1800250wwp();
    public static final InterfaceC1849670yEX LIZIZ;

    static {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        LIZIZ = (InterfaceC1849670yEX) iRetrofitFactory.LIZ(C2188811AlT.LIZIZ(sbLIZ)).create(InterfaceC1849670yEX.class);
    }
}
