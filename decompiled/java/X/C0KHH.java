package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KHH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KHH extends C09AY implements Function1<C514770KGt, Unit> {
    public final /* synthetic */ C0KHG LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KHH(C0KHG c0khg) {
        super(1);
        this.LL = c0khg;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C514770KGt c514770KGt) {
        String strLJIIL;
        C514770KGt c514770KGt2 = c514770KGt;
        C16F5 c16f5 = this.LL.LL;
        int i = c514770KGt2.LJI;
        if (i == 1) {
            strLJIIL = C497740JfY.LJIJI(2131844439);
        } else {
            strLJIIL = C497740JfY.LJIIL(2131755807, i, Integer.valueOf(i));
        }
        c16f5.setText(strLJIIL);
        if (c514770KGt2.LIZJ) {
            C16F5 c16f52 = this.LL.LL;
            if (c16f52 != null) {
                C500260Jjc.LLFFF(c16f52);
            }
        } else {
            C16F5 c16f53 = this.LL.LL;
            if (c16f53 != null) {
                C500260Jjc.LJIILIIL(c16f53);
            }
        }
        return Unit.LIZ;
    }
}
