package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.11Xx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19518311Xx {
    public static final C19518311Xx LIZ = new C19518311Xx();
    public static final InterfaceC2194131Au3 LIZIZ;

    static {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ);
        c1499850p8JCreateBuilder.LJIIIZ = 1;
        LIZIZ = (InterfaceC2194131Au3) c1499850p8JCreateBuilder.build().retrofit.LIZ(InterfaceC2194131Au3.class);
    }
}
