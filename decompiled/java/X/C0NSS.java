package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0NSS, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NSS {
    public static final C0NSS LIZ = new C0NSS();
    public static final IRetrofitFactory LIZIZ = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);

    public static Object LIZ(Class cls) {
        return LIZIZ.LIZ("https://oec-api.tiktokv.com").create(cls);
    }
}
