package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.commercialize.profile.impl.ad.CommerceProfileAdApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.05XV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05XV {
    public static final /* synthetic */ C05XV LIZ = new C05XV();
    public static final CommerceProfileAdApi LIZIZ;

    static {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        LIZIZ = (CommerceProfileAdApi) iRetrofitFactory.createBuilder(C2188811AlT.LIZIZ(sbLIZ)).build().retrofit.LIZ(CommerceProfileAdApi.class);
    }
}
