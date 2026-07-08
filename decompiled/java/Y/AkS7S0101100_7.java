package Y;

import X.C11NZ;
import X.InterfaceC1487280oo2;
import X.InterfaceC500500Jk0;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public class AkS7S0101100_7 implements InterfaceC1487280oo2 {
    public final int $t;
    public int i1;
    public long j2;
    public Object l0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public AkS7S0101100_7(Function1 function1, int i) {
        this.$t = i;
        this.i1 = 3;
        this.l0 = function1;
        this.j2 = 500L;
    }

    public static final Object apply$0(AkS7S0101100_7 akS7S0101100_7, Object obj) {
        C11NZ c11nzLJLLL = ((C11NZ) obj).LJLLL(C11NZ.LJJLIIIJILLIZJL(1, akS7S0101100_7.i1), new InterfaceC500500Jk0() { // from class: X.0Jk3
            @Override // X.InterfaceC500500Jk0
            public final Object apply(Object obj2, Object obj3) {
                return new Pair(obj2, obj3);
            }
        });
        final Function1 function1 = (Function1) akS7S0101100_7.l0;
        final int i = akS7S0101100_7.i1;
        final long j = akS7S0101100_7.j2;
        return c11nzLJLLL.LJJJ(new InterfaceC1487280oo2() { // from class: X.01Aj
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj2) {
                Pair pair = (Pair) obj2;
                Throwable th = (Throwable) pair.getFirst();
                Integer num = (Integer) pair.getSecond();
                if (function1.invoke(th).booleanValue() && num.intValue() < i) {
                    return C11NZ.LJLJJLL(j, TimeUnit.MILLISECONDS);
                }
                return C11NZ.LJJIJLIJ(th);
            }
        }, false);
    }

    public static final Object apply$1(AkS7S0101100_7 akS7S0101100_7, Object obj) {
        C11NZ c11nzLJLLL = ((C11NZ) obj).LJLLL(C11NZ.LJJLIIIJILLIZJL(1, akS7S0101100_7.i1), new InterfaceC500500Jk0() { // from class: X.0Jk4
            @Override // X.InterfaceC500500Jk0
            public final Object apply(Object obj2, Object obj3) {
                return new Pair(obj2, obj3);
            }
        });
        final Function1 function1 = (Function1) akS7S0101100_7.l0;
        final int i = akS7S0101100_7.i1;
        final long j = akS7S0101100_7.j2;
        return c11nzLJLLL.LJJJ(new InterfaceC1487280oo2() { // from class: X.01Ak
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj2) {
                Pair pair = (Pair) obj2;
                Throwable th = (Throwable) pair.getFirst();
                Integer num = (Integer) pair.getSecond();
                if (function1.invoke(th).booleanValue() && num.intValue() < i) {
                    return C11NZ.LJLJJLL(j, TimeUnit.MILLISECONDS);
                }
                return C11NZ.LJJIJLIJ(th);
            }
        }, false);
    }

    public AkS7S0101100_7(int i, long j, AFwS237S0000000_7 aFwS237S0000000_7, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = aFwS237S0000000_7;
        this.j2 = j;
    }
}
