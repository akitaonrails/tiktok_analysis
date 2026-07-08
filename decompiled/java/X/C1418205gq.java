package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05gq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1418205gq extends C09AY implements Function0<C1685910tyP> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C05P0<Boolean> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1418205gq(long j, long j2, C05P0<Boolean> c05p0) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = c05p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1685910tyP invoke() {
        return new C1685910tyP(C1668980tX6.LIZIZ(this.LLILLL) ? this.LL : this.LLILLJJLI);
    }
}
