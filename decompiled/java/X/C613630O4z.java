package X;

import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0O4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C613630O4z {
    public static final C613630O4z LIZ = new C613630O4z();
    public static final C01K1 LIZIZ = ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).LIZ("https://oec-api.tiktokv.com/");

    public static C15O7 LIZ(GetItemProductInfoRequest getItemProductInfoRequest) {
        return ((InterfaceC613620O4y) LIZIZ.create(InterfaceC613620O4y.class)).LIZIZ(getItemProductInfoRequest);
    }
}
