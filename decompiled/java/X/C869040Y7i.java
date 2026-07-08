package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Y7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869040Y7i extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ C0YEM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C869040Y7i(C0YEM c0yem) {
        super(1);
        this.LL = c0yem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        C870180YBs c870180YBsLIZ = this.LL.LJIIZILJ().getDomain().LIZ();
        c870180YBsLIZ.getClass();
        new C868990Y7d(c870180YBsLIZ.LLILLL, iIntValue).LJIILJJIL(true);
        return Unit.LIZ;
    }
}
