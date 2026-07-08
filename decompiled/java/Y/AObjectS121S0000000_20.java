package Y;

import X.C1276890jKh;
import X.C1300480jwk;
import X.C465520INi;
import com.bytedance.android.starship.StarshipBridge;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public class AObjectS121S0000000_20 implements Function1 {
    public final int $t;

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

    public AObjectS121S0000000_20(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS121S0000000_20 aObjectS121S0000000_20, Object obj) {
        Map map = (Map) obj;
        C1300480jwk c1300480jwk = C1276890jKh.LIZ;
        C1276890jKh.LJIJI = (String) map.get("cpu_cores");
        C1276890jKh.LJIJJ = (String) map.get("cpu_rate");
        C1276890jKh.LJIJJLI = (String) map.get("cpu_speed");
        C1276890jKh.LJIL = (String) map.get("single_cores_cpu_speed");
        C1276890jKh.LJJ = (String) map.get("app_max_memory");
        C1276890jKh.LJJI = (String) map.get("memory_app_allocate");
        C1276890jKh.LJJIFFI = (String) map.get("memory_usage_rate_android");
        C1276890jKh.LJJII = (String) map.get("pss_app_usage");
        C465520INi.LIZ.zO1(aObjectS121S0000000_20);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS121S0000000_20 aObjectS121S0000000_20, Object obj) {
        StarshipBridge.Companion.onSignalConfigUpdate((String) obj);
        return Unit.LIZ;
    }
}
