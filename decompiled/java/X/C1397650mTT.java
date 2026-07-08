package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mTT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397650mTT {
    public final int LIZ;
    public final Function1<C1397660mTU, Unit> LIZIZ;
    public Function1<? super C197039127h, Unit> LIZLLL;
    public CharSequence LJFF;
    public final List<C197039127h> LIZJ = new ArrayList();
    public boolean LJ = true;

    public final void LIZ(Function1<? super C197039127h, Unit> function1) {
        this.LIZLLL = function1;
        Iterator it2 = ((ArrayList) this.LIZJ).iterator();
        while (it2.hasNext()) {
            function1.invoke(it2.next());
        }
    }

    public final void LIZIZ(boolean z) {
        Iterator<C197039127h> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().setEnabled(z);
        }
        this.LJ = z;
    }

    public C1397650mTT(int i, CharSequence charSequence, Function1 function1) {
        this.LIZ = i;
        this.LIZIZ = function1;
        this.LJFF = charSequence;
    }
}
