package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0PHr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642410PHr extends AbstractC642430PHt {
    public final C0PHT LIZIZ;

    public final void LIZIZ() {
        C0PHX c0phx;
        C0PHX c0phxLJII;
        for (Function1<C642440PHu, Unit> function1 : this.LIZ) {
            C0PHT c0pht = this.LIZIZ;
            C642440PHu c642440PHu = new C642440PHu(c0pht.LJIIJ, c0pht, function1);
            C0PHW c0phwLIZJ = this.LIZIZ.LIZJ();
            if (c0phwLIZJ != null && (c0phx = c0phwLIZJ.LIZJ) != null && (c0phxLJII = c0phx.LJII()) != null) {
                C0PHX c0phx2 = new C0PHX(c642440PHu.LIZIZ, c642440PHu.LJFF, c642440PHu, false);
                c0phx2.LIZLLL = null;
                c0phx2.LJ = c0phxLJII;
                c0phxLJII.LIZLLL = c0phx2;
            }
        }
    }

    public C642410PHr(C0PHT c0pht) {
        this.LIZIZ = c0pht;
    }
}
