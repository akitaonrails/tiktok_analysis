package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RXc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697380RXc extends C09AY implements Function0<VideoItemParams> {
    public final /* synthetic */ InteractBottomBannerComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C697380RXc(InteractBottomBannerComponent interactBottomBannerComponent) {
        super(0);
        this.LL = interactBottomBannerComponent;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.feed.model.VideoItemParams, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final VideoItemParams invoke() {
        return this.LL.bo();
    }
}
