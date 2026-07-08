package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zA1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1885310zA1 extends C09AY implements Function1<C1885320zA2, Unit> {
    public final /* synthetic */ Function1<C1885270z9x, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1885310zA1(C1885210z9r c1885210z9r) {
        super(1);
        this.LL = c1885210z9r;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1885320zA2 c1885320zA2) {
        C1885320zA2 c1885320zA22 = c1885320zA2;
        Function1<C1885270z9x, Unit> function1 = this.LL;
        if (function1 != null) {
            function1.invoke(new C1885270z9x(c1885320zA22.LIZ, c1885320zA22.LIZIZ, c1885320zA22.LIZJ, c1885320zA22.LIZLLL, c1885320zA22.LJ));
        }
        return Unit.LIZ;
    }
}
