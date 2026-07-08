package X;

import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0aDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926630aDl {
    public static final void LIZJ(WeakReference<Object> weakReference) {
        Object obj;
        Fragment fragment;
        Object obj2;
        Dialog dialog;
        DialogFragment dialogFragment;
        Object obj3 = null;
        if (weakReference != null) {
            obj = weakReference.get();
        } else {
            obj = null;
        }
        if ((obj instanceof DialogFragment) && (fragment = (Fragment) obj) != null) {
            C19EG activity = fragment.getActivity();
            if (fragment.getFragmentManager() != null && activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                if (weakReference != null) {
                    obj2 = weakReference.get();
                } else {
                    obj2 = null;
                }
                if ((obj2 instanceof DialogFragment) && (dialogFragment = (DialogFragment) obj2) != null) {
                    dialogFragment.dismissAllowingStateLoss();
                }
                if (weakReference != null) {
                    obj3 = weakReference.get();
                }
                if ((obj3 instanceof Dialog) && (dialog = (Dialog) obj3) != null) {
                    C500260Jjc.LJJLIIIJL(dialog);
                    return;
                }
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismissAllowingStateLoss skipped, context is invalid. Fragment: ");
        sbLIZ.append(weakReference);
        C20441214yg.LJIIL("LiveDialogFragment", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Dialog LIZ(DialogC19728412Gs dialogC19728412Gs, int i, boolean z, boolean z2, boolean z3, int i2) {
        boolean z4;
        boolean z5 = z3;
        boolean z6 = z2;
        boolean z7 = z;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = 0;
        }
        if ((i2 & 2) != 0) {
            z7 = false;
        }
        if ((i2 & 4) != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if ((i2 & 8) != 0) {
            z6 = false;
        }
        if ((i2 & 16) != 0) {
            z5 = false;
        }
        if (dialogC19728412Gs == null) {
            return null;
        }
        MultiGuestDialogManager multiGuestDialogManagerLIZ = C922410a6x.LIZ();
        if (multiGuestDialogManagerLIZ == null) {
            return dialogC19728412Gs;
        }
        C926620aDk c926620aDk = new C926620aDk(i3, z7, z4, z6, z5, null, false, true, 256, 0);
        List<Pair<WeakReference<Object>, C926620aDk>> list = multiGuestDialogManagerLIZ.LLIZ;
        ArrayList<Pair> arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            Pair pair = (Pair) obj;
            List<Integer> list2 = c926620aDk.LJFF;
            if ((list2 != null && list2.contains(Integer.valueOf(((C926620aDk) pair.getSecond()).LIZ))) || (!c926620aDk.LJI && ((C926620aDk) pair.getSecond()).LIZ == c926620aDk.LIZ)) {
                arrayList.add(obj);
            }
        }
        for (Pair pair2 : arrayList) {
            LIZJ((WeakReference) pair2.getFirst());
            ((C926620aDk) pair2.getSecond()).LJII = false;
        }
        multiGuestDialogManagerLIZ.xQ2();
        ((ArrayList) multiGuestDialogManagerLIZ.LLIZ).add(new Pair(new WeakReference(dialogC19728412Gs), c926620aDk));
        return dialogC19728412Gs;
    }

    public static DialogFragment LIZIZ(DialogFragment dialogFragment, int i, boolean z, boolean z2, boolean z3, List list, int i2, int i3) {
        boolean z4;
        int i4 = i2;
        List list2 = list;
        boolean z5 = z3;
        boolean z6 = z2;
        boolean z7 = z;
        int i5 = i;
        if ((i3 & 1) != 0) {
            i5 = 0;
        }
        if ((i3 & 2) != 0) {
            z7 = false;
        }
        if ((i3 & 4) != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if ((i3 & 8) != 0) {
            z6 = false;
        }
        if ((i3 & 16) != 0) {
            z5 = false;
        }
        if ((i3 & 32) != 0) {
            list2 = null;
        }
        if ((i3 & 128) != 0) {
            i4 = 0;
        }
        if (dialogFragment == null) {
            return null;
        }
        MultiGuestDialogManager multiGuestDialogManagerLIZ = C922410a6x.LIZ();
        if (multiGuestDialogManagerLIZ == null) {
            return dialogFragment;
        }
        C926620aDk c926620aDk = new C926620aDk(i5, z7, z4, z6, z5, list2, false, true, i4);
        List<Pair<WeakReference<Object>, C926620aDk>> list3 = multiGuestDialogManagerLIZ.LLIZ;
        ArrayList<Pair> arrayList = new ArrayList();
        for (Object obj : (ArrayList) list3) {
            Pair pair = (Pair) obj;
            List<Integer> list4 = c926620aDk.LJFF;
            if ((list4 != null && list4.contains(Integer.valueOf(((C926620aDk) pair.getSecond()).LIZ))) || (!c926620aDk.LJI && ((C926620aDk) pair.getSecond()).LIZ == c926620aDk.LIZ)) {
                arrayList.add(obj);
            }
        }
        for (Pair pair2 : arrayList) {
            LIZJ((WeakReference) pair2.getFirst());
            ((C926620aDk) pair2.getSecond()).LJII = false;
        }
        multiGuestDialogManagerLIZ.xQ2();
        ((ArrayList) multiGuestDialogManagerLIZ.LLIZ).add(new Pair(new WeakReference(dialogFragment), c926620aDk));
        return dialogFragment;
    }
}
