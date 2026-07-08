package Y;

import X.C21206017yk;
import X.C21206117yl;
import X.C21206217ym;
import X.C21206317yn;
import X.InterfaceC1631620sYq;
import kotlin.Unit;

/* JADX INFO: loaded from: classes33.dex */
public class AObjectS538S0100000_32 implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public AObjectS538S0100000_32(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS538S0100000_32 aObjectS538S0100000_32, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        long jLongValue = ((Number) obj3).longValue();
        if (3 == iIntValue) {
            ((C21206017yk) aObjectS538S0100000_32.l0).LIZJ().LIZ(0);
        } else {
            ((C21206017yk) aObjectS538S0100000_32.l0).LLILLL.LJJI(2, jLongValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS538S0100000_32 aObjectS538S0100000_32, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        long jLongValue = ((Number) obj3).longValue();
        if (3 == iIntValue) {
            ((C21206217ym) aObjectS538S0100000_32.l0).LIZJ().LIZ(2);
        } else {
            ((C21206217ym) aObjectS538S0100000_32.l0).LLILLL.LJJI(1, jLongValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS538S0100000_32 aObjectS538S0100000_32, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        long jLongValue = ((Number) obj3).longValue();
        if (3 == iIntValue) {
            ((C21206117yl) aObjectS538S0100000_32.l0).LIZJ().LIZ(0);
        } else {
            ((C21206117yl) aObjectS538S0100000_32.l0).LLILLL.LJJI(2, jLongValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS538S0100000_32 aObjectS538S0100000_32, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        long jLongValue = ((Number) obj3).longValue();
        if (3 == iIntValue) {
            ((C21206317yn) aObjectS538S0100000_32.l0).LIZJ().LIZ(2);
        } else {
            ((C21206317yn) aObjectS538S0100000_32.l0).LLILLL.LJJI(1, jLongValue);
        }
        return Unit.LIZ;
    }
}
