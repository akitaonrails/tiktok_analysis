package X;

/* JADX INFO: renamed from: X.0u0C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.repository.AIPortraitTabRepository", f = "AIPortraitTabRepository.kt", l = {102}, m = "fetchRecommend")
public final class C1687020u0C extends AbstractC23140094w {
    public int LL;
    public C1687000u0A LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1687000u0A LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687020u0C(C1687000u0A c1687000u0A, InterfaceC1364105Vn<? super C1687020u0C> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1687000u0A;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitTabRepository@d05b.fetchRecommend$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZ.LIZLLL(0, 0, this);
        C1C7U.LIZIZ("AIPortraitTabRepository@d05b.fetchRecommend$1");
        return objLIZLLL;
    }
}
