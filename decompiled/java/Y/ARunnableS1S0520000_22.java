package Y;

import X.C013C;
import X.C0CHQ;
import X.C1455250nyN;
import X.C1455260nyO;
import X.C1455340nyW;
import X.C1456350o09;
import X.C15O7;
import X.C1C7U;
import X.C2501509rB;
import X.C295820Bie;
import X.C524780Ki4;

/* JADX INFO: loaded from: classes23.dex */
public class ARunnableS1S0520000_22 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public boolean z5;
    public boolean z6;

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
        C524780Ki4.LIZ.step("av_video_publish", "compile_sticker_done");
        if (((C013C) this.l0).element) {
            ((C1455260nyO) this.l1).LLZLLIL().oL2();
            ((C013C) this.l0).element = false;
        }
        if (((Runnable) this.l2) == null) {
            C1455260nyO c1455260nyO = (C1455260nyO) this.l1;
            c1455260nyO.q(this.z5, this.z6, new ARunnableS55S0300000_22(c1455260nyO, (C1456350o09) this.l3, (Runnable) this.l4, 6), false);
            return;
        }
        if (C295820Bie.LIZIZ() == 2) {
            ((C1455260nyO) this.l1).LLLLLZ(true, (C1456350o09) this.l3);
        }
        C1455260nyO c1455260nyO2 = (C1455260nyO) this.l1;
        Runnable runnable = (Runnable) this.l2;
        c1455260nyO2.getClass();
        C1455340nyW c1455340nyWLIZJ = C0CHQ.LIZ().getPublishService().LJIIJ().LIZJ();
        if (c1455340nyWLIZJ.LJ()) {
            runnable.run();
        } else {
            C15O7.LIZJ(new ACallableS410S0100000_2(c1455340nyWLIZJ, 3)).LJ(new C2501509rB(runnable, 10), C15O7.LJIIIIZZ, null);
        }
    }

    public final void LIZ$1() {
        C524780Ki4.LIZ.step("av_video_publish", "compile_sticker_done");
        if (((C013C) this.l0).element) {
            ((C1455250nyN) this.l1).LLLLZLL().oL2();
            ((C013C) this.l0).element = false;
        }
        if (((Runnable) this.l2) == null) {
            C1455250nyN c1455250nyN = (C1455250nyN) this.l1;
            c1455250nyN.LLLZLL(this.z5, this.z6, new ARunnableS55S0300000_22(c1455250nyN, (C1456350o09) this.l3, (Runnable) this.l4, 8), false);
            return;
        }
        if (C295820Bie.LIZIZ() == 2) {
            ((C1455250nyN) this.l1).LLLLLZ(true, (C1456350o09) this.l3);
        }
        C1455250nyN c1455250nyN2 = (C1455250nyN) this.l1;
        Runnable runnable = (Runnable) this.l2;
        c1455250nyN2.getClass();
        C1455340nyW c1455340nyWLIZJ = C0CHQ.LIZ().getPublishService().LJIIJ().LIZJ();
        if (c1455340nyWLIZJ.LJ()) {
            runnable.run();
        } else {
            C15O7.LIZJ(new ACallableS410S0100000_2(c1455340nyWLIZJ, 10)).LJ(new C2501509rB(runnable, 15), C15O7.LJIIIIZZ, null);
        }
    }

    public static final void run$0(ARunnableS1S0520000_22 aRunnableS1S0520000_22) {
        boolean zLIZ;
        C1C7U.LIZ("EditRootScene@37d3.asyncExtractCoverNew$2");
        try {
            aRunnableS1S0520000_22.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditRootScene@37d3.asyncExtractCoverNew$2");
    }

    public static final void run$1(ARunnableS1S0520000_22 aRunnableS1S0520000_22) {
        boolean zLIZ;
        C1C7U.LIZ("SocialEditRootScene@8880.asyncExtractCoverNew$2");
        try {
            aRunnableS1S0520000_22.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SocialEditRootScene@8880.asyncExtractCoverNew$2");
    }

    public ARunnableS1S0520000_22(Object obj, Object obj2, Object obj3, Object obj4, boolean z, boolean z2, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.z5 = z;
        this.z6 = z2;
        this.l4 = obj5;
    }
}
