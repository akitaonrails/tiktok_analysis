package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0CPm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C313200CPm {
    public static final /* synthetic */ C313200CPm LIZ = new C313200CPm();

    public static InterfaceC315270CXl LIZ() {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ);
        c1499850p8JCreateBuilder.LIZJ(C2336109Dj.LJI());
        return (InterfaceC315270CXl) c1499850p8JCreateBuilder.build().retrofit.LIZ(InterfaceC315270CXl.class);
    }
}
