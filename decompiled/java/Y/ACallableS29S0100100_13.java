package Y;

import X.C0VLZ;
import X.C1C7U;
import X.C795550VIr;
import X.C796490VMh;
import X.InterfaceC796340VLs;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public class ACallableS29S0100100_13 implements Callable {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS29S0100100_13 aCallableS29S0100100_13) {
        C1C7U.LIZ("AwemeMessageKvDao_Impl@117e.deleteByMsgId$1");
        InterfaceC796340VLs interfaceC796340VLsAcquire = ((C795550VIr) aCallableS29S0100100_13.l0).LJFF.acquire();
        interfaceC796340VLsAcquire.LJIJ(1, aCallableS29S0100100_13.j1);
        ((C795550VIr) aCallableS29S0100100_13.l0).LIZIZ.beginTransaction();
        try {
            Integer numValueOf = Integer.valueOf(interfaceC796340VLsAcquire.LJIIL());
            ((C795550VIr) aCallableS29S0100100_13.l0).LIZIZ.setTransactionSuccessful();
            ((C795550VIr) aCallableS29S0100100_13.l0).LIZIZ.endTransaction();
            ((C795550VIr) aCallableS29S0100100_13.l0).LJFF.release(interfaceC796340VLsAcquire);
            C1C7U.LIZIZ("AwemeMessageKvDao_Impl@117e.deleteByMsgId$1");
            return numValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C795550VIr) aCallableS29S0100100_13.l0).LIZIZ.endTransaction();
            ((C795550VIr) aCallableS29S0100100_13.l0).LJFF.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public static final Object call$1(ACallableS29S0100100_13 aCallableS29S0100100_13) {
        C1C7U.LIZ("SkylightLiveDao_Impl@6e67.deleteExpired$1");
        InterfaceC796340VLs interfaceC796340VLsAcquire = ((C0VLZ) aCallableS29S0100100_13.l0).LIZLLL.acquire();
        interfaceC796340VLsAcquire.LJIJ(1, aCallableS29S0100100_13.j1);
        ((C0VLZ) aCallableS29S0100100_13.l0).LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            ((C0VLZ) aCallableS29S0100100_13.l0).LIZ.setTransactionSuccessful();
            Unit unit = Unit.LIZ;
            ((C0VLZ) aCallableS29S0100100_13.l0).LIZ.endTransaction();
            ((C0VLZ) aCallableS29S0100100_13.l0).LIZLLL.release(interfaceC796340VLsAcquire);
            C1C7U.LIZIZ("SkylightLiveDao_Impl@6e67.deleteExpired$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C0VLZ) aCallableS29S0100100_13.l0).LIZ.endTransaction();
            ((C0VLZ) aCallableS29S0100100_13.l0).LIZLLL.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public static final Object call$2(ACallableS29S0100100_13 aCallableS29S0100100_13) {
        C1C7U.LIZ("SkylightStoryCollectionDao_Impl@3eab.deleteExpired$1");
        InterfaceC796340VLs interfaceC796340VLsAcquire = ((C796490VMh) aCallableS29S0100100_13.l0).LJFF.acquire();
        interfaceC796340VLsAcquire.LJIJ(1, aCallableS29S0100100_13.j1);
        ((C796490VMh) aCallableS29S0100100_13.l0).LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            ((C796490VMh) aCallableS29S0100100_13.l0).LIZ.setTransactionSuccessful();
            Unit unit = Unit.LIZ;
            ((C796490VMh) aCallableS29S0100100_13.l0).LIZ.endTransaction();
            ((C796490VMh) aCallableS29S0100100_13.l0).LJFF.release(interfaceC796340VLsAcquire);
            C1C7U.LIZIZ("SkylightStoryCollectionDao_Impl@3eab.deleteExpired$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C796490VMh) aCallableS29S0100100_13.l0).LIZ.endTransaction();
            ((C796490VMh) aCallableS29S0100100_13.l0).LJFF.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public static final Object call$3(ACallableS29S0100100_13 aCallableS29S0100100_13) {
        C1C7U.LIZ("AwemeMessageKvDao_Impl@117e.deleteByCreatedTimeBefore$1");
        InterfaceC796340VLs interfaceC796340VLsAcquire = ((C795550VIr) aCallableS29S0100100_13.l0).LJ.acquire();
        interfaceC796340VLsAcquire.LJIJ(1, aCallableS29S0100100_13.j1);
        ((C795550VIr) aCallableS29S0100100_13.l0).LIZIZ.beginTransaction();
        try {
            Integer numValueOf = Integer.valueOf(interfaceC796340VLsAcquire.LJIIL());
            ((C795550VIr) aCallableS29S0100100_13.l0).LIZIZ.setTransactionSuccessful();
            ((C795550VIr) aCallableS29S0100100_13.l0).LIZIZ.endTransaction();
            ((C795550VIr) aCallableS29S0100100_13.l0).LJ.release(interfaceC796340VLsAcquire);
            C1C7U.LIZIZ("AwemeMessageKvDao_Impl@117e.deleteByCreatedTimeBefore$1");
            return numValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C795550VIr) aCallableS29S0100100_13.l0).LIZIZ.endTransaction();
            ((C795550VIr) aCallableS29S0100100_13.l0).LJ.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public ACallableS29S0100100_13(Object obj, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
