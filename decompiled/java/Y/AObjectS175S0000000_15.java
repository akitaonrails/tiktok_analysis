package Y;

import X.EnumC947020ake;
import X.InterfaceC1631620sYq;
import X.InterfaceC949260aoG;
import kotlin.Unit;

/* JADX INFO: loaded from: classes16.dex */
public class AObjectS175S0000000_15 implements InterfaceC1631620sYq {
    public final int $t;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public AObjectS175S0000000_15(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS175S0000000_15 aObjectS175S0000000_15, Object obj, Object obj2, Object obj3) {
        ((InterfaceC949260aoG) obj3).LIZIZ((EnumC947020ake) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS175S0000000_15 aObjectS175S0000000_15, Object obj, Object obj2, Object obj3) {
        ((InterfaceC949260aoG) obj3).LIZ((EnumC947020ake) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS175S0000000_15 aObjectS175S0000000_15, Object obj, Object obj2, Object obj3) {
        ((InterfaceC949260aoG) obj3).LIZJ((EnumC947020ake) obj, (Long) obj2);
        return Unit.LIZ;
    }
}
