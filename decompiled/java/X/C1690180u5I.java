package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0u5I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {365, 366}, m = "scroll")
public final class C1690180u5I extends AbstractC23140094w {
    public C1690080u58 LL;
    public EnumC1384205bM LLILLJJLI;
    public Function2 LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1690080u58 LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1690180u5I(C1690080u58 c1690080u58, InterfaceC1364105Vn<? super C1690180u5I> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1690080u58;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        return this.LLILZIL.LIZ(null, null, this);
    }
}
