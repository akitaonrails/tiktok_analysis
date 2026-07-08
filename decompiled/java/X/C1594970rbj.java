package X;

import com.ss.android.ugc.feed.platform.panel.clearmode.ClearModePanelComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1594970rbj extends C09AY implements Function1<C1480430ocz, Unit> {
    public final /* synthetic */ ClearModePanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1594970rbj(ClearModePanelComponent clearModePanelComponent) {
        super(1);
        this.LL = clearModePanelComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1480430ocz c1480430ocz) {
        String eventType;
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        if (C586380MzE.LIZ().LIZLLL() && !this.LL.LLILZIL) {
            int type = EnumC1616310sA9.SWITCH_PAGE.getType();
            C2189821An6 c2189821An6 = this.LL.getPanelContext().LIZJ;
            if (c2189821An6 != null) {
                eventType = c2189821An6.getEventType();
            } else {
                eventType = null;
            }
            C1440005kM.LIZ(new C714060Rzg(false, type, "", eventType));
        }
        return Unit.LIZ;
    }
}
