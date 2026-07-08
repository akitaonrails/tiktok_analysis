package X;

import Y.ARunnableS124S0100000_24;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;

/* JADX INFO: renamed from: X.0rzW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609720rzW implements InterfaceC1331000kjy {
    public final /* synthetic */ C1609600rzK LIZ;

    @Override // X.InterfaceC1331000kjy
    public final void LIZIZ(AnimatedDrawable2 animatedDrawable2) {
    }

    @Override // X.InterfaceC1331000kjy
    public final void LIZLLL(AnimatedDrawable2 animatedDrawable2, int i) {
    }

    public C1609720rzW(C1609600rzK c1609600rzK) {
        this.LIZ = c1609600rzK;
    }

    @Override // X.InterfaceC1331000kjy
    public final void LIZ(AnimatedDrawable2 animatedDrawable2) {
        ViewGroup viewGroupLJIIIIZZ = this.LIZ.LJIIIIZZ();
        if (viewGroupLJIIIIZZ != null) {
            HandlerHook.viewPost(viewGroupLJIIIIZZ, new ARunnableS124S0100000_24(this.LIZ, 173));
        }
    }

    @Override // X.InterfaceC1331000kjy
    public final void LIZJ(AnimatedDrawable2 animatedDrawable2) {
        ViewGroup viewGroupLJIIIIZZ = this.LIZ.LJIIIIZZ();
        if (viewGroupLJIIIIZZ != null) {
            HandlerHook.viewPost(viewGroupLJIIIIZZ, new ARunnableS124S0100000_24(this.LIZ, 174));
        }
    }
}
