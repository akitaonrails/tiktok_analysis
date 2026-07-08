package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mJ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391190mJ3 {
    public static C16BC LJIIIZ(Fragment fragment) {
        C1391180mJ2 c1391180mJ2;
        TuxSheet tuxSheetLJIIL = LJIIL(fragment);
        if (tuxSheetLJIIL == null || (c1391180mJ2 = tuxSheetLJIIL.LLLI) == null) {
            return null;
        }
        if (c1391180mJ2.getUsingDragBehavior()) {
            return c1391180mJ2.getDragBehavior();
        }
        return c1391180mJ2.getBehavior();
    }

    public static AbstractC343940De4 LJIIJ(DialogInterface dialogInterface) {
        if (dialogInterface instanceof DialogC1389560mGQ) {
            return ((DialogC1389560mGQ) dialogInterface).LLJILLL;
        }
        return C343970De7.LIZ;
    }

    public static AbstractC343940De4 LJIIJJI(DialogInterface dialogInterface) {
        if (dialogInterface instanceof DialogC1389560mGQ) {
            return ((DialogC1389560mGQ) dialogInterface).LLJJ;
        }
        return C343970De7.LIZ;
    }

    public static TuxSheet LJIIL(Fragment fragment) {
        Fragment parentFragment = fragment.getParentFragment();
        if (parentFragment == null || !parentFragment.isAdded() || !(parentFragment instanceof TuxSheet)) {
            return null;
        }
        return (TuxSheet) parentFragment;
    }

    public static void LJIILIIL(Fragment fragment) {
        Dialog dialog;
        TuxSheet tuxSheetLJIIL = LJIIL(fragment);
        if (tuxSheetLJIIL != null && (dialog = tuxSheetLJIIL.getDialog()) != null) {
            dialog.hide();
        }
    }

    public static void LJIILJJIL(Fragment fragment) {
        TuxSheet tuxSheetLJIIL = LJIIL(fragment);
        if (tuxSheetLJIIL != null) {
            tuxSheetLJIIL.WR();
        }
    }

    public static void LJIJ(Fragment fragment) {
        Dialog dialog;
        View viewFindViewById;
        TuxSheet tuxSheetLJIIL = LJIIL(fragment);
        if (tuxSheetLJIIL != null && (dialog = tuxSheetLJIIL.getDialog()) != null && (viewFindViewById = dialog.findViewById(R.id.eqx)) != null) {
            viewFindViewById.setFitsSystemWindows(false);
            viewFindViewById.requestApplyInsets();
        }
    }

    public static void LIZ(View view, AbstractC343940De4 abstractC343940De4) {
        DialogFragment dialogFragment = (DialogFragment) view.getTag(R.id.fds);
        if (dialogFragment == null) {
            return;
        }
        Dialog dialog = dialogFragment.getDialog();
        if (dialog instanceof DialogC1389560mGQ) {
            DialogC1389560mGQ dialogC1389560mGQ = (DialogC1389560mGQ) dialog;
            dialogC1389560mGQ.LLJILLL = abstractC343940De4;
            dialogC1389560mGQ.LLJJ = abstractC343940De4;
        }
        if (dialog != null) {
            dialogFragment.onCancel(dialog);
        }
        dialogFragment.dismissAllowingStateLoss();
    }

    public static void LIZIZ(Fragment fragment, AbstractC343940De4 abstractC343940De4) {
        TuxSheet tuxSheetLJIIL = LJIIL(fragment);
        if (tuxSheetLJIIL == null) {
            return;
        }
        Dialog dialog = tuxSheetLJIIL.getDialog();
        Dialog dialog2 = tuxSheetLJIIL.getDialog();
        if (dialog2 instanceof DialogC1389560mGQ) {
            DialogC1389560mGQ dialogC1389560mGQ = (DialogC1389560mGQ) dialog2;
            dialogC1389560mGQ.LLJILLL = abstractC343940De4;
            dialogC1389560mGQ.LLJJ = abstractC343940De4;
        }
        if (dialog != null) {
            tuxSheetLJIIL.onCancel(dialog);
        }
        tuxSheetLJIIL.dismissAllowingStateLoss();
    }

    public static void LJ(View view, AbstractC343940De4 abstractC343940De4) {
        DialogFragment dialogFragment = (DialogFragment) view.getTag(R.id.fds);
        if (dialogFragment == null) {
            return;
        }
        Dialog dialog = dialogFragment.getDialog();
        if (dialog instanceof DialogC1389560mGQ) {
            ((DialogC1389560mGQ) dialog).LLJJ = abstractC343940De4;
        }
        dialogFragment.dismissAllowingStateLoss();
    }

    public static void LJFF(Fragment fragment, AbstractC343940De4 abstractC343940De4) {
        Dialog dialog;
        TuxSheet tuxSheetLJIIL = LJIIL(fragment);
        if (tuxSheetLJIIL != null) {
            dialog = tuxSheetLJIIL.getDialog();
        } else {
            dialog = null;
        }
        if (dialog instanceof DialogC1389560mGQ) {
            ((DialogC1389560mGQ) dialog).LLJJ = abstractC343940De4;
        }
        if (tuxSheetLJIIL != null) {
            tuxSheetLJIIL.dismissAllowingStateLoss();
        }
    }

    public static void LJIIIIZZ(Fragment fragment, boolean z) {
        C1391180mJ2 c1391180mJ2;
        TuxSheet tuxSheetLJIIL = LJIIL(fragment);
        if (tuxSheetLJIIL == null || (c1391180mJ2 = tuxSheetLJIIL.LLLI) == null) {
            return;
        }
        int i = 3;
        if (c1391180mJ2.getUsingDragBehavior()) {
            TuxSheetBehavior<?> dragBehavior = c1391180mJ2.getDragBehavior();
            if (dragBehavior != null) {
                if (!z) {
                    i = 4;
                }
                dragBehavior.setState(i);
                return;
            }
            return;
        }
        BottomSheetBehavior<?> behavior = c1391180mJ2.getBehavior();
        if (behavior == null) {
            return;
        }
        if (!z) {
            i = 4;
        }
        behavior.setState(i);
    }

    public static void LJIILL(int i, Fragment fragment) {
        C1391180mJ2 c1391180mJ2;
        TuxSheet tuxSheetLJIIL = LJIIL(fragment);
        if (tuxSheetLJIIL != null && (c1391180mJ2 = tuxSheetLJIIL.LLLI) != null) {
            c1391180mJ2.setDynamicPeekHeightPx$tux_theme_release(i);
        }
    }

    public static void LJIILLIIL(int i, Fragment fragment) {
        C1391180mJ2 c1391180mJ2;
        TuxSheet tuxSheetLJIIL = LJIIL(fragment);
        if (tuxSheetLJIIL != null && (c1391180mJ2 = tuxSheetLJIIL.LLLI) != null) {
            c1391180mJ2.setFixedHeightPx$tux_theme_release(i);
        }
    }

    public static void LJIIZILJ(Fragment fragment, boolean z) {
        C1391180mJ2 c1391180mJ2;
        TuxSheet tuxSheetLJIIL = LJIIL(fragment);
        if (tuxSheetLJIIL != null && (c1391180mJ2 = tuxSheetLJIIL.LLLI) != null) {
            c1391180mJ2.setHideable$tux_theme_release(z);
        }
    }

    public static void LJIJI(Fragment fragment, Fragment fragment2, boolean z, EnumC344640DfC enumC344640DfC, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            enumC344640DfC = EnumC344640DfC.SLIDE;
        }
        TuxSheet tuxSheetLJIIL = LJIIL(fragment);
        if (tuxSheetLJIIL != null) {
            tuxSheetLJIIL.aS(fragment2, z, enumC344640DfC);
        }
    }
}
