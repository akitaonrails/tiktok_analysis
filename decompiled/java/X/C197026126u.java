package X;

import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.126u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197026126u {
    public final InterfaceC197030126y LIZ;
    public final InterfaceC19275110az LIZIZ = (InterfaceC19275110az) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(InterfaceC19275110az.class);

    public C197026126u(C197027126v c197027126v) {
        this.LIZ = c197027126v;
    }
}
