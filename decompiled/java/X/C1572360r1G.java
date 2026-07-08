package X;

import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.feed.platform.panel.live.FypLiveCardComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0r1G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1572360r1G extends C09AY implements Function0<InterfaceC1572350r1F> {
    public final /* synthetic */ FypLiveCardComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1572360r1G(FypLiveCardComponent fypLiveCardComponent) {
        super(0);
        this.LL = fypLiveCardComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1572350r1F invoke() {
        ILiveOuterService iLiveOuterService = (ILiveOuterService) this.LL.LLILZ.getValue();
        if (iLiveOuterService != null) {
            return iLiveOuterService.i6();
        }
        return null;
    }
}
