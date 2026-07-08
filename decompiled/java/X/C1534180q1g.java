package X;

import com.bytedance.forest.experiments.ForestExperiment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0q1g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534180q1g {
    public static AbstractC1534170q1f LIZIZ(int i, AbstractC1534170q1f abstractC1534170q1f, boolean z) {
        C1534200q1i c1534200q1i;
        int i2 = abstractC1534170q1f.LJ;
        if (i2 >= i) {
            return abstractC1534170q1f;
        }
        ForestExperiment forestExperiment = ForestExperiment.INSTANCE;
        if (!forestExperiment.getOptimizeGrowth()) {
            int i3 = i2 << 1;
            if (i3 - i >= 0) {
                i = i3;
            }
        }
        if ((abstractC1534170q1f instanceof C1534200q1i) && (c1534200q1i = (C1534200q1i) abstractC1534170q1f) != null) {
            if (forestExperiment.getForceMeta() != EnumC1534630q2P.FORCE_CONTINUOUS && !z) {
                AbstractC1534170q1f c1534030q1R = c1534200q1i;
                if (i > forestExperiment.getMetaThreshold()) {
                    c1534030q1R = new C1534030q1R(EnumC1534640q2Q.AUTO, c1534200q1i.LIZLLL, c1534200q1i.LJII, c1534200q1i.LJ, abstractC1534170q1f.LIZ, abstractC1534170q1f.LIZIZ);
                }
                c1534030q1R.LIZJ(i);
                return c1534030q1R;
            }
            abstractC1534170q1f.LIZJ(i);
            return c1534200q1i;
        }
        abstractC1534170q1f.LIZJ(i);
        return abstractC1534170q1f;
    }

    public static AbstractC1534170q1f LIZJ(int i, AbstractC1534170q1f abstractC1534170q1f, C1534050q1T c1534050q1T) throws Throwable {
        abstractC1534170q1f.LIZIZ(i);
        Throwable th = null;
        try {
            if (!ForestExperiment.INSTANCE.getOptimizeMeta()) {
                byte[] bArr = new byte[8192];
                int i2 = c1534050q1T.read(bArr);
                while (i2 >= 0) {
                    int i3 = i + i2;
                    int iAvailable = c1534050q1T.available();
                    if (iAvailable < 0) {
                        iAvailable = 0;
                    }
                    abstractC1534170q1f = LIZIZ(iAvailable + i3, abstractC1534170q1f, true);
                    abstractC1534170q1f.LJIILJJIL(i, bArr, 0, i2);
                    i2 = c1534050q1T.read(bArr);
                    i = i3;
                }
            } else {
                AbstractC1534170q1f abstractC1534170q1fLIZIZ = abstractC1534170q1f;
                int iLIZLLL = 0;
                do {
                    i += iLIZLLL;
                    int iAvailable2 = c1534050q1T.available();
                    if (iAvailable2 < 0) {
                        iAvailable2 = 0;
                    } else if (iAvailable2 != 0) {
                        abstractC1534170q1fLIZIZ = LIZIZ(iAvailable2 + i, abstractC1534170q1fLIZIZ, true);
                        iLIZLLL = abstractC1534170q1fLIZIZ.LIZLLL(c1534050q1T, i);
                    }
                    int i4 = c1534050q1T.read();
                    if (i4 == -1) {
                        break;
                    }
                    C1533880q1C.LIZJ(abstractC1534170q1f.LJII(), "writeStreamInternal", "force fallback", null, null);
                    ForestExperiment.INSTANCE.setOptimizeGrowth(false);
                    int i5 = i + 1;
                    abstractC1534170q1fLIZIZ = LIZIZ(i5, abstractC1534170q1fLIZIZ, true);
                    abstractC1534170q1fLIZIZ.LJIILIIL(i, (byte) i4);
                    i = i5;
                    abstractC1534170q1fLIZIZ = LIZIZ(iAvailable2 + i, abstractC1534170q1fLIZIZ, true);
                    iLIZLLL = abstractC1534170q1fLIZIZ.LIZLLL(c1534050q1T, i);
                } while (iLIZLLL >= 0);
                abstractC1534170q1f = abstractC1534170q1fLIZIZ;
            }
            C2107108Nh.LIZ(c1534050q1T, null);
            return abstractC1534170q1f;
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
                try {
                    throw th2;
                } catch (Throwable th3) {
                    th = th3;
                    th = th2;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(c1534050q1T, th);
                            throw th;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public static AbstractC1534170q1f LIZLLL(int i, AbstractC1534170q1f abstractC1534170q1f, C1534050q1T c1534050q1T, C1534010q1P c1534010q1P) throws Throwable {
        Object c098200Yq;
        int iIntValue;
        InputStream inputStreamLJIILLIIL;
        if (abstractC1534170q1f instanceof C1534030q1R) {
            try {
                int i2 = abstractC1534170q1f.LIZLLL;
                int iAvailable = c1534050q1T.available();
                if (iAvailable < 0) {
                    iAvailable = 0;
                }
                c098200Yq = Integer.valueOf(i2 + iAvailable);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Unit unit = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Integer num = (Integer) c098200Yq;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = abstractC1534170q1f.LIZLLL;
            }
            C1534200q1i c1534200q1i = new C1534200q1i(iIntValue, abstractC1534170q1f.LIZ, abstractC1534170q1f.LIZIZ);
            if (abstractC1534170q1f.LIZLLL != 0) {
                inputStreamLJIILLIIL = c1534010q1P.LJIILLIIL();
                if (inputStreamLJIILLIIL != null) {
                    c1534200q1i.LIZLLL(inputStreamLJIILLIIL, 0);
                }
            } else {
                inputStreamLJIILLIIL = null;
            }
            if (!c1534010q1P.LJJJJJ()) {
                LIZJ(abstractC1534170q1f.LIZLLL, c1534200q1i, c1534050q1T);
            }
            if (inputStreamLJIILLIIL != null) {
                try {
                    inputStreamLJIILLIIL.close();
                    unit = Unit.LIZ;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
            }
            C189200o6.m2constructorimpl(unit);
            abstractC1534170q1f.LJIIJJI();
            return c1534200q1i;
        }
        return LIZJ(i, abstractC1534170q1f, c1534050q1T);
    }

    public static AbstractC1534170q1f LIZ(int i, EnumC1534640q2Q enumC1534640q2Q, AbstractC1533800q14 abstractC1533800q14, int i2, EnumC1534630q2P enumC1534630q2P) {
        if (enumC1534630q2P == null) {
            enumC1534630q2P = ForestExperiment.INSTANCE.getForceMeta();
        }
        int i3 = C1534620q2O.LIZIZ[enumC1534630q2P.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        int i4 = C1534620q2O.LIZ[enumC1534640q2Q.ordinal()];
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i >= ForestExperiment.INSTANCE.getMetaThreshold()) {
                                    return new C1534030q1R(enumC1534640q2Q, i, abstractC1533800q14, i2);
                                }
                                return new C1534200q1i(i, abstractC1533800q14, i2);
                            }
                            return new C1534030q1R(enumC1534640q2Q, i, abstractC1533800q14, i2);
                        }
                        return new C1534200q1i(i, abstractC1533800q14, i2);
                    }
                    throw new C1954807lC();
                }
                return new C1534030q1R(enumC1534640q2Q, i, abstractC1533800q14, i2);
            }
            return new C1534200q1i(i, abstractC1533800q14, i2);
        }
        throw new IllegalArgumentException("force bytes");
    }
}
