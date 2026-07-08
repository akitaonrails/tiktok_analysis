package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.ab.FeedSpecialShapedCardExtraTrackConfigModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ro7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C706890Ro7 extends C09AY implements Function0<FeedSpecialShapedCardExtraTrackConfigModel> {
    public C706890Ro7() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final FeedSpecialShapedCardExtraTrackConfigModel invoke() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            FeedSpecialShapedCardExtraTrackConfigModel feedSpecialShapedCardExtraTrackConfigModel = C706880Ro6.LIZ;
            FeedSpecialShapedCardExtraTrackConfigModel feedSpecialShapedCardExtraTrackConfigModel2 = (FeedSpecialShapedCardExtraTrackConfigModel) settingsManagerLIZLLL.LJIIIIZZ("feed_special_shaped_card_extra_track_config", FeedSpecialShapedCardExtraTrackConfigModel.class, feedSpecialShapedCardExtraTrackConfigModel);
            return feedSpecialShapedCardExtraTrackConfigModel2 != null ? feedSpecialShapedCardExtraTrackConfigModel2 : feedSpecialShapedCardExtraTrackConfigModel;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C706880Ro6.LIZ;
        }
    }
}
