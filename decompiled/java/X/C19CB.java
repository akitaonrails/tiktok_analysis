package X;

import android.R;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.19CB, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19CB {
    public final Activity LIZ;
    public final Class<? extends C19A3> LIZIZ;
    public Bundle LIZJ;
    public int LIZLLL = R.id.content;
    public boolean LJ;
    public InterfaceC214877197j LJFF;

    public final void LIZ() {
        Scene sceneLIZ;
        Activity activity = this.LIZ;
        int i = this.LIZLLL;
        Class<? extends C19A3> cls = this.LIZIZ;
        Bundle bundle = this.LIZJ;
        InterfaceC214877197j interfaceC214877197j = this.LJFF;
        boolean z = this.LJ;
        C12WP.LIZ();
        C788890Ux5.LIZ(activity, "LifeCycleFragment");
        C19CC c19cc = null;
        if (interfaceC214877197j == null || (sceneLIZ = interfaceC214877197j.LIZ(activity.getClass().getClassLoader(), cls.getName(), bundle)) == null) {
            sceneLIZ = C2350509Ix.LIZ(bundle, cls);
        }
        if (C19BL.LJ(activity)) {
            FragmentManager fragmentManager = activity.getFragmentManager();
            C19CC c19cc2 = (C19CC) fragmentManager.findFragmentByTag("LifeCycleFragment");
            if (c19cc2 == null || z) {
                c19cc = c19cc2;
            } else {
                FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
                fragmentTransactionBeginTransaction.remove(c19cc2);
                C19BL.LIZ(fragmentManager, fragmentTransactionBeginTransaction, true);
            }
            C19394410uE c19394410uE = new C19394410uE(activity);
            if (c19cc != null) {
                c19cc.LLILLJJLI = new C19AK(i, c19394410uE, sceneLIZ, C19CE.LIZ(activity, "LifeCycleFragment", false, true), z);
                return;
            }
            C19CC c19cc3 = new C19CC();
            FragmentTransaction fragmentTransactionBeginTransaction2 = fragmentManager.beginTransaction();
            fragmentTransactionBeginTransaction2.add(i, c19cc3, "LifeCycleFragment");
            c19cc3.LLILLJJLI = new C19AK(i, c19394410uE, sceneLIZ, C19CE.LIZ(activity, "LifeCycleFragment", !z, true), z);
            C19BL.LIZ(fragmentManager, fragmentTransactionBeginTransaction2, true);
        }
    }

    public C19CB(Activity activity, Class cls) {
        C19BL.LJI(activity, "Activity can't be null");
        this.LIZ = activity;
        this.LIZIZ = cls;
    }
}
