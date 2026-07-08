package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.ab.FeedEcCardTrackServerConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RRZ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RRZ extends C09AY implements Function0<FeedEcCardTrackServerConfig.TrackModel> {
    public C0RRZ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final FeedEcCardTrackServerConfig.TrackModel invoke() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            FeedEcCardTrackServerConfig.TrackModel trackModel = FeedEcCardTrackServerConfig.LIZ;
            FeedEcCardTrackServerConfig.TrackModel trackModel2 = (FeedEcCardTrackServerConfig.TrackModel) settingsManagerLIZLLL.LJIIIIZZ("feed_ec_card_track_from_server", FeedEcCardTrackServerConfig.TrackModel.class, trackModel);
            return trackModel2 != null ? trackModel2 : trackModel;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return FeedEcCardTrackServerConfig.LIZ;
        }
    }
}
