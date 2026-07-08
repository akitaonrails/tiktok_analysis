package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.CheckTitleSensitivityResult;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService;

/* JADX INFO: renamed from: X.0nhO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444720nhO {
    public static UploaderRetrofitService LIZIZ() {
        return (UploaderRetrofitService) C0CHQ.LIZ().getNetworkService().createRetrofit(((AVApi) ServiceManager.get().getService(AVApi.class)).LIZ(), true, UploaderRetrofitService.class);
    }

    public static C11NZ<CheckTitleSensitivityResult> LIZ(String str, EnumC1987607qU enumC1987607qU) {
        return ((InterfaceC1444730nhP) C0CHQ.LIZ().getNetworkService().retrofitCreate(((AVApi) ServiceManager.get().getService(AVApi.class)).LIZ(), InterfaceC1444730nhP.class)).LIZ(str, enumC1987607qU.getValue());
    }
}
