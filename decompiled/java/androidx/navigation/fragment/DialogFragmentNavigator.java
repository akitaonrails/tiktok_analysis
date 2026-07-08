package androidx.navigation.fragment;

import X.AbstractC20133313q7;
import X.C20131713pr;
import X.C20133813qC;
import X.C20134413qI;
import X.C20135813qW;
import X.C2188811AlT;
import X.InterfaceC20133113q5;
import X.InterfaceC20133413q8;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC20133113q5("dialog")
public final class DialogFragmentNavigator extends AbstractC20133313q7<C20134413qI> {
    public final Context LIZJ;
    public final FragmentManager LIZLLL;
    public int LJ;
    public final LifecycleEventObserver LJFF = new LifecycleEventObserver() { // from class: androidx.navigation.fragment.DialogFragmentNavigator.1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_STOP) {
                DialogFragment dialogFragment = (DialogFragment) lifecycleOwner;
                if (!dialogFragment.requireDialog().isShowing()) {
                    NavHostFragment.MR(dialogFragment).LJIIZILJ();
                }
            }
        }
    };

    @Override // X.AbstractC20133313q7
    public final C20131713pr LIZ() {
        return new C20134413qI(this);
    }

    @Override // X.AbstractC20133313q7
    public final Bundle LJFF() {
        if (this.LJ == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.LJ);
        return bundle;
    }

    @Override // X.AbstractC20133313q7
    public final boolean LJII() {
        if (this.LJ == 0 || this.LIZLLL.LJLJJI()) {
            return false;
        }
        FragmentManager fragmentManager = this.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("androidx-nav-fragment:navigator:dialog:");
        int i = this.LJ - 1;
        this.LJ = i;
        sbLIZ.append(i);
        Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
        if (fragmentLJJJJZI != null) {
            fragmentLJJJJZI.getLifecycle().removeObserver(this.LJFF);
            ((DialogFragment) fragmentLJJJJZI).dismiss();
        }
        return true;
    }

    @Override // X.AbstractC20133313q7
    public final void LJ(Bundle bundle) {
        this.LJ = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
        for (int i = 0; i < this.LJ; i++) {
            FragmentManager fragmentManager = this.LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("androidx-nav-fragment:navigator:dialog:");
            sbLIZ.append(i);
            Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
            if (fragmentLJJJJZI != null) {
                fragmentLJJJJZI.getLifecycle().addObserver(this.LJFF);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("DialogFragment ");
                sbLIZ2.append(i);
                sbLIZ2.append(" doesn't exist in the FragmentManager");
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    public DialogFragmentNavigator(Context context, FragmentManager fragmentManager) {
        this.LIZJ = context;
        this.LIZLLL = fragmentManager;
    }

    @Override // X.AbstractC20133313q7
    public final C20131713pr LIZJ(C20131713pr c20131713pr, Bundle bundle, C20133813qC c20133813qC, InterfaceC20133413q8 interfaceC20133413q8) {
        C20134413qI c20134413qI = (C20134413qI) c20131713pr;
        if (this.LIZLLL.LJLJJI()) {
            return null;
        }
        String strLIZIZ = c20134413qI.LLJIJIL;
        if (strLIZIZ != null) {
            if (strLIZIZ.charAt(0) == '.') {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZJ.getPackageName());
                sbLIZ.append(strLIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            C20135813qW c20135813qWLJJLIIIJJIZ = this.LIZLLL.LJJLIIIJJIZ();
            this.LIZJ.getClassLoader();
            Fragment fragmentLIZ = c20135813qWLJJLIIIJJIZ.LIZ(strLIZIZ);
            if (DialogFragment.class.isAssignableFrom(fragmentLIZ.getClass())) {
                DialogFragment dialogFragment = (DialogFragment) fragmentLIZ;
                dialogFragment.setArguments(bundle);
                dialogFragment.getLifecycle().addObserver(this.LJFF);
                FragmentManager fragmentManager = this.LIZLLL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("androidx-nav-fragment:navigator:dialog:");
                int i = this.LJ;
                this.LJ = i + 1;
                sbLIZ2.append(i);
                dialogFragment.show(fragmentManager, C2188811AlT.LIZIZ(sbLIZ2));
                return c20134413qI;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Dialog destination ");
            String str = c20134413qI.LLJIJIL;
            if (str != null) {
                sbLIZ3.append(str);
                sbLIZ3.append(" is not an instance of DialogFragment");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }
}
