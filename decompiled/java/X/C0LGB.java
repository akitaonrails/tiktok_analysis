package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import nv7.c0;

/* JADX INFO: renamed from: X.0LGB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LGB extends Scene implements InterfaceC379610EuV {
    public final C1DRG LLJI;

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C0LGB(C1DRG c1drg) {
        this.LLJI = c1drg;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        Integer numValueOf;
        super.onViewCreated(view, bundle);
        if (C1462920oAk.LIZLLL()) {
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.j8b);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tuxTextView.getLayoutParams());
            c0.LIZ.getClass();
            C1660590tJZ c1660590tJZ = c0.LJFF;
            if (c1660590tJZ != null && (numValueOf = Integer.valueOf(c1660590tJZ.LIZIZ())) != null) {
                layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(105)) + numValueOf.intValue();
            }
            C786410Ut5.R6(tuxTextView, layoutParams);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.d56, viewGroup, false);
    }
}
