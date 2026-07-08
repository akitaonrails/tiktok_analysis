package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.feed.platform.cell.interact.hotspot.FeedHotspotMonitorSettingConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RbJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698950RbJ extends C09AY implements Function0<FeedHotspotMonitorSettingConfig> {
    public C698950RbJ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.feed.platform.cell.interact.hotspot.FeedHotspotMonitorSettingConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final FeedHotspotMonitorSettingConfig invoke() {
        ?? LJIIIIZZ = SettingsManager.LIZLLL().LJIIIIZZ("feed_hotspot_monitor_setting", FeedHotspotMonitorSettingConfig.class, null);
        if (LJIIIIZZ != 0) {
            return LJIIIIZZ;
        }
        return null;
    }
}
