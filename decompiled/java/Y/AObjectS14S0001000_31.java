package Y;

import X.C2188811AlT;
import com.bytedance.applog.priority.PriorityWrapper;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public class AObjectS14S0001000_31 implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f275i0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS14S0001000_31 aObjectS14S0001000_31) {
        int i = aObjectS14S0001000_31.f275i0;
        List<String> list = PriorityWrapper.LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("native invoke onEvent failed: ");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AObjectS14S0001000_31 aObjectS14S0001000_31) {
        int i = aObjectS14S0001000_31.f275i0;
        List<String> list = PriorityWrapper.LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add session duration to native failed: ");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AObjectS14S0001000_31 aObjectS14S0001000_31) {
        int i = aObjectS14S0001000_31.f275i0;
        List<String> list = PriorityWrapper.LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("new session to native failed: ");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AObjectS14S0001000_31 aObjectS14S0001000_31) {
        int i = aObjectS14S0001000_31.f275i0;
        List<String> list = PriorityWrapper.LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("native invoke init failed: ");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AObjectS14S0001000_31(int i, int i2) {
        this.$t = i2;
        this.f275i0 = i;
    }
}
