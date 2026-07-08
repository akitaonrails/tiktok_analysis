package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01Sa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C335801Sa {
    public static final C335801Sa LIZ = new C335801Sa();
    public static final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static final ConcurrentHashMap<String, Boolean> LIZJ = new ConcurrentHashMap<>();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(201));

    public static int LIZ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(new JSONObject(str).optInt("status_code", -1));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = -1;
        }
        return ((Number) c098200Yq).intValue();
    }
}
