package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;
import java.util.Timer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0vm4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1755140vm4 {
    public int LIZ;
    public int LIZIZ;
    public long LIZJ;
    public C785860UsC LJI;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(472));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(473));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(474));
    public int LJII = -1;

    public final Set<Integer> LIZJ() {
        return (Set) this.LJ.getValue();
    }

    public final void LIZIZ(int i) {
        C785860UsC c785860UsC;
        int i2 = this.LIZIZ;
        if (i2 > 0 && i <= i2) {
            return;
        }
        LIZJ().remove(Integer.valueOf(i));
        if (LIZJ().isEmpty() && (c785860UsC = this.LJI) != null) {
            c785860UsC.cancel();
        }
    }

    public final void LIZLLL(int i) {
        int i2 = this.LIZIZ;
        if (i2 > 0 && i <= i2) {
            return;
        }
        ((Set) this.LIZLLL.getValue()).add(Integer.valueOf(i));
    }

    public final void LIZ(int i, Function1 function1, C054G c054g, String str) {
        int i2 = this.LIZIZ;
        if (i2 > 0 && i <= i2) {
            return;
        }
        if (LIZJ().isEmpty()) {
            try {
                this.LJI = new C785860UsC(this, 4);
                ((Timer) this.LJFF.getValue()).schedule(this.LJI, 0L, 1000L);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        LIZJ().add(Integer.valueOf(i));
        if (i > this.LJII) {
            this.LJII = i;
            C1406590mht.LIZ().LIZ(c054g, new C1406820miG(i, str, function1));
        }
    }
}
