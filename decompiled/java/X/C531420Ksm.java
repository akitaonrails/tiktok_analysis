package X;

import com.ss.android.ugc.aweme.service.TemplateMusicServiceImpl;

/* JADX INFO: renamed from: X.0Ksm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.TemplateMusicServiceImpl", f = "TemplateMusicServiceImpl.kt", l = {64}, m = "downloadMusicByMusicIds")
public final class C531420Ksm extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ TemplateMusicServiceImpl LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C531420Ksm(TemplateMusicServiceImpl templateMusicServiceImpl, InterfaceC1364105Vn<? super C531420Ksm> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = templateMusicServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateMusicServiceImpl@1ac4.downloadMusicByMusicIds$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZLL.LIZLLL(null, null, this);
        C1C7U.LIZIZ("TemplateMusicServiceImpl@1ac4.downloadMusicByMusicIds$1");
        return objLIZLLL;
    }
}
