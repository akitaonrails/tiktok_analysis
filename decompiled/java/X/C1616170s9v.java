package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0s9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616170s9v extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC1616070s9l LL;
    public final /* synthetic */ C0SZ8 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1616170s9v(InterfaceC1616070s9l interfaceC1616070s9l, C0SZ8 c0sz8) {
        super(0);
        this.LL = interfaceC1616070s9l;
        this.LLILLJJLI = c0sz8;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.onPageUnSelected(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
