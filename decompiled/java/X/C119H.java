package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.119H, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C119H {
    public static final /* synthetic */ C119H LIZ = new C119H();
    public static final InterfaceC2661011f LIZIZ = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/").build();
}
