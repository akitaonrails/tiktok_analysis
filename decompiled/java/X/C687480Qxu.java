package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ab.EcSearchAfterSearchFeedBubbleConfigModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Qxu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687480Qxu extends C09AY implements Function0<EcSearchAfterSearchFeedBubbleConfigModel> {
    public C687480Qxu() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ab.EcSearchAfterSearchFeedBubbleConfigModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final EcSearchAfterSearchFeedBubbleConfigModel invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcSearchAfterSearchFeedBubbleConfigModel ecSearchAfterSearchFeedBubbleConfigModel = C687460Qxs.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("ec_search_after_search_feed_bubble_config", EcSearchAfterSearchFeedBubbleConfigModel.class, ecSearchAfterSearchFeedBubbleConfigModel);
        return LJIIIIZZ != 0 ? LJIIIIZZ : ecSearchAfterSearchFeedBubbleConfigModel;
    }
}
