package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0nFm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427600nFm {
    public int LIZ;
    public int LIZIZ;
    public long LIZLLL;
    public C785860UsC LJII;
    public String LIZJ = "";
    public final C01GW LJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(27));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(28));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(29));
    public int LJIIIIZZ = -1;

    public final int LIZJ() {
        int i = this.LIZ;
        if (i == 0) {
            return 0;
        }
        int size = (int) ((((Set) this.LJ.getValue()).size() / i) * 100);
        if (size > 100) {
            return 100;
        }
        return size;
    }

    public final Set<Integer> LIZLLL() {
        return (Set) this.LJFF.getValue();
    }

    public final void LJ() {
        this.LIZLLL = 0L;
        ((Set) this.LJ.getValue()).clear();
        ((Set) this.LJ.getValue()).addAll(LIZLLL());
        if (!LIZLLL().isEmpty()) {
            try {
                this.LJII = new C785860UsC(this, 0);
                ((Timer) this.LJI.getValue()).schedule(this.LJII, 0L, 1000L);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LIZIZ(int i) {
        C785860UsC c785860UsC;
        int i2 = this.LIZIZ;
        if (i2 > 0 && i <= i2) {
            return;
        }
        LIZLLL().remove(Integer.valueOf(i));
        if (LIZLLL().isEmpty() && (c785860UsC = this.LJII) != null) {
            c785860UsC.cancel();
        }
    }

    public final void LJFF(int i) {
        int i2 = this.LIZIZ;
        if (i2 > 0 && i <= i2) {
            return;
        }
        ((Set) this.LJ.getValue()).add(Integer.valueOf(i));
    }

    public final void LJI(List<? extends Object> list) {
        Iterator<? extends Object> it2 = list.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                Object next = it2.next();
                if (((next instanceof C1406720mi6) && ((C1406720mi6) next).LLJ) || (next instanceof C1406010mgx)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        this.LIZIZ = i;
    }

    public final void LIZ(int i, Function1<? super Integer, ? extends Object> function1, InterfaceC497601wk interfaceC497601wk, String str) {
        int i2 = this.LIZIZ;
        if (i2 > 0 && i <= i2) {
            return;
        }
        if (LIZLLL().isEmpty()) {
            try {
                this.LJII = new C785860UsC(this, 0);
                ((Timer) this.LJI.getValue()).schedule(this.LJII, 0L, 1000L);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        LIZLLL().add(Integer.valueOf(i));
        if (i > this.LJIIIIZZ) {
            this.LJIIIIZZ = i;
            C1406590mht.LIZ().LIZ(interfaceC497601wk, new C1406820miG(i, str, function1));
        }
    }
}
