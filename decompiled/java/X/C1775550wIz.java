package X;

import com.ss.android.ugc.aweme.ecommerce.mall.recommend.video.VideoDetailLoadImpl;

/* JADX INFO: renamed from: X.0wIz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.recommend.video.VideoDetailLoadImpl", f = "VideoDetailLoadImpl.kt", l = {116, 117}, m = "loadDetail")
public final class C1775550wIz extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public VideoDetailLoadImpl LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ VideoDetailLoadImpl LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775550wIz(VideoDetailLoadImpl videoDetailLoadImpl, InterfaceC1364105Vn<? super C1775550wIz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = videoDetailLoadImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoDetailLoadImpl@ad2f.loadDetail$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZLL.LIZ(null, this);
        C1C7U.LIZIZ("VideoDetailLoadImpl@ad2f.loadDetail$1");
        return objLIZ;
    }
}
