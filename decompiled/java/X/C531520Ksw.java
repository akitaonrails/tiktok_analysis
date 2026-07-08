package X;

import com.ss.android.ugc.aweme.pipeline.service.TemplateAlbumServiceImpl;

/* JADX INFO: renamed from: X.0Ksw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.service.TemplateAlbumServiceImpl", f = "TemplateAlbumServiceImpl.kt", l = {98}, m = "resolvePrefetchedSingleMusic")
public final class C531520Ksw extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TemplateAlbumServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C531520Ksw(TemplateAlbumServiceImpl templateAlbumServiceImpl, InterfaceC1364105Vn<? super C531520Ksw> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = templateAlbumServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateAlbumServiceImpl@c867.resolvePrefetchedSingleMusic$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, null, this);
        C1C7U.LIZIZ("TemplateAlbumServiceImpl@c867.resolvePrefetchedSingleMusic$1");
        return objLIZLLL;
    }
}
