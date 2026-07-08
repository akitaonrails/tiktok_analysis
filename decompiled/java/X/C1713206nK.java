package X;

import android.app.Activity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import java.util.Iterator;

/* JADX INFO: renamed from: X.06nK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1713206nK {
    public static void LIZ(Activity activity) {
        C128Y next;
        InterfaceC1713406nM interfaceC1713406nM;
        if (activity instanceof C19EG) {
            if (((Boolean) C1713306nL.LIZ.getValue()).booleanValue()) {
                Iterator<Fragment> it2 = ((C19EG) activity).getSupportFragmentManager().LJJLIIIJL().iterator();
                do {
                    next = null;
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        next = it2.next();
                    }
                } while (!(next instanceof InterfaceC1713406nM));
                if ((next instanceof InterfaceC1713406nM) && (interfaceC1713406nM = (InterfaceC1713406nM) next) != null) {
                    interfaceC1713406nM.Dc();
                    return;
                }
                return;
            }
            for (Fragment fragment : ((C19EG) activity).getSupportFragmentManager().LJJLIIIJL()) {
                if (fragment instanceof DialogFragment) {
                    ((DialogFragment) fragment).dismissAllowingStateLoss();
                } else if (fragment instanceof InterfaceC1713406nM) {
                    for (Fragment fragment2 : fragment.getChildFragmentManager().LJJLIIIJL()) {
                        if (fragment2 instanceof DialogFragment) {
                            ((DialogFragment) fragment2).dismissAllowingStateLoss();
                        }
                    }
                }
            }
        }
    }
}
