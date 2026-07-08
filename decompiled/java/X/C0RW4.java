package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedSocialTagViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RW4, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RW4 extends C09AY implements Function1<Aweme, Unit> {
    public final /* synthetic */ VideoTagContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RW4(VideoTagContainer videoTagContainer) {
        super(1);
        this.LL = videoTagContainer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Aweme aweme) {
        Aweme aweme2;
        Aweme aweme3 = aweme;
        FeedSocialTagViewModel feedSocialTagViewModelEp = this.LL.Ep();
        VideoItemParams item = feedSocialTagViewModelEp.getItem();
        if (item != null && (aweme2 = item.getAweme()) != null && Intrinsics.LJFF(aweme2.getAid(), aweme3.getAid()) && aweme2.getInteractionTagInfo() != null) {
            InteractionTagInfo interactionTagInfo = aweme2.getInteractionTagInfo();
            if (interactionTagInfo != null) {
                interactionTagInfo.setVideoLabelText("");
            }
            feedSocialTagViewModelEp.setState(new AwS590S0100000_11(aweme2, 21));
        }
        return Unit.LIZ;
    }
}
