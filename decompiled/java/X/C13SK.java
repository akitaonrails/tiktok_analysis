package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13SK, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13SK {
    public final C13SI LIZ;
    public boolean[] LIZIZ;
    public boolean LIZJ;
    public final /* synthetic */ C13SG LIZLLL;

    public final void LIZ() {
        this.LIZLLL.LJ(this, false);
    }

    public final void LIZIZ() {
        if (!this.LIZJ) {
            this.LIZLLL.LJ(this, true);
        } else {
            this.LIZLLL.LJ(this, false);
            this.LIZLLL.LJIJ(this.LIZ.LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13SG] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.13SG] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.13SD] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.13SD] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final C13SD LIZJ() {
        final ?? LJIILIIL;
        ?? LJIILIIL2 = this.LIZLLL;
        if (LJIILIIL2.LIZJ <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected index ");
            sbLIZ.append(0);
            sbLIZ.append(" to be greater than 0 and less than the maximum value count of ");
            sbLIZ.append(LJIILIIL2.LIZJ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
        C2278408wI c2278408wI = LJIILIIL2.LJIILJJIL;
        c2278408wI.LIZ();
        try {
            if (!Intrinsics.LJFF(this.LIZ.LIZLLL, this)) {
                throw new IllegalStateException("Check failed.");
            }
            C13SI c13si = this.LIZ;
            if (!c13si.LIZJ) {
                boolean[] zArr = new boolean[LJIILIIL2.LIZJ];
                zArr[0] = true;
                this.LIZIZ = zArr;
            }
            C13M9 c13m9LIZIZ = c13si.LIZIZ(0);
            try {
                LJIILIIL2 = C13SB.LJIILIIL(c13m9LIZIZ, false);
                LJIILIIL = LJIILIIL2;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C13SB.LJIIJ(LJIILIIL2.LIZ);
                try {
                    LJIILIIL = C13SB.LJIILIIL(c13m9LIZIZ, false);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C13S8 c13s8 = new C13S8();
                    c2278408wI.LIZIZ();
                    return c13s8;
                }
            }
            final AwS574S0100000_30 awS574S0100000_30 = new AwS574S0100000_30(this, 303);
            C13SD c13sd = new C13SD(LJIILIIL, awS574S0100000_30) { // from class: X.13SC
                public final C13SD LIZIZ;
                public final Function0<Unit> LIZJ;

                @Override // X.C13SD
                public final void LIZ() {
                    try {
                        this.LIZIZ.LIZ();
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        this.LIZJ.invoke();
                    }
                }

                @Override // X.C13SD, X.C13SE
                public final void close() {
                    try {
                        this.LIZIZ.close();
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        this.LIZJ.invoke();
                    }
                }

                {
                    this.LIZIZ = LJIILIIL;
                    this.LIZJ = awS574S0100000_30;
                    FileOutputStream fileOutputStream = LJIILIIL.LIZ;
                    this.LIZ = fileOutputStream == null ? null : fileOutputStream;
                }

                @Override // X.C13SD
                public final void LIZIZ(byte[] bArr, int i) {
                    try {
                        this.LIZIZ.LIZIZ(bArr, i);
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        this.LIZJ.invoke();
                    }
                }
            };
            c2278408wI.LIZIZ();
            return c13sd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2278408wI.LIZIZ();
            throw th;
        }
    }

    public C13SK(C13SG c13sg, C13SI c13si) {
        this.LIZLLL = c13sg;
        this.LIZ = c13si;
        this.LIZIZ = new boolean[c13sg.LIZJ];
    }
}
