package Y;

import X.C118300cf;
import X.C11NZ;
import X.InterfaceC1487280oo2;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class AkS52S0210000_7 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS52S0210000_7 akS52S0210000_7, Object obj) {
        return ((C11NZ) obj).LJJJ(new AkS52S0210000_7((C118300cf) akS52S0210000_7.l0, (long[]) akS52S0210000_7.l1, akS52S0210000_7.z2, 1), false);
    }

    public static final Object apply$1(AkS52S0210000_7 akS52S0210000_7, Object obj) {
        C118300cf c118300cf = (C118300cf) akS52S0210000_7.l0;
        int i = c118300cf.element;
        if (i >= 0) {
            long[] jArr = (long[]) akS52S0210000_7.l1;
            if (i < jArr.length && akS52S0210000_7.z2) {
                int i2 = i + 1;
                c118300cf.element = i2;
                return C11NZ.LJJJJZ(obj).LJJI(jArr[i2 - 1], TimeUnit.MILLISECONDS);
            }
        }
        return C11NZ.LJJIJLIJ(new Throwable("retry reaches maximum"));
    }

    public static final Object apply$2(AkS52S0210000_7 akS52S0210000_7, Object obj) {
        return ((C11NZ) obj).LJJJ(new AkS52S0210000_7((C118300cf) akS52S0210000_7.l0, (long[]) akS52S0210000_7.l1, akS52S0210000_7.z2, 3), false);
    }

    public static final Object apply$3(AkS52S0210000_7 akS52S0210000_7, Object obj) {
        C118300cf c118300cf = (C118300cf) akS52S0210000_7.l0;
        int i = c118300cf.element;
        if (i >= 0) {
            long[] jArr = (long[]) akS52S0210000_7.l1;
            if (i < jArr.length && akS52S0210000_7.z2) {
                int i2 = i + 1;
                c118300cf.element = i2;
                return C11NZ.LJJJJZ(obj).LJJI(jArr[i2 - 1], TimeUnit.MILLISECONDS);
            }
        }
        return C11NZ.LJJIJLIJ(new Throwable("retry reaches maximum"));
    }

    public AkS52S0210000_7(C118300cf c118300cf, long[] jArr, boolean z, int i) {
        this.$t = i;
        this.l0 = c118300cf;
        this.l1 = jArr;
        this.z2 = z;
    }

    public AkS52S0210000_7(String str, C118300cf c118300cf, long[] jArr, boolean z, C118300cf c118300cf2, int i) {
        this.$t = i;
        this.l0 = c118300cf;
        this.l1 = jArr;
        this.z2 = z;
    }
}
