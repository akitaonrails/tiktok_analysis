package X;

import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707390Rov extends C09AY implements Function1<FeedCommonBannerProtocol, Unit> {
    public final /* synthetic */ FeedCommonBannerTrigger LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C707390Rov(FeedCommonBannerTrigger feedCommonBannerTrigger) {
        super(1);
        this.LL = feedCommonBannerTrigger;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(FeedCommonBannerProtocol feedCommonBannerProtocol) {
        feedCommonBannerProtocol.LL.LIZ(this.LL.LLJLL);
        return Unit.LIZ;
    }
}
