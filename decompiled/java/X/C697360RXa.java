package X;

import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697360RXa extends C09AY implements Function0<FeedComponentPriorityData> {
    public final /* synthetic */ InteractBottomBannerComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C697360RXa(InteractBottomBannerComponent interactBottomBannerComponent) {
        super(0);
        this.LL = interactBottomBannerComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FeedComponentPriorityData invoke() {
        return this.LL.tp();
    }
}
