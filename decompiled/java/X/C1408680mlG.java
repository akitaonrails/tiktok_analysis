package X;

import Y.ARunnableS122S0100000_22;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mlG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1408680mlG extends Scene implements InterfaceC379610EuV {
    public final C1DRG LLJI;
    public TuxTextView LLJIJIL;
    public final ARunnableS122S0100000_22 LLJILJIL = new ARunnableS122S0100000_22(this, 47);

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C1408680mlG(C1DRG c1drg) {
        this.LLJI = c1drg;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJIJIL = (TuxTextView) requireViewById(R.id.afb);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.d18, viewGroup, false);
    }
}
