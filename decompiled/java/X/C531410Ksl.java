package X;

import com.ss.android.ugc.aweme.service.TemplateMusicServiceImpl;

/* JADX INFO: renamed from: X.0Ksl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.TemplateMusicServiceImpl", f = "TemplateMusicServiceImpl.kt", l = {109, 116}, m = "downloadMusicByMusicIdLegacy")
public final class C531410Ksl extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public C259800zU LLILLL;
    public C259800zU LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ TemplateMusicServiceImpl LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C531410Ksl(TemplateMusicServiceImpl templateMusicServiceImpl, InterfaceC1364105Vn<? super C531410Ksl> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = templateMusicServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateMusicServiceImpl@1ac4.downloadMusicByMusicIdLegacy$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJI = this.LLILZLL.LJI(null, null, this);
        C1C7U.LIZIZ("TemplateMusicServiceImpl@1ac4.downloadMusicByMusicIdLegacy$1");
        return objLJI;
    }
}
