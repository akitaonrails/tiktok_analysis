package X;

import Y.ALAdapterS26S0100000_32;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.187K, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C187K extends C185J<ViewGroup, AtmosphereTag> {
    public final int LIZLLL;
    public AtmosphereTag LJ;
    public float LJFF;
    public InterfaceC212331187l LJI;
    public Animator LJII;
    public Animator LJIIIIZZ;

    public abstract Animator LJIIJJI();

    public abstract Animator LJIIL();

    public abstract int LJIILIIL();

    public abstract boolean LJIILLIIL();

    public abstract void LJIJJ(boolean z);

    public abstract C187X LJIJJLI(long j, List<Animator> list);

    public final boolean LJIIZILJ() {
        Animator animator = this.LJIIIIZZ;
        return animator != null && animator.isRunning();
    }

    public final boolean LJIILJJIL(int i) {
        View viewFindViewById = this.LIZ.findViewById(i);
        if (viewFindViewById != null && !(viewFindViewById instanceof ViewStub)) {
            return true;
        }
        return false;
    }

    public final View LJIILL(int i) {
        View viewFindViewById = this.LIZ.findViewById(i);
        if (viewFindViewById instanceof ViewStub) {
            return C786410Ut5.LJLLLL((ViewStub) viewFindViewById);
        }
        return viewFindViewById;
    }

    public final void LJIJ(boolean z) {
        Animator animator = this.LJII;
        if (animator != null) {
            animator.cancel();
        }
        this.LJII = null;
        if (!LJIILLIIL()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJII("setAtmosphereHide but is hidden");
        } else {
            if (z) {
                Animator animatorLJIIJJI = LJIIJJI();
                animatorLJIIJJI.addListener(new ALAdapterS26S0100000_32(this, 11));
                animatorLJIIJJI.start();
                this.LJIIIIZZ = animatorLJIIJJI;
                return;
            }
            LJIJJ(false);
        }
    }

    public final void LJIJI(long j) {
        Animator animator = this.LJIIIIZZ;
        if (animator != null) {
            animator.cancel();
        }
        this.LJIIIIZZ = null;
        if (LJIILLIIL()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJII("setAtmosphereShow but is showing");
            return;
        }
        LJIJJ(true);
        Animator animatorLJIIL = LJIIL();
        if (j > 0) {
            animatorLJIIL.setStartDelay(j);
        }
        animatorLJIIL.start();
        this.LJII = animatorLJIIL;
    }

    public C187K(int i, ViewGroup viewGroup) {
        super(viewGroup);
        this.LIZLLL = i;
        this.LJI = new C19343610m2();
    }

    public static boolean LJIIJ(AtmosphereTag atmosphereTag, AtmosphereTag atmosphereTag2) {
        Integer numValueOf;
        Integer numValueOf2;
        Long lValueOf;
        Long lValueOf2 = null;
        if (atmosphereTag != null) {
            numValueOf = Integer.valueOf(atmosphereTag.tagType);
        } else {
            numValueOf = null;
        }
        if (atmosphereTag2 != null) {
            numValueOf2 = Integer.valueOf(atmosphereTag2.tagType);
        } else {
            numValueOf2 = null;
        }
        if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
            if (atmosphereTag != null) {
                lValueOf = Long.valueOf(atmosphereTag.count);
            } else {
                lValueOf = null;
            }
            if (atmosphereTag2 != null) {
                lValueOf2 = Long.valueOf(atmosphereTag2.count);
            }
            if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
