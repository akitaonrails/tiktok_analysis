package X;

import com.ss.android.ugc.aweme.ecommerce.mall.recommend.video.VideoDetailLoadImpl;
import com.ss.android.ugc.aweme.ecommerce.mall.service.video.VideoDetailRequestParams;

/* JADX INFO: renamed from: X.0wIx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.recommend.video.VideoDetailLoadImpl", f = "VideoDetailLoadImpl.kt", l = {199, 96}, m = "preloadDetail")
public final class C1775530wIx extends AbstractC23140094w {
    public VideoDetailRequestParams LL;
    public Object LLILLJJLI;
    public VideoDetailLoadImpl LLILLL;
    public C259800zU LLILZ;
    public C1DEV LLILZIL;
    public Object LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ VideoDetailLoadImpl LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775530wIx(VideoDetailLoadImpl videoDetailLoadImpl, InterfaceC1364105Vn<? super C1775530wIx> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = videoDetailLoadImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoDetailLoadImpl@ad2f.preloadDetail$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objPreloadDetail = this.LLIZLLLIL.preloadDetail(null, false, null, this);
        C1C7U.LIZIZ("VideoDetailLoadImpl@ad2f.preloadDetail$1");
        return objPreloadDetail;
    }
}
