package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0u6G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {636, 641}, m = "scroll$suspendImpl")
public final class C1690780u6G extends AbstractC23140094w {
    public AbstractC1690640u62 LL;
    public EnumC1384205bM LLILLJJLI;
    public Function2 LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AbstractC1690640u62 LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1690780u6G(AbstractC1690640u62 abstractC1690640u62, InterfaceC1364105Vn<? super C1690780u6G> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = abstractC1690640u62;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        return AbstractC1690640u62.LJIJJ(this.LLILZIL, null, null, this);
    }
}
