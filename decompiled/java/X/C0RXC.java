package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RXC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RXC extends C09AY implements Function0<String> {
    public final /* synthetic */ VideoItemParams LL;
    public final /* synthetic */ FeedBottomButtonContainer LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RXC(VideoItemParams videoItemParams, FeedBottomButtonContainer feedBottomButtonContainer) {
        super(0);
        this.LL = videoItemParams;
        this.LLILLJJLI = feedBottomButtonContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return C603280NlO.LIZ(this.LL, this.LLILLJJLI.jm());
    }
}
