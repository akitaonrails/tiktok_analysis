package Y;

import X.C1161920gLG;
import X.C2214851BmN;
import X.InterfaceC2214871BmP;
import com.bytedance.android.live.function.IRoomFunctionService;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class AObjectS65S0000000_12 implements Function0 {
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
            default:
                return null;
        }
    }

    public AObjectS65S0000000_12(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS65S0000000_12 aObjectS65S0000000_12) {
        return ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).yO1();
    }

    public static final Object invoke$1(AObjectS65S0000000_12 aObjectS65S0000000_12) {
        return ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).P10();
    }

    public static final Object invoke$2(AObjectS65S0000000_12 aObjectS65S0000000_12) {
        for (InterfaceC2214871BmP interfaceC2214871BmP : (ArrayList) C2214851BmN.LJ) {
            String str = C2214851BmN.LIZIZ;
            if (str != null) {
                interfaceC2214871BmP.LJFF(str);
            }
        }
        return Unit.LIZ;
    }
}
