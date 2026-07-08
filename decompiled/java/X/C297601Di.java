package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: X.01Di, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C297601Di {
    public static String LIZ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = URLDecoder.decode(str, StandardCharsets.UTF_8.name());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = "";
        }
        return (String) c098200Yq;
    }
}
