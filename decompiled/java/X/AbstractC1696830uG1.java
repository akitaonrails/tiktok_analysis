package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0uG1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1696830uG1 {
    public Function1<? super AbstractC1696830uG1, Unit> LIZ;

    public abstract void LIZ(InterfaceC1675870tiD interfaceC1675870tiD);

    public final void LIZJ() {
        Function1<AbstractC1696830uG1, Unit> function1LIZIZ = LIZIZ();
        if (function1LIZIZ != null) {
            function1LIZIZ.invoke(this);
        }
    }

    public Function1<AbstractC1696830uG1, Unit> LIZIZ() {
        return this.LIZ;
    }

    public void LIZLLL(AwS604S0100000_25 awS604S0100000_25) {
        this.LIZ = awS604S0100000_25;
    }
}
