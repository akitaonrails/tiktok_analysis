package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lRV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1357990lRV extends C2217421BqW implements Function0<Unit> {
    public C1357990lRV(Object obj) {
        super(0, obj, UpvotePanelListCell.class, "onShareIconCLick", "onShareIconCLick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        VideoItemParams videoItemParams;
        UpvotePanelListCell upvotePanelListCell = (UpvotePanelListCell) this.receiver;
        upvotePanelListCell.getClass();
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        C1358130lRj item = upvotePanelListCell.getItem();
        C1358550lSP.LJIILIIL(c1358550lSP, (item == null || (videoItemParams = item.LLILLJJLI) == null) ? null : videoItemParams.mEventType, upvotePanelListCell.f6(), upvotePanelListCell.a6(), "click_share_button", null, null, null, null, null, null, upvotePanelListCell.d6(), 1008);
        upvotePanelListCell.D6("click_share_button");
        return Unit.LIZ;
    }
}
