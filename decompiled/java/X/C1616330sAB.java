package X;

import com.ss.android.ugc.feed.platform.panel.clearmode.ClearModePanelComponent;
import com.ss.android.ugc.feed.platform.panel.system.SystemComponentAbility;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sAB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616330sAB extends C09AY implements Function1<Pair<? extends String, ? extends Float>, Unit> {
    public final /* synthetic */ ClearModePanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1616330sAB(ClearModePanelComponent clearModePanelComponent) {
        super(1);
        this.LL = clearModePanelComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends String, ? extends Float> pair) {
        Pair<? extends String, ? extends Float> pair2 = pair;
        if (pair2 != null && pair2.getSecond().floatValue() > 0.0f && !this.LL.LLJJ) {
            ClearModePanelComponent clearModePanelComponent = this.LL;
            if (clearModePanelComponent.LLIZ == null) {
                clearModePanelComponent.LLIZ = (SystemComponentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(clearModePanelComponent), SystemComponentAbility.class, null);
            }
            SystemComponentAbility systemComponentAbility = clearModePanelComponent.LLIZ;
            if (systemComponentAbility != null) {
                systemComponentAbility.registerDisplayListener(this.LL, null);
                this.LL.LLJJ = true;
            }
        }
        return Unit.LIZ;
    }
}
