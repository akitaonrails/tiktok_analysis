package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0186, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0186 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, Map map) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("msg", str);
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            C1741890vQh.LJIIIIZZ(linkedHashMap);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
