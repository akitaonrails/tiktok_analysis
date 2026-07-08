package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.109B, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C109B extends AnonymousClass1041 implements InterfaceC191854103w {
    public final Integer LIZJ;
    public final CharSequence LIZLLL;
    public final CharSequence LJ;
    public final Function2<View, Boolean, Unit> LJFF;
    public final Function1<View, Unit> LJI;
    public final Function1<View, Boolean> LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final AnonymousClass1098 LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;

    public C109B() {
        throw null;
    }

    @Override // X.InterfaceC191854103w
    public final boolean x0() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC191854103w
    public final void LIZJ(boolean z) {
        this.LJIILIIL = z;
    }

    @Override // X.InterfaceC191854103w
    public final void LIZLLL(boolean z) {
        this.LJIIL = z;
    }

    public C109B(Integer num, CharSequence charSequence, CharSequence charSequence2, Function2 function2, Function1 function1, Function1 function12, boolean z, boolean z2, boolean z3, AnonymousClass1098 anonymousClass1098, Function0 function0, int i) {
        num = (i & 1) != 0 ? null : num;
        charSequence2 = (i & 4) != 0 ? null : charSequence2;
        function2 = (i & 8) != 0 ? null : function2;
        function1 = (i & 16) != 0 ? null : function1;
        function12 = (i & 32) != 0 ? null : function12;
        z = (i & 64) != 0 ? false : z;
        z2 = (i & 128) != 0 ? false : z2;
        z3 = (i & 256) != 0 ? true : z3;
        anonymousClass1098 = (i & 1024) != 0 ? null : anonymousClass1098;
        function0 = (i & 8192) != 0 ? null : function0;
        this.LIZJ = num;
        this.LIZLLL = charSequence;
        this.LJ = charSequence2;
        this.LJFF = function2;
        this.LJI = function1;
        this.LJII = function12;
        this.LJIIIIZZ = z;
        this.LJIIIZ = z2;
        this.LJIIJ = z3;
        this.LJIIJJI = anonymousClass1098;
        this.LJIIL = false;
        this.LJIILIIL = false;
        this.LIZ = function0;
        this.LIZIZ = null;
    }
}
