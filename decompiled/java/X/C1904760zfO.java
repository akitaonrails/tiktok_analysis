package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0zfO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904760zfO implements C0WHU {
    public static final C1904760zfO LIZ = new C1904760zfO();
    public static final C1604710rrR LIZIZ = new C1604710rrR("inbox", 3, 3);
    public static InterfaceC1587510rPh LIZJ;
    public static WeakReference<Fragment> LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;

    @Override // X.C0WHU
    public final void LIZ(C0WHR c0whr) {
        Fragment fragment;
        LIZJ = c0whr;
        WeakReference<Fragment> weakReference = LIZLLL;
        if (weakReference != null && (fragment = weakReference.get()) != null) {
            LifecycleOwnerKt.getLifecycleScope(fragment).launchWhenResumed(new C0NKS(fragment, null));
        }
    }
}
