package X;

import android.animation.Animator;
import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: X.185J, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C185J<T extends View, Z> {
    public final T LIZ;
    public InterfaceC212286185s LIZIZ;
    public final Context LIZJ;

    public final Animator LJ() {
        T t = this.LIZ;
        return C621740Oa4.LIZ(t.getAlpha(), 0.0f, t);
    }

    public boolean LJFF() {
        return this.LIZ.getVisibility() == 0;
    }

    public final void LJII() {
        C786410Ut5.T4(this.LIZ, 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C185J(View view) {
        this.LIZ = view;
        this.LIZJ = view.getContext();
    }

    public static final boolean LJI(View view) {
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final Animator LIZLLL(boolean z) {
        float alpha = 0.0f;
        if (z) {
            C786410Ut5.T4(this.LIZ, 0.0f);
        }
        T t = this.LIZ;
        if (t.getAlpha() != 1.0f) {
            alpha = this.LIZ.getAlpha();
        }
        return C621740Oa4.LIZ(alpha, 1.0f, t);
    }

    public boolean LJIIIZ(boolean z) {
        if (z) {
            if (this.LIZ.getVisibility() != 0) {
                C786410Ut5.LJLLLLLL(0, this.LIZ);
                InterfaceC212286185s interfaceC212286185s = this.LIZIZ;
                if (interfaceC212286185s != null) {
                    interfaceC212286185s.LIZ();
                }
                return true;
            }
        } else if (this.LIZ.getVisibility() != 8) {
            C786410Ut5.LJLLLLLL(8, this.LIZ);
            InterfaceC212286185s interfaceC212286185s2 = this.LIZIZ;
            if (interfaceC212286185s2 != null) {
                interfaceC212286185s2.LIZ();
            }
            return true;
        }
        return false;
    }

    public static final void LJIIIIZZ(View view, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }
}
