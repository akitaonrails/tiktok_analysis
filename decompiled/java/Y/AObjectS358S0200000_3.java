package Y;

import X.C09A7;
import X.C0L3D;
import X.C118300cf;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public class AObjectS358S0200000_3 implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS358S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object invoke$0(AObjectS358S0200000_3 aObjectS358S0200000_3, Object obj, Object obj2) {
        return C09A7.LJIIIZ((CoroutineContext[]) aObjectS358S0200000_3.l0, (C118300cf) aObjectS358S0200000_3.l1, (Unit) obj, (CoroutineContext.Element) obj2);
    }

    public static final Object invoke$1(AObjectS358S0200000_3 aObjectS358S0200000_3, Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        ((C0L3D) aObjectS358S0200000_3.l0).LJJJJZI(((Number) obj2).longValue());
        if (jLongValue == 0) {
            ((CountDownLatch) aObjectS358S0200000_3.l1).countDown();
        }
        return Unit.LIZ;
    }
}
