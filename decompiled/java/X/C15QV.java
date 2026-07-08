package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15QV, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15QV extends AbstractC19721812Ee implements InterfaceC523020KfE {
    public Function1<? super EnumC356130Dxj, Unit> LLJI = AFwS276S0000000_31.get$arr$(175);
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1015));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1017));

    public final void LLLII(EnumC356130Dxj enumC356130Dxj) {
        boolean z;
        C11GO c11go = (C11GO) this.LLJIJIL.getValue();
        boolean z2 = true;
        if (c11go != null) {
            if (enumC356130Dxj == EnumC356130Dxj.CROP) {
                z = true;
            } else {
                z = false;
            }
            c11go.LJIILJJIL(z);
        }
        C11GO c11go2 = (C11GO) this.LLJILJIL.getValue();
        if (c11go2 != null) {
            if (enumC356130Dxj != EnumC356130Dxj.ORIGIN_SHAPE) {
                z2 = false;
            }
            c11go2.LJIILJJIL(z2);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS575S0100000_31(this, 1016));
        c0om1.LIZIZ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131828868);
        c0om1.LIZJ = c1250250idj;
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        if (tuxNavBar != null) {
            tuxNavBar.setNavActions(c0om1);
            tuxNavBar.LJIIZILJ(false);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, tuxNavBar.getContext());
            if (numLIZJ != null) {
                tuxNavBar.setNavBackground(numLIZJ.intValue());
            }
        }
        C11GO c11go = (C11GO) this.LLJIJIL.getValue();
        if (c11go != null) {
            c11go.LJIILLIIL(new C16HE(this, 3));
        }
        C11GO c11go2 = (C11GO) this.LLJILJIL.getValue();
        if (c11go2 != null) {
            c11go2.LJIILLIIL(new C16HE(this, 4));
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string = bundle2.getString("FillModeSetting", LivePreviewCTASmartDisplayManager.DEFAULT)) != null) {
            LLLII(EnumC356130Dxj.valueOf(string));
        }
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.d4v, viewGroup, false);
    }
}
