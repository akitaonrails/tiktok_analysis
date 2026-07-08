package Y;

import X.C760300Ts4;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class AObjectS288S0200000_12 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS288S0200000_12 aObjectS288S0200000_12) {
        C760300Ts4 c760300Ts4 = (C760300Ts4) aObjectS288S0200000_12.l0;
        DataChannel dataChannel = (DataChannel) aObjectS288S0200000_12.l1;
        c760300Ts4.getClass();
        C760300Ts4.LIZJ(dataChannel, "report");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS288S0200000_12 aObjectS288S0200000_12) {
        C760300Ts4 c760300Ts4 = (C760300Ts4) aObjectS288S0200000_12.l0;
        DataChannel dataChannel = (DataChannel) aObjectS288S0200000_12.l1;
        c760300Ts4.getClass();
        C760300Ts4.LIZJ(dataChannel, "slide_close");
        return Unit.LIZ;
    }

    public AObjectS288S0200000_12(C760300Ts4 c760300Ts4, DataChannel dataChannel, int i) {
        this.$t = i;
        this.l0 = c760300Ts4;
        this.l1 = dataChannel;
    }
}
