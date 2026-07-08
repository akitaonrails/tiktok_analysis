package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0s9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616110s9p extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC1616070s9l LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1616110s9p(InterfaceC1616070s9l interfaceC1616070s9l, int i, boolean z) {
        super(0);
        this.LL = interfaceC1616070s9l;
        this.LLILLJJLI = i;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.onPageSelected(this.LLILLJJLI);
        this.LL.onPageSelected(this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
