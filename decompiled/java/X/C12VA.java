package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12VA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12VA {
    public static C12V9 LIZ() {
        C12VB c12vb;
        Function1<C12V9, Unit> function1LIZJ;
        if (C12V9.LJIILJJIL.compareAndSet(false, true) && (c12vb = C12V9.LJIILIIL) != null && (function1LIZJ = c12vb.LIZJ()) != null) {
            function1LIZJ.invoke(C12V9.LJIIL);
        }
        return C12V9.LJIIL;
    }
}
