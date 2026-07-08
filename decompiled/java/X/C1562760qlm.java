package X;

import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qlm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1562760qlm extends C09AY implements Function0<C1562830qlt> {
    public final /* synthetic */ RootPanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1562760qlm(RootPanelComponent rootPanelComponent) {
        super(0);
        this.LL = rootPanelComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1562830qlt invoke() {
        String eventType;
        C2189821An6 c2189821An6 = this.LL.getPanelContext().LIZJ;
        if (c2189821An6 == null || (eventType = c2189821An6.getEventType()) == null) {
            eventType = "";
        }
        return new C1562830qlt(eventType);
    }
}
