package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import n2.k1;

/* JADX INFO: renamed from: X.0tuD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1683310tuD {
    public boolean LIZ;

    public abstract EnumC1671200tag LIZIZ();

    public abstract int LIZJ();

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(AbstractC1683310tuD abstractC1683310tuD, AbstractC1686530tzP abstractC1686530tzP) {
        abstractC1683310tuD.getClass();
        if (abstractC1686530tzP instanceof InterfaceC1683320tuE) {
            ((InterfaceC1683320tuE) abstractC1686530tzP).LJIJJLI(abstractC1683310tuD.LIZ);
        }
    }

    public static void LJ(AbstractC1683310tuD abstractC1683310tuD, AbstractC1686530tzP abstractC1686530tzP, long j) {
        abstractC1683310tuD.getClass();
        LIZ(abstractC1683310tuD, abstractC1686530tzP);
        abstractC1686530tzP.LJJLIIIJJIZ(C1676820tjk.LJ(j, abstractC1686530tzP.LLILZIL), 0.0f, null);
    }

    public static void LJII(AbstractC1683310tuD abstractC1683310tuD, AbstractC1686530tzP abstractC1686530tzP, long j) {
        AFwS266S0000000_25 aFwS266S0000000_25 = k1.LIZ;
        if (abstractC1683310tuD.LIZIZ() != EnumC1671200tag.Ltr && abstractC1683310tuD.LIZJ() != 0) {
            int iLIZJ = (abstractC1683310tuD.LIZJ() - abstractC1686530tzP.LL) - ((int) (j >> 32));
            long jLIZJ = ((long) C1676820tjk.LIZJ(j)) & 4294967295L;
            LIZ(abstractC1683310tuD, abstractC1686530tzP);
            abstractC1686530tzP.LJJLIIIJJIZ(C1676820tjk.LJ(jLIZJ | (((long) iLIZJ) << 32), abstractC1686530tzP.LLILZIL), 0.0f, aFwS266S0000000_25);
            return;
        }
        LIZ(abstractC1683310tuD, abstractC1686530tzP);
        abstractC1686530tzP.LJJLIIIJJIZ(C1676820tjk.LJ(j, abstractC1686530tzP.LLILZIL), 0.0f, aFwS266S0000000_25);
    }

    public static void LJIIJJI(AbstractC1683310tuD abstractC1683310tuD, AbstractC1686530tzP abstractC1686530tzP, long j) {
        AFwS266S0000000_25 aFwS266S0000000_25 = k1.LIZ;
        abstractC1683310tuD.getClass();
        LIZ(abstractC1683310tuD, abstractC1686530tzP);
        abstractC1686530tzP.LJJLIIIJJIZ(C1676820tjk.LJ(j, abstractC1686530tzP.LLILZIL), 0.0f, aFwS266S0000000_25);
    }

    public static void LJFF(AbstractC1683310tuD abstractC1683310tuD, AbstractC1686530tzP abstractC1686530tzP, int i, int i2) {
        abstractC1683310tuD.getClass();
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (abstractC1683310tuD.LIZIZ() != EnumC1671200tag.Ltr && abstractC1683310tuD.LIZJ() != 0) {
            long jLIZJ = (((long) ((abstractC1683310tuD.LIZJ() - abstractC1686530tzP.LL) - ((int) (j >> 32)))) << 32) | (((long) C1676820tjk.LIZJ(j)) & 4294967295L);
            LIZ(abstractC1683310tuD, abstractC1686530tzP);
            abstractC1686530tzP.LJJLIIIJJIZ(C1676820tjk.LJ(jLIZJ, abstractC1686530tzP.LLILZIL), 0.0f, null);
            return;
        }
        LIZ(abstractC1683310tuD, abstractC1686530tzP);
        abstractC1686530tzP.LJJLIIIJJIZ(C1676820tjk.LJ(j, abstractC1686530tzP.LLILZIL), 0.0f, null);
    }

    public static void LJIIIIZZ(AbstractC1683310tuD abstractC1683310tuD, AbstractC1686530tzP abstractC1686530tzP, long j, C1695970uEd c1695970uEd) {
        if (abstractC1683310tuD.LIZIZ() != EnumC1671200tag.Ltr && abstractC1683310tuD.LIZJ() != 0) {
            int iLIZJ = (abstractC1683310tuD.LIZJ() - abstractC1686530tzP.LL) - ((int) (j >> 32));
            long jLIZJ = ((long) C1676820tjk.LIZJ(j)) & 4294967295L;
            LIZ(abstractC1683310tuD, abstractC1686530tzP);
            abstractC1686530tzP.LJJLIIIJJI(C1676820tjk.LJ(jLIZJ | (((long) iLIZJ) << 32), abstractC1686530tzP.LLILZIL), 0.0f, c1695970uEd);
            return;
        }
        LIZ(abstractC1683310tuD, abstractC1686530tzP);
        abstractC1686530tzP.LJJLIIIJJI(C1676820tjk.LJ(j, abstractC1686530tzP.LLILZIL), 0.0f, c1695970uEd);
    }

    public final void LIZLLL(AbstractC1686530tzP abstractC1686530tzP, int i, int i2, float f) {
        LIZ(this, abstractC1686530tzP);
        abstractC1686530tzP.LJJLIIIJJIZ(C1676820tjk.LJ((((long) i2) & 4294967295L) | (((long) i) << 32), abstractC1686530tzP.LLILZIL), f, null);
    }

    public final void LJIIIZ(AbstractC1686530tzP abstractC1686530tzP, int i, int i2, float f, Function1<? super InterfaceC1679550to9, Unit> function1) {
        LIZ(this, abstractC1686530tzP);
        abstractC1686530tzP.LJJLIIIJJIZ(C1676820tjk.LJ((((long) i2) & 4294967295L) | (((long) i) << 32), abstractC1686530tzP.LLILZIL), f, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJI(AbstractC1683310tuD abstractC1683310tuD, AbstractC1686530tzP abstractC1686530tzP, int i, int i2, Function1 function1, int i3) {
        if ((i3 & 8) != 0) {
            function1 = k1.LIZ;
        }
        abstractC1683310tuD.getClass();
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (abstractC1683310tuD.LIZIZ() != EnumC1671200tag.Ltr && abstractC1683310tuD.LIZJ() != 0) {
            long jLIZJ = (((long) ((abstractC1683310tuD.LIZJ() - abstractC1686530tzP.LL) - ((int) (j >> 32)))) << 32) | (((long) C1676820tjk.LIZJ(j)) & 4294967295L);
            LIZ(abstractC1683310tuD, abstractC1686530tzP);
            abstractC1686530tzP.LJJLIIIJJIZ(C1676820tjk.LJ(jLIZJ, abstractC1686530tzP.LLILZIL), 0.0f, function1);
            return;
        }
        LIZ(abstractC1683310tuD, abstractC1686530tzP);
        abstractC1686530tzP.LJJLIIIJJIZ(C1676820tjk.LJ(j, abstractC1686530tzP.LLILZIL), 0.0f, function1);
    }
}
