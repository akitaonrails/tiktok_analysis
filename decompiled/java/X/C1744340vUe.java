package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.interceptor.GecNetInterceptor;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictRequest;
import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0vUe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1744340vUe {
    public static final /* synthetic */ C1744340vUe LIZ = new C1744340vUe();
    public static final C01K1 LIZIZ;

    static {
        InterfaceC859903Xp interfaceC859903XpCreateBuilder = ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/");
        interfaceC859903XpCreateBuilder.LIZ(new GecNetInterceptor());
        LIZIZ = interfaceC859903XpCreateBuilder.build();
    }

    public static C11NZ LIZ(SearchDistrictRequest searchDistrictRequest) {
        return ((InterfaceC1744330vUd) LIZIZ.create(InterfaceC1744330vUd.class)).LIZ(searchDistrictRequest);
    }
}
