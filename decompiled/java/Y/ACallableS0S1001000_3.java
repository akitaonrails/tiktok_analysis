package Y;

import X.C036E;
import X.C1C7U;
import X.C2188811AlT;
import X.C2241008qG;
import X.C2344009Gk;
import X.C2344809Gs;
import X.C793770VBv;
import X.C794240VDq;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ACallableS0S1001000_3 implements Callable {
    public final int $t;
    public int i1;
    public String s0;

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

    public static final Object call$0(ACallableS0S1001000_3 aCallableS0S1001000_3) {
        C1C7U.LIZ("ColdLaunchRequestCombiner@5259.request$3$onError$3");
        try {
            if (C036E.LIZ.LIZIZ()) {
                C2241008qG c2241008qG = new C2241008qG();
                c2241008qG.LIZ.put("errorDesc", aCallableS0S1001000_3.s0);
                c2241008qG.LIZ.put("requestCount", Integer.valueOf(aCallableS0S1001000_3.i1));
                JSONObject jSONObjectLJ = c2241008qG.LJ();
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIJJI("combine_settings_monitor_service", 1, jSONObjectLJ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ColdLaunchRequestCombiner@5259.request$3$onError$3");
        return unit;
    }

    public static final Object call$1(ACallableS0S1001000_3 aCallableS0S1001000_3) {
        String strLIZIZ;
        int i = aCallableS0S1001000_3.i1;
        String str = aCallableS0S1001000_3.s0;
        C1C7U.LIZ("AwemeEmptyMonitorUtils@abd8.mobRequest$1L");
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(i, "request_type");
            c2344009Gk.LJIIIIZZ("to_user_id", str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("request:");
            if (i != 0) {
                if (i == 1) {
                    strLIZIZ = "aweme/v1/aweme/favorite";
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("urlTagByType/");
                    sbLIZ2.append(i);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
            } else {
                strLIZIZ = "aweme/v1/aweme/post";
            }
            sbLIZ.append(strLIZIZ);
            C2344809Gs.LIZLLL(4, C2188811AlT.LIZIZ(sbLIZ), c2344009Gk.LIZ.toString());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("AwemeEmptyMonitorUtils@abd8.mobRequest$1L");
        return null;
    }

    public ACallableS0S1001000_3(int i, String str, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.s0 = str;
    }

    public ACallableS0S1001000_3(Context context, int i, String str, int i2) {
        this.$t = i2;
        this.s0 = str;
        this.i1 = i;
    }
}
