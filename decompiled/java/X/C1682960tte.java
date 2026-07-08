package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tte, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682960tte extends C09AY implements Function1<Long, Unit> {
    public final /* synthetic */ C238400w2 LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ C05ZL LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1682960tte(C238400w2 c238400w2, float f, float f2, C05ZL c05zl) {
        super(1);
        this.LL = c238400w2;
        this.LLILLJJLI = f;
        this.LLILLL = f2;
        this.LLILZ = c05zl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        long jLongValue = l.longValue();
        C238400w2 c238400w2 = this.LL;
        if (c238400w2.element == 0) {
            c238400w2.element = jLongValue;
        } else {
            c238400w2.element = jLongValue;
            C05ZL c05zl = this.LLILZ;
            c05zl.LJIILJJIL(c05zl.LIZIZ() + (this.LLILLJJLI * ((jLongValue - r6) / 1.0E9f)));
            if (this.LLILZ.LIZIZ() > this.LLILLL) {
                C05ZL c05zl2 = this.LLILZ;
                c05zl2.LJIILJJIL(c05zl2.LIZIZ() - this.LLILLL);
            }
        }
        return Unit.LIZ;
    }
}
