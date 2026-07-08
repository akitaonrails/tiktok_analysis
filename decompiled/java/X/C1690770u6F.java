package X;

/* JADX INFO: renamed from: X.0u6F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {610, 617}, m = "animateScrollToPage")
public final class C1690770u6F extends AbstractC23140094w {
    public AbstractC1690640u62 LL;
    public InterfaceC1677030tk5 LLILLJJLI;
    public int LLILLL;
    public float LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ AbstractC1690640u62 LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1690770u6F(AbstractC1690640u62 abstractC1690640u62, InterfaceC1364105Vn<? super C1690770u6F> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = abstractC1690640u62;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        return this.LLILZLL.LJFF(0, 0.0f, null, this);
    }
}
