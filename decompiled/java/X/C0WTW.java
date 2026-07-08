package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveThreadPoolOptSetting;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0WTW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WTW implements InterfaceC479850Irn {
    public static final C0WTW LIZ;
    public static final C01GW LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static final C01GW LJ;
    public static final C01GW LJFF;
    public static final C01GW LJI;
    public static final C01GW LJII;
    public static final C01GW LJIIIIZZ;
    public static final C01GW LJIIIZ;
    public static final C01GW LJIIJ;
    public static final Map<String, C0WPX> LJIIJJI;
    public static final C01GW LJIIL;
    public static final C0WTS LJIILIIL;
    public static volatile boolean LJIILJJIL;

    @Override // X.InterfaceC479850Irn
    public final void LIZ() {
        LIZLLL = true;
    }

    @Override // X.InterfaceC479850Irn
    public final void LIZLLL() {
        LIZLLL = false;
    }

    static {
        C0WTW c0wtw = new C0WTW();
        LIZ = c0wtw;
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        LIZIZ = C452501pT.LIZ(enumC452301pR, AFwS200S0000000_13.get$arr$(339));
        C479860Iro.LIZ.addIfAbsent(c0wtw);
        Runtime.getRuntime().availableProcessors();
        LJ = C452501pT.LIZ(enumC452301pR, AFwS200S0000000_13.get$arr$(333));
        LJFF = C452501pT.LIZ(enumC452301pR, AFwS200S0000000_13.get$arr$(335));
        LJI = C452501pT.LIZ(enumC452301pR, AFwS200S0000000_13.get$arr$(332));
        LJII = C452501pT.LIZ(enumC452301pR, AFwS200S0000000_13.get$arr$(334));
        LJIIIIZZ = C452501pT.LIZ(enumC452301pR, AFwS200S0000000_13.get$arr$(338));
        LJIIIZ = C452501pT.LIZ(enumC452301pR, AFwS200S0000000_13.get$arr$(337));
        LJIIJ = C452501pT.LIZ(enumC452301pR, AFwS200S0000000_13.get$arr$(336));
        LJIIJJI = new LinkedHashMap();
        LJIIL = C452501pT.LIZ(enumC452301pR, AFwS189S0000000_3.get$arr$(1600));
        LJIILIIL = C0WTS.LL;
    }

    public static final void LJFF() {
        C0WTW c0wtw = LIZ;
        ExecutorService executorService = ((C0WTO) LJ.getValue()).LL;
        C0WPA c0wpa = executorService instanceof C0WPA ? (C0WPA) executorService : null;
        c0wtw.getClass();
        LJ(c0wpa, LJIIIZ().defaultPoolMinCoreSize, LJIIIZ().defaultPoolMinMaxSize, LJIIIZ().defaultPoolMaxMaxSize, new C0WTX(c0wtw), new C0WTY(c0wtw));
        ExecutorService executorService2 = LJIIIIZZ().LL;
        LJ(executorService2 instanceof C0WPA ? (C0WPA) executorService2 : null, LJIIIZ().ioPoolMinCoreSize, LJIIIZ().ioPoolMinMaxSize, LJIIIZ().ioPoolMaxMaxSize, new C0WTZ(c0wtw), new C823720WTa(c0wtw));
    }

    public static final C0WTO LJIIIIZZ() {
        return (C0WTO) LJFF.getValue();
    }

    public static LiveThreadPoolOptSetting.ThreadPoolOptConfig LJIIIZ() {
        return (LiveThreadPoolOptSetting.ThreadPoolOptConfig) LIZIZ.getValue();
    }

    public static PriorityBlockingQueue LJII(final int i) {
        if (LJIIIZ().enableThreadPoolCrashFix) {
            final C0WTS c0wts = LJIILIIL;
            return new PriorityBlockingQueue<Runnable>(i, c0wts) { // from class: X.0WTl
                public final /* synthetic */ int LL;

                public /* bridge */ int getSize() {
                    return super.size();
                }

                @Override // java.util.concurrent.PriorityBlockingQueue, java.util.AbstractCollection, java.util.Collection
                public final /* bridge */ int size() {
                    return getSize();
                }

                @Override // java.util.concurrent.PriorityBlockingQueue, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
                public final /* bridge */ boolean contains(Object obj) {
                    if (obj != null && !(obj instanceof Runnable)) {
                        return false;
                    }
                    return contains((Runnable) obj);
                }

                @Override // java.util.concurrent.PriorityBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                public boolean offer(Runnable runnable) {
                    if (size() < this.LL) {
                        return super.offer(runnable);
                    }
                    return false;
                }

                @Override // java.util.concurrent.PriorityBlockingQueue, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
                public final /* bridge */ boolean remove(Object obj) {
                    if (obj != null && !(obj instanceof Runnable)) {
                        return false;
                    }
                    return remove((Runnable) obj);
                }

                public /* bridge */ boolean contains(Runnable runnable) {
                    return super.contains((Object) runnable);
                }

                public /* bridge */ boolean remove(Runnable runnable) {
                    return super.remove((Object) runnable);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(i, c0wts);
                    this.LL = i;
                }
            };
        }
        return new PriorityBlockingQueue<Runnable>(i) { // from class: X.0WTk
            public final /* synthetic */ int LL;

            public /* bridge */ int getSize() {
                return super.size();
            }

            @Override // java.util.concurrent.PriorityBlockingQueue, java.util.AbstractCollection, java.util.Collection
            public final /* bridge */ int size() {
                return getSize();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(i);
                this.LL = i;
            }

            @Override // java.util.concurrent.PriorityBlockingQueue, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
            public final /* bridge */ boolean contains(Object obj) {
                if (obj != null && !(obj instanceof Runnable)) {
                    return false;
                }
                return contains((Runnable) obj);
            }

            @Override // java.util.concurrent.PriorityBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
            public boolean offer(Runnable runnable) {
                if (size() < this.LL) {
                    return super.offer(runnable);
                }
                return false;
            }

            @Override // java.util.concurrent.PriorityBlockingQueue, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
            public final /* bridge */ boolean remove(Object obj) {
                if (obj != null && !(obj instanceof Runnable)) {
                    return false;
                }
                return remove((Runnable) obj);
            }

            public /* bridge */ boolean contains(Runnable runnable) {
                return super.contains((Object) runnable);
            }

            public /* bridge */ boolean remove(Runnable runnable) {
                return super.remove((Object) runnable);
            }
        };
    }

    @Override // X.InterfaceC479850Irn
    public final void LIZIZ(WeakReference<Object> weakReference, EnumC479890Irr enumC479890Irr) {
        LIZJ = false;
        LIZLLL = false;
    }

    @Override // X.InterfaceC479850Irn
    public final void LIZJ(WeakReference<Object> weakReference, EnumC479890Irr enumC479890Irr) {
        if (enumC479890Irr == EnumC479890Irr.BROADCAST && !LJIIIZ().enableInBroadcast) {
            LIZJ = false;
        } else {
            LIZJ = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.C0WPA r13, int r14, int r15, int r16, kotlin.jvm.functions.Function1 r17, kotlin.jvm.functions.Function1 r18) {
        /*
            if (r13 != 0) goto L3
            return
        L3:
            int r8 = r13.getActiveCount()
            java.util.concurrent.BlockingQueue r0 = r13.getQueue()
            int r6 = r0.size()
            int r5 = r13.getCorePoolSize()
            int r4 = r13.getMaximumPoolSize()
            long r9 = java.lang.System.currentTimeMillis()
            java.util.concurrent.BlockingQueue r0 = r13.getQueue()
            java.util.Iterator r7 = r0.iterator()
            r12 = 0
        L25:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r1 = r7.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            boolean r0 = r1 instanceof X.C0WTR
            if (r0 == 0) goto L25
            X.0WTR r1 = (X.C0WTR) r1
            long r0 = r1.LLILZIL
            long r2 = r9 - r0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L25
            r12 = r2
            goto L25
        L41:
            com.bytedance.android.livesdk.livesetting.performance.LiveThreadPoolOptSetting$ThreadPoolOptConfig r10 = LJIIIZ()
            int r3 = r10.highLoadQueueThreshold
            r7 = r18
            if (r6 > r3) goto L51
            long r0 = r10.highLoadLatencyThresholdMs
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L66
        L51:
            if (r8 < r4) goto L66
            int r0 = r10.poolScaleStep
            int r0 = r0 + r4
            r1 = r16
            int r0 = java.lang.Math.min(r0, r1)
            if (r0 <= r4) goto L65
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.invoke(r0)
        L65:
            return
        L66:
            int r0 = r10.mediumLoadQueueMin
            r9 = r17
            if (r6 > r3) goto L80
            if (r0 > r6) goto L80
        L6e:
            if (r8 <= r5) goto L8d
            int r0 = r5 + 1
            int r0 = java.lang.Math.min(r0, r4)
            if (r0 <= r5) goto L65
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.invoke(r0)
            return
        L80:
            long r2 = r10.mediumLoadLatencyMinMs
            long r0 = r10.highLoadLatencyThresholdMs
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 > 0) goto L8d
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 > 0) goto L8d
            goto L6e
        L8d:
            int r0 = r10.lowLoadQueueThreshold
            if (r6 >= r0) goto La9
            long r0 = r10.lowLoadLatencyThresholdMs
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 >= 0) goto La9
            if (r8 >= r5) goto La9
            if (r5 <= r14) goto La9
            r0 = 1
            int r5 = r5 - r0
            int r0 = java.lang.Math.max(r5, r14)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.invoke(r0)
            return
        La9:
            if (r6 != 0) goto L65
            if (r8 != 0) goto L65
            r1 = r15
            if (r4 <= r1) goto L65
            int r0 = r10.poolScaleStep
            int r4 = r4 - r0
            int r0 = java.lang.Math.max(r4, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.invoke(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WTW.LJ(X.0WPA, int, int, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }

    public static C0WPX LJI(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, C086B c086b, C0WTT c0wtt) {
        C0WPX c0wpx = new C0WPX(i, i2, j, timeUnit, blockingQueue, c086b, c0wtt);
        LJIIJJI.put(str, c0wpx);
        return c0wpx;
    }
}
