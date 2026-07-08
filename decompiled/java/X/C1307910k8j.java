package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.jvm.internal.AwS169S1100000_20;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1307910k8j {
    public static final /* synthetic */ int LIZ = 0;

    public static Pair LIZ(String str, String str2) {
        try {
            C588110N4v c588110N4vLIZJ = C1307940k8m.LIZ.LIZIZ().LIZJ(str, new JSONObject(str2));
            C1306430k6L.LIZ(new AwS169S1100000_20(str, c588110N4vLIZJ, 4));
            return new Pair(Boolean.valueOf(c588110N4vLIZJ.LIZ), c588110N4vLIZJ.LIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new Pair(Boolean.FALSE, "expression is not json");
        }
    }
}
