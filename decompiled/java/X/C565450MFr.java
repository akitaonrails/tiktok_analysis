package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS622S0100000_8;

/* JADX INFO: renamed from: X.0MFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565450MFr<T> {
    public final Function1<T, Unit> LIZ;
    public final Function1<String, Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function2<Integer, Integer, Unit> LIZLLL;
    public final Function1<C557390LtZ, Unit> LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C565450MFr() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31);
    }

    public /* synthetic */ C565450MFr(AwS587S0100000_8 awS587S0100000_8, AwS587S0100000_8 awS587S0100000_82, AwS622S0100000_8 awS622S0100000_8, int i) {
        this((i & 1) != 0 ? null : awS587S0100000_8, (i & 2) != 0 ? null : awS587S0100000_82, null, (i & 8) != 0 ? null : awS622S0100000_8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C565450MFr(Function1<? super T, Unit> function1, Function1<? super String, Unit> function12, Function0<Unit> function0, Function2<? super Integer, ? super Integer, Unit> function2, Function1<? super C557390LtZ, Unit> function13) {
        this.LIZ = function1;
        this.LIZIZ = function12;
        this.LIZJ = function0;
        this.LIZLLL = function2;
        this.LJ = function13;
    }
}
