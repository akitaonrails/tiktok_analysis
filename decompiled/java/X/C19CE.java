package X;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

/* JADX INFO: renamed from: X.19CE, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19CE extends Fragment implements InterfaceC21498919Br {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs/Kio9LWHELIOSsfKiAjLQ0jJSs2OgM+KCg+LSs4";
    public final C214937199r LL = C214937199r.LJI.IQ();

    @Override // X.InterfaceC21498919Br
    public final C214937199r IQ() {
        return this.LL;
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public static C19CE LIZ(Activity activity, String str, boolean z, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_");
        sbLIZ.append("ScopeHolderFragment");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        FragmentManager fragmentManager = activity.getFragmentManager();
        C19CE c19ce = (C19CE) fragmentManager.findFragmentByTag(strLIZIZ);
        if (c19ce != null) {
            if (z) {
                FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
                fragmentTransactionBeginTransaction.remove(c19ce);
                C19BL.LIZ(fragmentManager, fragmentTransactionBeginTransaction, z2);
            } else {
                return c19ce;
            }
        }
        C19CE c19ce2 = new C19CE();
        FragmentTransaction fragmentTransactionBeginTransaction2 = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction2.add(c19ce2, strLIZIZ);
        C19BL.LIZ(fragmentManager, fragmentTransactionBeginTransaction2, z2);
        return c19ce2;
    }
}
