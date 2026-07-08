package Y;

import X.C1304040k2U;
import X.C1307030k7J;
import X.InterfaceC1307040k7K;
import com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public class AObjectS363S0100000_20 implements Function1 {
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

    public AObjectS363S0100000_20(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS363S0100000_20 aObjectS363S0100000_20, Object obj) {
        ((InterfaceC1307040k7K) aObjectS363S0100000_20.l0).LIZ((C1307030k7J) obj);
        return null;
    }

    public static final Object invoke$1(AObjectS363S0100000_20 aObjectS363S0100000_20, Object obj) {
        IMiniGameRuntimeAPI.LaunchResultListener launchResultListener = ((C1304040k2U) aObjectS363S0100000_20.l0).LJII;
        if (launchResultListener != null) {
            launchResultListener.onFirstOnScreenCanvasFrame();
        }
        return Unit.LIZ;
    }
}
