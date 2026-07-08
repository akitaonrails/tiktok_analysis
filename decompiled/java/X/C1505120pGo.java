package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0pGo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505120pGo {
    public final InterfaceC1507230pKD LIZ;

    public C1505120pGo() {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append("api-va.tiktokv.com");
        sbLIZ.append('/');
        this.LIZ = (InterfaceC1507230pKD) iRetrofitFactory.LIZ(C2188811AlT.LIZIZ(sbLIZ)).create(InterfaceC1507230pKD.class);
    }
}
