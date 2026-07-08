package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS48S0001000_3;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665240Q7m {
    public static C665320Q7u LIZIZ;
    public static final ReentrantLock LIZ = new ReentrantLock();
    public static final ConcurrentHashMap<Integer, C665320Q7u> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<C665320Q7u, CopyOnWriteArrayList<C0QW5<?>>> LIZLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<C0QW5<?>, InterfaceC1555100qZQ<?>> LJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<InterfaceC665370Q7z, C665320Q7u> LJFF = new ConcurrentHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #0 {all -> 0x00b2, blocks: (B:3:0x0007, B:5:0x0028, B:7:0x002d, B:12:0x0040, B:13:0x0047, B:15:0x005b, B:18:0x0073, B:20:0x008d, B:21:0x008f, B:8:0x0034, B:10:0x0038, B:22:0x00a5), top: B:29:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073 A[Catch: all -> 0x00b2, TRY_ENTER, TryCatch #0 {all -> 0x00b2, blocks: (B:3:0x0007, B:5:0x0028, B:7:0x002d, B:12:0x0040, B:13:0x0047, B:15:0x005b, B:18:0x0073, B:20:0x008d, B:21:0x008f, B:8:0x0034, B:10:0x0038, B:22:0x00a5), top: B:29:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C665320Q7u LIZ(androidx.lifecycle.LifecycleOwner r11) {
        /*
            java.lang.String r7 = "vprovider_vscope"
            java.util.concurrent.locks.ReentrantLock r10 = X.C665240Q7m.LIZ
            r10.lock()
            int r8 = r11.hashCode()     // Catch: java.lang.Throwable -> Lb2
            kotlin.jvm.internal.AwS150S0101000_10 r1 = new kotlin.jvm.internal.AwS150S0101000_10     // Catch: java.lang.Throwable -> Lb2
            r0 = 0
            r1.<init>(r8, r11, r0)     // Catch: java.lang.Throwable -> Lb2
            X.C1557550qdN.LIZ(r7, r1)     // Catch: java.lang.Throwable -> Lb2
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, X.0Q7u> r6 = X.C665240Q7m.LIZJ     // Catch: java.lang.Throwable -> Lb2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r9 = r6.get(r0)     // Catch: java.lang.Throwable -> Lb2
            X.0Q7u r9 = (X.C665320Q7u) r9     // Catch: java.lang.Throwable -> Lb2
            kotlin.jvm.internal.AwS118S0101000_10 r4 = new kotlin.jvm.internal.AwS118S0101000_10     // Catch: java.lang.Throwable -> Lb2
            r0 = 0
            r4.<init>(r8, r11, r0)     // Catch: java.lang.Throwable -> Lb2
            if (r9 != 0) goto La5
            boolean r0 = r11 instanceof X.C19EG     // Catch: java.lang.Throwable -> Lb2
            r1 = 0
            if (r0 == 0) goto L34
            X.19EG r11 = (X.C19EG) r11     // Catch: java.lang.Throwable -> Lb2
            X.0Q7z r5 = X.C1558360qeg.LJI(r11, r1)     // Catch: java.lang.Throwable -> Lb2
            goto L3e
        L34:
            boolean r0 = r11 instanceof androidx.fragment.app.Fragment     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L40
            androidx.fragment.app.Fragment r11 = (androidx.fragment.app.Fragment) r11     // Catch: java.lang.Throwable -> Lb2
            X.0Q7z r5 = X.C1558360qeg.LJFF(r11, r1)     // Catch: java.lang.Throwable -> Lb2
        L3e:
            if (r5 != 0) goto L47
        L40:
            X.0qYn r5 = new X.0qYn     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = "tracker_key"
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Lb2
        L47:
            kotlin.jvm.internal.AwS554S0100000_10 r1 = new kotlin.jvm.internal.AwS554S0100000_10     // Catch: java.lang.Throwable -> Lb2
            r0 = 16
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> Lb2
            X.C1557550qdN.LIZ(r7, r1)     // Catch: java.lang.Throwable -> Lb2
            java.util.concurrent.ConcurrentHashMap<X.0Q7z, X.0Q7u> r3 = X.C665240Q7m.LJFF     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r2 = r3.get(r5)     // Catch: java.lang.Throwable -> Lb2
            X.0Q7u r2 = (X.C665320Q7u) r2     // Catch: java.lang.Throwable -> Lb2
            if (r2 == 0) goto L73
            kotlin.jvm.internal.AwS554S0100000_10 r1 = new kotlin.jvm.internal.AwS554S0100000_10     // Catch: java.lang.Throwable -> Lb2
            r0 = 17
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> Lb2
            X.C1557550qdN.LIZ(r7, r1)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lb2
            r6.put(r0, r2)     // Catch: java.lang.Throwable -> Lb2
            r4.invoke(r2)     // Catch: java.lang.Throwable -> Lb2
            r10.unlock()
            return r2
        L73:
            kotlin.jvm.internal.AwS554S0100000_10 r1 = new kotlin.jvm.internal.AwS554S0100000_10     // Catch: java.lang.Throwable -> Lb2
            r0 = 18
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> Lb2
            X.C1557550qdN.LIZ(r7, r1)     // Catch: java.lang.Throwable -> Lb2
            X.0Q7u r9 = new X.0Q7u     // Catch: java.lang.Throwable -> Lb2
            r9.<init>(r5)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lb2
            r6.put(r0, r9)     // Catch: java.lang.Throwable -> Lb2
            X.0Q7u r2 = X.C665240Q7m.LIZIZ     // Catch: java.lang.Throwable -> Lb2
            if (r2 != 0) goto L8f
            X.0Q7w r2 = X.C665340Q7w.LJ     // Catch: java.lang.Throwable -> Lb2
        L8f:
            X.0qZ5 r1 = r5.getTree()     // Catch: java.lang.Throwable -> Lb2
            X.0Q7z r0 = r2.LIZ     // Catch: java.lang.Throwable -> Lb2
            r1.LIZJ(r0)     // Catch: java.lang.Throwable -> Lb2
            r2.LIZJ = r9     // Catch: java.lang.Throwable -> Lb2
            r9.LIZIZ = r2     // Catch: java.lang.Throwable -> Lb2
            X.C665240Q7m.LIZIZ = r9     // Catch: java.lang.Throwable -> Lb2
            r3.put(r5, r9)     // Catch: java.lang.Throwable -> Lb2
            r4.invoke(r9)     // Catch: java.lang.Throwable -> Lb2
            goto Lae
        La5:
            r0 = 36
            kotlin.jvm.internal.AFwS196S0000000_10 r0 = kotlin.jvm.internal.AFwS196S0000000_10.get$arr$(r0)     // Catch: java.lang.Throwable -> Lb2
            X.C1557550qdN.LIZ(r7, r0)     // Catch: java.lang.Throwable -> Lb2
        Lae:
            r10.unlock()
            return r9
        Lb2:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lb2
            r10.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C665240Q7m.LIZ(androidx.lifecycle.LifecycleOwner):X.0Q7u");
    }

    public static C0QW5 LIZJ(Class cls) {
        C665320Q7u c665320Q7u;
        C0QW5<?> c0qw5;
        C651990Phl c651990Phl = C651990Phl.LL;
        if (Intrinsics.LJFF(c651990Phl, c651990Phl)) {
            c665320Q7u = LIZIZ;
        } else {
            c665320Q7u = LIZJ.get(Integer.valueOf(c651990Phl.hashCode()));
        }
        if (c665320Q7u == null) {
            c665320Q7u = C665340Q7w.LJ;
        }
        InterfaceC1555100qZQ<?> interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(c665320Q7u.LIZ, null, cls, null);
        if (interfaceC1555100qZQLIZIZ == null || (c0qw5 = (C0QW5) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        ConcurrentHashMap<C665320Q7u, CopyOnWriteArrayList<C0QW5<?>>> concurrentHashMap = LIZLLL;
        CopyOnWriteArrayList<C0QW5<?>> copyOnWriteArrayList = concurrentHashMap.get(c665320Q7u);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            concurrentHashMap.put(c665320Q7u, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(c0qw5);
        LJ.put(c0qw5, interfaceC1555100qZQLIZIZ);
        return c0qw5;
    }

    public static void LIZIZ(C665320Q7u c665320Q7u, int i) {
        ReentrantLock reentrantLock = LIZ;
        reentrantLock.lock();
        try {
            if (c665320Q7u.LIZLLL) {
                reentrantLock.unlock();
                return;
            }
            c665320Q7u.LIZLLL = true;
            C665320Q7u c665320Q7u2 = c665320Q7u.LIZIZ;
            if (c665320Q7u2 == null) {
                c665320Q7u2 = C665340Q7w.LJ;
            }
            C665320Q7u c665320Q7u3 = c665320Q7u.LIZJ;
            c665320Q7u2.LIZJ = c665320Q7u3;
            if (c665320Q7u3 != null) {
                c665320Q7u3.LIZIZ = c665320Q7u2;
            }
            c665320Q7u.LIZ.getTree().LJFF();
            if (Intrinsics.LJFF(c665320Q7u, LIZIZ)) {
                LIZIZ = c665320Q7u2;
            }
            LIZJ.remove(Integer.valueOf(i));
            CopyOnWriteArrayList<C0QW5<?>> copyOnWriteArrayListRemove = LIZLLL.remove(c665320Q7u);
            if (copyOnWriteArrayListRemove != null) {
                Iterator<C0QW5<?>> it2 = copyOnWriteArrayListRemove.iterator();
                while (it2.hasNext()) {
                    LJ.remove(it2.next());
                }
            }
            LJFF.remove(c665320Q7u.LIZ);
            C1557550qdN.LIZ("vprovider_vscope", new AwS48S0001000_3(i, 0));
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public static void LIZLLL(LifecycleOwner lifecycleOwner, Class cls, Function1 function1) {
        C665320Q7u c665320Q7u;
        if (Intrinsics.LJFF(lifecycleOwner, C651990Phl.LL)) {
            c665320Q7u = LIZIZ;
        } else {
            c665320Q7u = LIZJ.get(Integer.valueOf(lifecycleOwner.hashCode()));
        }
        if (c665320Q7u == null) {
            c665320Q7u = C665340Q7w.LJ;
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(c665320Q7u.LIZ, null, cls, null);
        if (interfaceC1555100qZQLIZIZ != null && interfaceC1555100qZQLIZIZ.getSource() != null) {
            interfaceC1555100qZQLIZIZ.LIZIZ(new AwS589S0100000_10(function1, (Function1<? super h, Unit>) 575));
        }
    }
}
