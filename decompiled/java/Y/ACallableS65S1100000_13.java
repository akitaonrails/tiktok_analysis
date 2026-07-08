package Y;

import X.C080U;
import X.C0VM1;
import X.C0XI1;
import X.C0XI3;
import X.C0XJ8;
import X.C1489110oqz;
import X.C1697810uHb;
import X.C1AF0;
import X.C1C7U;
import X.C2259671DcT;
import X.C795520VIo;
import X.C796120VKw;
import X.C839620Wwi;
import X.InterfaceC796340VLs;
import X.InterfaceC846210XHn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.track.RawURLGetter;
import com.ss.android.ugc.aweme.commercialize.track.RawUrlApiV2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public class ACallableS65S1100000_13 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

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

    public static final Object call$0(ACallableS65S1100000_13 aCallableS65S1100000_13) {
        boolean z;
        List<InterfaceC846210XHn> listLJIILJJIL;
        C1C7U.LIZ("RawURLGetter@3f18.submit$2");
        String strLIZ = C1489110oqz.LIZ("other");
        if (strLIZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            listLJIILJJIL = null;
        } else {
            listLJIILJJIL = C1697810uHb.LJIILJJIL(new C2259671DcT("User-Agent", strLIZ));
        }
        ArrayList arrayList = new ArrayList();
        if (listLJIILJJIL != null) {
            for (InterfaceC846210XHn interfaceC846210XHn : listLJIILJJIL) {
                arrayList.add(new C080U(interfaceC846210XHn.getName(), interfaceC846210XHn.getValue()));
            }
        }
        try {
            if (C839620Wwi.LIZIZ) {
                ((RawUrlApiV2) RawURLGetter.LIZIZ.getValue()).doGet(aCallableS65S1100000_13.s0, arrayList).get();
            } else {
                ((RawURLGetter.RawUrlApi) RawURLGetter.LIZ.getValue()).doGet(aCallableS65S1100000_13.s0, arrayList).get();
            }
            C0XI1 c0xi1 = (C0XI1) aCallableS65S1100000_13.l1;
            if (c0xi1 != null) {
                try {
                    c0xi1.LIZ(200, true, null);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                }
            }
        } catch (C0XI3 e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            C0XI1 c0xi12 = (C0XI1) aCallableS65S1100000_13.l1;
            int statusCode = e.getStatusCode();
            if (c0xi12 != null) {
                try {
                    c0xi12.LIZ(statusCode, false, e);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C1AF0.LJ(th2);
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C0XI1 c0xi13 = (C0XI1) aCallableS65S1100000_13.l1;
            int iLIZ = C0XJ8.LIZIZ.LIZ(e2);
            if (c0xi13 != null) {
                try {
                    c0xi13.LIZ(iLIZ, false, e2);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C1AF0.LJ(th3);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RawURLGetter@3f18.submit$2");
        return unit;
    }

    public static final Object call$1(ACallableS65S1100000_13 aCallableS65S1100000_13) {
        C1C7U.LIZ("AIGCWorkflowDao_Impl@f8cc.deleteById$1");
        InterfaceC796340VLs interfaceC796340VLsAcquire = ((C795520VIo) aCallableS65S1100000_13.l1).LIZJ.acquire();
        String str = aCallableS65S1100000_13.s0;
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(1, str);
        }
        ((C795520VIo) aCallableS65S1100000_13.l1).LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            ((C795520VIo) aCallableS65S1100000_13.l1).LIZ.setTransactionSuccessful();
            Unit unit = Unit.LIZ;
            ((C795520VIo) aCallableS65S1100000_13.l1).LIZ.endTransaction();
            ((C795520VIo) aCallableS65S1100000_13.l1).LIZJ.release(interfaceC796340VLsAcquire);
            C1C7U.LIZIZ("AIGCWorkflowDao_Impl@f8cc.deleteById$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C795520VIo) aCallableS65S1100000_13.l1).LIZ.endTransaction();
            ((C795520VIo) aCallableS65S1100000_13.l1).LIZJ.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public static final Object call$2(ACallableS65S1100000_13 aCallableS65S1100000_13) {
        C1C7U.LIZ("AIGCWorkflowDao_Impl@f8cc.incrementGradeDownCount$1");
        InterfaceC796340VLs interfaceC796340VLsAcquire = ((C795520VIo) aCallableS65S1100000_13.l1).LJIIIIZZ.acquire();
        String str = aCallableS65S1100000_13.s0;
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(1, str);
        }
        ((C795520VIo) aCallableS65S1100000_13.l1).LIZ.beginTransaction();
        try {
            Integer numValueOf = Integer.valueOf(interfaceC796340VLsAcquire.LJIIL());
            ((C795520VIo) aCallableS65S1100000_13.l1).LIZ.setTransactionSuccessful();
            ((C795520VIo) aCallableS65S1100000_13.l1).LIZ.endTransaction();
            ((C795520VIo) aCallableS65S1100000_13.l1).LJIIIIZZ.release(interfaceC796340VLsAcquire);
            C1C7U.LIZIZ("AIGCWorkflowDao_Impl@f8cc.incrementGradeDownCount$1");
            return numValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C795520VIo) aCallableS65S1100000_13.l1).LIZ.endTransaction();
            ((C795520VIo) aCallableS65S1100000_13.l1).LJIIIIZZ.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public static final Object call$3(ACallableS65S1100000_13 aCallableS65S1100000_13) {
        C1C7U.LIZ("FriendsV3FeedDao_Impl@6b3b.removeUserFeeds$1");
        InterfaceC796340VLs interfaceC796340VLsAcquire = ((C0VM1) aCallableS65S1100000_13.l1).LIZLLL.acquire();
        String str = aCallableS65S1100000_13.s0;
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(1, str);
        }
        ((C0VM1) aCallableS65S1100000_13.l1).LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            ((C0VM1) aCallableS65S1100000_13.l1).LIZ.setTransactionSuccessful();
            Unit unit = Unit.LIZ;
            ((C0VM1) aCallableS65S1100000_13.l1).LIZ.endTransaction();
            ((C0VM1) aCallableS65S1100000_13.l1).LIZLLL.release(interfaceC796340VLsAcquire);
            C1C7U.LIZIZ("FriendsV3FeedDao_Impl@6b3b.removeUserFeeds$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C0VM1) aCallableS65S1100000_13.l1).LIZ.endTransaction();
            ((C0VM1) aCallableS65S1100000_13.l1).LIZLLL.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public static final Object call$4(ACallableS65S1100000_13 aCallableS65S1100000_13) {
        C1C7U.LIZ("StoryThoughtDraftDao_Impl@74ce.delete$1");
        InterfaceC796340VLs interfaceC796340VLsAcquire = ((C796120VKw) aCallableS65S1100000_13.l1).LIZLLL.acquire();
        String str = aCallableS65S1100000_13.s0;
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(1, str);
        }
        ((C796120VKw) aCallableS65S1100000_13.l1).LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            ((C796120VKw) aCallableS65S1100000_13.l1).LIZ.setTransactionSuccessful();
            Unit unit = Unit.LIZ;
            ((C796120VKw) aCallableS65S1100000_13.l1).LIZ.endTransaction();
            ((C796120VKw) aCallableS65S1100000_13.l1).LIZLLL.release(interfaceC796340VLsAcquire);
            C1C7U.LIZIZ("StoryThoughtDraftDao_Impl@74ce.delete$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C796120VKw) aCallableS65S1100000_13.l1).LIZ.endTransaction();
            ((C796120VKw) aCallableS65S1100000_13.l1).LIZLLL.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public ACallableS65S1100000_13(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
