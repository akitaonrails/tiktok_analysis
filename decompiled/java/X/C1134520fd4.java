package X;

import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveRevenueRelationRoseTaskSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0fd4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134520fd4 implements C0IL4 {
    public static final C1134520fd4 LIZ = new C1134520fd4();
    public static final long LIZIZ;
    public static final long LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static long LJFF;
    public static final ConcurrentHashMap<Long, Boolean> LJI;
    public static final ConcurrentHashMap<Long, Boolean> LJII;
    public static final ConcurrentHashMap<Long, Long> LJIIIIZZ;
    public static final ConcurrentHashMap<Long, Long> LJIIIZ;
    public static final ConcurrentHashMap<Long, Long> LJIIJ;
    public static final ConcurrentHashMap<Long, Long> LJIIJJI;
    public static final ConcurrentHashMap<Long, Boolean> LJIIL;
    public static final BPEAHandler LJIILIIL;
    public static AnonymousClass0996 LJIILJJIL;
    public static C0IN1 LJIILL;
    public static boolean LJIILLIIL;

    static {
        LiveRevenueRelationRoseTaskSetting liveRevenueRelationRoseTaskSetting = LiveRevenueRelationRoseTaskSetting.INSTANCE;
        Long lEnableCheckDuration = liveRevenueRelationRoseTaskSetting.enableCheckDuration();
        LIZIZ = lEnableCheckDuration != null ? lEnableCheckDuration.longValue() : 180L;
        Long lCompletedCheckPeriod = liveRevenueRelationRoseTaskSetting.completedCheckPeriod();
        LIZJ = lCompletedCheckPeriod != null ? lCompletedCheckPeriod.longValue() : 30L;
        LJI = new ConcurrentHashMap<>();
        LJII = new ConcurrentHashMap<>();
        ConcurrentHashMap<Long, Long> concurrentHashMap = new ConcurrentHashMap<>();
        LJIIIIZZ = concurrentHashMap;
        ConcurrentHashMap<Long, Long> concurrentHashMap2 = new ConcurrentHashMap<>();
        LJIIIZ = concurrentHashMap2;
        ConcurrentHashMap<Long, Long> concurrentHashMap3 = new ConcurrentHashMap<>();
        LJIIJ = concurrentHashMap3;
        ConcurrentHashMap<Long, Long> concurrentHashMap4 = new ConcurrentHashMap<>();
        LJIIJJI = concurrentHashMap4;
        ConcurrentHashMap<Long, Boolean> concurrentHashMap5 = new ConcurrentHashMap<>();
        LJIIL = concurrentHashMap5;
        LJIILIIL = new BPEAHandler(Looper.getMainLooper());
        C470360IcU.LIZIZ(new Runnable() { // from class: X.0fdK
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("RelationRoseWatchLiveDurationTracker@94fe.<init>$1");
                try {
                    C1134560fd8 c1134560fd8 = C1134560fd8.LIZ;
                    C1134560fd8.LIZIZ.add(new C1134670fdJ(C1134520fd4.LIZ));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("RelationRoseWatchLiveDurationTracker@94fe.<init>$1");
            }
        }, 0L, TimeUnit.SECONDS);
        long jLIZJ = C158B.LIZJ();
        C0JT7.LIZ.getClass();
        if (jLIZJ > ((Number) C0JT7.LIZ(0L, "day_end_time")).longValue()) {
            concurrentHashMap.clear();
            concurrentHashMap2.clear();
            concurrentHashMap3.clear();
            concurrentHashMap4.clear();
            concurrentHashMap5.clear();
        }
    }

    public static long LJ(Long l) {
        long jElapsedRealtime;
        long jMax = 0;
        if (l == null || l.longValue() == 0) {
            return 0L;
        }
        ConcurrentHashMap<Long, Long> concurrentHashMap = LJIIJJI;
        if (concurrentHashMap.get(l) == null) {
            concurrentHashMap.put(l, Long.valueOf(SystemClock.elapsedRealtime()));
        }
        Long l2 = LJIIJ.get(l);
        if (l2 != null) {
            jMax = l2.longValue();
        }
        Long l3 = concurrentHashMap.get(l);
        if (l3 != null) {
            jElapsedRealtime = l3.longValue();
        } else {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        Boolean bool = LJI.get(l);
        if (bool != null && bool.booleanValue()) {
            jMax = Math.max(jMax, SystemClock.elapsedRealtime() - jElapsedRealtime);
        }
        return jMax / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public static void LJFF(Long l) {
        boolean z;
        long jLongValue;
        long jLongValue2;
        long jElapsedRealtime;
        boolean zBooleanValue;
        long jElapsedRealtime2;
        Boolean bool;
        if (l != null) {
            long jLongValue3 = 0;
            if (l.longValue() != 0) {
                LJFF = l.longValue();
                boolean z2 = true;
                if (LJ && LIZLLL) {
                    z = true;
                } else {
                    z = false;
                }
                ConcurrentHashMap<Long, Long> concurrentHashMap = LJIIIIZZ;
                Long l2 = concurrentHashMap.get(l);
                if (l2 != null) {
                    jLongValue = l2.longValue();
                } else {
                    jLongValue = 0;
                }
                if (z) {
                    if (jLongValue == 0) {
                        concurrentHashMap.put(l, Long.valueOf(SystemClock.elapsedRealtime()));
                    }
                } else if (jLongValue != 0) {
                    if (l.longValue() != 0) {
                        ConcurrentHashMap<Long, Long> concurrentHashMap2 = LJIIIZ;
                        Long l3 = concurrentHashMap2.get(l);
                        if (l3 != null) {
                            jLongValue2 = l3.longValue();
                        } else {
                            jLongValue2 = 0;
                        }
                        Long l4 = concurrentHashMap.get(l);
                        if (l4 != null) {
                            jElapsedRealtime = l4.longValue();
                        } else {
                            jElapsedRealtime = SystemClock.elapsedRealtime();
                        }
                        concurrentHashMap2.put(l, Long.valueOf(Math.max(SystemClock.elapsedRealtime() - jElapsedRealtime, jLongValue2)));
                    }
                    concurrentHashMap.put(l, 0L);
                }
                ConcurrentHashMap<Long, Boolean> concurrentHashMap3 = LJI;
                Boolean bool2 = concurrentHashMap3.get(l);
                if (bool2 != null) {
                    zBooleanValue = bool2.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (!LJ || (bool = LJII.get(l)) == null || !bool.booleanValue()) {
                    z2 = false;
                }
                concurrentHashMap3.put(l, Boolean.valueOf(z2));
                if (z2) {
                    if (!zBooleanValue) {
                        LJIIJJI.put(l, Long.valueOf(SystemClock.elapsedRealtime()));
                    }
                } else {
                    if (!zBooleanValue) {
                        return;
                    }
                    ConcurrentHashMap<Long, Long> concurrentHashMap4 = LJIIJ;
                    Long l5 = concurrentHashMap4.get(l);
                    if (l5 != null) {
                        jLongValue3 = l5.longValue();
                    }
                    ConcurrentHashMap<Long, Long> concurrentHashMap5 = LJIIJJI;
                    Long l6 = concurrentHashMap5.get(l);
                    if (l6 != null) {
                        jElapsedRealtime2 = l6.longValue();
                    } else {
                        jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    }
                    concurrentHashMap4.put(l, Long.valueOf(Math.max(SystemClock.elapsedRealtime() - jElapsedRealtime2, jLongValue3)));
                    concurrentHashMap5.remove(l);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    @Override // X.C0IL4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.android.livesdkapi.depend.model.live.Room r5) {
        /*
            r4 = this;
            r3 = 0
            X.C1134520fd4.LIZLLL = r3
            if (r5 == 0) goto L4d
            X.1DgM r0 = r5.author()
            if (r0 == 0) goto L22
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = r0.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.Boolean> r1 = X.C1134520fd4.LJII
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.put(r2, r0)
        L22:
            X.1DgM r0 = r5.author()
            if (r0 == 0) goto L4d
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L30:
            LJFF(r0)
            X.0996 r1 = X.C1134520fd4.LJIILJJIL
            if (r1 == 0) goto L3c
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = X.C1134520fd4.LJIILIIL
            r0.removeCallbacks(r1)
        L3c:
            X.C1134520fd4.LJIILLIIL = r3
            X.0IN1 r1 = X.C1134520fd4.LJIILL
            if (r1 == 0) goto L47
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = X.C1134520fd4.LJIILIIL
            r0.removeCallbacks(r1)
        L47:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.Boolean> r0 = X.C1134520fd4.LJIIL
            r0.clear()
            return
        L4d:
            r0 = 0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1134520fd4.LIZ(com.bytedance.android.livesdkapi.depend.model.live.Room):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    @Override // X.C0IL4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.bytedance.android.livesdkapi.depend.model.live.Room r4) {
        /*
            r3 = this;
            r0 = 0
            X.C1134520fd4.LIZLLL = r0
            if (r4 == 0) goto L34
            X.1DgM r0 = r4.author()
            if (r0 == 0) goto L22
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = r0.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.Boolean> r1 = X.C1134520fd4.LJII
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.put(r2, r0)
        L22:
            X.1DgM r0 = r4.author()
            if (r0 == 0) goto L34
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L30:
            LJFF(r0)
            return
        L34:
            r0 = 0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1134520fd4.LIZIZ(com.bytedance.android.livesdkapi.depend.model.live.Room):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    @Override // X.C0IL4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.bytedance.android.livesdkapi.depend.model.live.Room r4) {
        /*
            r3 = this;
            r0 = 1
            X.C1134520fd4.LIZLLL = r0
            if (r4 == 0) goto L34
            X.1DgM r0 = r4.author()
            if (r0 == 0) goto L22
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = r0.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.Boolean> r1 = X.C1134520fd4.LJII
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.put(r2, r0)
        L22:
            X.1DgM r0 = r4.author()
            if (r0 == 0) goto L34
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L30:
            LJFF(r0)
            return
        L34:
            r0 = 0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1134520fd4.LIZJ(com.bytedance.android.livesdkapi.depend.model.live.Room):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    @Override // X.C0IL4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.bytedance.android.livesdkapi.depend.model.live.Room r4) {
        /*
            r3 = this;
            r0 = 1
            X.C1134520fd4.LIZLLL = r0
            if (r4 == 0) goto L34
            X.1DgM r0 = r4.author()
            if (r0 == 0) goto L22
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = r0.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.Boolean> r1 = X.C1134520fd4.LJII
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.put(r2, r0)
        L22:
            X.1DgM r0 = r4.author()
            if (r0 == 0) goto L34
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L30:
            LJFF(r0)
            return
        L34:
            r0 = 0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1134520fd4.LIZLLL(com.bytedance.android.livesdkapi.depend.model.live.Room):void");
    }
}
