package X;

/* JADX INFO: renamed from: X.0u6H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "LazyLayoutPager.kt", l = {386}, m = "performFling")
public final class C1690790u6H extends AbstractC23140094w {
    public C1690710u69 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1690710u69 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1690790u6H(C1690710u69 c1690710u69, InterfaceC1364105Vn<? super C1690790u6H> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1690710u69;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        return this.LLILLL.LIZ(null, 0.0f, this);
    }
}
