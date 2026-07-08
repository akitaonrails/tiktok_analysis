package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15QZ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15QZ extends AbstractC19721812Ee implements InterfaceC523020KfE {
    public Function1<? super Boolean, Unit> LLJI = AFwS276S0000000_31.get$arr$(177);
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1049));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1048));

    public final void LLLII(boolean z) {
        ((C1841350y17) this.LLJIJIL.getValue()).setChecked(z);
        ((C1841350y17) this.LLJILJIL.getValue()).setChecked(!z);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS575S0100000_31(this, 1050));
        c0om1.LIZIZ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131829501);
        c0om1.LIZJ = c1250250idj;
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        if (tuxNavBar != null) {
            tuxNavBar.setNavActions(c0om1);
            tuxNavBar.LJIIZILJ(false);
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            LLLII(bundle2.getBoolean("SameAssetSlotSetting", true));
            C786410Ut5.B7((C1841350y17) this.LLJIJIL.getValue(), new C16HE(this, 8));
            C786410Ut5.B7((C1841350y17) this.LLJILJIL.getValue(), new C16HE(this, 9));
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.d7z, viewGroup, false);
    }
}
