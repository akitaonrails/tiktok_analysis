package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kOO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1317620kOO extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1317790kOf LL;
    public final /* synthetic */ InterfaceC1317630kOP LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1317620kOO(C1317790kOf c1317790kOf, C1521280pgs c1521280pgs, long j) {
        super(0);
        this.LL = c1317790kOf;
        this.LLILLJJLI = c1521280pgs;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1521660phU c1521660phULIZIZ = this.LL.LIZIZ();
        this.LLILLJJLI.LIZ(new C1317650kOR(this.LLILLL, System.currentTimeMillis() - jCurrentTimeMillis, c1521660phULIZIZ));
        return Unit.LIZ;
    }
}
