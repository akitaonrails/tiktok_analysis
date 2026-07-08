package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04al, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1125704al extends C09AY implements Function0<Set<? extends String>> {
    public C1125704al() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends String> invoke() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            Set<String> set = C700620Re0.LIZIZ;
            Set<? extends String> set2 = (Set) settingsManagerLIZLLL.LJIIIIZZ("feed_component_event_black_list", Set.class, set);
            return set2 != null ? set2 : set;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C700620Re0.LIZIZ;
        }
    }
}
