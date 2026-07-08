package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.hybridkit.ssc.model.SSCPageConfig;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS247S0000000_13;

/* JADX INFO: renamed from: X.0Vkx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C806850Vkx {
    public static final C806850Vkx LIZ = new C806850Vkx();
    public static final ConcurrentHashMap<String, SSCPageConfig> LIZIZ = new ConcurrentHashMap<>();
    public static final CopyOnWriteArrayList<Function1<Boolean, Unit>> LIZJ = new CopyOnWriteArrayList<>();
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static volatile long LJFF;
    public static volatile boolean LJI;
    public static volatile int LJII;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:32:0x00a9
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static boolean LIZIZ() {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C806850Vkx.LIZIZ():boolean");
    }

    public static void LIZLLL() {
        if (LIZLLL || LJ || System.currentTimeMillis() - LJFF < 30000) {
            return;
        }
        LJII++;
        LIZ(AFwS247S0000000_13.get$arr$(53));
    }

    public static void LIZ(Function1 function1) {
        if (LIZLLL) {
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
                return;
            }
            return;
        }
        if (function1 != null) {
            LIZJ.add(function1);
        }
        if (LJ) {
            return;
        }
        LJ = true;
        LJI = true;
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0Vky
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SSCConfigLoader@e276.loadConfigAsync$1");
                try {
                    try {
                        C806850Vkx c806850Vkx = C806850Vkx.LIZ;
                        C806850Vkx.LJFF = System.currentTimeMillis();
                        C806850Vkx.LIZ.getClass();
                        boolean zLIZIZ = C806850Vkx.LIZIZ();
                        C806850Vkx.LJ = false;
                        C806850Vkx.LIZJ(zLIZIZ);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C806850Vkx c806850Vkx2 = C806850Vkx.LIZ;
                        C806850Vkx.LJ = false;
                        C806850Vkx.LIZ.getClass();
                        C806850Vkx.LIZJ(false);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SSCConfigLoader@e276.loadConfigAsync$1");
            }
        });
    }

    public static void LIZJ(boolean z) {
        Iterator<Function1<Boolean, Unit>> it2 = LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Boolean.valueOf(z));
        }
        LIZJ.clear();
    }
}
