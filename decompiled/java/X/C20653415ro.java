package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.feed.platform.popup.exp.FeedPopupManagerBugfixConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15ro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20653415ro extends C09AY implements Function0<FeedPopupManagerBugfixConfig> {
    public C20653415ro() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.feed.platform.popup.exp.FeedPopupManagerBugfixConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final FeedPopupManagerBugfixConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        FeedPopupManagerBugfixConfig feedPopupManagerBugfixConfig = C20653315rn.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("feed_popup_manager_bugfix", FeedPopupManagerBugfixConfig.class, feedPopupManagerBugfixConfig);
        return LJIIIIZZ != 0 ? LJIIIIZZ : feedPopupManagerBugfixConfig;
    }
}
