package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0u5J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", l = {377, 378}, m = "scroll")
public final class C1690190u5J extends AbstractC23140094w {
    public C1690050u55 LL;
    public EnumC1384205bM LLILLJJLI;
    public Function2 LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1690050u55 LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1690190u5J(C1690050u55 c1690050u55, InterfaceC1364105Vn<? super C1690190u5J> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1690050u55;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        return this.LLILZIL.LIZ(null, null, this);
    }
}
