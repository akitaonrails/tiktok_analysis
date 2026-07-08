package Y;

import X.C1289620jfE;
import X.C1AW8;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2250491D6p;
import X.C2252181DDc;
import X.EnumC780830Uk5;
import X.InterfaceC2250511D6r;
import X.InterfaceC647710Par;
import com.bytedance.android.livesdk.broadcast.interaction.config.AnchorWidgetLoadController;
import com.lynx.tasm.LynxView;
import java.util.Set;

/* JADX INFO: loaded from: classes36.dex */
public class ARunnableS68S0300000_35 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
        C2252181DDc c2252181DDc = (C2252181DDc) this.l0;
        if (c2252181DDc.LJIIJJI) {
            return;
        }
        Set<String> setKeySet = c2252181DDc.LIZIZ.keySet();
        Set<String> setKeySet2 = ((C2252181DDc) this.l0).LIZJ.keySet();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("phase_timeout priority=");
        sbLIZ.append((EnumC780830Uk5) this.l1);
        sbLIZ.append(" missing=");
        sbLIZ.append(setKeySet);
        sbLIZ.append(" notRequested=");
        sbLIZ.append(setKeySet2);
        C20441214yg.LJIIL("AnchorWidgetLoad", C2188811AlT.LIZIZ(sbLIZ));
        ((AnchorWidgetLoadController) this.l2).LIZIZ((EnumC780830Uk5) this.l1, "timeout");
    }

    public static final void run$0(ARunnableS68S0300000_35 aRunnableS68S0300000_35) {
        boolean zLIZ;
        C1C7U.LIZ("AnchorWidgetLoadController@a77a.startPhase$timeout$1");
        try {
            aRunnableS68S0300000_35.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnchorWidgetLoadController@a77a.startPhase$timeout$1");
    }

    public static final void run$1(ARunnableS68S0300000_35 aRunnableS68S0300000_35) {
        C2250491D6p c2250491D6p = (C2250491D6p) aRunnableS68S0300000_35.l0;
        C1AW8 c1aw8 = (C1AW8) aRunnableS68S0300000_35.l2;
        c2250491D6p.getClass();
        C1C7U.LIZ("LynxAsyncManager@e24a.preLayout$2L");
        if (c2250491D6p.LIZ && c2250491D6p.LJII != null) {
            c2250491D6p.LJII.execute(c1aw8);
        } else {
            C1289620jfE.LIZLLL(c1aw8);
        }
        C1C7U.LIZIZ("LynxAsyncManager@e24a.preLayout$2L");
    }

    public ARunnableS68S0300000_35(C2252181DDc c2252181DDc, EnumC780830Uk5 enumC780830Uk5, AnchorWidgetLoadController anchorWidgetLoadController, int i) {
        this.$t = i;
        this.l0 = c2252181DDc;
        this.l1 = enumC780830Uk5;
        this.l2 = anchorWidgetLoadController;
    }

    public ARunnableS68S0300000_35(C2250491D6p c2250491D6p, String str, InterfaceC647710Par interfaceC647710Par, C1AW8 c1aw8, InterfaceC2250511D6r interfaceC2250511D6r, LynxView lynxView, int i) {
        this.$t = i;
        this.l0 = c2250491D6p;
        this.l1 = interfaceC647710Par;
        this.l2 = c1aw8;
    }
}
