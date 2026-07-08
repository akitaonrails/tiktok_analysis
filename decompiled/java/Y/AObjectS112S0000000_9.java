package Y;

import X.C0PLT;
import X.C1538590q8n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AObjectS112S0000000_9 implements Function1 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public AObjectS112S0000000_9(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS112S0000000_9 aObjectS112S0000000_9, Object obj) {
        C0PLT c0plt = (C0PLT) obj;
        if (c0plt != null && c0plt.getAweme() != null) {
            return c0plt.getAweme().getAuthor();
        }
        return null;
    }

    public static final Object invoke$1(AObjectS112S0000000_9 aObjectS112S0000000_9, Object obj) {
        ((C1538590q8n) obj).LJIIIIZZ = true;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS112S0000000_9 aObjectS112S0000000_9, Object obj) {
        C0PLT c0plt = (C0PLT) obj;
        if (c0plt != null) {
            return c0plt.getAweme();
        }
        return null;
    }
}
