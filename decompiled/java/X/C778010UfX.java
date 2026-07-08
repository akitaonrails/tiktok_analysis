package X;

import Y.ACListenerS147S0100000_12;
import Y.AfS181S0100000_12;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UfX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778010UfX implements InterfaceC779960Uig {
    public final C778020UfY LIZ;
    public C0H18 LIZIZ;
    public C11JF LIZJ;
    public AbstractC777950UfR LJ;
    public InterfaceC779250UhX LJI;
    public final EnumC778100Ufg LIZLLL = EnumC778100Ufg.LIVE_TIP_UNKNOWN;
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(499));
    public final C01GW LJII = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(500));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(501));

    @Override // X.InterfaceC779960Uig
    public final void LIZ(EnumC778100Ufg enumC778100Ufg) {
    }

    @Override // X.InterfaceC779960Uig
    public final void LJ() {
    }

    @Override // X.InterfaceC779960Uig
    public final void LJFF(EnumC778100Ufg enumC778100Ufg, CharSequence charSequence, boolean z, Object obj) {
    }

    @Override // X.InterfaceC779960Uig
    public final int LJIIJ() {
        return 2;
    }

    @Override // X.InterfaceC779960Uig
    public final void dismiss() {
        this.LJI = null;
        this.LIZIZ = null;
        this.LIZ.LJI();
        C11JF c11jf = this.LIZJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    @Override // X.InterfaceC779960Uig
    public final void LJIIIIZZ() {
        EnumC777930UfP enumC777930UfPLIZJ;
        AbstractC777950UfR abstractC777950UfR = this.LJ;
        if (abstractC777950UfR != null && (enumC777930UfPLIZJ = abstractC777950UfR.LIZJ()) != EnumC777930UfP.PRIORITY_TYPE_P0 && enumC777930UfPLIZJ != EnumC777930UfP.PRIORITY_TYPE_P1) {
            LJIILJJIL(EnumC778130Ufj.CHANGE_STATE, false);
        }
        hide();
    }

    @Override // X.InterfaceC779960Uig
    public final void LJIIJJI() {
        LJIILJJIL(EnumC778130Ufj.RETURN_APP, false);
    }

    public final ConcurrentLinkedDeque<AbstractC777950UfR> LJIILIIL() {
        return (ConcurrentLinkedDeque) this.LJFF.getValue();
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
        C0H18 c0h18 = this.LIZIZ;
        if (c0h18 != null) {
            C439101nJ.LJI(c0h18);
        }
        this.LIZ.LJIIIIZZ();
    }

    @Override // X.InterfaceC779960Uig
    public final void init() {
        this.LIZ.LJIIIZ();
    }

    @Override // X.InterfaceC779960Uig
    public final void onDestroy() {
        C778020UfY c778020UfY = this.LIZ;
        DataChannel dataChannel = c778020UfY.LJIIJ;
        if (dataChannel != null) {
            dataChannel.zQ2(c778020UfY);
        }
    }

    @Override // X.InterfaceC779960Uig
    public final EnumC778100Ufg LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC779960Uig
    public final AbstractC777950UfR LJII() {
        return this.LJ;
    }

    @Override // X.InterfaceC779960Uig
    public final void LIZIZ(C777860UfI c777860UfI) {
        for (AbstractC777950UfR abstractC777950UfR : LJIILIIL()) {
            if (LJIILL(c777860UfI, abstractC777950UfR)) {
                LJIILIIL().remove(abstractC777950UfR);
                C777840UfG.LJ(abstractC777950UfR, EnumC778130Ufj.HIDE_TIP);
            }
        }
        if (LJIILL(c777860UfI, this.LJ)) {
            LJIILJJIL(EnumC778130Ufj.HIDE_TIP, true);
        }
    }

    @Override // X.InterfaceC779960Uig
    public final void LIZJ(boolean z) {
        EnumC777930UfP enumC777930UfPLIZJ;
        AbstractC777950UfR abstractC777950UfR = this.LJ;
        if (abstractC777950UfR != null && ((enumC777930UfPLIZJ = abstractC777950UfR.LIZJ()) == EnumC777930UfP.PRIORITY_TYPE_P0 || enumC777930UfPLIZJ == EnumC777930UfP.PRIORITY_TYPE_P1)) {
            LJIIL(abstractC777950UfR, z);
            return;
        }
        AbstractC777950UfR abstractC777950UfRPollLast = LJIILIIL().pollLast();
        if (abstractC777950UfRPollLast == null) {
            return;
        }
        LJIIL(abstractC777950UfRPollLast, z);
    }

    public C778010UfX(C778020UfY c778020UfY, C0H18 c0h18) {
        this.LIZ = c778020UfY;
        this.LIZIZ = c0h18;
        C0H18 c0h182 = this.LIZIZ;
        if (c0h182 != null) {
            c0h182.setOnCloseClickListener(new ACListenerS147S0100000_12(this, 411));
        }
        c778020UfY.LJIJI = new ACListenerS147S0100000_12(this, 412);
    }

    public static boolean LJIILL(C777860UfI c777860UfI, AbstractC777950UfR abstractC777950UfR) {
        if (abstractC777950UfR == null) {
            return false;
        }
        if (c777860UfI.LIZIZ == null) {
            if (abstractC777950UfR.LJ() == c777860UfI.LIZ) {
                return true;
            }
        } else if (abstractC777950UfR.LJ() == c777860UfI.LIZ && Intrinsics.LJFF(abstractC777950UfR.LIZLLL, c777860UfI.LIZIZ)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC779960Uig
    public final void LJI(boolean z, boolean z2) {
        C778020UfY c778020UfY = this.LIZ;
        c778020UfY.LJIIIIZZ = z;
        c778020UfY.LJIIIZ = z2;
    }

    @Override // X.InterfaceC779960Uig
    public final boolean LJIIIZ(AbstractC777950UfR abstractC777950UfR, boolean z) {
        EnumC777930UfP enumC777930UfPLIZJ;
        AbstractC777950UfR abstractC777950UfR2;
        AbstractC777950UfR abstractC777950UfR3 = this.LJ;
        EnumC777930UfP enumC777930UfPLIZJ2 = null;
        if (abstractC777950UfR3 != null) {
            enumC777930UfPLIZJ = abstractC777950UfR3.LIZJ();
        } else {
            enumC777930UfPLIZJ = null;
        }
        EnumC777930UfP enumC777930UfP = EnumC777930UfP.PRIORITY_TYPE_P0;
        if (enumC777930UfPLIZJ == enumC777930UfP && abstractC777950UfR.LIZJ() != enumC777930UfP) {
            return false;
        }
        AbstractC777950UfR abstractC777950UfR4 = this.LJ;
        if (abstractC777950UfR4 != null) {
            enumC777930UfPLIZJ2 = abstractC777950UfR4.LIZJ();
        }
        if (enumC777930UfPLIZJ2 == EnumC777930UfP.PRIORITY_TYPE_P1 && (abstractC777950UfR2 = this.LJ) != null) {
            LJIILIIL().add(abstractC777950UfR2);
        }
        if (abstractC777950UfR.LIZJ() == enumC777930UfP) {
            LJIILIIL().clear();
        }
        if (LJJII()) {
            C777840UfG.LJ(this.LJ, EnumC778130Ufj.NEW_TIP);
        }
        LJIIL(abstractC777950UfR, z);
        Set<InterfaceC777850UfH> set = C777840UfG.LIZJ.get(abstractC777950UfR.LJ());
        if (set != null) {
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                ((InterfaceC777850UfH) it2.next()).LJI(abstractC777950UfR);
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_floating_toast_show");
        c474500IjALIZ.LJJII(Long.valueOf(((Number) this.LJIIIIZZ.getValue()).longValue()), "anchor_id");
        c474500IjALIZ.LJJ("screen_share");
        c474500IjALIZ.LJJII(Long.valueOf(((Number) this.LJII.getValue()).longValue()), "room_id");
        c474500IjALIZ.LIZ();
        return true;
    }

    public final void LJIIL(AbstractC777950UfR abstractC777950UfR, boolean z) {
        this.LJ = abstractC777950UfR;
        int measuredHeight = 0;
        if (z) {
            C0H18 c0h18 = this.LIZIZ;
            if (c0h18 != null) {
                C778370Ug7.LIZIZ(abstractC777950UfR, c0h18.LLILLJJLI, c0h18.LLILLL, c0h18.LLILZ, c0h18.LLILZIL, c0h18.LLILZLL, c0h18, c0h18.LLIZ, c0h18.LL);
            }
            C0H18 c0h182 = this.LIZIZ;
            if (c0h182 != null) {
                C12ES.LJIILL(0, c0h182);
            }
            this.LIZ.LJIIIIZZ();
        } else {
            C778020UfY c778020UfY = this.LIZ;
            c778020UfY.getClass();
            C778370Ug7.LIZIZ(abstractC777950UfR, c778020UfY.LJIIL, c778020UfY.LJIILIIL, c778020UfY.LJIILJJIL, c778020UfY.LJIILL, c778020UfY.LJIILLIIL, c778020UfY.LIZLLL, c778020UfY.LJIJI, c778020UfY.LJIIJJI);
            View view = c778020UfY.LIZLLL;
            if (view != null) {
                view.measure(1073741824, 0);
            }
            int i = c778020UfY.LJI;
            int i2 = c778020UfY.LJII;
            View view2 = c778020UfY.LIZLLL;
            if (view2 != null) {
                measuredHeight = view2.getMeasuredHeight();
            }
            c778020UfY.LJIIL(i, Math.max(i2, measuredHeight));
            c778020UfY.LJIIJJI();
            C0H18 c0h183 = this.LIZIZ;
            if (c0h183 != null) {
                C439101nJ.LJI(c0h183);
            }
        }
        int iLIZIZ = abstractC777950UfR.LIZIZ();
        C11JF c11jf = this.LIZJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        if (iLIZIZ != -1 && iLIZIZ > 0) {
            this.LIZJ = (C11JF) C11NZ.LJLJJLL(((long) iLIZIZ) * 1000, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS181S0100000_12(this, 281));
        }
    }

    public final void LJIILJJIL(EnumC778130Ufj enumC778130Ufj, boolean z) {
        AbstractC777950UfR abstractC777950UfRPollLast;
        boolean zLJJII = LJJII();
        hide();
        if (zLJJII) {
            C777840UfG.LJ(this.LJ, enumC778130Ufj);
        }
        Boolean boolValueOf = null;
        this.LJ = null;
        if (z && (abstractC777950UfRPollLast = LJIILIIL().pollLast()) != null) {
            InterfaceC779250UhX interfaceC779250UhX = this.LJI;
            if (interfaceC779250UhX != null) {
                boolValueOf = Boolean.valueOf(interfaceC779250UhX.LJFF());
            }
            LJIIL(abstractC777950UfRPollLast, C500260Jjc.LJJJI(boolValueOf));
        }
    }
}
