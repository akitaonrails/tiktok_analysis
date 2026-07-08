package Y;

import X.C703070Rhx;
import X.EnumC699470Rc9;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public class AObjectS161S0000000_11 implements Function2 {
    public final int $t;

    public static final Object invoke$0(AObjectS161S0000000_11 aObjectS161S0000000_11, Object obj, Object obj2) {
        return obj2;
    }

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

    public AObjectS161S0000000_11(int i) {
        this.$t = i;
    }

    public static final Object invoke$1(AObjectS161S0000000_11 aObjectS161S0000000_11, Object obj, Object obj2) {
        C703070Rhx c703070Rhx = (C703070Rhx) obj2;
        if (c703070Rhx.LJ || c703070Rhx.LIZ == EnumC699470Rc9.AVAILABLE) {
            return new C703070Rhx(c703070Rhx.LIZ, c703070Rhx.LIZIZ, c703070Rhx.LIZJ, c703070Rhx.LIZLLL, true);
        }
        return c703070Rhx;
    }
}
