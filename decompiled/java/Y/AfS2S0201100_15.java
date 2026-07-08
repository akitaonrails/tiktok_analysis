package Y;

import X.C09JN;
import X.C0UVC;
import X.C1C7U;
import X.C954360awU;
import X.C973660bRc;
import X.C974540bT2;
import X.C974930bTf;
import X.C975250bUB;
import X.C976120bVa;
import X.C976770bWd;
import X.C977620bY0;
import X.C977630bY1;
import X.C977730bYB;
import X.C977770bYF;
import X.EnumC976390bW1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AfS2S0201100_15 implements C09JN {
    public final int $t;
    public int i2;
    public long j3;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS2S0201100_15 afS2S0201100_15, Object obj) {
        C1C7U.LIZ("TeamMatchInviteeViewModel@e3fd.requestRejectApi$dispose$2");
        Throwable th = (Throwable) obj;
        C974540bT2.LIZ.LJLLI(afS2S0201100_15.i2, afS2S0201100_15.j3, th);
        C0UVC.LIZIZ(th);
        ((C975250bUB) afS2S0201100_15.l0).LJIJ.setValue(C974930bTf.LIZ(new C974930bTf(null, null, null, null), null, null, null, (EnumC976390bW1) afS2S0201100_15.l1, 7));
        C1C7U.LIZIZ("TeamMatchInviteeViewModel@e3fd.requestRejectApi$dispose$2");
    }

    public static final void accept$1(AfS2S0201100_15 afS2S0201100_15, Object obj) {
        Function1<Throwable, Unit> function1;
        C1C7U.LIZ("CombinedMatchInviterViewModel@5274.requestTwoMatchInviteApi$dispose$2");
        Throwable th = (Throwable) obj;
        C974540bT2.LIZ.LJJLIIIJJI(afS2S0201100_15.i2, afS2S0201100_15.j3, th);
        ((C977630bY1) afS2S0201100_15.l0).LJJ.setValue(C977770bYF.LIZ(new C977770bYF(0), null, null, th, null, null, 27));
        C973660bRc.LJLLJ = "";
        C0UVC.LIZIZ(th);
        C954360awU c954360awU = (C954360awU) afS2S0201100_15.l1;
        if (c954360awU != null && (function1 = c954360awU.LIZIZ) != null) {
            function1.invoke(th);
        }
        C1C7U.LIZIZ("CombinedMatchInviterViewModel@5274.requestTwoMatchInviteApi$dispose$2");
    }

    public static final void accept$2(AfS2S0201100_15 afS2S0201100_15, Object obj) {
        C1C7U.LIZ("TwoMatchInviteeViewModel@472.requestRejectApi$dispose$2");
        Throwable th = (Throwable) obj;
        C974540bT2.LIZ.LJLLI(afS2S0201100_15.i2, afS2S0201100_15.j3, th);
        C0UVC.LIZIZ(th);
        ((C976120bVa) afS2S0201100_15.l0).LJIJ.setValue(C976770bWd.LIZ(new C976770bWd(null, null, null, null), null, null, null, (EnumC976390bW1) afS2S0201100_15.l1, 7));
        C1C7U.LIZIZ("TwoMatchInviteeViewModel@472.requestRejectApi$dispose$2");
    }

    public static final void accept$3(AfS2S0201100_15 afS2S0201100_15, Object obj) {
        Function1<Throwable, Unit> function1;
        C1C7U.LIZ("TwoMatchInviterViewModel@1a1b.requestTwoMatchInviteApi$dispose$2");
        Throwable th = (Throwable) obj;
        C974540bT2.LIZ.LJJLIIIJJI(afS2S0201100_15.i2, afS2S0201100_15.j3, th);
        ((C977620bY0) afS2S0201100_15.l0).LJIIZILJ.setValue(C977730bYB.LIZ(new C977730bYB(null, null, null, null), null, th, null, null, 13));
        C973660bRc.LJLLJ = "";
        C0UVC.LIZIZ(th);
        if (afS2S0201100_15.i2 == 5) {
            ((C977620bY0) afS2S0201100_15.l0).LJIILIIL();
        }
        C954360awU c954360awU = (C954360awU) afS2S0201100_15.l1;
        if (c954360awU != null && (function1 = c954360awU.LIZIZ) != null) {
            function1.invoke(th);
        }
        C1C7U.LIZIZ("TwoMatchInviterViewModel@1a1b.requestTwoMatchInviteApi$dispose$2");
    }

    public AfS2S0201100_15(int i, long j, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.j3 = j;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
