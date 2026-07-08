package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.118V, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C118V {
    public static final C118V LIZ = new C118V();
    public static final InterfaceC2661011f LIZIZ = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(Api.LIZ).build();
    public static final InterfaceC2661011f LIZJ = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ("https://oec-api.tiktokv.com/");
}
