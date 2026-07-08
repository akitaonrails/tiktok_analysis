package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DHc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2253221DHc extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1DHY LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2253221DHc(C1DHY c1dhy, int i, float f, boolean z) {
        super(0);
        this.LL = c1dhy;
        this.LLILLJJLI = i;
        this.LLILLL = f;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1DHZ c1dhz = this.LL.LIZIZ;
        if (c1dhz != null) {
            c1dhz.LJFF(this.LLILLL, this.LLILLJJLI, this.LLILZ);
        }
        return Unit.LIZ;
    }
}
