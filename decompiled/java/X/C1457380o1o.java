package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0o1o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457380o1o extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1457350o1l LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1457380o1o(C1457350o1l c1457350o1l, boolean z, boolean z2, boolean z3) {
        super(1);
        this.LL = c1457350o1l;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        bool.booleanValue();
        C0CNO.LIZLLL(0L, new C1457370o1n(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ));
        return Unit.LIZ;
    }
}
