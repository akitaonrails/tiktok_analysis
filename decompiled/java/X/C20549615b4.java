package X;

import com.ss.android.ugc.aweme.poi.experiment.LSFeedCardInsetConfig;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardShowInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15b4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20549615b4 extends C09AY implements Function0<List<LSFeedCardInsetConfig.LSCardConfig>> {
    public C20549615b4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<LSFeedCardInsetConfig.LSCardConfig> invoke() {
        List<LSFeedCardInsetConfig.LSCardConfig> list;
        CardShowInfo cardShowInfo;
        FeedCardInsertConfig feedCardInsertConfigLIZ = C20551415bM.LIZ();
        Map<Integer, CardShowInfo> map = feedCardInsertConfigLIZ != null ? feedCardInsertConfigLIZ.cardInfo : null;
        ArrayList arrayList = new ArrayList();
        LSFeedCardInsetConfig.Config config = (LSFeedCardInsetConfig.Config) LSFeedCardInsetConfig.LIZIZ.getValue();
        if (config != null && (list = config.cardConfig) != null) {
            for (LSFeedCardInsetConfig.LSCardConfig lSCardConfig : list) {
                if (map != null && (cardShowInfo = map.get(lSCardConfig.cardType)) != null && cardShowInfo.flowIndex > 0 && cardShowInfo.timeInterval > 0 && cardShowInfo.intervalMaxShowCount > 0) {
                    arrayList.add(lSCardConfig);
                }
            }
        }
        return arrayList;
    }
}
