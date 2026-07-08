package X;

import com.bytedance.android.starship.strategy.repository.StrategiesData;
import com.bytedance.android.starship.strategy.repository.StrategyModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0k6T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306510k6T {
    public static final C1306510k6T LIZ = new C1306510k6T();
    public static final C2252321DDq LIZIZ = C1BNE.LIZ(EnumC1006310cIH.UNINITIALIZED);

    public static void LIZIZ() {
        StrategiesData strategiesDataLJ;
        if (C1306480k6Q.LIZLLL || (strategiesDataLJ = C1306580k6a.LJ(EnumC1306820k6y.COLD_START, false)) == null) {
            return;
        }
        LIZ.LIZ(strategiesDataLJ);
    }

    public static void LIZJ(EnumC1306820k6y enumC1306820k6y) {
        LIZIZ();
        if (enumC1306820k6y == EnumC1306820k6y.COLD_START) {
            return;
        }
        if (((ConcurrentHashMap) C1306580k6a.LIZIZ.getValue()).containsKey(enumC1306820k6y.getValue()) && Intrinsics.LJFF(((ConcurrentHashMap) C1306580k6a.LIZJ.getValue()).get(enumC1306820k6y.getValue()), Boolean.TRUE)) {
            return;
        }
        StrategiesData strategiesDataLJ = C1306580k6a.LJ(enumC1306820k6y, true);
        LIZ.getClass();
        LIZLLL(strategiesDataLJ);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x001c
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LIZLLL(com.bytedance.android.starship.strategy.repository.StrategiesData r4) {
        /*
            if (r4 != 0) goto L3
            return
        L3:
            X.0k7W r3 = r4.tracer
            r2 = 0
            X.0k6Q r0 = X.C1306480k6Q.LIZ     // Catch: java.lang.Throwable -> L14
            r0.LIZLLL(r4)     // Catch: java.lang.Throwable -> L14
            if (r3 == 0) goto L10
            r3.release()     // Catch: java.lang.Throwable -> L14
        L10:
            X.C1306420k6K.LIZ(r3, r2)
            return
        L14:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L19
        L19:
            r0 = move-exception
            r2 = r1
            goto L1d
        L1c:
            r0 = move-exception
        L1d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L1c
            X.C1306420k6K.LIZ(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1306510k6T.LIZLLL(com.bytedance.android.starship.strategy.repository.StrategiesData):void");
    }

    public final synchronized void LIZ(StrategiesData strategiesData) {
        try {
        } finally {
        }
        if (((Boolean) C1309360kB4.LIZJ.getValue()).booleanValue()) {
            return;
        }
        if (C1306480k6Q.LIZLLL) {
            return;
        }
        Map<String, StrategyModel> map = strategiesData.strategies;
        if (map != null && !map.isEmpty()) {
            C1306480k6Q.LIZJ(strategiesData);
            C1DFH c1dfh = C0PEM.LIZ;
            Object c098200Yq = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1006300cIG(this, null), 3);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1306580k6a.LIZ(thM5exceptionOrNullimpl);
            }
        }
    }
}
