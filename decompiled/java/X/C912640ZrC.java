package X;

/* JADX INFO: renamed from: X.0ZrC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.feature.tiktoklinkvideo.IMTiktokLinkImpl", f = "IMTiktokLinkImpl.kt", l = {40}, m = "tryGetVideoIdFromLink")
public final class C912640ZrC extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C912620ZrA LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C912640ZrC(C912620ZrA c912620ZrA, InterfaceC1364105Vn<? super C912640ZrC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c912620ZrA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("IMTiktokLinkImpl@573f.tryGetVideoIdFromLink$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLL.LJ(null, this);
        C1C7U.LIZIZ("IMTiktokLinkImpl@573f.tryGetVideoIdFromLink$1");
        return objLJ;
    }
}
