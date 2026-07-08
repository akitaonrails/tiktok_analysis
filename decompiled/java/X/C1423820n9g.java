package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0n9g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.favorite.TemplateFavoriteService", f = "TemplateFavoriteService.kt", l = {223}, m = "fetchTemplateTabFavoriteListInternal")
public final class C1423820n9g extends AbstractC23140094w {
    public Function2 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1423810n9f LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1423820n9g(C1423810n9f c1423810n9f, InterfaceC1364105Vn<? super C1423820n9g> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1423810n9f;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateFavoriteService@db.fetchTemplateTabFavoriteListInternal$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(0, 0, null, this);
        C1C7U.LIZIZ("TemplateFavoriteService@db.fetchTemplateTabFavoriteListInternal$1");
        return objLIZIZ;
    }
}
