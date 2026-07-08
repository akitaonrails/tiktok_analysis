package X;

/* JADX INFO: renamed from: X.0u0D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.repository.AIPortraitTabRepository", f = "AIPortraitTabRepository.kt", l = {181}, m = "pollGeneratingProgress")
public final class C1687030u0D extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1687000u0A LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687030u0D(C1687000u0A c1687000u0A, InterfaceC1364105Vn<? super C1687030u0D> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1687000u0A;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitTabRepository@d05b.pollGeneratingProgress$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLJJLI.LJ(null, this);
        C1C7U.LIZIZ("AIPortraitTabRepository@d05b.pollGeneratingProgress$1");
        return objLJ;
    }
}
