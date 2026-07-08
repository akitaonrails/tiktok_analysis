package X;

import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RS7, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RS7 extends C09AY implements Function0<FeedComponentPriorityData> {
    public final /* synthetic */ FeedBottomButtonContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RS7(FeedBottomButtonContainer feedBottomButtonContainer) {
        super(0);
        this.LL = feedBottomButtonContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FeedComponentPriorityData invoke() {
        return this.LL.Ap();
    }
}
