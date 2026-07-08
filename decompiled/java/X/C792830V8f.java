package X;

import android.text.TextUtils;
import com.bytedance.apm6.perf.base.model.ThreadStatInfo;
import com.bytedance.monitor.collector.MonitorJni;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0V8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792830V8f {
    public static void LIZ(int i, Map<Integer, C792840V8g> map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/proc/");
        sbLIZ.append(i);
        sbLIZ.append("/task/");
        for (File file : new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).listFiles()) {
            try {
                int i2 = CastIntegerProtector.parseInt(file.getName());
                C791560V3i.LIZLLL().getClass();
                ThreadStatInfo threadStatInfo = MonitorJni.getThreadStatInfo(i, i2);
                if (i2 != 0 && threadStatInfo != null && !TextUtils.isEmpty(threadStatInfo.threadName) && threadStatInfo.threadCpuTime != 0) {
                    C792840V8g c792840V8g = new C792840V8g();
                    c792840V8g.LIZ = i2;
                    c792840V8g.LIZIZ = threadStatInfo.threadName;
                    c792840V8g.LIZJ = threadStatInfo.threadCpuTime;
                    ((HashMap) map).put(Integer.valueOf(i2), c792840V8g);
                }
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
