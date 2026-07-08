package X;

import Y.ALAdapterS26S0200000_32;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.187I, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C187I extends AbstractC212220183e<ViewGroup, C184F> {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final int LJ;
    public C184F LJFF;
    public float LJI;
    public Animator LJII;
    public Animator LJIIIIZZ;

    public abstract Animator LJIIL();

    public abstract Animator LJIILIIL();

    public abstract int LJIILJJIL();

    public abstract boolean LJIIZILJ();

    public abstract void LJIJJLI(boolean z);

    public abstract C187N LJIL(long j, List<Animator> list);

    public final boolean LJIJ() {
        Animator animator = this.LJIIIIZZ;
        return animator != null && animator.isRunning();
    }

    public final boolean LJIILL(int i) {
        View viewFindViewById = this.LIZ.findViewById(i);
        if (viewFindViewById != null && !(viewFindViewById instanceof ViewStub)) {
            return true;
        }
        return false;
    }

    public final View LJIILLIIL(int i) {
        View viewFindViewById = this.LIZ.findViewById(i);
        if (viewFindViewById instanceof ViewStub) {
            return C786410Ut5.LJLLLL((ViewStub) viewFindViewById);
        }
        return viewFindViewById;
    }

    public final void LJIJJ(long j) {
        Animator animator = this.LJIIIIZZ;
        if (animator != null) {
            animator.cancel();
        }
        this.LJIIIIZZ = null;
        if (LJIIZILJ()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJII("setAtmosphereShow but is showing");
            return;
        }
        LJIJJLI(true);
        Animator animatorLJIILIIL = LJIILIIL();
        if (j > 0) {
            animatorLJIILIIL.setStartDelay(j);
        }
        animatorLJIILIIL.start();
        this.LJII = animatorLJIILIIL;
    }

    public C187I(ViewGroup viewGroup, int i) {
        super(viewGroup, "atmosphere_item");
        this.LJ = i;
        new C19340610lY();
    }

    public static boolean LJIIJJI(C184F c184f, C184F c184f2) {
        Integer numValueOf;
        Integer numValueOf2;
        Long lValueOf;
        Long lValueOf2 = null;
        if (c184f != null) {
            numValueOf = Integer.valueOf(c184f.LIZLLL());
        } else {
            numValueOf = null;
        }
        if (c184f2 != null) {
            numValueOf2 = Integer.valueOf(c184f2.LIZLLL());
        } else {
            numValueOf2 = null;
        }
        if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
            if (c184f != null) {
                lValueOf = Long.valueOf(c184f.LIZ());
            } else {
                lValueOf = null;
            }
            if (c184f2 != null) {
                lValueOf2 = Long.valueOf(c184f2.LIZ());
            }
            if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LJIJI(boolean z, Function0 function0) {
        Animator animator = this.LJII;
        if (animator != null) {
            animator.cancel();
        }
        this.LJII = null;
        if (!LJIIZILJ()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJII("setAtmosphereHide but is hidden");
        } else {
            if (z) {
                Animator animatorLJIIL = LJIIL();
                animatorLJIIL.addListener(new ALAdapterS26S0200000_32(function0, this, 9));
                animatorLJIIL.start();
                this.LJIIIIZZ = animatorLJIIL;
                return;
            }
            LJIJJLI(false);
            if (function0 == null) {
                return;
            }
            function0.invoke();
        }
    }
}
