package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.util.rxutils.rxlifecycle.BindingFragment;

/* JADX INFO: renamed from: X.0J1S, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J1S<V> {
    public final C11NZ<V> LIZ;

    public C0J1S(C11PQ c11pq) {
        this.LIZ = c11pq;
    }

    public static C0J1S<C0J1T> LIZ(FragmentManager fragmentManager) {
        BindingFragment bindingFragment = (BindingFragment) fragmentManager.LJJJJZI("_LIFECYCLE_BINDING_FRAGMENT_");
        if (bindingFragment == null) {
            bindingFragment = new BindingFragment();
            C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
            c19ehLJIIJ.LIZLLL(bindingFragment, "_LIFECYCLE_BINDING_FRAGMENT_");
            c19ehLJIIJ.LJIIJ();
        } else if (bindingFragment.isDetached()) {
            C19EH c19ehLJIIJ2 = fragmentManager.LJIIJ();
            c19ehLJIIJ2.LJIIIIZZ(bindingFragment);
            c19ehLJIIJ2.LJIIJ();
        }
        return new C0J1S<>(bindingFragment.LL);
    }
}
