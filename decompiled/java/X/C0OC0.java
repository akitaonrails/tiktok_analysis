package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0OC0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OC0 {
    public static final C0OC0 LIZ = new C0OC0();
    public static C0OC2 LIZIZ;

    public static void LIZ(final int i, final String str, final String str2, final List list) {
        C0XQ7.LJ();
        if (!C0XQ7.LIZ.LJIIJ().isLogin()) {
            return;
        }
        if (LIZIZ == null) {
            LIZIZ = (C0OC2) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C0CQT.LIZJ).create(C0OC2.class);
        }
        C15O7.LIZJ(new Callable() { // from class: X.0OC1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("RankTaskManager@77b2.sendRealRequest$1");
                ListenableFuture<BaseResponse> listenableFutureLIZ = C0OC0.LIZIZ.LIZ(str, 1, i, list, str2);
                BaseResponse baseResponse = listenableFutureLIZ != null ? listenableFutureLIZ.get() : null;
                C1C7U.LIZIZ("RankTaskManager@77b2.sendRealRequest$1");
                return baseResponse;
            }
        });
    }
}
