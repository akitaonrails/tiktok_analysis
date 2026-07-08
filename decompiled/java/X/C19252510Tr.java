package X;

import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.10Tr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19252510Tr {
    public static final InterfaceC19252610Ts LIZ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append("api-va.tiktokv.com");
        LIZ = (InterfaceC19252610Ts) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C2188811AlT.LIZIZ(sbLIZ)).create(InterfaceC19252610Ts.class);
    }
}
