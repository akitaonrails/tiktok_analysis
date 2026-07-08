package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;

/* JADX INFO: renamed from: X.01np, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C442301np {
    public static final n LIZ = new n();

    public static final String LIZ() {
        Object c098200Yq;
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            c098200Yq = LIZ;
            n nVar = (n) settingsManagerLIZLLL.LJIIIIZZ("push_sdk_overwrite_settings", n.class, c098200Yq);
            if (nVar != null) {
                c098200Yq = nVar;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        k kVar = (k) c098200Yq;
        if (kVar == null) {
            kVar = LIZ;
        }
        return kVar.toString();
    }
}
