package X;

import Y.ARunnableS132S0100000_32;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.bytedance.otis.ultimate.inflater.internal.cache.CacheHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS646S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17p1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21145717p1 implements InterfaceC1567710qtl, InterfaceC21147317pH {
    public static final CacheHandler LIZ;
    public static final ReentrantReadWriteLock LIZIZ;
    public static final C21145917p3 LIZJ;
    public static final C21145917p3 LIZLLL;
    public static final C21145717p1 LJ;

    static {
        C21145717p1 c21145717p1 = new C21145717p1();
        LJ = c21145717p1;
        LIZ = new CacheHandler(c21145717p1);
        LIZIZ = new ReentrantReadWriteLock();
        LIZJ = new C21145917p3();
        LIZLLL = new C21145917p3();
    }

    @Override // X.InterfaceC1567710qtl
    public final void LIZ(InterfaceC21143917oj interfaceC21143917oj) {
        AwS646S0100000_32 awS646S0100000_32 = new AwS646S0100000_32(interfaceC21143917oj, 0);
        ReentrantReadWriteLock.ReadLock lock = LIZIZ.readLock();
        lock.lock();
        try {
            Iterator it2 = ((ConcurrentHashMap) LIZJ.LIZ).entrySet().iterator();
            while (it2.hasNext()) {
                List list = (List) ((Map.Entry) it2.next()).getValue();
                synchronized (list) {
                    try {
                        C21145417oy.LIZJ(list, new C21143317od((InterfaceC21143917oj) awS646S0100000_32.l0), new AwS611S0100000_32(AFwS278S0000000_32.get$arr$(1), 3));
                    } finally {
                    }
                }
            }
            Iterator it3 = ((ConcurrentHashMap) LIZLLL.LIZ).entrySet().iterator();
            while (it3.hasNext()) {
                List list2 = (List) ((Map.Entry) it3.next()).getValue();
                synchronized (list2) {
                    try {
                        C21145417oy.LIZJ(list2, new C21143317od((InterfaceC21143917oj) awS646S0100000_32.l0), new AwS611S0100000_32(AFwS278S0000000_32.get$arr$(2), 3));
                    } finally {
                    }
                }
            }
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public final InterfaceC21143917oj LIZLLL(Context context) {
        Object c098200Yq;
        Activity activityLIZ = C21145417oy.LIZ(context);
        InterfaceC21143917oj interfaceC21143917oj = null;
        if (activityLIZ != null) {
            Iterator it2 = ((List) C21145817p2.LIZ.getValue()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                try {
                    c098200Yq = ((InterfaceC1567700qtk) it2.next()).LIZ(activityLIZ);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                InterfaceC21143917oj interfaceC21143917oj2 = (InterfaceC21143917oj) c098200Yq;
                if (interfaceC21143917oj2 != null) {
                    interfaceC21143917oj = interfaceC21143917oj2;
                    if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                        interfaceC21143917oj2.LIZ(this);
                    } else {
                        LIZ.postAtFrontOfQueue(new ARunnableS132S0100000_32(interfaceC21143917oj2, 0));
                        return interfaceC21143917oj;
                    }
                }
            }
        }
        return interfaceC21143917oj;
    }

    public static void LJ(int i, InterfaceC21138617ns interfaceC21138617ns) {
        int readHoldCount;
        C21143617og c21143617og;
        C21143617og c21143617og2;
        ReentrantReadWriteLock reentrantReadWriteLock = LIZIZ;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < readHoldCount; i3++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            List<C21143617og> listLIZ = LIZJ.LIZ(i);
            synchronized (listLIZ) {
                try {
                    c21143617og = (C21143617og) C21145417oy.LIZIZ(listLIZ, new C21142317oT(interfaceC21138617ns));
                    c21143617og2 = null;
                    if (c21143617og != null) {
                        InterfaceC21146617pA interfaceC21146617pA = C21145617p0.LIZ.LIZLLL;
                        if (interfaceC21146617pA != null) {
                            c21143617og.LIZ();
                            interfaceC21146617pA.LIZLLL();
                        }
                    } else {
                        c21143617og = null;
                    }
                } finally {
                }
            }
            if (c21143617og != null) {
                List<C21143617og> listLIZ2 = LIZLLL.LIZ(i);
                synchronized (listLIZ2) {
                    try {
                        listLIZ2.add(c21143617og);
                    } finally {
                    }
                }
                c21143617og2 = c21143617og;
            }
            while (i2 < readHoldCount) {
                lock.lock();
                i2++;
            }
            writeLock.unlock();
            if (c21143617og2 != null) {
                CacheHandler cacheHandler = LIZ;
                cacheHandler.getClass();
                cacheHandler.removeMessages(1, c21143617og2.LIZLLL);
                long j = C21145617p0.LIZ.LJFF;
                Message messageObtain = Message.obtain();
                messageObtain.what = 2;
                messageObtain.arg1 = c21143617og2.LIZIZ;
                messageObtain.obj = c21143617og2.LIZLLL;
                cacheHandler.sendMessageDelayed(messageObtain, j);
                InterfaceC21146617pA interfaceC21146617pA2 = C21145617p0.LIZ.LIZLLL;
                if (interfaceC21146617pA2 != null) {
                    c21143617og2.LIZ();
                    interfaceC21146617pA2.LJIIIIZZ();
                }
            }
        } catch (Throwable th) {
            while (i2 < readHoldCount) {
                lock.lock();
                i2++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public static void LJI(int i, InterfaceC21138617ns interfaceC21138617ns) {
        List<C21143617og> listLIZ = LIZJ.LIZ(i);
        synchronized (listLIZ) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        List<C21143617og> listLIZ2 = LIZLLL.LIZ(i);
        synchronized (listLIZ2) {
            try {
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    @Override // X.InterfaceC21147317pH
    public final void LIZIZ(int i, String str) {
        LJFF(LIZLLL, i, str, AFwS278S0000000_32.get$arr$(3));
    }

    @Override // X.InterfaceC21147317pH
    public final void LIZJ(int i, String str) {
        LJFF(LIZJ, i, str, AFwS278S0000000_32.get$arr$(0));
    }

    public static void LJFF(C21145917p3 c21145917p3, int i, final String str, Function1 function1) {
        ReentrantReadWriteLock.ReadLock lock = LIZIZ.readLock();
        lock.lock();
        try {
            List<C21143617og> listLIZ = c21145917p3.LIZ(i);
            synchronized (listLIZ) {
                try {
                    C21145417oy.LIZJ(listLIZ, new Function1<C21143617og, Boolean>(str) { // from class: X.17oU
                        public final String LL;

                        {
                            this.LL = str;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(C21143617og c21143617og) {
                            return Boolean.valueOf(Intrinsics.LJFF(c21143617og.LIZLLL, this.LL));
                        }
                    }, new AwS611S0100000_32(function1, 2));
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }
}
