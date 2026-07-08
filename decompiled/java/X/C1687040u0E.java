package X;

/* JADX INFO: renamed from: X.0u0E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.repository.AIPortraitTabRepository", f = "AIPortraitTabRepository.kt", l = {70}, m = "fetchCarousel")
public final class C1687040u0E extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1687000u0A LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687040u0E(C1687000u0A c1687000u0A, InterfaceC1364105Vn<? super C1687040u0E> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1687000u0A;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitTabRepository@d05b.fetchCarousel$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(0, this);
        C1C7U.LIZIZ("AIPortraitTabRepository@d05b.fetchCarousel$1");
        return objLIZJ;
    }
}
