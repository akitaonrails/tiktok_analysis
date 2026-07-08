package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sa3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1632370sa3 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C1632310sZx LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1632370sa3(int i, int i2, int i3, C1632310sZx c1632310sZx) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = c1632310sZx;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL == 17 && ((this.LLILLJJLI == 3 || this.LLILLL == 3) && this.LLILZ.W2().rK0().LIZJ().booleanValue())) {
            C1632310sZx c1632310sZx = this.LLILZ;
            c1632310sZx.i3(c1632310sZx.W2().Tk0().LIZJ().booleanValue());
        }
        return Unit.LIZ;
    }
}
