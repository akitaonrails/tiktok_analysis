package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0I6n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461150I6n extends C09AY implements Function1<C461100I6i, C461100I6i> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C461150I6n(long j, long j2, long j3) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = j3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C461100I6i invoke(C461100I6i c461100I6i) {
        C461100I6i c461100I6i2 = c461100I6i;
        C291001Au c291001Au = new C291001Au(new C461170I6p(this.LL, this.LLILLJJLI, this.LLILLL));
        Pair<Long, C291001Au<Boolean>> pair = c461100I6i2.LLILLJJLI;
        c461100I6i2.getClass();
        return new C461100I6i(c291001Au, pair);
    }
}
