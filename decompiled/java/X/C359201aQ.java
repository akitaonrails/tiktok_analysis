package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;

/* JADX INFO: renamed from: X.01aQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C359201aQ implements InterfaceC359301aR {
    @Override // X.InterfaceC359301aR
    public final String getApiHost() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC359301aR
    public final Object LIZ(String str, Class cls, List list) {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(str);
        c1499850p8JCreateBuilder.getClass();
        c1499850p8JCreateBuilder.LJFF(list);
        return c1499850p8JCreateBuilder.build().retrofit.LIZ(cls);
    }
}
