package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11VB, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11VB {
    public static final void LIZ(C11VC c11vc, boolean z) {
        c11vc.LJIIJJI().set(z);
        c11vc.LJIIIZ().set(z);
        c11vc.LJ().LJIIIIZZ(Boolean.valueOf(z));
        Function1<Boolean, Unit> function1LIZ = c11vc.LIZ();
        if (function1LIZ != null) {
            function1LIZ.invoke(Boolean.valueOf(z));
        }
    }
}
