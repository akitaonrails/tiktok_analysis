package X;

import com.ss.android.ugc.feed.platform.cell.component.adaption.strategy.FeedVideoAdaptionStrategyFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ykK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869380ykK extends C09AY implements Function0<C1869350ykH> {
    public final /* synthetic */ FeedVideoAdaptionStrategyFactory LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1869380ykK(FeedVideoAdaptionStrategyFactory feedVideoAdaptionStrategyFactory) {
        super(0);
        this.LL = feedVideoAdaptionStrategyFactory;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0ykH] */
    @Override // kotlin.jvm.functions.Function0
    public final C1869350ykH invoke() {
        final FeedVideoAdaptionStrategyFactory feedVideoAdaptionStrategyFactory = this.LL;
        return new InterfaceC1869390ykL() { // from class: X.0ykH
            @Override // X.InterfaceC1869390ykL
            public final List LIZ(InterfaceC1869460ykS interfaceC1869460ykS) {
                ArrayList arrayList = new ArrayList();
                FeedVideoAdaptionStrategyFactory feedVideoAdaptionStrategyFactory2 = feedVideoAdaptionStrategyFactory;
                if (interfaceC1869460ykS instanceof C1869360ykI) {
                    arrayList.add(feedVideoAdaptionStrategyFactory2.getMultiContainerThresholdHandler((C1869360ykI) interfaceC1869460ykS));
                }
                return arrayList;
            }
        };
    }
}
