package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DHb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2253211DHb extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1DHY LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2253211DHb(C1DHY c1dhy, int i, int i2) {
        super(0);
        this.LL = c1dhy;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1DHZ c1dhz = this.LL.LIZIZ;
        if (c1dhz != null) {
            c1dhz.LIZ(this.LLILLJJLI, this.LLILLL);
        }
        return Unit.LIZ;
    }
}
