package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.19CY, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19CY {
    public final FragmentManager LIZ;
    public final CopyOnWriteArrayList<C19CZ> LIZIZ = new CopyOnWriteArrayList<>();

    public C19CY(FragmentManager fragmentManager) {
        this.LIZ = fragmentManager;
    }

    public final void LIZIZ(Fragment fragment, boolean z) {
        Context context = this.LIZ.LJJLIIIJLJLI().LLILLJJLI;
        Fragment fragmentLJJLIL = this.LIZ.LJJLIL();
        if (fragmentLJJLIL != null) {
            fragmentLJJLIL.getParentFragmentManager().LJJLIIJ().LIZIZ(fragment, true);
        }
        for (C19CZ c19cz : this.LIZIZ) {
            if (!z || c19cz.LIZIZ) {
                c19cz.LIZ.onFragmentAttached(this.LIZ, fragment, context);
            }
        }
    }

    public final void LIZLLL(Fragment fragment, boolean z) {
        Fragment fragmentLJJLIL = this.LIZ.LJJLIL();
        if (fragmentLJJLIL != null) {
            fragmentLJJLIL.getParentFragmentManager().LJJLIIJ().LIZLLL(fragment, true);
        }
        for (C19CZ c19cz : this.LIZIZ) {
            if (!z || c19cz.LIZIZ) {
                c19cz.LIZ.onFragmentDestroyed(this.LIZ, fragment);
            }
        }
    }

    public final void LJ(Fragment fragment, boolean z) {
        Fragment fragmentLJJLIL = this.LIZ.LJJLIL();
        if (fragmentLJJLIL != null) {
            fragmentLJJLIL.getParentFragmentManager().LJJLIIJ().LJ(fragment, true);
        }
        for (C19CZ c19cz : this.LIZIZ) {
            if (!z || c19cz.LIZIZ) {
                c19cz.LIZ.onFragmentDetached(this.LIZ, fragment);
            }
        }
    }

    public final void LJFF(Fragment fragment, boolean z) {
        Fragment fragmentLJJLIL = this.LIZ.LJJLIL();
        if (fragmentLJJLIL != null) {
            fragmentLJJLIL.getParentFragmentManager().LJJLIIJ().LJFF(fragment, true);
        }
        for (C19CZ c19cz : this.LIZIZ) {
            if (!z || c19cz.LIZIZ) {
                c19cz.LIZ.onFragmentPaused(this.LIZ, fragment);
            }
        }
    }

    public final void LJI(Fragment fragment, boolean z) {
        Context context = this.LIZ.LJJLIIIJLJLI().LLILLJJLI;
        Fragment fragmentLJJLIL = this.LIZ.LJJLIL();
        if (fragmentLJJLIL != null) {
            fragmentLJJLIL.getParentFragmentManager().LJJLIIJ().LJI(fragment, true);
        }
        for (C19CZ c19cz : this.LIZIZ) {
            if (!z || c19cz.LIZIZ) {
                c19cz.LIZ.onFragmentPreAttached(this.LIZ, fragment, context);
            }
        }
    }

    public final void LJIIIIZZ(Fragment fragment, boolean z) {
        Fragment fragmentLJJLIL = this.LIZ.LJJLIL();
        if (fragmentLJJLIL != null) {
            fragmentLJJLIL.getParentFragmentManager().LJJLIIJ().LJIIIIZZ(fragment, true);
        }
        for (C19CZ c19cz : this.LIZIZ) {
            if (!z || c19cz.LIZIZ) {
                c19cz.LIZ.onFragmentResumed(this.LIZ, fragment);
            }
        }
    }

    public final void LJIIJ(Fragment fragment, boolean z) {
        Fragment fragmentLJJLIL = this.LIZ.LJJLIL();
        if (fragmentLJJLIL != null) {
            fragmentLJJLIL.getParentFragmentManager().LJJLIIJ().LJIIJ(fragment, true);
        }
        for (C19CZ c19cz : this.LIZIZ) {
            if (!z || c19cz.LIZIZ) {
                c19cz.LIZ.onFragmentStarted(this.LIZ, fragment);
            }
        }
    }

    public final void LJIIJJI(Fragment fragment, boolean z) {
        Fragment fragmentLJJLIL = this.LIZ.LJJLIL();
        if (fragmentLJJLIL != null) {
            fragmentLJJLIL.getParentFragmentManager().LJJLIIJ().LJIIJJI(fragment, true);
        }
        for (C19CZ c19cz : this.LIZIZ) {
            if (!z || c19cz.LIZIZ) {
                c19cz.LIZ.onFragmentStopped(this.LIZ, fragment);
            }
        }
    }

    public final void LJIILIIL(Fragment fragment, boolean z) {
        Fragment fragmentLJJLIL = this.LIZ.LJJLIL();
        if (fragmentLJJLIL != null) {
            fragmentLJJLIL.getParentFragmentManager().LJJLIIJ().LJIILIIL(fragment, true);
        }
        for (C19CZ c19cz : this.LIZIZ) {
            if (!z || c19cz.LIZIZ) {
                c19cz.LIZ.onFragmentViewDestroyed(this.LIZ, fragment);
            }
        }
    }

    public final void LIZ(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentLJJLIL = this.LIZ.LJJLIL();
        if (fragmentLJJLIL != null) {
            fragmentLJJLIL.getParentFragmentManager().LJJLIIJ().LIZ(fragment, bundle, true);
        }
        for (C19CZ c19cz : this.LIZIZ) {
            if (!z || c19cz.LIZIZ) {
                c19cz.LIZ.onFragmentActivityCreated(this.LIZ, fragment, bundle);
            }
        }
    }

    public final void LIZJ(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentLJJLIL = this.LIZ.LJJLIL();
        if (fragmentLJJLIL != null) {
            fragmentLJJLIL.getParentFragmentManager().LJJLIIJ().LIZJ(fragment, bundle, true);
        }
        for (C19CZ c19cz : this.LIZIZ) {
            if (!z || c19cz.LIZIZ) {
                c19cz.LIZ.onFragmentCreated(this.LIZ, fragment, bundle);
            }
        }
    }

    public final void LJII(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentLJJLIL = this.LIZ.LJJLIL();
        if (fragmentLJJLIL != null) {
            fragmentLJJLIL.getParentFragmentManager().LJJLIIJ().LJII(fragment, bundle, true);
        }
        for (C19CZ c19cz : this.LIZIZ) {
            if (!z || c19cz.LIZIZ) {
                c19cz.LIZ.onFragmentPreCreated(this.LIZ, fragment, bundle);
            }
        }
    }

    public final void LJIIIZ(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentLJJLIL = this.LIZ.LJJLIL();
        if (fragmentLJJLIL != null) {
            fragmentLJJLIL.getParentFragmentManager().LJJLIIJ().LJIIIZ(fragment, bundle, true);
        }
        for (C19CZ c19cz : this.LIZIZ) {
            if (!z || c19cz.LIZIZ) {
                c19cz.LIZ.onFragmentSaveInstanceState(this.LIZ, fragment, bundle);
            }
        }
    }

    public final void LJIIL(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragmentLJJLIL = this.LIZ.LJJLIL();
        if (fragmentLJJLIL != null) {
            fragmentLJJLIL.getParentFragmentManager().LJJLIIJ().LJIIL(fragment, view, bundle, true);
        }
        for (C19CZ c19cz : this.LIZIZ) {
            if (!z || c19cz.LIZIZ) {
                c19cz.LIZ.onFragmentViewCreated(this.LIZ, fragment, view, bundle);
            }
        }
    }
}
