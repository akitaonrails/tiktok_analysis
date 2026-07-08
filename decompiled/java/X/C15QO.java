package X;

import Y.ACListenerS133S0200000_31;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15QO, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15QO extends Scene {
    public C15QN LLJI;
    public EnumC356130Dxj LLJIJIL = EnumC356130Dxj.DEFAULT;
    public C214799194j LLJILJIL;

    public final String LLLII() {
        int i = C352290DrX.LIZ[this.LLJIJIL.ordinal()];
        return i != 1 ? i != 2 ? "" : getString(2131828867) : getString(2131828866);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        C11G4 c11g4;
        super.onViewCreated(view, bundle);
        C127K c127k = (C127K) view.findViewById(R.id.hx1);
        C127M accessory = null;
        if (c127k != null) {
            accessory = c127k.getAccessory();
        }
        if ((accessory instanceof C11G4) && (c11g4 = (C11G4) accessory) != null) {
            c11g4.LJIILJJIL(LLLII());
            c11g4.LJIILL(new ACListenerS133S0200000_31(this, c11g4, 17));
        }
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(C786410Ut5.ne(getSceneContext()), R.layout.d4u, viewGroup, false);
    }
}
