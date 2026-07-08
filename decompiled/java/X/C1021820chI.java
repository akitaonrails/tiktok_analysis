package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.component.nativeproducttilescomponent.AnoleProductTilesModel;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0chI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1021820chI extends AbstractC1021850chL {
    public final AnoleProductTilesModel LJFF;
    public final C01GW LJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 623));

    @Override // X.InterfaceC1021730ch9
    public final void LIZIZ(C1021680ch4 c1021680ch4) {
    }

    public final boolean LJIIIIZZ() {
        return ((Boolean) this.LJI.getValue()).booleanValue();
    }

    @Override // X.AbstractC1021850chL
    public final int LJI() {
        return LJIIIIZZ() ? 64 : 80;
    }

    @Override // X.AbstractC1021850chL
    public final int LJII() {
        return LJIIIIZZ() ? 12 : 8;
    }

    public C1021820chI(AnoleProductTilesModel anoleProductTilesModel) {
        this.LJFF = anoleProductTilesModel;
    }

    @Override // X.InterfaceC1021730ch9
    public final void LIZJ(C1021680ch4 c1021680ch4) {
        int iLIZLLL;
        int i;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (LJIIIIZZ()) {
            iLIZLLL = LJFF();
        } else {
            iLIZLLL = LIZLLL();
        }
        c1021680ch4.LLJJI = new C1009390cNF(-1.0d, iLIZLLL);
        if (LJIIIIZZ()) {
            i = 5;
        } else {
            i = 4;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        View view = c1021680ch4.LLJJIJIL;
        if (view != null && (layoutParams = view.getLayoutParams()) != null && (layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.bottomMargin = iLIZIZ;
            View view2 = c1021680ch4.LLJJIJIL;
            if (view2 != null) {
                C786410Ut5.W5(view2, marginLayoutParams);
            }
        }
    }
}
