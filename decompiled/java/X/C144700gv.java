package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.00gv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C144700gv {
    public static final Map<Long, C1092530eXL> LIZ = new LinkedHashMap();

    public static C1092530eXL LIZ(long j) {
        try {
            return (C1092530eXL) ((LinkedHashMap) LIZ).get(Long.valueOf(j));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
