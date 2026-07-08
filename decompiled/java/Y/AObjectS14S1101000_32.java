package Y;

import X.C21365518jN;
import X.C21365818jQ;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class AObjectS14S1101000_32 implements Function1 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS14S1101000_32 aObjectS14S1101000_32, Object obj) {
        C21365818jQ c21365818jQ = (C21365818jQ) aObjectS14S1101000_32.l1;
        c21365818jQ.LJFF.runOnUiThread(new ARunnableS8S1201000_32(aObjectS14S1101000_32.i2, c21365818jQ, (Integer) obj, aObjectS14S1101000_32.s0, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS14S1101000_32 aObjectS14S1101000_32, Object obj) {
        C21365518jN c21365518jN = (C21365518jN) aObjectS14S1101000_32.l1;
        c21365518jN.LJFF.runOnUiThread(new ARunnableS8S1201000_32(aObjectS14S1101000_32.i2, c21365518jN, (Integer) obj, aObjectS14S1101000_32.s0, 1));
        return Unit.LIZ;
    }

    public AObjectS14S1101000_32(Object obj, int i, String str, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.i2 = i;
        this.s0 = str;
    }
}
