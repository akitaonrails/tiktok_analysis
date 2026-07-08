package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.detailpage.VideoFeedCard;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z9y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1885280z9y extends C09AY implements Function0<C1885110z9h> {
    public final /* synthetic */ VideoFeedCard LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1885280z9y(VideoFeedCard videoFeedCard) {
        super(0);
        this.LL = videoFeedCard;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1885110z9h invoke() {
        return new C1885110z9h(this.LL.LLILLL);
    }
}
