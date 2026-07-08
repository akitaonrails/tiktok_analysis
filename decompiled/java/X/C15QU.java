package X;

import Y.ACListenerS133S0200000_31;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15QU, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15QU extends Scene {
    public C127K LLJI;
    public C15QQ LLJIJIL;
    public boolean LLJILJIL = true;
    public C214799194j LLJILJILJ;

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        C127M accessory;
        String string;
        super.onViewCreated(view, bundle);
        C127K c127k = this.LLJI;
        if (c127k != null) {
            c127k.setTitle(new C444910HcX(getString(2131829501)));
        }
        C127K c127k2 = this.LLJI;
        if (c127k2 != null) {
            accessory = c127k2.getAccessory();
        } else {
            accessory = null;
        }
        C11G4 c11g4 = (C11G4) accessory;
        if (this.LLJILJIL) {
            string = getString(2131829505);
        } else {
            string = getString(2131829503);
        }
        c11g4.LJIILJJIL(string);
        c11g4.LJIILL(new ACListenerS133S0200000_31(this, c11g4, 19));
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C127K c127k = (C127K) C786410Ut5.Td(C786410Ut5.ne(getSceneContext()), R.layout.d7y, viewGroup, false);
        this.LLJI = c127k;
        return c127k;
    }
}
