package X;

import com.benchmark.inject.InjectABMockConfig;
import com.bytedance.ies.abmock.debugtool.mock.MockComponentRegister;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18aS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21310218aS {
    public static C21310518aV LIZ;
    public static InjectABMockConfig LIZIZ;

    public static Object LIZ(String str) {
        Object obj = null;
        if (LIZ == null) {
            return null;
        }
        try {
            C0C5H configMock = MockComponentRegister.getConfigMock(LIZIZ.getHostId());
            if (configMock != null) {
                obj = configMock.get(str);
                return obj;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return obj;
    }
}
