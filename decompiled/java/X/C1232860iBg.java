package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minis.request.IMetaServiceApi;

/* JADX INFO: renamed from: X.0iBg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1232860iBg {
    public static final /* synthetic */ C1232860iBg LIZ = new C1232860iBg();

    public static IMetaServiceApi LIZ() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("url host:");
        String str = C0CQT.LIZJ;
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        Gson gsonLIZ = new e().LIZ();
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(str);
        c1499850p8JCreateBuilder.LIZJ(new C2336109Dj(gsonLIZ));
        return (IMetaServiceApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(IMetaServiceApi.class);
    }
}
