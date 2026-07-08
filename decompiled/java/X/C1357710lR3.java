package X;

import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonTrigger;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lR3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357710lR3 extends C09AY implements Function0<FeedBottomButtonAbility> {
    public final /* synthetic */ QuickShareButtonTrigger LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1357710lR3(QuickShareButtonTrigger quickShareButtonTrigger) {
        super(0);
        this.LL = quickShareButtonTrigger;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final FeedBottomButtonAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), FeedBottomButtonAbility.class, null);
    }
}
