package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0PHq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642400PHq extends AbstractC642430PHt {
    public final C0PHT LIZIZ;

    public final void LIZIZ() {
        for (Function1<C642440PHu, Unit> function1 : this.LIZ) {
            C0PHT c0pht = this.LIZIZ;
            C642440PHu c642440PHu = new C642440PHu(c0pht.LJIIJ, c0pht, function1);
            C0PHT c0pht2 = this.LIZIZ;
            C0PHX c0phx = new C0PHX(c642440PHu.LIZIZ, c642440PHu.LJFF, c642440PHu, false);
            C0PHX c0phx2 = c0pht2.LIZIZ;
            if (c0phx2 == null) {
                c0pht2.LIZ = c0phx;
            } else {
                c0phx.LIZLLL = null;
                c0phx.LJ = c0phx2;
                c0phx2.LIZLLL = c0phx;
            }
            c0pht2.LIZIZ = c0phx;
        }
    }

    public C642400PHq(C0PHT c0pht) {
        this.LIZIZ = c0pht;
    }
}
