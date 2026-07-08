package X;

import com.ss.android.ugc.aweme.feed.ab.FeedLynxInsertCardSettingsModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ygY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867040ygY extends C09AY implements Function0<Integer> {
    public C1867040ygY() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        FeedLynxInsertCardSettingsModel feedLynxInsertCardSettingsModel = C1867050ygZ.LIZ;
        FeedLynxInsertCardSettingsModel feedLynxInsertCardSettingsModel2 = (FeedLynxInsertCardSettingsModel) c0c64LJIILLIIL.LJJII(FeedLynxInsertCardSettingsModel.class, feedLynxInsertCardSettingsModel, "feed_lynx_insert_card_setting", true);
        if (feedLynxInsertCardSettingsModel2 != null) {
            feedLynxInsertCardSettingsModel = feedLynxInsertCardSettingsModel2;
        }
        Integer num = feedLynxInsertCardSettingsModel.earlyNum;
        return Integer.valueOf(num != null ? num.intValue() : 3);
    }
}
