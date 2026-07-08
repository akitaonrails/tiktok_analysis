package X;

import android.view.View;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RGI, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RGI extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ InteractBottomBannerComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RGI(InteractBottomBannerComponent interactBottomBannerComponent) {
        super(1);
        this.LL = interactBottomBannerComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        String strLIZ;
        Boolean bool2 = bool;
        if (bool2 != null) {
            bool2.booleanValue();
            C695510RPx c695510RPx = C695510RPx.LIZ;
            View viewLJJIJL = this.LL.LJJIJL();
            boolean zBooleanValue = bool2.booleanValue();
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            C0RGG c0rggLIZ = C586380MzE.LIZ();
            C0RJN c0rjnLIZIZ = this.LL.jm().LIZIZ();
            if (c0rjnLIZIZ != null) {
                strLIZ = C1389300mG0.LIZ(c0rjnLIZIZ);
            } else {
                strLIZ = null;
            }
            boolean z = !c0rggLIZ.LIZIZ(strLIZ);
            c695510RPx.getClass();
            C695510RPx.LJ(viewLJJIJL, zBooleanValue, true, z);
        }
        return Unit.LIZ;
    }
}
