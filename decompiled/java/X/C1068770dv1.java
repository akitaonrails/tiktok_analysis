package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.autofill.api.AdAutofillApi;
import com.ss.android.ugc.aweme.autofill.api.PipoRequestTagHandler;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0dv1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1068770dv1 {
    public static final /* synthetic */ C1068770dv1 LIZ = new C1068770dv1();

    public static AdAutofillApi LIZ() {
        return (AdAutofillApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(AdAutofillApi.class);
    }

    public static AdAutofillApi LIZIZ(String str) {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(str);
        return (AdAutofillApi) iRetrofitFactory.LIZ(C2188811AlT.LIZIZ(sbLIZ)).create(AdAutofillApi.class);
    }

    public static AdAutofillApi LIZJ(String str) {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(str);
        C1499850p8J c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(C2188811AlT.LIZIZ(sbLIZ));
        c1499850p8JCreateBuilder.LIZIZ(PipoRequestTagHandler.LIZ);
        return (AdAutofillApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(AdAutofillApi.class);
    }
}
