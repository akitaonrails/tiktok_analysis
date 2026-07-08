package X;

import android.text.TextUtils;
import com.bytedance.forest.Forest;
import com.bytedance.forest.experiments.ForestExperiment;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q1B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533870q1B {
    public static final C1533870q1B LIZ = new C1533870q1B();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1534940q2u());
    public static final ReentrantReadWriteLock LIZJ = new ReentrantReadWriteLock();
    public static final ConcurrentHashMap<String, C1534570q2J> LIZLLL = new ConcurrentHashMap<>();

    public static Queue LIZLLL() {
        return (Queue) LIZIZ.getValue();
    }

    public static C1534930q2t LIZJ(String str) {
        Object next;
        ReentrantReadWriteLock.ReadLock lock = LIZJ.readLock();
        lock.lock();
        try {
            LIZ.getClass();
            Iterator it2 = LIZLLL().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((C1534930q2t) next).LIZ, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1534930q2t c1534930q2t = (C1534930q2t) next;
            lock.unlock();
            return c1534930q2t;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public static void LJI(String str) {
        int readHoldCount;
        ReentrantReadWriteLock reentrantReadWriteLock = LIZJ;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            if (TextUtils.isEmpty(str)) {
                C1534250q1n.LIZIZ("PreLoader", "prepare preload failed, url is empty!", null);
            } else {
                LIZ.getClass();
                C1534930q2t c1534930q2tLIZJ = LIZJ(str);
                if (c1534930q2tLIZJ != null) {
                    LIZLLL().remove(c1534930q2tLIZJ);
                    LIZLLL().offer(c1534930q2tLIZJ);
                } else {
                    if (LIZLLL().size() > 30) {
                        LIZLLL().poll();
                    }
                    LIZLLL().offer(new C1534930q2t(str, EnumC1984207pw.LL));
                }
            }
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public static C1534930q2t LJII(String str) {
        int readHoldCount;
        ReentrantReadWriteLock reentrantReadWriteLock = LIZJ;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            LIZ.getClass();
            C1534930q2t c1534930q2tLIZJ = LIZJ(str);
            if (c1534930q2tLIZJ != null) {
                LIZLLL().remove(c1534930q2tLIZJ);
            } else {
                c1534930q2tLIZJ = null;
            }
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            return c1534930q2tLIZJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public static C1534570q2J LIZ(String str, Function1 function1) {
        LJII(str);
        ConcurrentHashMap<String, C1534570q2J> concurrentHashMap = LIZLLL;
        C1534570q2J c1534570q2J = concurrentHashMap.get(str);
        if (c1534570q2J != null) {
            C1534250q1n.LJII("PreLoader", "request reused", false);
            synchronized (c1534570q2J) {
                try {
                    if (c1534570q2J.LLILZIL != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("fetchCache:hit cache immediately, url:");
                        sbLIZ.append(str);
                        C1534250q1n.LJII("PreLoader", C2188811AlT.LIZIZ(sbLIZ), false);
                        c1534570q2J.LLILZLL = false;
                        concurrentHashMap.remove(str);
                        function1.invoke(c1534570q2J.LLILZIL);
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("fetchCache:waiting for result, url:");
                        sbLIZ2.append(str);
                        C1534250q1n.LJII("PreLoader", C2188811AlT.LIZIZ(sbLIZ2), false);
                        c1534570q2J.LLILZLL = true;
                        ((ArrayList) c1534570q2J.LLIZ).add(function1);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c1534570q2J;
    }

    public static C1533790q13 LIZIZ(String str, RequestParams requestParams) {
        EnumC1533980q1M enumC1533980q1M;
        EnumC1984207pw enumC1984207pw;
        InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY;
        C1533490q0Z c1533490q0Z;
        C1534930q2t c1534930q2tLJII = LJII(str);
        ConcurrentHashMap<String, C1534570q2J> concurrentHashMap = LIZLLL;
        C1534570q2J c1534570q2J = concurrentHashMap.get(str);
        EnumC1984207pw enumC1984207pw2 = null;
        if (c1534570q2J == null) {
            return null;
        }
        C1533790q13 c1533790q13 = c1534570q2J.LLILZIL;
        if (c1533790q13 != null && (c1533490q0Z = c1533790q13.LIZ) != null) {
            enumC1533980q1M = c1533490q0Z.LJJJ;
        } else {
            enumC1533980q1M = null;
        }
        if (enumC1533980q1M == EnumC1533980q1M.LYNX_IMAGE) {
            SoftReference<InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>>> softReference = c1534570q2J.LLIZLLLIL;
            if (softReference != null && (interfaceC1320200kSY = softReference.get()) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("image request, url:");
                sbLIZ.append(str);
                sbLIZ.append(" finished:");
                sbLIZ.append(interfaceC1320200kSY.LIZ());
                sbLIZ.append(" progress:");
                sbLIZ.append(interfaceC1320200kSY.getProgress());
                C1534250q1n.LJII("PreLoader", C2188811AlT.LIZIZ(sbLIZ), false);
            }
            concurrentHashMap.remove(str);
        } else {
            if (c1534930q2tLJII != null) {
                enumC1984207pw = c1534930q2tLJII.LIZIZ;
            } else {
                enumC1984207pw = null;
            }
            if (enumC1984207pw == EnumC1984207pw.LLILLJJLI) {
                C086F.LIZ.getClass();
                if (C086F.LIZ()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Fetching ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" sync in main thread!");
                    C1534250q1n.LIZIZ("PreLoader", C2188811AlT.LIZIZ(sbLIZ2), null);
                }
                CountDownLatch countDownLatch = new CountDownLatch(1);
                C1533870q1B c1533870q1B = LIZ;
                AwS602S0100000_23 awS602S0100000_23 = new AwS602S0100000_23(countDownLatch, 77);
                c1533870q1B.getClass();
                LIZ(str, awS602S0100000_23);
                countDownLatch.await(requestParams.fetchPreloadedCacheTimeout, TimeUnit.MILLISECONDS);
            } else {
                C1534250q1n c1534250q1n = C1534250q1n.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("request reuse failed for ");
                sbLIZ3.append(str);
                sbLIZ3.append(", cause it is not in producing, current state is ");
                if (c1534930q2tLJII != null) {
                    enumC1984207pw2 = c1534930q2tLJII.LIZIZ;
                }
                sbLIZ3.append(enumC1984207pw2);
                C1534250q1n.LIZ(c1534250q1n, "PreLoader", C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return c1534570q2J.LLILZIL;
    }

    public final void LJFF(Forest forest, String str, RequestParams requestParams, boolean z, Function1<? super C1533790q13, Unit> function1) {
        int readHoldCount;
        C1533790q13 c1533790q13;
        if (LIZLLL.containsKey(str)) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = LIZJ;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i = 0; i < readHoldCount; i++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            LIZ.getClass();
            C1534930q2t c1534930q2tLIZJ = LIZJ(str);
            if (c1534930q2tLIZJ == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("produce preload failed, no prepare record exists for ");
                sbLIZ.append(str);
                sbLIZ.append('!');
                C1534250q1n.LIZIZ("PreLoader", C2188811AlT.LIZIZ(sbLIZ), null);
            } else {
                LIZLLL().remove(c1534930q2tLIZJ);
                LIZLLL().offer(new C1534930q2t(str, EnumC1984207pw.LLILLJJLI));
            }
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.lock();
            }
            writeLock.unlock();
            EnumC1533980q1M enumC1533980q1M = requestParams.resourceScene;
            if ((enumC1533980q1M == EnumC1533980q1M.WEB_CHILD_RESOURCE || enumC1533980q1M == EnumC1533980q1M.WEB_MAIN_DOCUMENT) && ForestExperiment.INSTANCE.getEnableParallelLoadingInH5()) {
                requestParams.parallelLoading = true;
                requestParams.loadToMemory = false;
            }
            requestParams.isPreload = true;
            C1534570q2J c1534570q2J = new C1534570q2J(str, requestParams.resourceScene, this, function1);
            LIZLLL.put(str, c1534570q2J);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("start preload, url:");
            sbLIZ2.append(str);
            C1534250q1n.LJII("PreLoader", C2188811AlT.LIZIZ(sbLIZ2), false);
            if (z) {
                C1533910q1F c1533910q1FCreateSyncRequest = forest.createSyncRequest(str, requestParams);
                if (c1533910q1FCreateSyncRequest == null || (c1533790q13 = c1533910q1FCreateSyncRequest.LIZIZ()) == null) {
                    c1533790q13 = new C1533790q13(new C1533490q0Z(forest, requestParams, str, false));
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("preload finished, url:");
                sbLIZ3.append(str);
                C1534250q1n.LJII("PreLoader", C2188811AlT.LIZIZ(sbLIZ3), false);
                c1534570q2J.LIZ(c1533790q13);
                return;
            }
            forest.fetchResourceAsync(str, requestParams, c1534570q2J);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            for (int i3 = 0; i3 < readHoldCount; i3++) {
                lock.lock();
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final void LJ(Forest forest, C1533140q00 c1533140q00, EnumC1533980q1M enumC1533980q1M, String str, String str2, String str3) {
        boolean z;
        String str4 = c1533140q00.LIZ;
        RequestParams requestParams = new RequestParams(enumC1533980q1M);
        boolean z2 = c1533140q00.LIZIZ;
        boolean z3 = true;
        if (z2 && enumC1533980q1M != EnumC1533980q1M.LYNX_IMAGE) {
            z = true;
        } else {
            z = false;
        }
        requestParams.loadToMemory = z;
        requestParams.needLocalFile = Boolean.FALSE;
        requestParams.enableMemoryCache = Boolean.valueOf(z2);
        if (!c1533140q00.LIZJ && enumC1533980q1M != EnumC1533980q1M.LYNX_IMAGE) {
            z3 = false;
        }
        requestParams.disableCdn = z3;
        if (str != null) {
            requestParams.groupId = str;
        }
        Map<String, ? extends Object> map = c1533140q00.LIZLLL;
        if (map != null) {
            requestParams.customParams.putAll(map);
        }
        requestParams.sessionId = str2;
        requestParams.source = str3;
        LJFF(forest, str4, requestParams, false, null);
    }
}
