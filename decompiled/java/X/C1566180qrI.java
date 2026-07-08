package X;

import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566180qrI extends C09AY implements Function0<C2254708sT> {
    public final /* synthetic */ BasePanelUIComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566180qrI(BasePanelUIComponent basePanelUIComponent) {
        super(0);
        this.LL = basePanelUIComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C2254708sT invoke() {
        return this.LL.LLJ.getValue();
    }
}
