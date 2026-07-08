package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0L8k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538080L8k extends AbstractC538070L8j {
    public Set<? extends InterfaceC538100L8m> LJII = C08CX.INSTANCE;
    public int LJIIIIZZ;
    public Function1<? super C0FQS, Unit> LJIIIZ;
    public Function1<? super C381350ExJ, Unit> LJIIJ;
    public Function1<? super Float, Unit> LJIIJJI;

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final int LJIL() {
        return 0;
    }

    @Override // X.InterfaceC538100L8m
    public final String getTaskName() {
        return "END";
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final boolean LJIIJJI() {
        Set<? extends InterfaceC538100L8m> set = this.LJII;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (InterfaceC538100L8m interfaceC538100L8m : set) {
                if (interfaceC538100L8m.getStatus() == C0L94.CANCELED || interfaceC538100L8m.getStatus() == C0L94.FAILED) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final boolean LJIIZILJ(C0FQS c0fqs) {
        if (LJIJ() && super.LJIIZILJ(c0fqs)) {
            Function1<? super C0FQS, Unit> function1 = this.LJIIIZ;
            if (function1 != null) {
                function1.invoke(c0fqs);
            }
            LIZJ(c0fqs, null);
            return false;
        }
        return false;
    }

    @Override // X.AbstractC538070L8j
    public final void LJJIIZ(C381350ExJ c381350ExJ) {
        Iterator<T> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            ((InterfaceC538100L8m) it2.next()).LJJIII();
        }
        Function1<? super C381350ExJ, Unit> function1 = this.LJIIJ;
        if (function1 != null) {
            function1.invoke(c381350ExJ);
        }
    }

    @Override // X.AbstractC538070L8j
    public final void LJJIIZI(float f) {
        Function1<? super Float, Unit> function1;
        Iterator<? extends InterfaceC538100L8m> it2 = this.LJII.iterator();
        float fLJIILIIL = 0.0f;
        while (it2.hasNext()) {
            fLJIILIIL += it2.next().LJIILIIL() * r0.LJIL();
        }
        int i = this.LJIIIIZZ;
        if (i > 0 && (function1 = this.LJIIJJI) != null) {
            function1.invoke(Float.valueOf(fLJIILIIL / i));
        }
    }
}
