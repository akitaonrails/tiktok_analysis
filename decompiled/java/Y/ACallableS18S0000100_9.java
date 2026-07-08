package Y;

import X.C1386470mBR;
import X.C1C7U;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public class ACallableS18S0000100_9 implements Callable {
    public final int $t;
    public long j0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS18S0000100_9 aCallableS18S0000100_9) {
        C1C7U.LIZ("DiscoverAndSearchFragment@a4a6.stopCalTimeForDiscover$1");
        C1386470mBR c1386470mBR = new C1386470mBR();
        c1386470mBR.LJJIJL("discovery");
        c1386470mBR.LJJLIIIJ = String.valueOf(aCallableS18S0000100_9.j0);
        c1386470mBR.LJIILJJIL();
        C1C7U.LIZIZ("DiscoverAndSearchFragment@a4a6.stopCalTimeForDiscover$1");
        return null;
    }

    public static final Object call$1(ACallableS18S0000100_9 aCallableS18S0000100_9) {
        C1C7U.LIZ("DiscoverAndSearchFragment@a4a6.stopCalTimeForSearchIntermediate$1");
        C1386470mBR c1386470mBR = new C1386470mBR();
        c1386470mBR.LJJIJL("search_empty_page");
        c1386470mBR.LJJLIIIJ = String.valueOf(aCallableS18S0000100_9.j0);
        c1386470mBR.LJIILJJIL();
        C1C7U.LIZIZ("DiscoverAndSearchFragment@a4a6.stopCalTimeForSearchIntermediate$1");
        return null;
    }

    public ACallableS18S0000100_9(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }
}
