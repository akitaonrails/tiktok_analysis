package Y;

import X.C1035180d2q;
import X.C1064210dnf;
import X.C1C7U;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes17.dex */
public class ACallableS151S0000000_16 implements Callable {
    public final int $t;

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

    public ACallableS151S0000000_16(int i) {
        this.$t = i;
    }

    public static final Object call$0(ACallableS151S0000000_16 aCallableS151S0000000_16) {
        C1C7U.LIZ("MicroGameVideoModel@2c0b.fetchVideoList$1");
        C1C7U.LIZIZ("MicroGameVideoModel@2c0b.fetchVideoList$1");
        return null;
    }

    public static final Object call$1(ACallableS151S0000000_16 aCallableS151S0000000_16) {
        C1C7U.LIZ("AdShowFilterManager@c491.clearDataBase$1L");
        try {
            ShowAdDataBase showAdDataBaseLIZIZ = C1064210dnf.LJI.LIZIZ();
            if (showAdDataBaseLIZIZ != null) {
                showAdDataBaseLIZIZ.LIZ().LIZIZ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("AdShowFilterManager@c491.clearDataBase$1L");
        return null;
    }

    public static final Object call$2(ACallableS151S0000000_16 aCallableS151S0000000_16) {
        C1C7U.LIZ("SplashAdManagerPreloadTask@d550.run$1L");
        C1035180d2q.LIZJ.getValue();
        C1C7U.LIZIZ("SplashAdManagerPreloadTask@d550.run$1L");
        return null;
    }
}
