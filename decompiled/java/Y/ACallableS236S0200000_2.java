package Y;

import X.AbstractC1375550ltp;
import X.AbstractC19483511Kn;
import X.C063Y;
import X.C0PEM;
import X.C11LF;
import X.C1C7U;
import X.C2097908Jt;
import X.C23250099c;
import X.C786410Ut5;
import X.C805380Via;
import X.InterfaceC1369790lkX;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.share.panel.TakoLongImageSharePackage;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public class ACallableS236S0200000_2 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS236S0200000_2 aCallableS236S0200000_2) {
        C1C7U.LIZ("PumbaaTask@7275.initCustomBPEA$4$onGetCache$1");
        C805380Via.LIZLLL((Throwable) aCallableS236S0200000_2.l0, "BPEA_carrier_cache_default", C2097908Jt.LIZJ(new Pair("key", String.valueOf(aCallableS236S0200000_2.l1))));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PumbaaTask@7275.initCustomBPEA$4$onGetCache$1");
        return unit;
    }

    public static final Object call$1(ACallableS236S0200000_2 aCallableS236S0200000_2) {
        C1C7U.LIZ("TakoLongImageSharePackage@f869.selectContentAsync$2");
        C11LF c11lfLJIIJJI = AbstractC19483511Kn.LJIIJJI(new ACallableS236S0200000_2((TakoLongImageSharePackage) aCallableS236S0200000_2.l0, (InterfaceC1369790lkX) aCallableS236S0200000_2.l1, 2));
        C1C7U.LIZIZ("TakoLongImageSharePackage@f869.selectContentAsync$2");
        return c11lfLJIIJJI;
    }

    public static final Object call$2(ACallableS236S0200000_2 aCallableS236S0200000_2) throws Throwable {
        C1C7U.LIZ("TakoLongImageSharePackage@f869.selectContentAsync$2$1");
        if (((TakoLongImageSharePackage) aCallableS236S0200000_2.l0).tempFilePath.length() > 0) {
            try {
                C23250099c.LJ(C0PEM.LIZJ, new C063Y((TakoLongImageSharePackage) aCallableS236S0200000_2.l0, null));
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                C786410Ut5.u3().interrupt();
            }
        }
        AbstractC1375550ltp abstractC1375550ltpLJIILLIIL = ((TakoLongImageSharePackage) aCallableS236S0200000_2.l0).LJIILLIIL((InterfaceC1369790lkX) aCallableS236S0200000_2.l1);
        C1C7U.LIZIZ("TakoLongImageSharePackage@f869.selectContentAsync$2$1");
        return abstractC1375550ltpLJIILLIIL;
    }

    public ACallableS236S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
