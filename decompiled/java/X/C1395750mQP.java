package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mQP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395750mQP implements InterfaceC1799880wwE {
    public final Keva LIZ = KevaImpl.getRepo("minis_revisit_mission", 1);
    public final Object LIZIZ = new Object();

    @Override // X.InterfaceC1799880wwE
    public final void LIZIZ() {
        synchronized (this.LIZIZ) {
            try {
                String strLJIIIIZZ = LJIIIIZZ("dismiss_count");
                String strLJIIIIZZ2 = LJIIIIZZ("exit_until");
                this.LIZ.storeInt(strLJIIIIZZ, 0);
                this.LIZ.storeLong(strLJIIIIZZ2, 0L);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static String LJIIIIZZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("floating:");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1799880wwE
    public final C00YF LJ(long j) {
        C00YF c00yf;
        synchronized (this.LIZIZ) {
            try {
                String strLJIIIIZZ = LJIIIIZZ("exit_until");
                String strLJIIIIZZ2 = LJIIIIZZ("dismiss_count");
                String strLJIIIIZZ3 = LJIIIIZZ("x");
                String strLJIIIIZZ4 = LJIIIIZZ("y");
                long jLongValue = 0;
                long j2 = this.LIZ.getLong(strLJIIIIZZ, 0L);
                int i = this.LIZ.getInt(strLJIIIIZZ2, 0);
                Float fLJIIIZ = LJIIIZ(strLJIIIIZZ3);
                Float fLJIIIZ2 = LJIIIZ(strLJIIIIZZ4);
                Long lValueOf = Long.valueOf(j2);
                if (lValueOf.longValue() > j) {
                    jLongValue = lValueOf.longValue();
                }
                c00yf = new C00YF(fLJIIIZ, fLJIIIZ2, i, jLongValue);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c00yf;
    }

    @Override // X.InterfaceC1799880wwE
    public final boolean LJII(String str) {
        EnumC1395730mQN enumC1395730mQN = EnumC1395730mQN.SHORT_CUT;
        if ((a0.LJJJIL(str) || this.LIZ.getLong(LJIIJJI(enumC1395730mQN, str), 0L) <= 0) && !LIZJ(EnumC1799930wwJ.ADD_TO_HOME_SCREEN, str)) {
            return false;
        }
        return true;
    }

    public final Float LJIIIZ(String str) {
        Float fValueOf = Float.valueOf(this.LIZ.getFloat(str, -1000000.0f));
        if (fValueOf.floatValue() == -1000000.0f) {
            return null;
        }
        return fValueOf;
    }

    public static String LJIIJ(EnumC1799930wwJ enumC1799930wwJ, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mission_completed:");
        sbLIZ.append(enumC1799930wwJ.getConfigKey());
        sbLIZ.append(':');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIIJJI(EnumC1395730mQN enumC1395730mQN, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("visit:");
        sbLIZ.append(enumC1395730mQN.getScene());
        sbLIZ.append(':');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1799880wwE
    public final boolean LIZJ(EnumC1799930wwJ enumC1799930wwJ, String str) {
        if (a0.LJJJIL(str) || this.LIZ.getLong(LJIIJ(enumC1799930wwJ, str), 0L) <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    @Override // X.InterfaceC1799880wwE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C00YF LJI(long r8, java.util.List r10) {
        /*
            r7 = this;
            java.lang.Object r3 = r7.LIZIZ
            monitor-enter(r3)
            java.lang.String r0 = "dismiss_count"
            java.lang.String r6 = LJIIIIZZ(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = "exit_until"
            java.lang.String r5 = LJIIIIZZ(r0)     // Catch: java.lang.Throwable -> L55
            com.bytedance.keva.Keva r1 = r7.LIZ     // Catch: java.lang.Throwable -> L55
            r0 = 0
            int r0 = r1.getInt(r6, r0)     // Catch: java.lang.Throwable -> L55
            int r4 = r0 + 1
            int r0 = r4 + (-2)
            if (r0 < 0) goto L3a
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r10)     // Catch: java.lang.Throwable -> L55
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L29
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L55
            goto L35
        L29:
            java.lang.Object r0 = X.C13LP.LJJLIIIJL(r10)     // Catch: java.lang.Throwable -> L55
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L3a
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L55
        L35:
            if (r0 < 0) goto L3a
            if (r0 <= 0) goto L3a
            goto L3d
        L3a:
            r1 = 0
            goto L45
        L3d:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.Throwable -> L55
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L55
            long r1 = r2.toMillis(r0)     // Catch: java.lang.Throwable -> L55
            long r1 = r1 + r8
        L45:
            com.bytedance.keva.Keva r0 = r7.LIZ     // Catch: java.lang.Throwable -> L55
            r0.storeInt(r6, r4)     // Catch: java.lang.Throwable -> L55
            com.bytedance.keva.Keva r0 = r7.LIZ     // Catch: java.lang.Throwable -> L55
            r0.storeLong(r5, r1)     // Catch: java.lang.Throwable -> L55
            X.00YF r0 = r7.LJ(r8)     // Catch: java.lang.Throwable -> L55
            monitor-exit(r3)
            return r0
        L55:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L55
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1395750mQP.LJI(long, java.util.List):X.00YF");
    }

    @Override // X.InterfaceC1799880wwE
    public final void LIZ(EnumC1799930wwJ enumC1799930wwJ, String str, long j) {
        if (a0.LJJJIL(str)) {
            return;
        }
        this.LIZ.storeLong(LJIIJ(enumC1799930wwJ, str), j);
    }

    @Override // X.InterfaceC1799880wwE
    public final void LIZLLL(EnumC1395730mQN enumC1395730mQN, String str, long j) {
        if (a0.LJJJIL(str)) {
            return;
        }
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("visit:");
        sbLIZ.append(enumC1395730mQN.getScene());
        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), j);
        this.LIZ.storeLong(LJIIJJI(enumC1395730mQN, str), j);
        if (enumC1395730mQN == EnumC1395730mQN.SHORT_CUT) {
            LIZ(EnumC1799930wwJ.ADD_TO_HOME_SCREEN, str, j);
        }
    }

    @Override // X.InterfaceC1799880wwE
    public final boolean LJFF(EnumC1395730mQN enumC1395730mQN, int i, long j) {
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("visit:");
        sbLIZ.append(enumC1395730mQN.getScene());
        long j2 = keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        if (j2 <= 0) {
            return true;
        }
        TimeUnit timeUnit = TimeUnit.DAYS;
        if (i < 0) {
            i = 0;
        }
        if (j - j2 >= timeUnit.toMillis(i)) {
            return true;
        }
        return false;
    }
}
