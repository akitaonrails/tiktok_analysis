package Y;

import X.C0F4H;
import X.C1602160rnK;
import X.C1C7U;
import X.C2179971ATj;
import X.C2216241Boc;
import X.C352350Drd;
import X.C374880Ems;
import X.InterfaceC1452170ntP;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEEditor;

/* JADX INFO: loaded from: classes6.dex */
public class ARunnableS24S0110000_5 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public final void LIZ$0() {
        if (this.z1) {
            InterfaceC1452170ntP interfaceC1452170ntPLIZJ = ((C352350Drd) this.l0).LIZJ();
            if ((interfaceC1452170ntPLIZJ != null ? interfaceC1452170ntPLIZJ.getState() : null) != VEEditor.VEState.IDLE && ((C352350Drd) this.l0).LIZLLL.invoke().booleanValue() && ((C352350Drd) this.l0).LJ.invoke().booleanValue()) {
                ((C352350Drd) this.l0).LIZ.F32(true);
                InterfaceC1452170ntP interfaceC1452170ntPLIZJ2 = ((C352350Drd) this.l0).LIZJ();
                if (interfaceC1452170ntPLIZJ2 != null) {
                    interfaceC1452170ntPLIZJ2.Xe();
                }
                C2216241Boc.LIZ.LIZ("audio fadeout || release editor");
            }
        }
    }

    public static final void run$0(ARunnableS24S0110000_5 aRunnableS24S0110000_5) {
        try {
            aRunnableS24S0110000_5.LIZ$0();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$1(ARunnableS24S0110000_5 aRunnableS24S0110000_5) {
        boolean zLIZ;
        C1C7U.LIZ("RevealBlurOverlayScene@1baf.animateShowHideBlurImage$1$1");
        try {
            if (!aRunnableS24S0110000_5.z1) {
                C0F4H c0f4h = (C0F4H) aRunnableS24S0110000_5.l0;
                int visibility = c0f4h.getVisibility();
                c0f4h.setVisibility(4);
                C1602160rnK.LIZIZ(visibility, 4, c0f4h);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RevealBlurOverlayScene@1baf.animateShowHideBlurImage$1$1");
    }

    public static final void run$2(ARunnableS24S0110000_5 aRunnableS24S0110000_5) {
        boolean zLIZ;
        C1C7U.LIZ("VideoCropApiCoordinator@3b3a.exit$1$1");
        try {
            if (aRunnableS24S0110000_5.z1) {
                ((C374880Ems) aRunnableS24S0110000_5.l0).X1(true);
            } else {
                ((C374880Ems) aRunnableS24S0110000_5.l0).X1(false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoCropApiCoordinator@3b3a.exit$1$1");
    }

    public ARunnableS24S0110000_5(Object obj, boolean z, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = obj;
    }
}
