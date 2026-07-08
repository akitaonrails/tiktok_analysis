package X;

import com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15cQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20558015cQ extends C09AY implements Function0<VideoShrinkAbility> {
    public final /* synthetic */ FeedCellAdaptionComponentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20558015cQ(FeedCellAdaptionComponentV2 feedCellAdaptionComponentV2) {
        super(0);
        this.LL = feedCellAdaptionComponentV2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final VideoShrinkAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), VideoShrinkAbility.class, null);
    }
}
