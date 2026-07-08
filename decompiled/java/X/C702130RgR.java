package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RgR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C702130RgR extends C09AY implements Function0<List<? extends IStandardConfigProvider>> {
    public C702130RgR() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends IStandardConfigProvider> invoke() {
        IFeedDebugService iFeedDebugService = (IFeedDebugService) PluggableExtentionKt.pluggableSpi$default(IFeedDebugService.class, false, false, false, 14, null);
        if (iFeedDebugService != null) {
            iFeedDebugService.LJJIIJZLJL();
        }
        return null;
    }
}
