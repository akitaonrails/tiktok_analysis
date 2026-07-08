package Y;

import X.C1587220rPE;
import X.C1587270rPJ;
import X.C1589640rT8;
import X.C19EG;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.main.IMainPageFragment;

/* JADX INFO: loaded from: classes25.dex */
public class AObserverS174S0000000_24 implements Observer {
    public final int $t;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public AObserverS174S0000000_24(int i) {
        this.$t = i;
    }

    public static final void onChanged$0(AObserverS174S0000000_24 aObserverS174S0000000_24, Object obj) {
        if (StateOwner.LL.LIZIZ() != null) {
            C1587220rPE.LIZ.getClass();
            if (C1587220rPE.LIZLLL()) {
                C1587270rPJ.LL.getClass();
                C1587270rPJ.LJIIIIZZ();
            } else {
                C1587270rPJ.LL.getClass();
                C1587270rPJ.LJ();
                C1587220rPE.LIZIZ.storeBoolean("has_shown_permission_dialog", true);
            }
        }
    }

    public static final void onChanged$1(AObserverS174S0000000_24 aObserverS174S0000000_24, Object obj) {
        C19EG c19egLIZIZ;
        if (C1589640rT8.LIZIZ.LIZ() && (c19egLIZIZ = StateOwner.LL.LIZIZ()) != null) {
            ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LIZLLL(c19egLIZIZ);
        }
    }
}
