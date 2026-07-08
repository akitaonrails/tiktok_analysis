package X;

import com.ss.android.ugc.aweme.videoadaption.adaptioncontext.VideoAdaptionManagerContext;
import com.ss.android.ugc.feed.platform.cell.component.adaption.strategy.FeedVideoAdaptionStrategyFactory;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ykG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869340ykG extends C09AY implements Function0<C1869360ykI> {
    public final /* synthetic */ FeedVideoAdaptionStrategyFactory LL;
    public final /* synthetic */ VideoAdaptionManagerContext LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1869340ykG(FeedVideoAdaptionStrategyFactory feedVideoAdaptionStrategyFactory, VideoAdaptionManagerContext videoAdaptionManagerContext) {
        super(0);
        this.LL = feedVideoAdaptionStrategyFactory;
        this.LLILLJJLI = videoAdaptionManagerContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1869360ykI invoke() {
        return new C1869360ykI(this.LL.getFeedHandlerFactoryV2(), this.LLILLJJLI);
    }
}
