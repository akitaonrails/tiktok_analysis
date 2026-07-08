package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qf0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558560qf0 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC725510Sd3 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1558560qf0(AbstractC725510Sd3 abstractC725510Sd3, String str, long j) {
        super(0);
        this.LL = abstractC725510Sd3;
        this.LLILLJJLI = str;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        C725430Scv.LIZ.put(new C725490Sd1(this.LL, this.LLILLJJLI), Long.valueOf(this.LLILLL));
        return Unit.LIZ;
    }
}
