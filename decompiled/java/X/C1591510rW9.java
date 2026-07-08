package X;

import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rW9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591510rW9 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ MainTabStrip LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1591510rW9(MainTabStrip mainTabStrip) {
        super(0);
        this.LL = mainTabStrip;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (((Number) C18027074f.LIZ.getValue()).intValue() == 1) {
            MainTabStrip mainTabStrip = this.LL;
            C1592450rXf c1592450rXf = mainTabStrip.LLILLJJLI;
            if (!c1592450rXf.isLaidOut() || c1592450rXf.isLayoutRequested()) {
                c1592450rXf.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1620710sHF(mainTabStrip, 5));
            } else if (mainTabStrip.LLILLJJLI.getTabLayoutScrollRange() > 0 && ((mainTabStrip.LLILLJJLI.getSelectedScrollX() == 0 || mainTabStrip.LLILLJJLI.getSelectedScrollX() != mainTabStrip.LLILLJJLI.getScrollX()) && !mainTabStrip.LLILLJJLI.LJIILLIIL())) {
                mainTabStrip.LLILLJJLI.LJIIIIZZ(mainTabStrip.LLJ);
            }
        } else if (this.LL.LLILLJJLI.getTabLayoutScrollRange() > 0 && this.LL.LLILLJJLI.getSelectedScrollX() != this.LL.LLILLJJLI.getScrollX() && !this.LL.LLILLJJLI.LJIILLIIL()) {
            MainTabStrip mainTabStrip2 = this.LL;
            mainTabStrip2.LLILLJJLI.LJIIIIZZ(mainTabStrip2.LLJ);
        }
        return Unit.LIZ;
    }
}
