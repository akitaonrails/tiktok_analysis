package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KHJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KHJ extends C09AY implements Function1<C514770KGt, Unit> {
    public final /* synthetic */ C0KHF LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KHJ(C0KHF c0khf) {
        super(1);
        this.LL = c0khf;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C514770KGt c514770KGt) {
        C514770KGt c514770KGt2 = c514770KGt;
        this.LL.LL.setText(c514770KGt2.LIZLLL);
        if (c514770KGt2.LJ) {
            C16F5 c16f5 = this.LL.LL;
            if (c16f5 != null) {
                C500260Jjc.LLFFF(c16f5);
            }
        } else {
            C16F5 c16f52 = this.LL.LL;
            if (c16f52 != null) {
                C500260Jjc.LJIILIIL(c16f52);
            }
        }
        return Unit.LIZ;
    }
}
