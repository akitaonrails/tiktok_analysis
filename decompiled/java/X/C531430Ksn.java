package X;

import com.ss.android.ugc.aweme.service.TemplateMusicServiceImpl;

/* JADX INFO: renamed from: X.0Ksn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.TemplateMusicServiceImpl", f = "TemplateMusicServiceImpl.kt", l = {151, 155}, m = "doDownloadMusicByMusicId")
public final class C531430Ksn extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ TemplateMusicServiceImpl LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C531430Ksn(TemplateMusicServiceImpl templateMusicServiceImpl, InterfaceC1364105Vn<? super C531430Ksn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = templateMusicServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateMusicServiceImpl@1ac4.doDownloadMusicByMusicId$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZ.LJFF(null, null, this);
        C1C7U.LIZIZ("TemplateMusicServiceImpl@1ac4.doDownloadMusicByMusicId$1");
        return objLJFF;
    }
}
