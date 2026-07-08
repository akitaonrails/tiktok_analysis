package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Suz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736630Suz extends C09AY implements Function0<IVideoCellAbility> {
    public final /* synthetic */ VideoShrinkComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C736630Suz(VideoShrinkComponent videoShrinkComponent) {
        super(0);
        this.LL = videoShrinkComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IVideoCellAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IVideoCellAbility.class, null);
    }
}
