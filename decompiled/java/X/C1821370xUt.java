package X;

import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.0xUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821370xUt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final C1807680x8o LIZ(Fragment fragment) {
        for (Fragment parentFragment = fragment.getParentFragment(); parentFragment != 0; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof InterfaceC1821390xUv) {
                return ((InterfaceC1821390xUv) parentFragment).jG();
            }
        }
        InterfaceC1670800ta2 activity = fragment.getActivity();
        if (activity instanceof InterfaceC1821390xUv) {
            return ((InterfaceC1821390xUv) activity).jG();
        }
        throw new IllegalStateException("No HasCreativeCommonComponent found in the parent fragment chain or host activity");
    }
}
