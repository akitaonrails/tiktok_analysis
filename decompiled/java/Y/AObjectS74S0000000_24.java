package Y;

import X.C0TN6;
import X.C19281710c3;
import X.C2188811AlT;
import X.EnumC799870VZh;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class AObjectS74S0000000_24 implements Function0 {
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
            default:
                return null;
        }
    }

    public AObjectS74S0000000_24(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS74S0000000_24 aObjectS74S0000000_24) {
        PopupManager.LIZJ(C0TN6.class);
        return null;
    }

    public static final Object invoke$1(AObjectS74S0000000_24 aObjectS74S0000000_24) {
        return EnumC799870VZh.BACKGROUND;
    }

    public static final Object invoke$2(AObjectS74S0000000_24 aObjectS74S0000000_24) {
        return EnumC799870VZh.IDLE;
    }

    public static final Object invoke$3(AObjectS74S0000000_24 aObjectS74S0000000_24) {
        return MainActivity.lambda$beforeSuperOnCreate$3();
    }

    public static final Object invoke$4(AObjectS74S0000000_24 aObjectS74S0000000_24) {
        return MainActivity.lambda$beforeSuperOnCreate$4();
    }

    public static final Object invoke$5(AObjectS74S0000000_24 aObjectS74S0000000_24) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("coreSwitch: ");
        sbLIZ.append(C19281710c3.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
