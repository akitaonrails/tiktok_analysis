package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aj5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946050aj5 implements C01GT<Object> {
    public final /* synthetic */ C946060aj6<Object> LIZ;

    public final void LJ() {
        Function0<Unit> function0 = this.LIZ.LJIIL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public C946050aj5(C946060aj6<Object> c946060aj6) {
        this.LIZ = c946060aj6;
    }

    @Override // X.C01GT
    public final void LIZ(Object obj) {
        C946060aj6<Object> c946060aj6;
        Function2<? super Object, ? super Object, Unit> function2;
        if ((this.LIZ.LJIIJ || C937280aUw.LIZIZ(this.LIZ.LIZIZ)) && (function2 = (c946060aj6 = this.LIZ).LIZJ) != null) {
            function2.invoke(c946060aj6.LIZ, obj);
        }
    }

    @Override // X.C01GT
    public final void LIZIZ(int i) {
        Function1<? super Integer, Unit> function1 = this.LIZ.LJI;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
        C946060aj6<Object> c946060aj6 = this.LIZ;
        if (c946060aj6.LJIIIZ) {
            Function0<Unit> function0 = c946060aj6.LJFF;
            if (function0 != null) {
                function0.invoke();
            }
            C946060aj6<Object> c946060aj62 = this.LIZ;
            c946060aj62.LIZ = null;
            c946060aj62.LIZIZ = "unknown";
            c946060aj62.LIZJ = null;
            c946060aj62.LJI = null;
            c946060aj62.LJII = null;
            c946060aj62.LJIIIIZZ = null;
            c946060aj62.LJFF = null;
            c946060aj62.LJIIL = null;
            c946060aj62.LJIILIIL = null;
        }
    }

    public final void LIZJ(long j) {
        Function1<? super Long, Unit> function1 = this.LIZ.LIZLLL;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j));
        }
    }

    public final void LIZLLL(String str) {
        if (!Intrinsics.LJFF(str, "has_params")) {
            this.LIZ.LJIIJ = false;
        }
        Function1<? super String, Unit> function1 = this.LIZ.LJII;
        if (function1 != null) {
            function1.invoke(str);
        }
    }

    public final void LJFF(int i) {
        Function1<? super Integer, Unit> function1 = this.LIZ.LJIIIIZZ;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }
}
