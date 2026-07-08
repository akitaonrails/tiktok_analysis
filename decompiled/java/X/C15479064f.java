package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.064f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15479064f {
    public static final C15479064f LIZ = new C15479064f();

    public static Map LIZ(C869590Y9l c869590Y9l) {
        boolean z;
        Object c098200Yq;
        String str = c869590Y9l.getLocalExt().get("dynamic_card_mob_map");
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        try {
            c098200Yq = (Map) C105700ad.LIZ(str, Map.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (Map) obj;
    }
}
