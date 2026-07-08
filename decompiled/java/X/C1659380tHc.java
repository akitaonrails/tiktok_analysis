package X;

import Y.ALAdapterS20S0100000_25;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import iyl.i3;
import java.util.List;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tHc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659380tHc extends C1659140tHE {
    public final InterfaceC1659390tHd LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public boolean LLJLILLLLZIIL;
    public View LLJLL;
    public View LLJLLIL;

    @Override // X.AbstractC1659350tHZ
    public final boolean LJII() {
        return false;
    }

    public final void LJJIIZ() {
        View view = this.LLJLL;
        if (view != null) {
            C339190DRl.LIZIZ(view);
        }
        View view2 = this.LLJLLIL;
        if (view2 != null) {
            C339190DRl.LIZIZ(view2);
        }
        LJJ().setText(2131820718);
        SmartImageView smartImageViewLJIJI = LJIJI();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_live_photo_ai;
        int i = this.LLJJJ;
        c419910GdJ.LIZIZ = i;
        c419910GdJ.LIZJ = i;
        smartImageViewLJIJI.setImageDrawable(c419910GdJ.LIZ(LJIJI().getContext()));
        C426750GoL.LJIIL(LJIJI(), Integer.valueOf(this.LLJJIJIIJIL), Integer.valueOf(this.LLJJIJIIJIL), Integer.valueOf(this.LLJJIJIIJIL), Integer.valueOf(this.LLJJIJIIJIL), 16);
    }

    @Override // X.C1659140tHE, X.InterfaceC1657880tFC
    public final void LIZJ(i3 i3Var) {
        super.LIZJ(i3Var);
        if (((Boolean) this.LLJL.getValue()).booleanValue()) {
            View view = this.LLJLL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            View view2 = this.LLJLLIL;
            if (view2 != null) {
                C339190DRl.LIZIZ(view2);
            }
            LJJ().setText("");
            SmartImageView smartImageViewLJIJI = LJIJI();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_live_photo_ai;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1t);
            c419910GdJ.LIZIZ = this.LLJJJ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            c419910GdJ.LIZJ = this.LLJJJ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            smartImageViewLJIJI.setImageDrawable(c419910GdJ.LIZ(LJIJI().getContext()));
            int iLIZIZ = this.LLJJIJIIJIL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            C426750GoL.LJIIL(LJIJI(), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), 16);
            InterfaceC1659390tHd interfaceC1659390tHd = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC1659390tHd != null) {
                interfaceC1659390tHd.uC1(1);
                return;
            }
            return;
        }
        if (!this.LLJLILLLLZIIL && ((Boolean) this.LLJLIL.getValue()).booleanValue()) {
            this.LLJLILLLLZIIL = true;
            LJJIIZ();
            C1295960jpS c1295960jpSLJIJJLI = LJIJJLI();
            c1295960jpSLJIJJLI.setAnimation(R.raw.tux_lottie_common_creation_ailive_icon);
            c1295960jpSLJIJJLI.setRepeatCount(2);
            c1295960jpSLJIJJLI.setRepeatMode(1);
            c1295960jpSLJIJJLI.addAnimatorListener(new ALAdapterS20S0100000_25(this, 10));
            c1295960jpSLJIJJLI.playAnimation();
            InterfaceC1659390tHd interfaceC1659390tHd2 = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC1659390tHd2 == null) {
                return;
            }
            interfaceC1659390tHd2.uC1(2);
            return;
        }
        LJJIIZ();
        InterfaceC1659390tHd interfaceC1659390tHd3 = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1659390tHd3 == null) {
            return;
        }
        interfaceC1659390tHd3.uC1(0);
    }

    @Override // X.AbstractC1659350tHZ, X.InterfaceC1657880tFC
    public final View LIZIZ(int i, ViewGroup viewGroup) {
        View viewLIZIZ = super.LIZIZ(i, viewGroup);
        ViewStub viewStub = (ViewStub) viewLIZIZ.findViewById(R.id.view_stub_ai_live_plugin);
        if (viewStub != null) {
            C786410Ut5.LJLLLL(viewStub);
        }
        View viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) viewLIZIZ.findViewById(R.id.aop));
        View viewFindViewById = viewLIZIZ.findViewById(R.id.aoq);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zi);
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
        viewFindViewById.setBackground(c384050F3z.LIZ(viewLJLLLL.getContext()));
        this.LLJLL = viewLJLLLL;
        this.LLJLLIL = viewLIZIZ.findViewById(R.id.aoo);
        return viewLIZIZ;
    }

    public C1659380tHc(InterfaceC1659390tHd interfaceC1659390tHd, LifecycleOwner lifecycleOwner, InterfaceC1659200tHK interfaceC1659200tHK, List<View> list) {
        super(lifecycleOwner, list, interfaceC1659200tHK);
        this.LLJJLIIIJLLLLLLLZ = interfaceC1659390tHd;
        this.LLJL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1030));
        this.LLJLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1029));
    }
}
