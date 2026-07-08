package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.InputStream;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0pyG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532060pyG {
    public static AbstractC1532040pyE LIZLLL(int i, AbstractC1532040pyE abstractC1532040pyE) {
        C1532050pyF c1532050pyF;
        if (abstractC1532040pyE.LJFF >= i) {
            return abstractC1532040pyE;
        }
        if ((abstractC1532040pyE instanceof C1532050pyF) && (c1532050pyF = (C1532050pyF) abstractC1532040pyE) != null) {
            if (!abstractC1532040pyE.LIZJ) {
                abstractC1532040pyE.LIZJ(i);
                return c1532050pyF;
            }
            C1532680pzG.LIZ.getClass();
            AbstractC1532040pyE c1532110pyL = c1532050pyF;
            if (C1532680pzG.LJIIIIZZ) {
                c1532110pyL = c1532050pyF;
                if (i > 3145728) {
                    c1532110pyL = new C1532110pyL(c1532050pyF.LJ, c1532050pyF.LJIIIIZZ, c1532050pyF.LJFF, abstractC1532040pyE.LIZ, abstractC1532040pyE.LIZIZ);
                }
            }
            c1532110pyL.LIZJ(i);
            return c1532110pyL;
        }
        abstractC1532040pyE.LIZJ(i);
        return abstractC1532040pyE;
    }

    /* JADX WARN: Path cross not found for [B:17:0x0035, B:59:0x004b], limit reached: 66 */
    /* JADX WARN: Path cross not found for [B:59:0x004b, B:17:0x0035], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0049 -> B:17:0x0035). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0082 -> B:16:0x0033). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0097 -> B:17:0x0035). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0099 -> B:16:0x0033). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x009a -> B:17:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.AbstractC1532040pyE LIZJ(int r7, X.AbstractC1532040pyE r8, java.io.InputStream r9) {
        /*
            r8.LIZIZ(r7)
            r3 = 0
            int r0 = r9.available()     // Catch: java.lang.Throwable -> L10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L10
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L10
            goto L1c
        L10:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La1
            X.00Yq r1 = new X.00Yq     // Catch: java.lang.Throwable -> La1
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La1
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> La1
        L1c:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L23
            r1 = r3
        L23:
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> La1
            if (r1 == 0) goto L2c
            int r6 = r1.intValue()     // Catch: java.lang.Throwable -> La1
            goto L2d
        L2c:
            r6 = 0
        L2d:
            r4 = 8192(0x2000, float:1.148E-41)
            r5 = 0
            if (r6 > 0) goto L38
            r2 = 0
        L33:
            r6 = 8192(0x2000, float:1.148E-41)
        L35:
            if (r5 < 0) goto L9d
            goto L39
        L38:
            r2 = 1
        L39:
            X.0pyG r1 = X.AbstractC1532040pyE.LJI     // Catch: java.lang.Throwable -> La1
            int r0 = r7 + r6
            r1.getClass()     // Catch: java.lang.Throwable -> La1
            X.0pyE r8 = LIZLLL(r0, r8)     // Catch: java.lang.Throwable -> La1
            int r5 = r8.LIZLLL(r9, r7)     // Catch: java.lang.Throwable -> La1
            int r7 = r7 + r5
            if (r2 == 0) goto L35
            int r0 = r9.available()     // Catch: java.lang.Throwable -> L57
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L57
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L57
            goto L63
        L57:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La1
            X.00Yq r1 = new X.00Yq     // Catch: java.lang.Throwable -> La1
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La1
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> La1
        L63:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L6a
            r2 = 0
        L6a:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L71
            r1 = r3
        L71:
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> La1
            if (r1 == 0) goto L9a
            int r6 = r1.intValue()     // Catch: java.lang.Throwable -> La1
            if (r6 != 0) goto L97
            int r2 = r9.read()     // Catch: java.lang.Throwable -> La1
            r0 = -1
            if (r2 == r0) goto L9d
            X.0pyG r1 = X.AbstractC1532040pyE.LJI     // Catch: java.lang.Throwable -> La1
            int r0 = r7 + 8192
            int r0 = r0 + 1
            r1.getClass()     // Catch: java.lang.Throwable -> La1
            X.0pyE r8 = LIZLLL(r0, r8)     // Catch: java.lang.Throwable -> La1
            byte r0 = (byte) r2     // Catch: java.lang.Throwable -> La1
            r8.LJIIL(r7, r0)     // Catch: java.lang.Throwable -> La1
            int r7 = r7 + 1
            r2 = 0
            goto L33
        L97:
            if (r6 >= r4) goto L35
            goto L33
        L9a:
            r6 = 8192(0x2000, float:1.148E-41)
            goto L35
        L9d:
            X.C2107108Nh.LIZ(r9, r3)
            return r8
        La1:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> La9
            throw r1     // Catch: java.lang.Throwable -> La6
        La6:
            r0 = move-exception
            r3 = r1
            goto Laa
        La9:
            r0 = move-exception
        Laa:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lae
            goto Lb0
        Lae:
            r0 = move-exception
            goto Laa
        Lb0:
            X.C2107108Nh.LIZ(r9, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1532060pyG.LIZJ(int, X.0pyE, java.io.InputStream):X.0pyE");
    }

    public static AbstractC1532040pyE LIZ(int i, int i2, File file, boolean z) {
        C1532680pzG.LIZ.getClass();
        if (C1532680pzG.LJIIIIZZ && i2 >= 3145728 && z) {
            return new C1532110pyL(0, null, 131072, file, i);
        }
        return new C1532050pyF(i2, i, file, z);
    }

    public static AbstractC1532040pyE LIZIZ(int i, AbstractC1532040pyE abstractC1532040pyE, InputStream inputStream, C1532030pyD c1532030pyD, C1532710pzJ c1532710pzJ) {
        Object c098200Yq;
        int iIntValue;
        InputStream inputStreamLJIILJJIL;
        int iAvailable;
        abstractC1532040pyE.LIZJ = false;
        if (inputStream == null && !c1532030pyD.LJIIJJI()) {
            C1532760pzO.LIZJ(C1532920pze.LIZJ, "Meta", "drainStreamAndGetBytes", "no input stream is available", null, null, 48);
            return abstractC1532040pyE;
        }
        if (abstractC1532040pyE instanceof C1532110pyL) {
            try {
                int i2 = abstractC1532040pyE.LJ;
                if (inputStream == null || (iAvailable = inputStream.available()) < 0) {
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
                iIntValue = abstractC1532040pyE.LJ;
            }
            C1532050pyF c1532050pyF = new C1532050pyF(iIntValue, abstractC1532040pyE.LIZIZ, abstractC1532040pyE.LIZ, false);
            if (abstractC1532040pyE.LJ != 0) {
                inputStreamLJIILJJIL = c1532030pyD.LJIILJJIL(c1532710pzJ);
                if (inputStreamLJIILJJIL != null) {
                    c1532050pyF.LIZLLL(inputStreamLJIILJJIL, 0);
                }
            } else {
                inputStreamLJIILJJIL = null;
            }
            if (inputStream != null) {
                C1532060pyG c1532060pyG = AbstractC1532040pyE.LJI;
                int i3 = abstractC1532040pyE.LJ;
                c1532060pyG.getClass();
                LIZJ(i3, c1532050pyF, inputStream);
            }
            if (inputStreamLJIILJJIL != null) {
                try {
                    inputStreamLJIILJJIL.close();
                    unit = Unit.LIZ;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
            }
            C189200o6.m2constructorimpl(unit);
            abstractC1532040pyE.LJIIJJI();
            return c1532050pyF;
        }
        if (inputStream != null) {
            return LIZJ(i, abstractC1532040pyE, inputStream);
        }
        return abstractC1532040pyE;
    }
}
