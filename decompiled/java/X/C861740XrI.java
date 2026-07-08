package X;

/* JADX INFO: renamed from: X.0XrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel$subPageRenderFlow$$inlined$map$1$2", f = "CreatorRankingPageViewModel.kt", l = {223}, m = "emit")
public final class C861740XrI extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C861750XrJ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861740XrI(C861750XrJ c861750XrJ, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c861750XrJ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreatorRankingPageViewModel@3458.subPageRenderFlow$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("CreatorRankingPageViewModel@3458.subPageRenderFlow$$inlined$map$1$2$1");
        return objEmit;
    }
}
