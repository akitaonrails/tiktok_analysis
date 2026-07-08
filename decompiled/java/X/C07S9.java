package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.n;

/* JADX INFO: renamed from: X.07S9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07S9 {
    public static final n LIZ = new n();

    public static final n LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        n nVar = LIZ;
        n nVar2 = (n) settingsManagerLIZLLL.LJIIIIZZ("hybrid_monitor_issue_tracing_config", n.class, nVar);
        return nVar2 != null ? nVar2 : nVar;
    }
}
