package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0pTg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513100pTg {
    public static final C01GW<Set<String>> LJI = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(14));
    public static final C01GW<Set<String>> LJII = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(15));
    public static final C01GW<Set<String>> LJIIIIZZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(16));
    public static final C01GW<Set<String>> LJIIIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(13));
    public static final C01GW<Set<String>> LJIIJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(12));
    public static final C01GW<Set<String>> LJIIJJI = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(11));
    public final int LIZ = 16;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS567S0100000_23(this, 46));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(17));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS567S0100000_23(this, 47));
    public final C1513110pTh LJ = new C1513110pTh(this);
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS567S0100000_23(this, 48));

    public final C1513120pTi<String, C790220UzE> LIZIZ() {
        return (C1513120pTi) this.LIZIZ.getValue();
    }

    public final void LIZ(Function1<? super C1513140pTk, Unit> function1) {
        C1513140pTk c1513140pTk = new C1513140pTk();
        function1.invoke(c1513140pTk);
        List list = (List) this.LIZJ.getValue();
        int i = c1513140pTk.LIZIZ;
        if (i != -1) {
            if (i == 4 && c1513140pTk.LIZJ == null) {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
            list.add(c1513140pTk);
            return;
        }
        "func must has value".toString();
        throw new IllegalStateException("func must has value");
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.09AY, kotlin.jvm.functions.Function1] */
    public final void LIZJ(String str, Map map) {
        C790220UzE c790220UzE;
        ((Boolean) this.LIZLLL.getValue()).booleanValue();
        C1513130pTj c1513130pTj = new C1513130pTj(map);
        C1513120pTi<String, C790220UzE> c1513120pTiLIZIZ = LIZIZ();
        c1513120pTiLIZIZ.LIZJ.readLock().lock();
        try {
            C1513120pTi<String, C790220UzE>.a aVar = c1513120pTiLIZIZ.LJ.LIZLLL;
            if (aVar != null) {
                c790220UzE = aVar.LIZIZ;
            } else {
                c790220UzE = null;
            }
            c1513120pTiLIZIZ.LIZJ.readLock().unlock();
            for (C1513140pTk c1513140pTk : (List) this.LIZJ.getValue()) {
                ?? r0 = c1513140pTk.LIZ;
                if (r0 != 0 && ((Boolean) r0.invoke(str)).booleanValue() && c1513140pTk.LIZIZ == 4) {
                    this.LJ.invoke(c1513130pTj, str, c790220UzE, c1513140pTk);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1513120pTiLIZIZ.LIZJ.readLock().unlock();
            throw th;
        }
    }
}
