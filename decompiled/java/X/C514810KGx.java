package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C514810KGx extends C09AY implements Function1<C514770KGt, Unit> {
    public final /* synthetic */ C514820KGy LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C514810KGx(C514820KGy c514820KGy) {
        super(1);
        this.LL = c514820KGy;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C514770KGt c514770KGt) {
        C514770KGt c514770KGt2 = c514770KGt;
        C16F5 c16f5 = this.LL.LL;
        if (c16f5 != null) {
            if (c514770KGt2.LJIIIIZZ) {
                c16f5.setText(C497740JfY.LJIJJ(2131830312, c514770KGt2.LJIIIZ));
                C500260Jjc.LLFFF(c16f5);
            } else if (c514770KGt2.LIZIZ) {
                int i = c514770KGt2.LJI;
                c16f5.setText(C497740JfY.LJIIL(2131755522, i, Integer.valueOf(i)));
                C500260Jjc.LLFFF(c16f5);
            } else {
                C500260Jjc.LJIILIIL(c16f5);
            }
        }
        return Unit.LIZ;
    }
}
