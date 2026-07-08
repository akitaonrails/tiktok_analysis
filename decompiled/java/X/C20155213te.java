package X;

import Y.AComparatorS49S0000000_30;
import android.util.LruCache;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.13te, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20155213te {
    public static final LruCache<String, Boolean> LIZ;
    public static final C20154813ta LIZIZ;
    public static final AComparatorS49S0000000_30 LIZJ;
    public static final ConcurrentHashMap<String, TreeSet<C20155613ti>> LIZLLL;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.13ta] */
    static {
        final LruCache<String, Boolean> lruCache = new LruCache<>(LSPassThroughRecordSizeConfig.DEFAULT);
        if (C1773900wGK.LIZIZ()) {
            C687360Qxi.LIZ(new InterfaceC687370Qxj() { // from class: X.13tf
                @Override // X.InterfaceC687370Qxj
                public final void onLowMemory() {
                    lruCache.trimToSize(400);
                }
            });
        }
        LIZ = lruCache;
        final ?? r1 = new LruCache<String, C20155613ti>() { // from class: X.13ta
            /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {all -> 0x0023, blocks: (B:7:0x000c, B:9:0x0016, B:11:0x001f), top: B:18:0x000c }] */
            @Override // android.util.LruCache
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void entryRemoved(boolean r4, java.lang.String r5, X.C20155613ti r6, X.C20155613ti r7) {
                /*
                    r3 = this;
                    X.13ti r6 = (X.C20155613ti) r6
                    super.entryRemoved(r4, r5, r6, r7)
                    if (r4 == 0) goto L2a
                    if (r6 == 0) goto L2a
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.TreeSet<X.13ti>> r2 = X.C20155213te.LIZLLL
                    monitor-enter(r2)
                    java.lang.String r1 = r6.LIZIZ     // Catch: java.lang.Throwable -> L23
                    java.lang.Object r0 = r2.get(r1)     // Catch: java.lang.Throwable -> L23
                    java.util.TreeSet r0 = (java.util.TreeSet) r0     // Catch: java.lang.Throwable -> L23
                    if (r0 == 0) goto L1f
                    r0.remove(r6)     // Catch: java.lang.Throwable -> L23
                    int r0 = r0.size()     // Catch: java.lang.Throwable -> L23
                    if (r0 != 0) goto L29
                L1f:
                    r2.remove(r1)     // Catch: java.lang.Throwable -> L23
                    goto L29
                L23:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L23
                    monitor-exit(r2)
                    throw r0
                L29:
                    monitor-exit(r2)
                L2a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20154813ta.entryRemoved(boolean, java.lang.Object, java.lang.Object, java.lang.Object):void");
            }
        };
        if (C1773900wGK.LIZIZ()) {
            C687360Qxi.LIZ(new InterfaceC687370Qxj() { // from class: X.13tg
                @Override // X.InterfaceC687370Qxj
                public final void onLowMemory() {
                    trimToSize(400);
                }
            });
        }
        LIZIZ = r1;
        LIZJ = new AComparatorS49S0000000_30(12);
        LIZLLL = new ConcurrentHashMap<>();
    }

    public static boolean LIZ(String str) {
        if (LIZ.get(str) == null) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(String str) {
        LIZ.put(str, Boolean.TRUE);
    }
}
