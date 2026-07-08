package X;

/* JADX INFO: renamed from: X.0Ol8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.template.net.TemplateFavoriteService", f = "TemplateFavoriteApi.kt", l = {63, 64, 66, 67}, m = "doFavorite")
public final class C628600Ol8 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C628610Ol9 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C628600Ol8(C628610Ol9 c628610Ol9, InterfaceC1364105Vn<? super C628600Ol8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c628610Ol9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateFavoriteService@928e.doFavorite$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, false, this);
        C1C7U.LIZIZ("TemplateFavoriteService@928e.doFavorite$1");
        return objLIZ;
    }
}
