package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0TPP, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TPP {
    public static final C0TPP LIZ = new C0TPP();
    public static final IRetrofitFactory LIZIZ = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
    public static final String LIZJ;

    static {
        String str = C0D80.LIZ;
        LIZJ = C0D80.LIZ;
    }

    public static Object LIZ(Class cls) {
        return LIZIZ.createBuilder(LIZJ).build().retrofit.LIZ(cls);
    }

    public static Object LIZIZ(Class cls, String str) {
        return LIZIZ.createBuilder(str).build().retrofit.LIZ(cls);
    }
}
