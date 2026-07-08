package X;

import X.C1ETD;
import X.InterfaceC1659130tHD;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0t4p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1651450t4p<STATE extends C1ETD, ACTION extends InterfaceC1659130tHD<? super STATE>> implements InterfaceC379610EuV {
    public final C1DRG LL;
    public final EnumC1651310t4b LLILLJJLI = EnumC1651310t4b.SLIDE;

    public abstract AbstractC1651430t4n LJ();

    public abstract Function0<STATE> LJI();

    public abstract InterfaceC1651490t4t LJIIIIZZ();

    public abstract EnumC1651770t5L LJIIIZ();

    public void LJIIJ() {
    }

    public final STATE LJFF() {
        STATE state = (STATE) LJIIIIZZ().LIZJ(LJIIIZ());
        if (state != null) {
            return state;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIIIZ().getKey());
        sbLIZ.append(" has not been registered");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public EnumC1651310t4b LJII() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public AbstractC1651450t4p(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void LJIIJJI(Function1<? super STATE, ? extends STATE> function1) {
        LJIIIIZZ().LJ(LJIIIZ(), function1);
    }
}
