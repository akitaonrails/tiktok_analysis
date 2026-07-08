package Y;

import X.C098200Yq;
import X.C09KV;
import X.C09KX;
import X.C09KY;
import X.C189200o6;
import X.C2220251Bv5;
import X.C2221081BwQ;
import X.C2221091BwR;
import X.EnumC2221121BwU;
import X.EnumC2221171BwZ;
import X.EnumC2221181Bwa;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AObjectS96S1100000_34 implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS96S1100000_34 aObjectS96S1100000_34) {
        return ((C2221091BwR) aObjectS96S1100000_34.l1).LIZ(aObjectS96S1100000_34.s0);
    }

    public static final Object invoke$1(AObjectS96S1100000_34 aObjectS96S1100000_34) {
        return ((C2221081BwQ) aObjectS96S1100000_34.l1).LJJLIIIJ(aObjectS96S1100000_34.s0);
    }

    public static final Object invoke$2(AObjectS96S1100000_34 aObjectS96S1100000_34) {
        return ((C2221091BwR) aObjectS96S1100000_34.l1).LJJIIJ(aObjectS96S1100000_34.s0);
    }

    public static final Object invoke$3(AObjectS96S1100000_34 aObjectS96S1100000_34) {
        Object c098200Yq;
        boolean zContainsKey;
        C2221091BwR c2221091BwR = (C2221091BwR) aObjectS96S1100000_34.l1;
        String str = aObjectS96S1100000_34.s0;
        c2221091BwR.getClass();
        try {
            File fileLJLIIIL = c2221091BwR.LJLIIIL(str, EnumC2221171BwZ.LL);
            C09KY c09ky = C09KY.LIZ;
            C09KX c09kx = c2221091BwR.LJFF;
            if (c09kx == null) {
                c09kx = null;
            }
            c09ky.getClass();
            String strLJI = C09KY.LJI(fileLJLIIIL, c09kx);
            if (strLJI == null) {
                strLJI = str;
            }
            C09KV c09kv = c2221091BwR.LJI;
            if (c09kv == null) {
                c09kv = null;
            }
            synchronized (c09kv) {
                zContainsKey = c09kv.LIZIZ().containsKey(strLJI);
            }
            if (!zContainsKey) {
                c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.NO_SUCH_FILE, str);
            } else if (fileLJLIIIL.exists() && !fileLJLIIIL.isDirectory()) {
                if (!fileLJLIIIL.delete()) {
                    c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.IO_ERROR, "delete fail");
                } else {
                    C09KV c09kv2 = c2221091BwR.LJI;
                    if (c09kv2 == null) {
                        c09kv2 = null;
                    }
                    c09kv2.LJ(strLJI);
                    c098200Yq = C2220251Bv5.LIZJ(null, null);
                }
            } else {
                C09KV c09kv3 = c2221091BwR.LJI;
                if (c09kv3 == null) {
                    c09kv3 = null;
                }
                c09kv3.LJ(strLJI);
                c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.NO_SUCH_FILE, str);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            return C2221091BwR.LJLJJI(thM5exceptionOrNullimpl, null);
        }
        return c098200Yq;
    }

    public static final Object invoke$4(AObjectS96S1100000_34 aObjectS96S1100000_34) {
        Object c098200Yq;
        boolean zContainsKey;
        C2221081BwQ c2221081BwQ = (C2221081BwQ) aObjectS96S1100000_34.l1;
        String str = aObjectS96S1100000_34.s0;
        c2221081BwQ.getClass();
        try {
            File fileLJLILLLLZI = c2221081BwQ.LJLILLLLZI(str, EnumC2221181Bwa.LL);
            C09KY c09ky = C09KY.LIZ;
            C09KX c09kx = c2221081BwQ.LJFF;
            if (c09kx == null) {
                c09kx = null;
            }
            c09ky.getClass();
            String strLJI = C09KY.LJI(fileLJLILLLLZI, c09kx);
            if (strLJI == null) {
                strLJI = str;
            }
            C09KV c09kv = c2221081BwQ.LJI;
            if (c09kv == null) {
                c09kv = null;
            }
            synchronized (c09kv) {
                zContainsKey = c09kv.LIZIZ().containsKey(strLJI);
            }
            if (!zContainsKey) {
                c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.NO_SUCH_FILE, str);
            } else {
                C09KV c09kv2 = c2221081BwQ.LJI;
                if (c09kv2 == null) {
                    c09kv2 = null;
                }
                c09kv2.LJ(strLJI);
                ReentrantLock reentrantLockLJLIIIL = c2221081BwQ.LJLIIIL(C2221081BwQ.LJJZZI(fileLJLILLLLZI));
                reentrantLockLJLIIIL.lock();
                try {
                    if (fileLJLILLLLZI.exists() && !fileLJLILLLLZI.isDirectory()) {
                        if (!fileLJLILLLLZI.delete()) {
                            c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.IO_ERROR, "delete fail");
                        } else {
                            c098200Yq = C2220251Bv5.LIZJ(null, null);
                        }
                    } else {
                        c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.NO_SUCH_FILE, str);
                    }
                    reentrantLockLJLIIIL.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    reentrantLockLJLIIIL.unlock();
                    throw th;
                }
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            return C2221081BwQ.LJLJL(thM5exceptionOrNullimpl, null);
        }
        return c098200Yq;
    }

    public static final Object invoke$5(AObjectS96S1100000_34 aObjectS96S1100000_34) {
        return ((C2221081BwQ) aObjectS96S1100000_34.l1).LIZ(aObjectS96S1100000_34.s0);
    }

    public static final Object invoke$6(AObjectS96S1100000_34 aObjectS96S1100000_34) {
        return ((C2221091BwR) aObjectS96S1100000_34.l1).LJJLIIIJJIZ(aObjectS96S1100000_34.s0);
    }

    public static final Object invoke$7(AObjectS96S1100000_34 aObjectS96S1100000_34) {
        return ((C2221081BwQ) aObjectS96S1100000_34.l1).LJJIIJ(aObjectS96S1100000_34.s0);
    }

    public static final Object invoke$8(AObjectS96S1100000_34 aObjectS96S1100000_34) {
        return ((C2221091BwR) aObjectS96S1100000_34.l1).LJJLIIIJ(aObjectS96S1100000_34.s0);
    }

    public static final Object invoke$9(AObjectS96S1100000_34 aObjectS96S1100000_34) {
        return ((C2221081BwQ) aObjectS96S1100000_34.l1).LJJLIIIJJIZ(aObjectS96S1100000_34.s0);
    }

    public AObjectS96S1100000_34(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
