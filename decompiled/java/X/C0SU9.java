package X;

import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SU9, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SU9 extends C09AY implements Function0<C0RJN> {
    public final /* synthetic */ BasePanelUIComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SU9(BasePanelUIComponent basePanelUIComponent) {
        super(0);
        this.LL = basePanelUIComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0RJN invoke() {
        BasePanelUIComponent basePanelUIComponent = this.LL;
        return ((C0SU7) new C1559260qg8(new C723590SZx(basePanelUIComponent, C0SU7.class, null), basePanelUIComponent.checkSupervisorPrepared()).getValue()).LL;
    }
}
