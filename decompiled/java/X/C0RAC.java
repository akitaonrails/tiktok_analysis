package X;

import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.feed.platform.container.interaction.FeedInteractionAreaContainer;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RAC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RAC extends C09AY implements Function0<FeedInteractionAreaContainer> {
    public final /* synthetic */ VideoBaseCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RAC(VideoBaseCell videoBaseCell) {
        super(0);
        this.LL = videoBaseCell;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FeedInteractionAreaContainer invoke() {
        C0RAD c0rad = FeedInteractionAreaContainer.LLJLL;
        VideoBaseCell videoBaseCell = this.LL;
        c0rad.getClass();
        FeedInteractionAreaContainer feedInteractionAreaContainer = new FeedInteractionAreaContainer();
        feedInteractionAreaContainer.LLJJI = videoBaseCell.LLJILJILJ.LIZ.findViewById(R.id.widget_container);
        feedInteractionAreaContainer.LLJJJJLIIL = videoBaseCell.LLJILJILJ.LJ;
        feedInteractionAreaContainer.setParent(videoBaseCell);
        return feedInteractionAreaContainer;
    }
}
