package X;

import com.ss.android.ugc.feed.platform.panel.clean.FeedCleanComponent;
import com.ss.android.ugc.feed.platform.panel.pause.IPausePanelAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qgF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559330qgF extends C09AY implements Function0<IPausePanelAbility> {
    public final /* synthetic */ FeedCleanComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1559330qgF(FeedCleanComponent feedCleanComponent) {
        super(0);
        this.LL = feedCleanComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.panel.pause.IPausePanelAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IPausePanelAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IPausePanelAbility.class, null);
    }
}
