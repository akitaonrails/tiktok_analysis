package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.09S2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09S2 {
    public static final IRetrofitFactory LIZLLL() {
        return (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
    }

    public static final InterfaceC2661011f LIZ(String str) {
        return LIZLLL().LIZ(str);
    }

    public static final InterfaceC1507130pK3 LIZIZ(String str) {
        return LIZLLL().createBuilder(str);
    }

    public static final Object LIZJ(Class cls, String str) {
        InterfaceC2661011f interfaceC2661011fLIZ = LIZLLL().LIZ(str);
        if (interfaceC2661011fLIZ != null) {
            return interfaceC2661011fLIZ.create(cls);
        }
        return null;
    }
}
