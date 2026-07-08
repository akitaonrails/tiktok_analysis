package Y;

import X.C1C7U;
import X.C795520VIo;
import X.InterfaceC796340VLs;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes14.dex */
public class ACallableS20S2100000_13 implements Callable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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
            case 4:
                return call$4(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS20S2100000_13 aCallableS20S2100000_13) {
        C1C7U.LIZ("AIGCWorkflowDao_Impl@f8cc.updateCentralRegistry$1");
        InterfaceC796340VLs interfaceC796340VLsAcquire = ((C795520VIo) aCallableS20S2100000_13.l2).LIZLLL.acquire();
        String str = aCallableS20S2100000_13.s0;
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(1, str);
        }
        String str2 = aCallableS20S2100000_13.s1;
        if (str2 == null) {
            interfaceC796340VLsAcquire.LLD(2);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(2, str2);
        }
        ((C795520VIo) aCallableS20S2100000_13.l2).LIZ.beginTransaction();
        try {
            Integer numValueOf = Integer.valueOf(interfaceC796340VLsAcquire.LJIIL());
            ((C795520VIo) aCallableS20S2100000_13.l2).LIZ.setTransactionSuccessful();
            ((C795520VIo) aCallableS20S2100000_13.l2).LIZ.endTransaction();
            ((C795520VIo) aCallableS20S2100000_13.l2).LIZLLL.release(interfaceC796340VLsAcquire);
            C1C7U.LIZIZ("AIGCWorkflowDao_Impl@f8cc.updateCentralRegistry$1");
            return numValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C795520VIo) aCallableS20S2100000_13.l2).LIZ.endTransaction();
            ((C795520VIo) aCallableS20S2100000_13.l2).LIZLLL.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public static final Object call$1(ACallableS20S2100000_13 aCallableS20S2100000_13) {
        C1C7U.LIZ("AIGCWorkflowDao_Impl@f8cc.updateWorkflowStatus$1");
        InterfaceC796340VLs interfaceC796340VLsAcquire = ((C795520VIo) aCallableS20S2100000_13.l2).LJ.acquire();
        String str = aCallableS20S2100000_13.s0;
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(1, str);
        }
        String str2 = aCallableS20S2100000_13.s1;
        if (str2 == null) {
            interfaceC796340VLsAcquire.LLD(2);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(2, str2);
        }
        ((C795520VIo) aCallableS20S2100000_13.l2).LIZ.beginTransaction();
        try {
            Integer numValueOf = Integer.valueOf(interfaceC796340VLsAcquire.LJIIL());
            ((C795520VIo) aCallableS20S2100000_13.l2).LIZ.setTransactionSuccessful();
            ((C795520VIo) aCallableS20S2100000_13.l2).LIZ.endTransaction();
            ((C795520VIo) aCallableS20S2100000_13.l2).LJ.release(interfaceC796340VLsAcquire);
            C1C7U.LIZIZ("AIGCWorkflowDao_Impl@f8cc.updateWorkflowStatus$1");
            return numValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C795520VIo) aCallableS20S2100000_13.l2).LIZ.endTransaction();
            ((C795520VIo) aCallableS20S2100000_13.l2).LJ.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public static final Object call$2(ACallableS20S2100000_13 aCallableS20S2100000_13) {
        C1C7U.LIZ("AIGCWorkflowDao_Impl@f8cc.updateStaticCentralRegistry$1");
        InterfaceC796340VLs interfaceC796340VLsAcquire = ((C795520VIo) aCallableS20S2100000_13.l2).LJFF.acquire();
        String str = aCallableS20S2100000_13.s0;
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(1, str);
        }
        String str2 = aCallableS20S2100000_13.s1;
        if (str2 == null) {
            interfaceC796340VLsAcquire.LLD(2);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(2, str2);
        }
        ((C795520VIo) aCallableS20S2100000_13.l2).LIZ.beginTransaction();
        try {
            Integer numValueOf = Integer.valueOf(interfaceC796340VLsAcquire.LJIIL());
            ((C795520VIo) aCallableS20S2100000_13.l2).LIZ.setTransactionSuccessful();
            ((C795520VIo) aCallableS20S2100000_13.l2).LIZ.endTransaction();
            ((C795520VIo) aCallableS20S2100000_13.l2).LJFF.release(interfaceC796340VLsAcquire);
            C1C7U.LIZIZ("AIGCWorkflowDao_Impl@f8cc.updateStaticCentralRegistry$1");
            return numValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C795520VIo) aCallableS20S2100000_13.l2).LIZ.endTransaction();
            ((C795520VIo) aCallableS20S2100000_13.l2).LJFF.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public static final Object call$3(ACallableS20S2100000_13 aCallableS20S2100000_13) {
        C1C7U.LIZ("AIGCWorkflowDao_Impl@f8cc.updateCreationIdReadOnly$1");
        InterfaceC796340VLs interfaceC796340VLsAcquire = ((C795520VIo) aCallableS20S2100000_13.l2).LJI.acquire();
        String str = aCallableS20S2100000_13.s0;
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(1, str);
        }
        String str2 = aCallableS20S2100000_13.s1;
        if (str2 == null) {
            interfaceC796340VLsAcquire.LLD(2);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(2, str2);
        }
        ((C795520VIo) aCallableS20S2100000_13.l2).LIZ.beginTransaction();
        try {
            Integer numValueOf = Integer.valueOf(interfaceC796340VLsAcquire.LJIIL());
            ((C795520VIo) aCallableS20S2100000_13.l2).LIZ.setTransactionSuccessful();
            ((C795520VIo) aCallableS20S2100000_13.l2).LIZ.endTransaction();
            ((C795520VIo) aCallableS20S2100000_13.l2).LJI.release(interfaceC796340VLsAcquire);
            C1C7U.LIZIZ("AIGCWorkflowDao_Impl@f8cc.updateCreationIdReadOnly$1");
            return numValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C795520VIo) aCallableS20S2100000_13.l2).LIZ.endTransaction();
            ((C795520VIo) aCallableS20S2100000_13.l2).LJI.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public static final Object call$4(ACallableS20S2100000_13 aCallableS20S2100000_13) {
        C1C7U.LIZ("AIGCWorkflowDao_Impl@f8cc.updateServerTaskId$1");
        InterfaceC796340VLs interfaceC796340VLsAcquire = ((C795520VIo) aCallableS20S2100000_13.l2).LJII.acquire();
        String str = aCallableS20S2100000_13.s0;
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(1, str);
        }
        String str2 = aCallableS20S2100000_13.s1;
        if (str2 == null) {
            interfaceC796340VLsAcquire.LLD(2);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(2, str2);
        }
        ((C795520VIo) aCallableS20S2100000_13.l2).LIZ.beginTransaction();
        try {
            Integer numValueOf = Integer.valueOf(interfaceC796340VLsAcquire.LJIIL());
            ((C795520VIo) aCallableS20S2100000_13.l2).LIZ.setTransactionSuccessful();
            ((C795520VIo) aCallableS20S2100000_13.l2).LIZ.endTransaction();
            ((C795520VIo) aCallableS20S2100000_13.l2).LJII.release(interfaceC796340VLsAcquire);
            C1C7U.LIZIZ("AIGCWorkflowDao_Impl@f8cc.updateServerTaskId$1");
            return numValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C795520VIo) aCallableS20S2100000_13.l2).LIZ.endTransaction();
            ((C795520VIo) aCallableS20S2100000_13.l2).LJII.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public ACallableS20S2100000_13(C795520VIo c795520VIo, String str, String str2, int i) {
        this.$t = i;
        this.l2 = c795520VIo;
        this.s0 = str;
        this.s1 = str2;
    }
}
