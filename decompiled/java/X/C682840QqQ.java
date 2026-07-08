package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.SAFExtensionKt;

/* JADX INFO: renamed from: X.0QqQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C682840QqQ {
    public static final C01GW LIZ;
    public static final boolean LIZIZ;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C295840Big());
        LIZ = c01gwLIZIZ;
        LIZIZ = ((Number) c01gwLIZIZ.getValue()).intValue() > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C488600JEc LIZ(InterfaceC214902198i interfaceC214902198i, Activity activity) {
        Fragment fragment;
        if (LIZIZ) {
            if (interfaceC214902198i instanceof Fragment) {
                fragment = (Fragment) interfaceC214902198i;
            } else {
                fragment = null;
            }
            return SAFExtensionKt.LJIILIIL(fragment);
        }
        return SAFExtensionKt.LJIIL(activity);
    }
}
