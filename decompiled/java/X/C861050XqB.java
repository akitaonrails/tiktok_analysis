package X;

import android.os.SystemClock;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0XqB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C861050XqB {
    public final InterfaceC497601wk LIZ;
    public final long LIZIZ = 1000;
    public final C2252321DDq LIZJ;
    public final AnonymousClass0951 LIZLLL;
    public AnonymousClass0956 LJ;

    public final void LIZJ() {
        C861060XqC c861060XqC = (C861060XqC) this.LIZJ.getValue();
        Long l = c861060XqC.LIZIZ;
        if (!(c861060XqC.LJ && l != null && l.longValue() > 0)) {
            AnonymousClass0956 anonymousClass0956 = this.LJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LJ = null;
            return;
        }
        AnonymousClass0956 anonymousClass09562 = this.LJ;
        if (anonymousClass09562 == null || !anonymousClass09562.isActive()) {
            this.LJ = C23250099c.LIZLLL(this.LIZ, null, null, new C861040XqA(this, null), 3);
        }
    }

    public C861050XqB(InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = interfaceC497601wk;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C861060XqC(0));
        this.LIZJ = c2252321DDqLIZ;
        this.LIZLLL = C09IC.LIZIZ(c2252321DDqLIZ);
    }

    public final void LIZIZ(boolean z) {
        Long lLIZ;
        C861060XqC c861060XqC = (C861060XqC) this.LIZJ.getValue();
        C861890XrX c861890XrX = c861060XqC.LIZ;
        if (z && c861890XrX != null) {
            lLIZ = LIZ(c861890XrX, c861060XqC.LIZIZ, c861060XqC, SystemClock.elapsedRealtime());
        } else {
            lLIZ = c861060XqC.LIZIZ;
        }
        C861060XqC c861060XqCLIZ = C861060XqC.LIZ(c861060XqC, null, lLIZ, null, null, z, 13);
        C2252321DDq c2252321DDq = this.LIZJ;
        if (c861890XrX != null) {
            c861060XqCLIZ = LIZLLL(c861060XqCLIZ, c861890XrX, lLIZ);
        }
        c2252321DDq.setValue(c861060XqCLIZ);
        LIZJ();
    }

    public static C861060XqC LIZLLL(C861060XqC c861060XqC, C861890XrX c861890XrX, Long l) {
        if (l == null) {
            return c861060XqC;
        }
        return C861060XqC.LIZ(c861060XqC, null, null, C2097608Jq.LJIILIIL(c861060XqC.LIZJ, new Pair(c861890XrX, l)), C2097608Jq.LJIILIIL(c861060XqC.LIZLLL, new Pair(c861890XrX, Long.valueOf(SystemClock.elapsedRealtime()))), false, 19);
    }

    public static Long LIZ(C861890XrX c861890XrX, Long l, C861060XqC c861060XqC, long j) {
        if (l != null) {
            long jLongValue = l.longValue();
            Long l2 = c861060XqC.LIZLLL.get(c861890XrX);
            long j2 = 0;
            if (l2 != null) {
                long jLongValue2 = j - l2.longValue();
                if (jLongValue2 < 0) {
                    jLongValue2 = 0;
                }
                long j3 = jLongValue - (jLongValue2 / 1000);
                if (j3 >= 0) {
                    j2 = j3;
                }
                return Long.valueOf(j2);
            }
            if (jLongValue < 0) {
                jLongValue = 0;
            }
            return Long.valueOf(jLongValue);
        }
        return null;
    }
}
