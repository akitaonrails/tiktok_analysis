package X;

import Y.ARunnableS74S0200000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0Enf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C375370Enf extends AbstractC1664490tPr<C375420Enk, C375460Eno> {
    public C375320Ena LLJJJIL;

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (C0E47.LIZ()) {
            View view2 = this.mView;
            if (view2 instanceof C2260311DdV) {
                C2260311DdV c2260311DdV = (C2260311DdV) view2;
                if (this.LLJJJIL == null) {
                    this.LLJJJIL = new C375320Ena(c2260311DdV);
                    HandlerHook.viewPost(c2260311DdV, new ARunnableS74S0200000_5(c2260311DdV, this, 57));
                }
            }
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!C0E47.LIZ()) {
            return new FrameLayout(requireSceneContext());
        }
        C2260311DdV c2260311DdV = new C2260311DdV(requireSceneContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c2260311DdV);
        c2260311DdV.setLayoutParams(layoutParams);
        return c2260311DdV;
    }
}
