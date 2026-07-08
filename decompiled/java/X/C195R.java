package X;

import Y.ARunnableS6S0600000_32;
import android.app.Activity;
import kotlin.Pair;

/* JADX INFO: renamed from: X.195R, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C195R {
    public static final boolean LIZLLL(InterfaceC214902198i interfaceC214902198i) {
        C195S c195s;
        boolean z;
        AbstractC214793194d abstractC214793194d = interfaceC214902198i.ej().LJ;
        if (abstractC214793194d instanceof C195S) {
            c195s = (C195S) abstractC214793194d;
        } else {
            c195s = null;
        }
        if (c195s == null) {
            return false;
        }
        C21494919Ad.LIZIZ.LIZIZ("SafDelayedAnim", "start pending enter animation due to startPostponed");
        ARunnableS6S0600000_32 aRunnableS6S0600000_32 = c195s.LJIIIIZZ;
        if (aRunnableS6S0600000_32 != null) {
            z = true;
            aRunnableS6S0600000_32.run();
        } else {
            z = false;
        }
        c195s.LJIIIIZZ = null;
        c195s.LJII = false;
        c195s.LJI.removeCallbacks(c195s.LJ);
        if (!z) {
            return false;
        }
        return true;
    }

    public static final void LIZIZ(InterfaceC214902198i interfaceC214902198i, long j) {
        C195S c195s;
        AbstractC214793194d abstractC214793194d = interfaceC214902198i.ej().LJ;
        if ((abstractC214793194d instanceof C195S) && (c195s = (C195S) abstractC214793194d) != null && j > 0 && !c195s.LJII) {
            C21494919Ad.LIZIZ.LIZIZ("SafDelayedAnim", "postponeEnterTransition");
            c195s.LJII = true;
            C786410Ut5.LJLIIL(j, c195s.LJI, c195s.LJ);
        }
    }

    public static final AbstractC214793194d LIZJ(AnonymousClass1991 anonymousClass1991, Activity activity, boolean z) {
        InterfaceC721300SRc interfaceC721300SRc = anonymousClass1991.LIZJ;
        if (interfaceC721300SRc != null) {
            if (interfaceC721300SRc instanceof C721560SSc) {
                return ((C721560SSc) interfaceC721300SRc).LIZ;
            }
            if (interfaceC721300SRc instanceof InterfaceC21392018ne) {
                return new C195P((InterfaceC21392018ne) interfaceC721300SRc);
            }
            if (interfaceC721300SRc instanceof C21392718nl) {
                C21392718nl c21392718nl = (C21392718nl) interfaceC721300SRc;
                return LIZ(activity, z, c21392718nl.LIZ, c21392718nl.LIZIZ);
            }
            throw new C1954807lC();
        }
        return LIZ(activity, z, anonymousClass1991.LJFF, anonymousClass1991.LJI);
    }

    public static final AbstractC214793194d LIZ(Activity activity, boolean z, Pair<Integer, Integer> pair, Pair<Integer, Integer> pair2) {
        if (!z) {
            pair = pair2;
        }
        int iIntValue = pair.getFirst().intValue();
        int iIntValue2 = pair.getSecond().intValue();
        if (pair == AnonymousClass1991.LJIJJLI) {
            return null;
        }
        if (iIntValue == -1) {
            iIntValue = 0;
        }
        if (iIntValue2 == -1) {
            iIntValue2 = 0;
        }
        if (iIntValue == 0 && iIntValue2 == 0) {
            return new C214798194i();
        }
        if (z) {
            return new C195I(iIntValue, activity, iIntValue2);
        }
        return new C195I(activity, 0, 0, iIntValue2, iIntValue);
    }
}
