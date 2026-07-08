package X;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0ixB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262310ixB {
    public final C19EG LIZ;
    public final Fragment LIZIZ;
    public final C1262090iwp LIZJ;
    public final C1262320ixC LIZLLL;
    public final C1261270ivV LJ;
    public final C1262590ixd LJFF;
    public Function0<Unit> LJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C1262310ixB() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    public final void LIZ(Function1<? super C1262590ixd, Unit> function1) {
        function1.invoke(this.LJFF);
    }

    public final void LIZIZ(Function1<? super C1262320ixC, Unit> function1) {
        function1.invoke(this.LIZLLL);
    }

    public final void LIZJ(Function1<? super C1261270ivV, Unit> function1) {
        function1.invoke(this.LJ);
    }

    public final void LIZLLL(Function1<? super C1262090iwp, Unit> function1) {
        function1.invoke(this.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1262310ixB(C19EG c19eg, Fragment fragment) {
        this.LIZ = c19eg;
        this.LIZIZ = fragment;
        String str = null;
        this.LIZJ = new C1262090iwp(0);
        this.LIZLLL = new C1262320ixC(0);
        this.LJ = new C1261270ivV(str, str, str, str, 0 == true ? 1 : 0, str, str, str, 0 == true ? 1 : 0, 33554431);
        this.LJFF = new C1262590ixd(null, 2097151);
        this.LJI = AFwS207S0000000_19.get$arr$(306);
    }

    public /* synthetic */ C1262310ixB(C19EG c19eg, Fragment fragment, int i) {
        this((i & 1) != 0 ? null : c19eg, (i & 2) != 0 ? null : fragment);
    }
}
