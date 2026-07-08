package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IPanelUIAbility;
import com.ss.android.ugc.feed.platform.panel.clearmode.ClearModePanelComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T3G, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T3G extends C09AY implements Function0<IPanelUIAbility> {
    public final /* synthetic */ ClearModePanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0T3G(ClearModePanelComponent clearModePanelComponent) {
        super(0);
        this.LL = clearModePanelComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.feed.assem.ability.IPanelUIAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IPanelUIAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IPanelUIAbility.class, null);
    }
}
