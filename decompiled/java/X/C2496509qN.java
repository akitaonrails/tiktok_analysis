package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;

/* JADX INFO: renamed from: X.09qN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.customize.album.AIPortraitAlbumFaceInterceptComponent", f = "AIPortraitAlbumFaceInterceptComponent.kt", l = {61, 85}, m = "intercept")
public final class C2496509qN extends AbstractC23140094w {
    public C525700KjY LL;
    public InterfaceC2495009q8 LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public TikTokMediaModel LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C2496409qM LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2496509qN(C2496409qM c2496409qM, InterfaceC1364105Vn<? super C2496509qN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c2496409qM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitAlbumFaceInterceptComponent@ad9.intercept$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLJLIIIL = this.LLIZLLLIL.LJLIIIL(null, null, this);
        C1C7U.LIZIZ("AIPortraitAlbumFaceInterceptComponent@ad9.intercept$1");
        return objLJLIIIL;
    }
}
