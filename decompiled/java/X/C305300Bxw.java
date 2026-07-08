package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Bxw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C305300Bxw extends C09AY implements Function0<n> {
    public C305300Bxw() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final n invoke() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            n nVar = C0QD9.LIZ;
            n nVar2 = (n) settingsManagerLIZLLL.LJIIIIZZ("search_vertical_tab_config", n.class, nVar);
            return nVar2 != null ? nVar2 : nVar;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C0QD9.LIZ;
        }
    }
}
