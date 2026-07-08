package X;

/* JADX INFO: renamed from: X.0n9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.favorite.TemplateFavoriteService", f = "TemplateFavoriteService.kt", l = {117, 118, 120, 121}, m = "doFavorite")
public final class C1423830n9h extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1423810n9f LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1423830n9h(C1423810n9f c1423810n9f, InterfaceC1364105Vn<? super C1423830n9h> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1423810n9f;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateFavoriteService@db.doFavorite$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, false, this);
        C1C7U.LIZIZ("TemplateFavoriteService@db.doFavorite$1");
        return objLIZ;
    }
}
