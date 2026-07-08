package X;

import com.ss.android.ugc.feed.platform.panel.IRootAbility;
import com.ss.android.ugc.feed.platform.panel.dailyscreentime.ScreenTimePanelComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qgN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559410qgN extends C09AY implements Function0<IRootAbility> {
    public final /* synthetic */ ScreenTimePanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1559410qgN(ScreenTimePanelComponent screenTimePanelComponent) {
        super(0);
        this.LL = screenTimePanelComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.panel.IRootAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IRootAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IRootAbility.class, null);
    }
}
