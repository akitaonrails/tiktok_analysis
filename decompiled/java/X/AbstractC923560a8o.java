package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0a8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC923560a8o<T, S> implements InterfaceC923020a7w {
    public S LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(212));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(216));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(213));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(214));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(215));

    public abstract void LJFF(S s);

    public final List<T> LIZLLL() {
        return (List) this.LIZIZ.getValue();
    }

    public final List<T> LJ() {
        return (List) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC923020a7w
    public final List<T> LIZ() {
        return LJ();
    }

    @Override // X.InterfaceC923020a7w
    public final List<T> LIZIZ() {
        return LIZLLL();
    }

    public final void LIZJ() {
        LIZLLL().clear();
        LJ().clear();
        ((List) this.LIZLLL.getValue()).clear();
        ((List) this.LJ.getValue()).clear();
        ((List) this.LJFF.getValue()).clear();
    }

    public final void LJI(S s) {
        synchronized (this) {
            try {
                this.LIZ = s;
                LIZJ();
                LJFF(s);
                List<T> listLIZLLL = LIZLLL();
                listLIZLLL.addAll(LJ());
                listLIZLLL.addAll((List) this.LIZLLL.getValue());
                listLIZLLL.addAll((List) this.LJ.getValue());
                listLIZLLL.addAll((List) this.LJFF.getValue());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJII(boolean z) {
        synchronized (this) {
            if (z) {
                try {
                    LIZJ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
