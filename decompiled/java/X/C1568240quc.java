package X;

import com.ss.android.ugc.aweme.ab.PreviewCardSignalSystemConfig;
import com.ss.android.ugc.feed.platform.panel.live.FeedLiveStatusManagerComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0quc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1568240quc extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ FeedLiveStatusManagerComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568240quc(FeedLiveStatusManagerComponent feedLiveStatusManagerComponent) {
        super(0);
        this.LL = feedLiveStatusManagerComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        PreviewCardSignalSystemConfig previewCardSignalSystemConfig = C1568260que.LIZ;
        return Boolean.valueOf(C1568260que.LIZ().sceneList.contains(this.LL.ko()));
    }
}
