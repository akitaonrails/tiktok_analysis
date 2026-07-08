package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nLN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431070nLN {
    public final InterfaceC1431080nLO LIZ;
    public final Function0<Unit> LIZIZ;
    public final int LIZJ;

    public static void LIZ(C1431070nLN c1431070nLN) {
        c1431070nLN.LIZ.LIZIZ(null);
        try {
            c1431070nLN.LIZIZ.invoke();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C1431070nLN(C1D85 c1d85, AwS566S0100000_22 awS566S0100000_22) {
        this.LIZ = c1d85;
        this.LIZIZ = awS566S0100000_22;
        this.LIZJ = c1d85.LIZ;
    }

    public final void LIZIZ(Object obj, EnumC2251001D8o enumC2251001D8o) {
        this.LIZ.LIZ(obj, enumC2251001D8o);
    }

    public final void LIZLLL(int i, Throwable th) {
        this.LIZ.LJ(i, th);
        try {
            this.LIZIZ.invoke();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJ(Object obj, boolean z) {
        this.LIZ.LIZJ(obj, z);
        try {
            this.LIZIZ.invoke();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
