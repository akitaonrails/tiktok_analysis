package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0tu8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683260tu8 {
    public static void LIZ(InterfaceC1675870tiD interfaceC1675870tiD, C1692150u8T c1692150u8T, long j, long j2, int i) throws Throwable {
        float fLIZIZ;
        int i2;
        AbstractC1668700tWe abstractC1668700tWeLIZJ;
        long j3 = j2;
        long jLIZJ = j;
        if ((i & 2) != 0) {
            jLIZJ = C1685910tyP.LJIIJ;
        }
        if ((i & 4) != 0) {
            j3 = 0;
        }
        if ((i & 8) != 0) {
            fLIZIZ = Float.NaN;
        } else {
            fLIZIZ = 0.0f;
        }
        if ((i & 128) != 0) {
            InterfaceC1675870tiD.LLILL.getClass();
            i2 = C1668240tVu.LIZIZ;
        } else {
            i2 = 0;
        }
        C1693450uAZ c1693450uAZ = c1692150u8T.LIZ.LIZIZ.LIZ;
        C1693340uAO c1693340uAO = c1693450uAZ.LJIILIIL;
        C1693510uAf c1693510uAf = c1693450uAZ.LJIIL;
        AbstractC1695860uES abstractC1695860uES = c1693450uAZ.LJIILL;
        C1695230uDR c1695230uDRLJLJI = interfaceC1675870tiD.LJLJI();
        long jLIZIZ = c1695230uDRLJLJI.LIZIZ();
        c1695230uDRLJLJI.LIZ().save();
        try {
            try {
                C1686260tyy c1686260tyy = c1695230uDRLJLJI.LIZ;
                c1686260tyy.LJII(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
                if (c1692150u8T.LJ() && c1692150u8T.LIZ.LJFF != 3) {
                    long j4 = c1692150u8T.LIZJ;
                    try {
                        c1686260tyy.LIZJ(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L), 1);
                    } catch (Throwable th) {
                        th = th;
                        jLIZJ = jLIZIZ;
                    }
                }
                abstractC1668700tWeLIZJ = c1692150u8T.LIZ.LIZIZ.LIZ.LIZJ();
            } catch (Throwable th2) {
                th = th2;
                jLIZJ = jLIZIZ;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        if (abstractC1668700tWeLIZJ != null && jLIZJ == 16) {
            C1692200u8Y c1692200u8Y = c1692150u8T.LIZIZ;
            InterfaceC1686290tz1 interfaceC1686290tz1LIZ = interfaceC1675870tiD.LJLJI().LIZ();
            if (Float.isNaN(fLIZIZ)) {
                try {
                    fLIZIZ = c1692150u8T.LIZ.LIZIZ.LIZ.LIZIZ();
                } catch (Throwable th4) {
                    th = th4;
                    jLIZJ = jLIZIZ;
                    TryCatchGuardChecker.doCheck(th);
                    c1695230uDRLJLJI.LIZ().LJIIJ();
                    c1695230uDRLJLJI.LIZJ(jLIZJ);
                    throw th;
                }
                try {
                    c1692200u8Y.LJIIJ(interfaceC1686290tz1LIZ, abstractC1668700tWeLIZJ, fLIZIZ, c1693340uAO, c1693510uAf, abstractC1695860uES, i2);
                } catch (Throwable th5) {
                    th = th5;
                    jLIZJ = jLIZIZ;
                    TryCatchGuardChecker.doCheck(th);
                    c1695230uDRLJLJI.LIZ().LJIIJ();
                    c1695230uDRLJLJI.LIZJ(jLIZJ);
                    throw th;
                }
            } else {
                c1692200u8Y.LJIIJ(interfaceC1686290tz1LIZ, abstractC1668700tWeLIZJ, fLIZIZ, c1693340uAO, c1693510uAf, abstractC1695860uES, i2);
            }
            TryCatchGuardChecker.doCheck(th);
            c1695230uDRLJLJI.LIZ().LJIIJ();
            c1695230uDRLJLJI.LIZJ(jLIZJ);
            throw th;
        }
        C1692200u8Y c1692200u8Y2 = c1692150u8T.LIZIZ;
        InterfaceC1686290tz1 interfaceC1686290tz1LIZ2 = interfaceC1675870tiD.LJLJI().LIZ();
        if (jLIZJ == 16) {
            jLIZJ = c1692150u8T.LIZ.LIZIZ.LIZJ();
        }
        c1692200u8Y2.LJIIIIZZ(interfaceC1686290tz1LIZ2, C1683270tu9.LIZ(fLIZIZ, jLIZJ), c1693340uAO, c1693510uAf, abstractC1695860uES, i2);
        c1695230uDRLJLJI.LIZ().LJIIJ();
        c1695230uDRLJLJI.LIZJ(jLIZIZ);
    }
}
