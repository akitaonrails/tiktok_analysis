package X;

import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RP8, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RP8 extends C09AY implements Function0<String> {
    public final /* synthetic */ FeedBottomButtonContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RP8(FeedBottomButtonContainer feedBottomButtonContainer) {
        super(0);
        this.LL = feedBottomButtonContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return C698800Rb4.LJ(this.LL.jm());
    }
}
