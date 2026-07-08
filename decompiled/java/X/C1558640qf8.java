package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qf8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558640qf8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC725510Sd3 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Function0 LLILZIL;
    public final /* synthetic */ C1558530qex LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1558640qf8(AbstractC725510Sd3 abstractC725510Sd3, String str, long j, boolean z, Function0 function0, C1558530qex c1558530qex) {
        super(0);
        this.LL = abstractC725510Sd3;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = function0;
        this.LLILZLL = c1558530qex;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        Long lRemove = C725430Scv.LIZ.remove(new C725490Sd1(this.LL, this.LLILLJJLI));
        if (lRemove != null) {
            long jLongValue = lRemove.longValue();
            if (C725480Sd0.LIZ(this.LL)) {
                long j = this.LLILLL - jLongValue;
                AbstractC1559280qgA abstractC1559280qgA = (AbstractC1559280qgA) this.LLILZIL.invoke();
                abstractC1559280qgA.LIZJ = this.LLILZLL.LIZ.invoke();
                boolean z = this.LLILZ;
                abstractC1559280qgA.LIZ = j;
                abstractC1559280qgA.LIZIZ = z;
                C725480Sd0.LIZIZ(this.LL, abstractC1559280qgA);
            }
        }
        return Unit.LIZ;
    }
}
