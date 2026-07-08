package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.detailpage.VideoFeedCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zA8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1885380zA8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ VideoFeedCard LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1885380zA8(VideoFeedCard videoFeedCard) {
        super(0);
        this.LL = videoFeedCard;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJJJJZ("scroll_to_bottom");
        return Unit.LIZ;
    }
}
