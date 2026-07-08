package Y;

import X.C0C64;
import X.C1917907fF;
import X.C2168808ec;
import X.C452550Hor;
import X.EnumC799870VZh;
import com.google.gson.Gson;
import com.ss.android.vesdk.VEUtils;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public class AObjectS56S0000000_3 implements Function0 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public AObjectS56S0000000_3(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS56S0000000_3 aObjectS56S0000000_3) {
        return EnumC799870VZh.BACKGROUND;
    }

    public static final Object invoke$1(AObjectS56S0000000_3 aObjectS56S0000000_3) {
        return EnumC799870VZh.BOOT_FINISH;
    }

    public static final Object invoke$2(AObjectS56S0000000_3 aObjectS56S0000000_3) {
        return new C2168808ec();
    }

    public static final Object invoke$3(AObjectS56S0000000_3 aObjectS56S0000000_3) {
        return Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "open_clear_fresco_map", true, true));
    }

    public static final Object invoke$4(AObjectS56S0000000_3 aObjectS56S0000000_3) {
        return new C1917907fF();
    }

    public static final Object invoke$5(AObjectS56S0000000_3 aObjectS56S0000000_3) {
        return new Gson();
    }

    public static final Object invoke$6(AObjectS56S0000000_3 aObjectS56S0000000_3) {
        return VEUtils.createRTAudioWaveformMgr(2, 1, 44100, 33.0f, 2);
    }

    public AObjectS56S0000000_3(C452550Hor c452550Hor, int i) {
        this.$t = i;
    }
}
