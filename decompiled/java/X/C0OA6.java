package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.localservice.optimistic.VideoLikeService;
import com.ss.android.ugc.aweme.localservice.service.optimistic.IVideoLikeService;
import java.util.HashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0OA6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C0OA6 extends C2217421BqW implements Function2<HashMap<String, String>, InterfaceC1364105Vn<? super BaseResponse>, Object>, InterfaceC842703Qz {
    public C0OA6(IVideoLikeService iVideoLikeService) {
        super(2, iVideoLikeService, VideoLikeService.class, "request", "request(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HashMap<String, String> map, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return ((VideoLikeService) this.receiver).LJIIIZ(map, interfaceC1364105Vn);
    }
}
