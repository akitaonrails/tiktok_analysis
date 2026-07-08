package X;

import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uNE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701300uNE implements InterfaceC21498219Bk {
    public final ClassLoader LIZ;

    @Override // X.InterfaceC21498219Bk
    public final void LJJIJIIJIL() {
    }

    public C1701300uNE(ClassLoader classLoader) {
        this.LIZ = classLoader;
    }

    @Override // X.InterfaceC21498219Bk
    public final Bundle onRestoreInstanceState(Bundle bundle) {
        String name;
        ClassLoader classLoader;
        Bundle bundle2 = bundle.getBundle("saf_state_save_strategy");
        int i = Build.VERSION.SDK_INT;
        if (i == 29 || i == 28) {
            if (bundle2 != null && (classLoader = bundle2.getClassLoader()) != null) {
                name = classLoader.getClass().getName();
            } else {
                name = null;
            }
            if (Intrinsics.LJFF(name, "java.lang.BootClassLoader") && bundle2 != null) {
                bundle2.setClassLoader(this.LIZ);
            }
        }
        return bundle2;
    }

    @Override // X.InterfaceC21498219Bk
    public final void LIZ(Bundle bundle, Bundle bundle2) {
        C786410Ut5.LJJIIZI(bundle, bundle2, "saf_state_save_strategy");
    }
}
