package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.localservice.optimistic.PoiCollectService;
import com.ss.android.ugc.aweme.localservice.service.optimistic.IPoiCollectService;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0O9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C614830O9p extends C2217421BqW implements Function2<C614810O9n, InterfaceC1364105Vn<? super BaseResponse>, Object>, InterfaceC842703Qz {
    public C614830O9p(IPoiCollectService iPoiCollectService) {
        super(2, iPoiCollectService, PoiCollectService.class, "request", "request(Lcom/ss/android/ugc/aweme/localservice/service/optimistic/PoiCollectState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C614810O9n c614810O9n, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return ((PoiCollectService) this.receiver).LJIIIZ(c614810O9n, interfaceC1364105Vn);
    }
}
