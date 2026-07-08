package X;

import Y.ACListenerS147S0100000_12;
import Y.AfS181S0100000_12;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AwS661S0100000_12;

/* JADX INFO: renamed from: X.0Ufh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778110Ufh implements InterfaceC779960Uig {
    public final C778590UgT LIZ;
    public C778600UgU LIZIZ;
    public final InterfaceC1631620sYq<EnumC778100Ufg, EnumC778130Ufj, Object, Unit> LIZJ;
    public C11JF LIZLLL;
    public int LJ = 2;
    public EnumC778100Ufg LJFF = EnumC778100Ufg.LIVE_TIP_UNKNOWN;
    public CharSequence LJI;
    public Object LJII;

    @Override // X.InterfaceC779960Uig
    public final void LIZIZ(C777860UfI c777860UfI) {
    }

    @Override // X.InterfaceC779960Uig
    public final AbstractC777950UfR LJII() {
        return null;
    }

    @Override // X.InterfaceC779960Uig
    public final boolean LJIIIZ(AbstractC777950UfR abstractC777950UfR, boolean z) {
        return false;
    }

    @Override // X.InterfaceC779960Uig
    public final void dismiss() {
        this.LIZIZ = null;
        this.LIZ.LJI();
        C11JF c11jf = this.LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    @Override // X.InterfaceC779960Uig
    public final void LJ() {
        LJIILIIL(this, EnumC778130Ufj.HIDE_TIP);
    }

    @Override // X.InterfaceC779960Uig
    public final void LJIIIIZZ() {
        int i = this.LJ;
        if (i != 0 && i != 1) {
            LJIILIIL(this, EnumC778130Ufj.CHANGE_STATE);
        }
        hide();
    }

    @Override // X.InterfaceC779960Uig
    public final void LJIIJJI() {
        LJIILIIL(this, EnumC778130Ufj.RETURN_APP);
    }

    @Override // X.InterfaceC779960Uig
    public final boolean LJJII() {
        return (this.LIZ.LJ ^ true) || C500260Jjc.LJJJJIZL(this.LIZIZ);
    }

    @Override // X.InterfaceC779960Uig
    public final View getContentView() {
        return this.LIZ.LIZLLL;
    }

    @Override // X.InterfaceC779960Uig
    public final void hide() {
        C778600UgU c778600UgU = this.LIZIZ;
        if (c778600UgU != null) {
            C439101nJ.LJI(c778600UgU);
        }
        this.LIZ.LJIIIIZZ();
    }

    @Override // X.InterfaceC779960Uig
    public final void init() {
        this.LIZ.LJIIIZ();
    }

    @Override // X.InterfaceC779960Uig
    public final void onDestroy() {
        C778590UgT c778590UgT = this.LIZ;
        DataChannel dataChannel = c778590UgT.LJIILJJIL;
        if (dataChannel != null) {
            dataChannel.zQ2(c778590UgT);
        }
    }

    @Override // X.InterfaceC779960Uig
    public final EnumC778100Ufg LIZLLL() {
        return this.LJFF;
    }

    @Override // X.InterfaceC779960Uig
    public final int LJIIJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC779960Uig
    public final void LIZ(EnumC778100Ufg enumC778100Ufg) {
        InterfaceC1631620sYq<EnumC778100Ufg, EnumC778130Ufj, Object, Unit> interfaceC1631620sYq = this.LIZJ;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(enumC778100Ufg, EnumC778130Ufj.HIDE_TIP, this.LJII);
        }
    }

    @Override // X.InterfaceC779960Uig
    public final void LIZJ(boolean z) {
        CharSequence charSequence;
        int i = this.LJ;
        if ((i == 0 || i == 1) && (charSequence = this.LJI) != null) {
            if (this.LJFF.getForceAutoDismiss() > 0) {
                LJIIL(this.LJFF);
            }
            if (z) {
                C778600UgU c778600UgU = this.LIZIZ;
                if (c778600UgU != null) {
                    c778600UgU.h0(this.LJFF, charSequence, this.LJII);
                }
                C778600UgU c778600UgU2 = this.LIZIZ;
                if (c778600UgU2 != null) {
                    C12ES.LJIILL(0, c778600UgU2);
                }
                this.LIZ.LJIIIIZZ();
                return;
            }
            this.LIZ.LJIIZILJ(this.LJFF, charSequence, this.LJII);
            C778600UgU c778600UgU3 = this.LIZIZ;
            if (c778600UgU3 == null) {
                return;
            }
            C439101nJ.LJI(c778600UgU3);
        }
    }

    public final void LJIIL(EnumC778100Ufg enumC778100Ufg) {
        long forceAutoDismiss;
        C11JF c11jf = this.LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        if (enumC778100Ufg.getForceAutoDismiss() > 0) {
            forceAutoDismiss = enumC778100Ufg.getForceAutoDismiss();
            if (forceAutoDismiss <= 0) {
                return;
            }
        } else {
            int priority = enumC778100Ufg.getPriority();
            if (priority != 2) {
                if (priority != 3) {
                    return;
                } else {
                    forceAutoDismiss = Mp4ScreenVideoLoadTimeout.CONTROL;
                }
            } else {
                forceAutoDismiss = 10000;
            }
        }
        this.LIZLLL = (C11JF) C11NZ.LJLJJLL(forceAutoDismiss, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS181S0100000_12(this, 278));
    }

    public static void LJIILIIL(C778110Ufh c778110Ufh, EnumC778130Ufj enumC778130Ufj) {
        InterfaceC1631620sYq<EnumC778100Ufg, EnumC778130Ufj, Object, Unit> interfaceC1631620sYq;
        boolean zLJJII = c778110Ufh.LJJII();
        EnumC778100Ufg enumC778100Ufg = c778110Ufh.LJFF;
        EnumC778100Ufg enumC778100Ufg2 = EnumC778100Ufg.LIVE_TIP_UNKNOWN;
        c778110Ufh.LJFF = enumC778100Ufg2;
        c778110Ufh.LJ = 2;
        c778110Ufh.hide();
        if (zLJJII && enumC778100Ufg != enumC778100Ufg2 && (interfaceC1631620sYq = c778110Ufh.LIZJ) != null) {
            interfaceC1631620sYq.invoke(enumC778100Ufg, enumC778130Ufj, c778110Ufh.LJII);
        }
    }

    @Override // X.InterfaceC779960Uig
    public final void LJI(boolean z, boolean z2) {
        C778590UgT c778590UgT = this.LIZ;
        c778590UgT.LJIIL = z;
        c778590UgT.LJIILIIL = z2;
    }

    public C778110Ufh(C778590UgT c778590UgT, C778600UgU c778600UgU, AwS661S0100000_12 awS661S0100000_12) {
        this.LIZ = c778590UgT;
        this.LIZIZ = c778600UgU;
        this.LIZJ = awS661S0100000_12;
        c778600UgU.setOnCloseClickListener(new ACListenerS147S0100000_12(this, 409));
        c778590UgT.LJJII = new ACListenerS147S0100000_12(this, 410);
    }

    @Override // X.InterfaceC779960Uig
    public final void LJFF(EnumC778100Ufg enumC778100Ufg, CharSequence charSequence, boolean z, Object obj) {
        InterfaceC1631620sYq<EnumC778100Ufg, EnumC778130Ufj, Object, Unit> interfaceC1631620sYq;
        EnumC778100Ufg enumC778100Ufg2 = this.LJFF;
        this.LJFF = enumC778100Ufg;
        if (enumC778100Ufg != enumC778100Ufg2 || C777110Ue5.LIZIZ(enumC778100Ufg, enumC778100Ufg2)) {
            EnumC778100Ufg enumC778100Ufg3 = this.LJFF;
            EnumC778100Ufg enumC778100Ufg4 = EnumC778100Ufg.LIVE_TIP_UNKNOWN;
            if (enumC778100Ufg3 != enumC778100Ufg4 && enumC778100Ufg2 != enumC778100Ufg4 && LJJII() && (interfaceC1631620sYq = this.LIZJ) != null) {
                interfaceC1631620sYq.invoke(enumC778100Ufg2, EnumC778130Ufj.NEW_TIP, obj);
            }
        }
        this.LJI = charSequence;
        this.LJ = enumC778100Ufg.getPriority();
        this.LJII = obj;
        LJIIL(enumC778100Ufg);
        if (z) {
            C778600UgU c778600UgU = this.LIZIZ;
            if (c778600UgU != null) {
                c778600UgU.h0(this.LJFF, charSequence, obj);
            }
            C778600UgU c778600UgU2 = this.LIZIZ;
            if (c778600UgU2 != null) {
                C12ES.LJIILL(0, c778600UgU2);
            }
            this.LIZ.LJIIIIZZ();
            return;
        }
        this.LIZ.LJIIZILJ(this.LJFF, charSequence, obj);
        C778600UgU c778600UgU3 = this.LIZIZ;
        if (c778600UgU3 == null) {
            return;
        }
        C439101nJ.LJI(c778600UgU3);
    }
}
