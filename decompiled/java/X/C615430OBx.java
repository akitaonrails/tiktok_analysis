package X;

import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0OBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C615430OBx {
    public static final IRetrofitService LIZ;
    public static final InterfaceC607760Nsc LIZIZ;

    static {
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        LIZ = iRetrofitService;
        LIZIZ = (InterfaceC607760Nsc) iRetrofitService.createNewRetrofit(C0CQT.LIZJ).create(InterfaceC607760Nsc.class);
    }
}
