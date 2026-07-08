package Y;

import X.AbstractC21673719rz;
import X.AbstractC677840QiM;
import X.C0HA4;
import X.C0Q0K;
import X.C1397905dZ;
import X.C13LP;
import X.C1846060y8i;
import X.C1C7U;
import X.C20600815jK;
import X.C678140Qiq;
import X.InterfaceC1891350zJl;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS7S0310000_10 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C678140Qiq c678140Qiq = (C678140Qiq) this.l0;
        String str = c678140Qiq.LJIJ;
        List<AbstractC677840QiM> listLIZ = c678140Qiq.LIZ(((C1397905dZ) this.l1).LIZ);
        C0HA4 c0ha4 = ((C678140Qiq) this.l0).LIZJ;
        if (c0ha4 == null) {
            c0ha4 = null;
        }
        C20600815jK<InterfaceC1891350zJl> state = c0ha4.getState();
        if (state != null) {
            state.LJIILL(listLIZ, null);
        }
        C678140Qiq c678140Qiq2 = (C678140Qiq) this.l0;
        boolean z = this.z3;
        AbstractC21673719rz abstractC21673719rz = (AbstractC21673719rz) this.l2;
        if (z) {
            C0HA4 c0ha42 = c678140Qiq2.LIZJ;
            HandlerHook.viewPostDelay(c0ha42 != null ? c0ha42 : null, new ARunnableS79S0200000_10(c678140Qiq2, abstractC21673719rz, 49), 180L);
        } else {
            c678140Qiq2.getClass();
        }
        ((C678140Qiq) this.l0).LJI(str, listLIZ);
        C678140Qiq c678140Qiq3 = (C678140Qiq) this.l0;
        AbstractC677840QiM abstractC677840QiM = (AbstractC677840QiM) C13LP.LJJJLL(listLIZ);
        c678140Qiq3.getClass();
        c678140Qiq3.LJIJ = C678140Qiq.LJII(abstractC677840QiM);
    }

    public static final void run$0(ARunnableS7S0310000_10 aRunnableS7S0310000_10) {
        boolean zLIZ;
        C1C7U.LIZ("MixPowerListController@cd45.observeEvent$1$2$1");
        try {
            aRunnableS7S0310000_10.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixPowerListController@cd45.observeEvent$1$2$1");
    }

    public static final void run$1(ARunnableS7S0310000_10 aRunnableS7S0310000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchTabTakoEntranceUIHelper@ea68.inflateTabByExperiment$2");
        try {
            C0Q0K.LIZJ((C1846060y8i) aRunnableS7S0310000_10.l0, aRunnableS7S0310000_10.z3, (View) aRunnableS7S0310000_10.l1, (Rect) aRunnableS7S0310000_10.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchTabTakoEntranceUIHelper@ea68.inflateTabByExperiment$2");
    }

    public ARunnableS7S0310000_10(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z3 = z;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
