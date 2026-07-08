package Y;

import X.C1C7U;
import X.C795530VIp;
import X.C795560VIs;
import X.InterfaceC796340VLs;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public class ACallableS96S0101000_13 implements Callable {
    public final int $t;
    public int i1;
    public Object l0;

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

    public static final Object call$0(ACallableS96S0101000_13 aCallableS96S0101000_13) {
        C1C7U.LIZ("StrategyRuleHitCacheDao_Impl@9a97.deleteOldest$1");
        InterfaceC796340VLs interfaceC796340VLsAcquire = ((C795560VIs) aCallableS96S0101000_13.l0).LIZJ.acquire();
        interfaceC796340VLsAcquire.LJIJ(1, aCallableS96S0101000_13.i1);
        ((C795560VIs) aCallableS96S0101000_13.l0).LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            ((C795560VIs) aCallableS96S0101000_13.l0).LIZ.setTransactionSuccessful();
            Unit unit = Unit.LIZ;
            ((C795560VIs) aCallableS96S0101000_13.l0).LIZ.endTransaction();
            ((C795560VIs) aCallableS96S0101000_13.l0).LIZJ.release(interfaceC796340VLsAcquire);
            C1C7U.LIZIZ("StrategyRuleHitCacheDao_Impl@9a97.deleteOldest$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C795560VIs) aCallableS96S0101000_13.l0).LIZ.endTransaction();
            ((C795560VIs) aCallableS96S0101000_13.l0).LIZJ.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public static final Object call$1(ACallableS96S0101000_13 aCallableS96S0101000_13) {
        C1C7U.LIZ("AIQuickReplyDao_Impl@45a9.deleteOldestEntries$1");
        InterfaceC796340VLs interfaceC796340VLsAcquire = ((C795530VIp) aCallableS96S0101000_13.l0).LIZLLL.acquire();
        interfaceC796340VLsAcquire.LJIJ(1, aCallableS96S0101000_13.i1);
        ((C795530VIp) aCallableS96S0101000_13.l0).LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            ((C795530VIp) aCallableS96S0101000_13.l0).LIZ.setTransactionSuccessful();
            Unit unit = Unit.LIZ;
            ((C795530VIp) aCallableS96S0101000_13.l0).LIZ.endTransaction();
            ((C795530VIp) aCallableS96S0101000_13.l0).LIZLLL.release(interfaceC796340VLsAcquire);
            C1C7U.LIZIZ("AIQuickReplyDao_Impl@45a9.deleteOldestEntries$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C795530VIp) aCallableS96S0101000_13.l0).LIZ.endTransaction();
            ((C795530VIp) aCallableS96S0101000_13.l0).LIZLLL.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public ACallableS96S0101000_13(C795530VIp c795530VIp, int i) {
        this.$t = i;
        this.l0 = c795530VIp;
        this.i1 = LSPassThroughRecordSizeConfig.DEFAULT;
    }

    public ACallableS96S0101000_13(C795560VIs c795560VIs, int i, int i2) {
        this.$t = i2;
        this.l0 = c795560VIs;
        this.i1 = i;
    }
}
