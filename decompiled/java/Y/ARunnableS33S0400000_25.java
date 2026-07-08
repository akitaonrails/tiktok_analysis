package Y;

import X.C1622820sKe;
import X.C1624010sMZ;
import X.C1650560t3O;
import X.C1650980t44;
import X.C1651010t47;
import X.C1C7U;
import X.C1DRG;
import X.EnumC1448980noG;
import X.EnumC1651770t5L;
import X.InterfaceC1623390sLZ;
import X.InterfaceC1649530t1j;
import X.InterfaceC1650230t2r;
import X.InterfaceC1650740t3g;
import X.InterfaceC1651080t4E;
import X.InterfaceC1651490t4t;
import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS234S0300000_25;

/* JADX INFO: loaded from: classes26.dex */
public class ARunnableS33S0400000_25 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS33S0400000_25 aRunnableS33S0400000_25) {
        boolean zLIZ;
        InterfaceC1650740t3g interfaceC1650740t3g;
        C1C7U.LIZ("ToolbarCreator@23f7.onCreate$refreshSpeedItemWithFunc$1");
        try {
            ((Function0) aRunnableS33S0400000_25.l0).invoke();
            Object objLJII = ((C1DRG) aRunnableS33S0400000_25.l1).LJII(InterfaceC1651080t4E.class, null);
            C1651010t47 c1651010t47 = (C1651010t47) aRunnableS33S0400000_25.l2;
            C1DRG c1drg = (C1DRG) aRunnableS33S0400000_25.l1;
            C1650560t3O c1650560t3O = (C1650560t3O) aRunnableS33S0400000_25.l3;
            C1650980t44 c1650980t44Ss = ((InterfaceC1651080t4E) objLJII).ss(1);
            if (c1650980t44Ss != null && (interfaceC1650740t3g = c1650980t44Ss.LLJILJILJ) != null) {
                interfaceC1650740t3g.LIZ();
            }
            C1650980t44 c1650980t44LJIILJJIL = c1650560t3O.LJIILJJIL();
            c1651010t47.getClass();
            C1651010t47.LIZLLL(c1drg, c1650980t44LJIILJJIL, true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ToolbarCreator@23f7.onCreate$refreshSpeedItemWithFunc$1");
    }

    public static final void run$1(ARunnableS33S0400000_25 aRunnableS33S0400000_25) {
        boolean zLIZ;
        C1C7U.LIZ("StickerModuleExt@8c5c.setCurrentEffectWithRequestSource$1");
        try {
            Effect effect = (Effect) aRunnableS33S0400000_25.l0;
            if (effect == null) {
                C1624010sMZ.LJIIIZ((InterfaceC1623390sLZ) aRunnableS33S0400000_25.l1, C1622820sKe.LIZ(null, (Bundle) aRunnableS33S0400000_25.l2, 5));
            } else {
                InterfaceC1623390sLZ interfaceC1623390sLZ = (InterfaceC1623390sLZ) aRunnableS33S0400000_25.l1;
                EnumC1448980noG enumC1448980noG = (EnumC1448980noG) aRunnableS33S0400000_25.l3;
                if (enumC1448980noG == null) {
                    enumC1448980noG = EnumC1448980noG.AUTO_SELECT;
                }
                C1624010sMZ.LJIIIZ(interfaceC1623390sLZ, C1622820sKe.LIZIZ(effect, -1, enumC1448980noG, null, (Bundle) aRunnableS33S0400000_25.l2, null, null, 0, false, null, null, 1012));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StickerModuleExt@8c5c.setCurrentEffectWithRequestSource$1");
    }

    public static final void run$2(ARunnableS33S0400000_25 aRunnableS33S0400000_25) {
        boolean zLIZ;
        C1C7U.LIZ("RecordToolbarCreator@8b2d.onCreate$callback$1$2$1");
        try {
            ((InterfaceC1651490t4t) aRunnableS33S0400000_25.l0).LJ(EnumC1651770t5L.SPEED, new AwS234S0300000_25((InterfaceC1649530t1j) aRunnableS33S0400000_25.l1, (InterfaceC1650230t2r) aRunnableS33S0400000_25.l2, (Boolean) aRunnableS33S0400000_25.l3, 36));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecordToolbarCreator@8b2d.onCreate$callback$1$2$1");
    }

    public ARunnableS33S0400000_25(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj4;
        this.l1 = obj3;
        this.l2 = obj;
        this.l3 = obj2;
    }
}
