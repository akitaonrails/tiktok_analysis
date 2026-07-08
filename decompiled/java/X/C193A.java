package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.193A, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C193A extends C09AY implements Function1<C905240ZfG, Unit> {
    public final /* synthetic */ AnonymousClass1932 LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C193A(AnonymousClass1932 anonymousClass1932, boolean z, boolean z2) {
        super(1);
        this.LL = anonymousClass1932;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C905240ZfG c905240ZfG) {
        AnonymousClass1933.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
