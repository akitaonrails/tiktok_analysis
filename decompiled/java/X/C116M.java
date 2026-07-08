package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.116M, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C116M {
    public final AnonymousClass1165 LIZ = (AnonymousClass1165) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(AnonymousClass1165.class);

    public final void LIZ(String str, final InterfaceC447230HgH interfaceC447230HgH) {
        boolean zLJI = MethodIDManager.LJI(202466);
        C11U6<ChallengeDetail> c11u6 = new C11U6<ChallengeDetail>() { // from class: X.116O
            @Override // X.C11U6
            public final void onFailure(Throwable th) {
                interfaceC447230HgH.accept(null);
            }

            @Override // X.C11U6
            public final void onSuccess(ChallengeDetail challengeDetail) {
                interfaceC447230HgH.accept(challengeDetail);
            }
        };
        if (!((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJIIZILJ(str) && !((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJIIZILJ(null)) {
            ListenableFuture<ChallengeDetail> listenableFutureLIZIZ = this.LIZ.LIZIZ(str, null, 0, 0);
            listenableFutureLIZIZ.LJIIJJI(new C135Q(listenableFutureLIZIZ, c11u6), ExecutorC1592406Li.LLILLJJLI);
        } else if (!C10EU.LJIIIIZZ()) {
            ListenableFuture<ChallengeDetail> listenableFutureLIZ = this.LIZ.LIZ(str, null, 0, 0);
            listenableFutureLIZ.LJIIJJI(new C135Q(listenableFutureLIZ, c11u6), ExecutorC1592406Li.LLILLJJLI);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
