package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.video.experiment.TTPlayerViewedVideoHistory;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Mvo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584260Mvo extends C09AY implements Function0<TTPlayerViewedVideoHistory.PlaybackHistoryConfig> {
    public C584260Mvo() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final TTPlayerViewedVideoHistory.PlaybackHistoryConfig invoke() {
        try {
            return (TTPlayerViewedVideoHistory.PlaybackHistoryConfig) C0C64.LJIILLIIL().LJJII(TTPlayerViewedVideoHistory.PlaybackHistoryConfig.class, TTPlayerViewedVideoHistory.LIZ, "ttplayer_viewed_video_history", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return TTPlayerViewedVideoHistory.LIZ;
        }
    }
}
