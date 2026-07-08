package X;

import com.ss.android.ugc.aweme.service.TemplateMediaServiceImpl;

/* JADX INFO: renamed from: X.096i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.TemplateMediaServiceImpl", f = "TemplateMediaServiceImpl.kt", l = {129, 129}, m = "compressVideos")
public final class C23178096i extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ TemplateMediaServiceImpl LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23178096i(TemplateMediaServiceImpl templateMediaServiceImpl, InterfaceC1364105Vn<? super C23178096i> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = templateMediaServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateMediaServiceImpl@c2fb.compressVideos$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZLL.LIZJ(null, null, null, this);
        C1C7U.LIZIZ("TemplateMediaServiceImpl@c2fb.compressVideos$1");
        return objLIZJ;
    }
}
