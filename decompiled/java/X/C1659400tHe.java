package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.zhiliaoapp.musically.R;
import iyl.i3;
import java.util.List;
import kotlin.jvm.internal.AwS569S0100000_25;
import wh6.AbS704S0100000_25;

/* JADX INFO: renamed from: X.0tHe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659400tHe extends C1659140tHE {
    public final InterfaceC1659440tHi LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public View LLJLIL;
    public View LLJLILLLLZIIL;

    @Override // X.AbstractC1659350tHZ
    public final boolean LJII() {
        return false;
    }

    @Override // X.C1659140tHE, X.InterfaceC1657880tFC
    public final void LIZJ(i3 i3Var) {
        String strLIZJ;
        C0MW8 c0mw8LJ;
        super.LIZJ(i3Var);
        if (((Boolean) this.LLJL.getValue()).booleanValue()) {
            View view = this.LLJLIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            View view2 = this.LLJLIL;
            if (view2 != null) {
                C786410Ut5.I7(new AbS704S0100000_25(this, 0), view2);
            }
            View view3 = this.LLJLILLLLZIIL;
            if (view3 != null) {
                C368610Ecl.LIZIZ(view3);
            }
            LJJ().setText("");
            SmartImageView smartImageViewLJIJI = LJIJI();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_cast_fill;
            c419910GdJ.LIZIZ = this.LLJJJ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            c419910GdJ.LIZJ = this.LLJJJ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            smartImageViewLJIJI.setImageDrawable(c419910GdJ.LIZ(LJIJI().getContext()));
            SmartImageView smartImageViewLJIJI2 = LJIJI();
            C0GZ3.LIZIZ(smartImageViewLJIJI2, C0GZ3.LIZLLL(smartImageViewLJIJI2.getContext()), null, 1.0f, 0.25f, 0.0f, 0.75f, 3, this.LLJJJ, this.LLJJJ);
            int iLIZIZ = this.LLJJIJIIJIL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            C426750GoL.LJIIL(LJIJI(), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), 16);
            InterfaceC1659440tHi interfaceC1659440tHi = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC1659440tHi != null) {
                interfaceC1659440tHi.sw1(EnumC2011907uP.BANNER);
                return;
            }
            return;
        }
        View view4 = this.LLJLIL;
        if (view4 != null) {
            C368610Ecl.LIZIZ(view4);
        }
        View view5 = this.LLJLILLLLZIIL;
        if (view5 != null) {
            C368610Ecl.LIZIZ(view5);
        }
        TuxTextView tuxTextViewLJJ = LJJ();
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ != null && (c0mw8LJ = iAITheaterFeatureServiceLIZ.LJ()) != null) {
            strLIZJ = c0mw8LJ.LIZJ();
        } else {
            strLIZJ = null;
        }
        tuxTextViewLJJ.setText(strLIZJ);
        SmartImageView smartImageViewLJIJI3 = LJIJI();
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_cast;
        int i = this.LLJJJ;
        c419910GdJ2.LIZIZ = i;
        c419910GdJ2.LIZJ = i;
        c419910GdJ2.LIZLLL = -1;
        smartImageViewLJIJI3.setImageDrawable(c419910GdJ2.LIZ(LJIJI().getContext()));
        C426750GoL.LJIIL(LJIJI(), Integer.valueOf(this.LLJJIJIIJIL), Integer.valueOf(this.LLJJIJIIJIL), Integer.valueOf(this.LLJJIJIIJIL), Integer.valueOf(this.LLJJIJIIJIL), 16);
        InterfaceC1659440tHi interfaceC1659440tHi2 = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1659440tHi2 == null) {
            return;
        }
        interfaceC1659440tHi2.sw1(EnumC2011907uP.NORMAL);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x014a  */
    @Override // X.AbstractC1659350tHZ, X.InterfaceC1657880tFC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LIZIZ(int r26, android.view.ViewGroup r27) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1659400tHe.LIZIZ(int, android.view.ViewGroup):android.view.View");
    }

    public C1659400tHe(LifecycleOwner lifecycleOwner, InterfaceC1659200tHK interfaceC1659200tHK, List<View> list, InterfaceC1659440tHi interfaceC1659440tHi) {
        super(lifecycleOwner, list, interfaceC1659200tHK);
        this.LLJJLIIIJLLLLLLLZ = interfaceC1659440tHi;
        this.LLJL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 512));
    }
}
