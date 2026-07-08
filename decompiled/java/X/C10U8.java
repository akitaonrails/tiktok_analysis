package X;

import Y.AObjectS78S0000000_28;
import com.bytedance.crash.Npth;
import java.util.Map;

/* JADX INFO: renamed from: X.10U8, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10U8 {
    public static final C10U8 LIZ = new C10U8();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new AObjectS78S0000000_28(5));

    public static void LIZ(String str, Throwable th, Map map) throws Throwable {
        if (!((Boolean) LIZIZ.getValue()).booleanValue()) {
            C10UB.LIZ.getClass();
            if (C10UB.LIZIZ("kmp_exception_report_switch") != 1) {
                return;
            }
            Npth.reportBizException("kmp_biz_exception", th, str, map);
            return;
        }
        throw th;
    }
}
