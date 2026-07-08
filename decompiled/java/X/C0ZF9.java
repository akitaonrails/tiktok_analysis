package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: renamed from: X.0ZF9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZF9 {
    public static final C01GW<C0ZF9> LIZLLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(543));
    public final Function0<C0ZFD> LIZ;
    public final Function1<String, Boolean> LIZIZ;
    public volatile C0ZFD LIZJ;

    public C0ZF9() {
        this(null);
    }

    public final C0ZFD LIZIZ() {
        Function1<String, Boolean> function1 = this.LIZIZ;
        C0ZFD c0zfd = this.LIZJ;
        if (!function1.invoke(c0zfd != null ? c0zfd.LIZ : null).booleanValue()) {
            this.LIZJ = this.LIZ.invoke();
        }
        return this.LIZJ;
    }

    public final void LIZ() {
        C0ZFD c0zfdLIZIZ = LIZIZ();
        if (c0zfdLIZIZ != null) {
            C23250099c.LIZLLL(c0zfdLIZIZ.LIZLLL, null, null, new C0ZFA(c0zfdLIZIZ, null), 3);
        }
    }

    public C0ZF9(Object obj) {
        AFwS201S0000000_14 aFwS201S0000000_14 = AFwS201S0000000_14.get$arr$(542);
        AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(843);
        this.LIZ = aFwS201S0000000_14;
        this.LIZIZ = aFwS229S0000000_2;
    }
}
