package X;

import com.ss.android.ugc.aweme.ecommerce.mall.recommend.video.VideoDetailLoadImpl;
import com.ss.android.ugc.aweme.ecommerce.mall.service.video.VideoDetailRequestParams;

/* JADX INFO: renamed from: X.0wIy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.recommend.video.VideoDetailLoadImpl", f = "VideoDetailLoadImpl.kt", l = {165}, m = "requestData")
public final class C1775540wIy extends AbstractC23140094w {
    public VideoDetailRequestParams LL;
    public C259800zU LLILLJJLI;
    public C259800zU LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ VideoDetailLoadImpl LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775540wIy(VideoDetailLoadImpl videoDetailLoadImpl, InterfaceC1364105Vn<? super C1775540wIy> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = videoDetailLoadImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoDetailLoadImpl@ad2f.requestData$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZLL.LIZLLL(null, this);
        C1C7U.LIZIZ("VideoDetailLoadImpl@ad2f.requestData$1");
        return objLIZLLL;
    }
}
