package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;

/* JADX INFO: renamed from: X.0KpQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.selection.SelectMediaInterceptorChain", f = "SelectMediaInterceptorChain.kt", l = {55, 57}, m = "doIntercept")
public final class C529340KpQ extends AbstractC23140094w {
    public Object LL;
    public TikTokMediaModel LLILLJJLI;
    public C0L90 LLILLL;
    public Object LLILZ;
    public InterfaceC529320KpO LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C529330KpP LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C529340KpQ(C529330KpP c529330KpP, InterfaceC1364105Vn<? super C529340KpQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c529330KpP;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SelectMediaInterceptorChain@b2b7.doIntercept$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLIZ.LIZIZ(null, null, null, null, this);
        C1C7U.LIZIZ("SelectMediaInterceptorChain@b2b7.doIntercept$1");
        return objLIZIZ;
    }
}
