package Y;

import X.C1748770vbn;
import X.C1748780vbo;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AObjectS345S0100000_1 implements Function1 {
    public final int $t;
    public Object l0;

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

    /* JADX WARN: Multi-variable type inference failed */
    public AObjectS345S0100000_1(Function1 function1, Function1<? super LaneParams, Unit> function12) {
        this.$t = function12;
        this.l0 = function1;
    }

    public static final Object invoke$0(AObjectS345S0100000_1 aObjectS345S0100000_1, Object obj) {
        C1748780vbo.LIZIZ((C1748770vbn) obj, "lib_track_builtin_lane_param_pass", (Function1) aObjectS345S0100000_1.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS345S0100000_1 aObjectS345S0100000_1, Object obj) {
        C1748780vbo.LIZIZ((C1748770vbn) obj, "lib_track_builtin_lane_param_pass", (Function1) aObjectS345S0100000_1.l0);
        return Unit.LIZ;
    }
}
