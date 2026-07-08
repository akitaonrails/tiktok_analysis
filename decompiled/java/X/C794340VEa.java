package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.legoImp.task.dm.ab.TrackerBlockConfigModel;

/* JADX INFO: renamed from: X.0VEa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C794340VEa {
    public static final TrackerBlockConfigModel LIZ = new TrackerBlockConfigModel(false, C2097608Jq.LJ(), null);

    public static final TrackerBlockConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        TrackerBlockConfigModel trackerBlockConfigModel = LIZ;
        TrackerBlockConfigModel trackerBlockConfigModel2 = (TrackerBlockConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pns_apm_event_block_config", TrackerBlockConfigModel.class, trackerBlockConfigModel);
        return trackerBlockConfigModel2 != null ? trackerBlockConfigModel2 : trackerBlockConfigModel;
    }
}
