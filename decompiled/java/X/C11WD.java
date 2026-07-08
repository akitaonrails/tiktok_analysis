package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.11WD, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11WD {
    public static final /* synthetic */ C11WD LIZ = new C11WD();
    public static final C11WC LIZIZ;

    static {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ);
        c1499850p8JCreateBuilder.LJIIIZ = 3;
        LIZIZ = (C11WC) c1499850p8JCreateBuilder.build().retrofit.LIZ(C11WC.class);
    }
}
