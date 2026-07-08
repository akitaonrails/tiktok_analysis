package Y;

import X.C1C7U;
import X.C570490MZb;
import X.C684030QsL;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public class ACallableS13S0010000_8 implements Callable {
    public final int $t;
    public boolean z0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS13S0010000_8 aCallableS13S0010000_8) {
        C1C7U.LIZ("MemoryGainPerformanceMonitor@4454.recordBeforeClickMemory$1");
        C684030QsL.LIZ = C684030QsL.LIZ();
        C684030QsL.LIZIZ = aCallableS13S0010000_8.z0;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MemoryGainPerformanceMonitor@4454.recordBeforeClickMemory$1");
        return unit;
    }

    public static final Object call$1(ACallableS13S0010000_8 aCallableS13S0010000_8) {
        C1C7U.LIZ("CreativeFiles@e055.smartCreateNewFileWithCleanCache$2");
        C570490MZb.LIZ(aCallableS13S0010000_8.z0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreativeFiles@e055.smartCreateNewFileWithCleanCache$2");
        return unit;
    }

    public ACallableS13S0010000_8(boolean z, int i) {
        this.$t = i;
        this.z0 = z;
    }
}
