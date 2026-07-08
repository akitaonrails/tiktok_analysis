package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092140eWi extends C09AY implements Function1<Long, Unit> {
    public final /* synthetic */ C1092090eWd LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1092140eWi(C1092090eWd c1092090eWd) {
        super(1);
        this.LL = c1092090eWd;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        long jLongValue = l.longValue();
        this.LL.LJ(jLongValue);
        this.LL.LLJI.LIZIZ(jLongValue);
        return Unit.LIZ;
    }
}
