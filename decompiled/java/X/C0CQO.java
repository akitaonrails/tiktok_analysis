package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.samsungfinder.SamsungSearchApi;

/* JADX INFO: renamed from: X.0CQO, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CQO {
    public static final /* synthetic */ C0CQO LIZ = new C0CQO();
    public static final SamsungSearchApi LIZIZ = (SamsungSearchApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(SamsungSearchApi.class);
}
