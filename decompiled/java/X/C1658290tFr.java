package X;

import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0tFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1658290tFr {
    public static final List<C2185991Agv> LIZ(int[] iArr) {
        try {
            ArrayList arrayList = new ArrayList();
            int[] iArrLLLLLJLJLL = C1654960tAU.LIZ().LLLLLJLJLL(iArr);
            C2185991Agv c2185991AgvLLLLLLLLL = C1654960tAU.LIZ().LLLLLLLLL(iArrLLLLLJLJLL);
            if (c2185991AgvLLLLLLLLL != null) {
                arrayList.add(c2185991AgvLLLLLLLLL);
                return arrayList;
            }
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Npth.reportBizException("Camera", th, "getCameraExternalCapturePipelines failed", C2097608Jq.LJ());
            return C13BV.INSTANCE;
        }
    }
}
