package X;

import com.ss.android.ugc.feed.platform.ab.FeedComponentComplexityExpConfig;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RKX, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RKX extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ InteractBottomBannerComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RKX(InteractBottomBannerComponent interactBottomBannerComponent) {
        super(0);
        this.LL = interactBottomBannerComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Map<String, Boolean> map;
        FeedComponentComplexityExpConfig feedComponentComplexityExpConfig = C0RKZ.LIZ;
        this.LL.getClass();
        FeedComponentComplexityExpConfig feedComponentComplexityExpConfig2 = (FeedComponentComplexityExpConfig) C0RKZ.LIZJ.getValue();
        boolean z = false;
        if (feedComponentComplexityExpConfig2 != null && (map = feedComponentComplexityExpConfig2.useNewMaker) != null && Intrinsics.LJFF(map.get("bottom_banner"), Boolean.TRUE)) {
            InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
            C0RJN c0rjnLIZIZ = this.LL.jm().LIZIZ();
            if (!interfaceC706770RnvLJJIIJ.LJJIIJZLJL(c0rjnLIZIZ != null ? c0rjnLIZIZ.LJ : null)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
