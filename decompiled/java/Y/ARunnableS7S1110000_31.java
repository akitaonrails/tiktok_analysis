package Y;

import X.AbstractC212300186g;
import X.C123100dR;
import X.C1389880mGw;
import X.C181R;
import X.C1C7U;
import X.C20337314hv;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS7S1110000_31 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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
        AbstractC212300186g bidCardView = ((C181R) this.l1).getBidCardView();
        if (bidCardView != null) {
            bidCardView.setBtnLoading(false);
        }
        if (this.z2) {
            return;
        }
        if (C123100dR.LIZ(this.s0)) {
            C1389880mGw c1389880mGw = new C1389880mGw((C181R) this.l1);
            c1389880mGw.LJIIIZ(this.s0);
            c1389880mGw.LJIIJ();
        } else {
            C1389880mGw c1389880mGw2 = new C1389880mGw((C181R) this.l1);
            c1389880mGw2.LJIIIIZZ(2131833103);
            c1389880mGw2.LJIIJ();
        }
    }

    public static final void run$0(ARunnableS7S1110000_31 aRunnableS7S1110000_31) {
        boolean zLIZ;
        C1C7U.LIZ("UsBidPopCardBaseView@fbef.bidDirectly$1$1$1");
        try {
            aRunnableS7S1110000_31.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UsBidPopCardBaseView@fbef.bidDirectly$1$1$1");
    }

    public static final void run$1(ARunnableS7S1110000_31 aRunnableS7S1110000_31) {
        boolean zLIZ;
        C1C7U.LIZ("AbnormalExitMonitor@8384.stepIn$1");
        try {
            if (aRunnableS7S1110000_31.z2) {
                ((C20337314hv) aRunnableS7S1110000_31.l1).LJ.clear();
            }
            ((C20337314hv) aRunnableS7S1110000_31.l1).LJ.push(aRunnableS7S1110000_31.s0);
            ((C20337314hv) aRunnableS7S1110000_31.l1).LJIIIIZZ().storeString("exit_monitor_key_last_page", aRunnableS7S1110000_31.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbnormalExitMonitor@8384.stepIn$1");
    }

    public ARunnableS7S1110000_31(Object obj, boolean z, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.z2 = z;
        this.s0 = str;
    }
}
