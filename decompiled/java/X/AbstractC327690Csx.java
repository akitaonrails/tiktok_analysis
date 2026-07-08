package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Csx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC327690Csx {
    public final Function0<Unit> LIZ;
    public final Function2<? super Long, ? super Long, Unit> LIZIZ;
    public final List<? extends AbstractC315550CYn> LIZJ;
    public final C0CVI LIZLLL;
    public boolean LJ;

    public abstract void LIZIZ(List<C327610Csp> list);

    public abstract void LIZJ(int i, List list);

    public abstract void LIZLLL(List list);

    public abstract void LJ(List<C327610Csp> list);

    public abstract void LJI(int i, boolean z, List list);

    public final void LJFF() {
        List<? extends AbstractC315550CYn> list = this.LIZJ;
        if (list != null) {
            for (AbstractC315550CYn abstractC315550CYn : list) {
                if (abstractC315550CYn != null) {
                    abstractC315550CYn.LIZIZ = false;
                    long jLIZ = this.LIZLLL.LIZ();
                    abstractC315550CYn.LIZIZ = false;
                    abstractC315550CYn.LIZLLL = jLIZ;
                }
            }
        }
    }

    public final boolean LIZ(List<C327610Csp> list) {
        if (InterfaceC1106030et7.r6.LIZIZ().booleanValue() && (!list.isEmpty()) && !this.LJ) {
            return true;
        }
        return false;
    }

    public AbstractC327690Csx(Function0 function0, Function2 function2, List list, C0CVI c0cvi) {
        this.LIZ = function0;
        this.LIZIZ = function2;
        this.LIZJ = list;
        this.LIZLLL = c0cvi;
    }
}
