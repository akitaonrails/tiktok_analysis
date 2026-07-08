package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417600mze extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1417330mzD LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417600mze(C1417330mzD c1417330mzD, int i, String str) {
        super(0);
        this.LL = c1417330mzD;
        this.LLILLJJLI = i;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.Td(this.LLILLJJLI, this.LLILLL);
        C1417360mzG c1417360mzG = this.LL.b;
        if (c1417360mzG != null) {
            c1417360mzG.LIZIZ();
        }
        return Unit.LIZ;
    }
}
