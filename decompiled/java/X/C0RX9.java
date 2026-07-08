package X;

import com.ss.android.ugc.aweme.feed.assem.unreadshare.HideComponentForQuickShareAbility;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RX9, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RX9 extends C09AY implements Function0<HideComponentForQuickShareAbility> {
    public final /* synthetic */ FeedBottomButtonContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RX9(FeedBottomButtonContainer feedBottomButtonContainer) {
        super(0);
        this.LL = feedBottomButtonContainer;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.feed.assem.unreadshare.HideComponentForQuickShareAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final HideComponentForQuickShareAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), HideComponentForQuickShareAbility.class, null);
    }
}
