package X;

import com.ss.android.ugc.aweme.feed.assem.unreadshare.HideComponentForQuickCommentAbility;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RX8, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RX8 extends C09AY implements Function0<HideComponentForQuickCommentAbility> {
    public final /* synthetic */ FeedBottomButtonContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RX8(FeedBottomButtonContainer feedBottomButtonContainer) {
        super(0);
        this.LL = feedBottomButtonContainer;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.feed.assem.unreadshare.HideComponentForQuickCommentAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final HideComponentForQuickCommentAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), HideComponentForQuickCommentAbility.class, null);
    }
}
