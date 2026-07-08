package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.051V, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C051V {
    public static final <K, V> void LIZ(Map<K, V> map, K k, V v) {
        try {
            if (map.get(k) == null) {
                map.put(k, v);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
