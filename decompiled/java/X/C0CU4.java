package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0CU4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CU4 {
    public static final Keva LIZ = Keva.getRepo("landscape_cache");

    public static Pair LIZ() {
        Object c098200Yq;
        List listLJJLL;
        if (!C288470BSj.LIZ) {
            return new Pair(new ArrayList(), "disabled");
        }
        String string = LIZ.getString("key_landscape_cache_data", "");
        try {
            if (string == null) {
                return new Pair(new ArrayList(), "no_cache");
            }
            try {
                C1227904rF.LIZ.getClass();
                c098200Yq = (String[]) C1227904rF.LIZIZ(string, String[].class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String[] strArr = (String[]) c098200Yq;
            if (strArr == null || (listLJJLL = C13LQ.LJJLL(strArr)) == null) {
                listLJJLL = C13BV.INSTANCE;
            }
            return new Pair(listLJJLL, listLJJLL.isEmpty() ? "empty_cache" : null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new Pair(C13BV.INSTANCE, "get_cache_list_exception");
        }
    }
}
