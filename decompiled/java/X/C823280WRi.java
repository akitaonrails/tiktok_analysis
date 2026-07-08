package X;

import com.bytedance.pumbaa.base2.interfaces.IEventReporter;
import com.bytedance.pumbaa.base2.interfaces.IShouldCacheHandler;
import com.bytedance.pumbaa.impl.tt.TtEventReporter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WRi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823280WRi {
    public static volatile IEventReporter LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile IShouldCacheHandler LIZLLL;
    public static volatile Function0<C823260WRg> LJ;
    public static volatile InterfaceC823270WRh LJIIJJI;
    public static final C823280WRi LIZ = new C823280WRi();
    public static final ReentrantLock LJFF = new ReentrantLock();
    public static final C13E8<C823290WRj> LJI = new C13E8<>();
    public static final Set<InterfaceC1631630sYr<String, JSONObject, JSONObject, JSONObject, Unit>> LJII = new LinkedHashSet();
    public static final ReadWriteLock LJIIIIZZ = new ReentrantReadWriteLock();
    public static final Set<InterfaceC1631620sYq<Throwable, String, Map<String, String>, Unit>> LJIIIZ = new LinkedHashSet();
    public static final ReadWriteLock LJIIJ = new ReentrantReadWriteLock();

    public static C823260WRg LIZ() {
        Function0<C823260WRg> function0 = LJ;
        int i = 0;
        if (function0 == null) {
            return new C823260WRg(i);
        }
        try {
            return function0.invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new C823260WRg(i);
        }
    }

    public static void LJIIIZ() {
        Object c098200Yq;
        if (LIZIZ == null) {
            try {
                LIZIZ = TtEventReporter.LIZJ();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    }

    public static final void LIZLLL(Throwable th) {
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        LIZJ(message, "ensure_not_reach_here", th);
    }

    public static final void LJIIIIZZ(String str, Throwable th) {
        try {
            C189200o6.m2constructorimpl(null);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        LJ(new Throwable(str, th), str, C2097608Jq.LJIIJ(new Pair("pumbaa_exception_type", "crash")));
    }

    public static final void LIZJ(String str, String str2, Throwable th) {
        LJ(new Throwable(str, th), str, C2097608Jq.LJIIJ(new Pair("pumbaa_exception_type", str2)));
    }

    public static final void LJ(Throwable th, String str, Map<String, String> map) {
        if (!map.containsKey("pumbaa_exception_type")) {
            map.put("pumbaa_exception_type", "ensure_not_reach_here");
        }
        LJII(str, th, map);
    }

    public static final void LJII(String str, Throwable th, Map map) throws Throwable {
        boolean z;
        LIZ.getClass();
        LJIIIZ();
        if (!map.containsKey("pumbaa_exception_type")) {
            map.put("pumbaa_exception_type", "other_exception");
            z = false;
        } else {
            z = !Intrinsics.LJFF(map.get("pumbaa_exception_type"), "other_exception");
        }
        map.put("pumbaa_version", "6.22.0.1-bugfix");
        InterfaceC823270WRh interfaceC823270WRh = LJIIJJI;
        if (interfaceC823270WRh != null && interfaceC823270WRh.LIZ(str, map)) {
            return;
        }
        Lock lock = ((ReentrantReadWriteLock) LJIIJ).readLock();
        lock.lock();
        try {
            Iterator<InterfaceC1631620sYq<Throwable, String, Map<String, String>, Unit>> it2 = LJIIIZ.iterator();
            while (it2.hasNext()) {
                it2.next().invoke(th, str, map);
            }
            lock.unlock();
            IEventReporter iEventReporter = LIZIZ;
            if (iEventReporter != null) {
                iEventReporter.LIZ(str, th, map);
            }
            if (z && LIZJ) {
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            lock.unlock();
            throw th2;
        }
    }

    public static void LIZIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        LJIIIZ();
        Lock lock = ((ReentrantReadWriteLock) LJIIIIZZ).readLock();
        lock.lock();
        try {
            Iterator<InterfaceC1631630sYr<String, JSONObject, JSONObject, JSONObject, Unit>> it2 = LJII.iterator();
            while (it2.hasNext()) {
                it2.next().invoke(str, jSONObject, jSONObject2, jSONObject3);
            }
            lock.unlock();
            IEventReporter iEventReporter = LIZIZ;
            if (iEventReporter != null) {
                iEventReporter.reportEvent(str, jSONObject, jSONObject2, jSONObject3);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJI(java.lang.String r8, org.json.JSONObject r9, org.json.JSONObject r10, org.json.JSONObject r11) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C823280WRi.LJI(java.lang.String, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject):void");
    }
}
