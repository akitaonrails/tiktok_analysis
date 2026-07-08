package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0zzQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1917180zzQ {
    public static final /* synthetic */ C1917180zzQ LIZ = new C1917180zzQ();
    public static final InterfaceC1917190zzR LIZIZ;

    static {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        String str = C344670DfF.LIZ;
        LIZIZ = (InterfaceC1917190zzR) iRetrofitFactory.LIZ(C344670DfF.LIZ).create(InterfaceC1917190zzR.class);
    }
}
