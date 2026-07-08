package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.n;

/* JADX INFO: renamed from: X.07SB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07SB {
    public static final n LIZ = new n();

    public static final n LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        n nVar = LIZ;
        n nVar2 = (n) settingsManagerLIZLLL.LJIIIIZZ("hybrid_monitor_regex_list_opt", n.class, nVar);
        return nVar2 != null ? nVar2 : nVar;
    }
}
