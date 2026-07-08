package X;

import Y.ACListenerS159S0100000_25;
import Y.ARunnableS111S0100000_11;
import Y.AfS194S0100000_25;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.0stp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644630stp implements InterfaceC1644680stu {
    public static final Object LJFF = new Object();
    public final Context LIZ;
    public final InterfaceC1644620sto LIZIZ;
    public View.OnClickListener LIZJ;
    public View LIZLLL;
    public final C11NJ LJ = new C11NJ();

    @Override // X.InterfaceC1644680stu
    public final void LIZ() {
        FrameLayout frameLayout = new FrameLayout(this.LIZ);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZ), R.layout.uw, this.LIZIZ.LIZIZ(), false);
        q0.LJIJ(viewTd, new C786390Ut3(13));
        frameLayout.addView(viewTd, new FrameLayout.LayoutParams(-2, -2, 17));
        this.LIZLLL = frameLayout;
        this.LIZIZ.LJIIL(frameLayout);
        this.LJ.LIZ(this.LIZIZ.LJIILL().LJJLL(new AfS194S0100000_25(this, 192), C19487811Me.LJ));
    }

    @Override // X.InterfaceC1644680stu
    public final void LIZJ() {
        View view;
        View view2 = this.LIZLLL;
        if (view2 != null) {
            Object parent = view2.getParent();
            if (!(parent instanceof View) || (view = (View) parent) == null) {
                return;
            }
            HandlerHook.viewPostDelay(view, new ARunnableS111S0100000_11(view, 152), 500L);
        }
    }

    @Override // X.InterfaceC1644680stu
    public final void LIZIZ(ACListenerS159S0100000_25 aCListenerS159S0100000_25) {
        this.LIZJ = aCListenerS159S0100000_25;
    }

    public C1644630stp(Context context, InterfaceC1644620sto interfaceC1644620sto) {
        this.LIZ = context;
        this.LIZIZ = interfaceC1644620sto;
    }
}
