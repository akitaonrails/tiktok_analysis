package X;

import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SU8, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SU8 extends C09AY implements Function0<C0RJN> {
    public final /* synthetic */ BasePanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SU8(BasePanelComponent basePanelComponent) {
        super(0);
        this.LL = basePanelComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0RJN invoke() {
        BasePanelComponent basePanelComponent = this.LL;
        return ((C0SU7) new C1559260qg8(new C723590SZx(basePanelComponent, C0SU7.class, null), basePanelComponent.checkSupervisorPrepared()).getValue()).LL;
    }
}
