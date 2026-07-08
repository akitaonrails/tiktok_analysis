package X;

import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qrF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566150qrF extends C09AY implements Function0<C2254708sT> {
    public final /* synthetic */ BasePanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566150qrF(BasePanelComponent basePanelComponent) {
        super(0);
        this.LL = basePanelComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C2254708sT invoke() {
        return this.LL._actionHandler.getValue();
    }
}
