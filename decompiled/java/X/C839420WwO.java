package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings.ScopeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WwO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839420WwO extends C09AY implements Function0<ScopeConfig> {
    public C839420WwO() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings.ScopeConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ScopeConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ScopeConfig scopeConfig = C839410WwN.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("pns_interceptor_settings", ScopeConfig.class, scopeConfig);
        return LJIIIIZZ != 0 ? LJIIIIZZ : scopeConfig;
    }
}
