package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.bytedance.scene.Scene;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11gt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19566511gt extends Scene implements InterfaceC379610EuV {
    public final C1DRG LLJI;
    public View LLJIJIL;
    public ViewPropertyAnimator LLJILJIL;

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C19566511gt(C1DRG c1drg) {
        this.LLJI = c1drg;
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.d8z, viewGroup, false);
        this.LLJIJIL = viewTd;
        if (viewTd == null) {
            return null;
        }
        return viewTd;
    }
}
