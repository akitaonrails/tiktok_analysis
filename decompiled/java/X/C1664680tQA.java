package X;

import Y.ARunnableS20S0210000_19;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tQA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664680tQA<STATE> extends C1664690tQB<STATE> {
    public C1664680tQA(C194335111h c194335111h) {
        super(null, c194335111h);
    }

    public C1664680tQA(Object obj) {
        super(null, obj);
    }

    @Override // X.C1664690tQB
    public final void LIZJ(Function1 function1, boolean z) {
        super.LIZJ(function1, z);
    }

    public final void LIZLLL(Function1 function1, boolean z) {
        if (!C1664630tQ5.LIZLLL) {
            getClass();
            if (C1659720tIA.LIZIZ() && !this.LIZJ) {
                this.LIZ = (STATE) function1.invoke(this.LIZ);
                LIZIZ(z);
                return;
            } else {
                LIZJ(function1, z);
                return;
            }
        }
        if (C1659720tIA.LIZIZ()) {
            if (!this.LIZJ) {
                this.LIZ = (STATE) function1.invoke(this.LIZ);
                LIZIZ(z);
                do {
                    List listLLIIII = C13LP.LLIIII(this.LJ);
                    ((ArrayList) this.LJ).clear();
                    Iterator it2 = listLLIIII.iterator();
                    while (it2.hasNext()) {
                        ((Runnable) it2.next()).run();
                    }
                } while (!((ArrayList) this.LJ).isEmpty());
                return;
            }
            ((ArrayList) this.LJ).add(new ARunnableS20S0210000_19(function1, this, z, 2));
            C1659700tI8.LIZ("setState while change in progress");
            return;
        }
        LIZJ(function1, z);
    }
}
