package X;

import com.ss.android.ugc.aweme.localservice.optimistic.VideoLikeService;

/* JADX INFO: renamed from: X.0OA7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.localservice.optimistic.VideoLikeService", f = "VideoLikeService.kt", l = {230}, m = "request")
public final class C0OA7 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ VideoLikeService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OA7(VideoLikeService videoLikeService, InterfaceC1364105Vn<? super C0OA7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = videoLikeService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoLikeService@a177.request$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILLJJLI.LJIIIZ(null, this);
        C1C7U.LIZIZ("VideoLikeService@a177.request$1");
        return objLJIIIZ;
    }
}
