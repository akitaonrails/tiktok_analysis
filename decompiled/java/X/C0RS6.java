package X;

import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RS6, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RS6 extends C09AY implements Function0<String> {
    public final /* synthetic */ FeedBottomButtonContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RS6(FeedBottomButtonContainer feedBottomButtonContainer) {
        super(0);
        this.LL = feedBottomButtonContainer;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return this.LL.LLLIIII.getValue();
    }
}
