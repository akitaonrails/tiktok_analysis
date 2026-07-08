package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.bytex.pthread.base.BuildConfig;
import com.tiktok.myna.render.base.IMynaGlobalService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS53S1000000_2;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0gVV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1168270gVV {
    public static volatile boolean LIZIZ;
    public static InterfaceC1168280gVW LIZJ;
    public static final C1168270gVV LIZ = new C1168270gVV();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1163200gNK());
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(713));
    public static final C01GW LJFF = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C2192151Aqr());
    public static final C01GW LJI = C452501pT.LIZIZ(new C1168300gVY());
    public static final C01GW LJII = C452501pT.LIZIZ(new C1301710jyj());
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C1163050gN5());
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(715));
    public static final C01GW LJIIJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(716));
    public static final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(714));
    public static final C01GW LJIIL = C452501pT.LIZIZ(new C1168290gVX());

    public static ExecutorService LIZLLL() {
        return (ExecutorService) LJI.getValue();
    }

    public static boolean LJ() {
        return ((Boolean) LJIIIIZZ.getValue()).booleanValue();
    }

    public static boolean LJFF() {
        return ((Boolean) LJIIIZ.getValue()).booleanValue();
    }

    public static boolean LJI() {
        return ((Boolean) LJIIJ.getValue()).booleanValue();
    }

    public static ConcurrentHashMap LJIIIIZZ() {
        return (ConcurrentHashMap) LIZLLL.getValue();
    }

    public static ConcurrentHashMap LJIIIZ() {
        return (ConcurrentHashMap) LJ.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [T, java.lang.String] */
    public final void LIZJ() {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        String message;
        String message2;
        if (LIZIZ) {
            return;
        }
        synchronized (this) {
            try {
                if (LIZIZ) {
                    return;
                }
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = "";
                LIZ.getClass();
                InterfaceC1168280gVW interfaceC1168280gVW = LIZJ;
                Throwable th = null;
                Context contextLJFF = interfaceC1168280gVW != null ? interfaceC1168280gVW.LJFF() : null;
                try {
                    C2167708eR.LIZLLL(contextLJFF);
                    c098200Yq = 0;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    try {
                        C2167708eR.LIZLLL(contextLJFF);
                        c098200Yq2 = 1;
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        c098200Yq2 = new C098200Yq(th3);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
                        try {
                            C2167708eR.LIZLLL(null);
                            c098200Yq3 = 2;
                            C189200o6.m2constructorimpl(c098200Yq3);
                        } catch (Throwable th4) {
                            TryCatchGuardChecker.doCheck(th4);
                            c098200Yq3 = new C098200Yq(th4);
                            C189200o6.m2constructorimpl(c098200Yq3);
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq3);
                        if (thM5exceptionOrNullimpl != null) {
                            c098200Yq3 = 3;
                            th = thM5exceptionOrNullimpl;
                        }
                        c098200Yq2 = Integer.valueOf(((Number) c098200Yq3).intValue());
                    }
                    c098200Yq = Integer.valueOf(((Number) c098200Yq2).intValue());
                }
                int iIntValue = ((Number) c098200Yq).intValue();
                if (iIntValue == 0) {
                    LIZIZ = true;
                    c259800zU.element = "SoLoader initialized successfully";
                } else if (iIntValue == 1) {
                    LIZIZ = true;
                    c259800zU.element = "SoLoader initialized after retry";
                } else if (iIntValue == 2) {
                    LIZIZ = true;
                    c259800zU.element = "SoLoader initialized with null context";
                } else if (iIntValue == 3) {
                    if ((th instanceof IllegalStateException) && (message2 = ((IllegalStateException) th).getMessage()) != null && a0.LJJIIZI(message2, "already been called", true)) {
                        LIZIZ = true;
                        c259800zU.element = "SoLoader already initialized";
                    } else {
                        if (th == null || (message = th.getMessage()) == null) {
                            message = "unknown";
                        }
                        c259800zU.element = "SoLoader initialized failed: ".concat(message);
                    }
                }
                C1168400gVi.LIZIZ(new AwS597S0100000_18(c259800zU, (C259800zU<List<Aweme>>) 898));
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                throw th5;
            }
        }
    }

    public static boolean LIZ(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        InterfaceC1168280gVW interfaceC1168280gVW = LIZJ;
        if (interfaceC1168280gVW != null && interfaceC1168280gVW.LJII()) {
            z = true;
        } else {
            z = false;
        }
        C1162950gMv c1162950gMv = (C1162950gMv) LJIIIZ().get(str);
        if ((c1162950gMv != null && ((Boolean) c1162950gMv.LIZ("show_debug_label")).booleanValue()) || LIZIZ(str)) {
            z2 = true;
        } else {
            z2 = false;
        }
        InterfaceC1168310gVZ interfaceC1168310gVZ = (InterfaceC1168310gVZ) LJIIIIZZ().get(str);
        if (interfaceC1168310gVZ != null && interfaceC1168310gVZ.LJIIIIZZ()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            if (z2 || z3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZIZ(String str) {
        boolean z;
        boolean z2;
        InterfaceC1168280gVW interfaceC1168280gVW = LIZJ;
        if (interfaceC1168280gVW != null && interfaceC1168280gVW.LJII()) {
            z = true;
        } else {
            z = false;
        }
        C1162950gMv c1162950gMv = (C1162950gMv) LJIIIZ().get(str);
        if (c1162950gMv != null && ((Boolean) c1162950gMv.LIZ("use_mock_data")).booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            return true;
        }
        return false;
    }

    public static Map LJII(Context context, String str) {
        Map mapLJIIZILJ;
        String strChannel;
        String strLJIIIIZZ;
        String strLIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        InterfaceC1168310gVZ interfaceC1168310gVZ = (InterfaceC1168310gVZ) LJIIIIZZ().get(str);
        if (interfaceC1168310gVZ != null) {
            interfaceC1168310gVZ.LJIIJJI();
        }
        linkedHashMap2.put("myna_version", BuildConfig.VERSION_NAME);
        linkedHashMap2.put("page_technology", "Android");
        linkedHashMap2.put("os", "Android");
        InterfaceC1168280gVW interfaceC1168280gVW = LIZJ;
        if (interfaceC1168280gVW != null) {
            linkedHashMap2.put("app_id", Integer.valueOf(interfaceC1168280gVW.appId()));
        }
        InterfaceC1168280gVW interfaceC1168280gVW2 = LIZJ;
        if (interfaceC1168280gVW2 != null) {
            linkedHashMap2.put("app_version_number", Long.valueOf(interfaceC1168280gVW2.LIZJ()));
        }
        InterfaceC1168280gVW interfaceC1168280gVW3 = LIZJ;
        if (interfaceC1168280gVW3 != null && (strLIZIZ = interfaceC1168280gVW3.LIZIZ()) != null) {
            linkedHashMap2.put("app_version", strLIZIZ);
        }
        InterfaceC1168280gVW interfaceC1168280gVW4 = LIZJ;
        if (interfaceC1168280gVW4 != null && (strLJIIIIZZ = interfaceC1168280gVW4.LJIIIIZZ(context)) != null) {
            linkedHashMap2.put("theme", strLJIIIIZZ);
        }
        InterfaceC1168280gVW interfaceC1168280gVW5 = LIZJ;
        if (interfaceC1168280gVW5 != null && (strChannel = interfaceC1168280gVW5.channel()) != null) {
            linkedHashMap2.put("channel", strChannel);
        }
        C1162950gMv c1162950gMv = (C1162950gMv) LJIIIZ().get(str);
        if (c1162950gMv != null && (mapLJIIZILJ = C2097608Jq.LJIIZILJ(c1162950gMv.LIZIZ)) != null) {
            linkedHashMap2.put("query_items", mapLJIIZILJ);
        }
        linkedHashMap.putAll(linkedHashMap2);
        int dimensionPixelSize = C1168320gVa.LIZIZ;
        int i = 0;
        if (dimensionPixelSize <= 0) {
            if (context == null) {
                dimensionPixelSize = 0;
            } else {
                int iN3 = C786410Ut5.n3(context.getResources(), "status_bar_height", "dimen", "android");
                if (iN3 > 0) {
                    try {
                        dimensionPixelSize = (int) ((r2.getDimensionPixelSize(iN3) / context.getResources().getDisplayMetrics().density) + 0.5f);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1325860kbg.LIZIZ(null, new C020L(iN3, e, 4), C2097608Jq.LJ());
                        dimensionPixelSize = 0;
                    }
                    C1168320gVa.LIZIZ = dimensionPixelSize;
                } else {
                    dimensionPixelSize = 0;
                    C1168320gVa.LIZIZ = dimensionPixelSize;
                }
            }
        }
        linkedHashMap.put("status_bar_height", Integer.valueOf(dimensionPixelSize));
        int i2 = C1168320gVa.LIZJ;
        if (i2 <= 0) {
            C1168320gVa.LIZ(context);
            i2 = C1168320gVa.LIZJ;
            if (i2 <= 0) {
                i2 = 0;
            }
        }
        linkedHashMap.put("screen_width", Integer.valueOf(i2));
        int i3 = C1168320gVa.LIZLLL;
        if (i3 <= 0) {
            C1168320gVa.LIZ(context);
            int i4 = C1168320gVa.LIZLLL;
            if (i4 > 0) {
                i = i4;
            }
            i3 = i;
        }
        linkedHashMap.put("screen_height", Integer.valueOf(i3));
        return linkedHashMap;
    }

    public final void LJIIJJI(InterfaceC1168310gVZ interfaceC1168310gVZ, String str) {
        if (((Boolean) C286780BLw.LIZ.getValue()).booleanValue() && LIZJ == null) {
            long jNanoTime = System.nanoTime();
            IMynaGlobalService iMynaGlobalService = (IMynaGlobalService) PluggableExtentionKt.pluggableSpi$default(IMynaGlobalService.class, false, false, false, 14, null);
            if (iMynaGlobalService != null) {
                iMynaGlobalService.LIZ(jNanoTime, "lazy", str);
            }
        }
        if (!LIZIZ && ((Boolean) C282500B5k.LIZ.getValue()).booleanValue()) {
            LIZJ();
        }
        if (a0.LJJJIL(str)) {
            C1168400gVi.LIZIZ(new AwS53S1000000_2("init custom config", 18));
            return;
        }
        synchronized (LJIIIIZZ()) {
            try {
                LIZ.getClass();
                if (LJIIIIZZ().get(str) != null) {
                    return;
                }
                LJIIIIZZ().put(str, interfaceC1168310gVZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIIJ(C1549260qQ0 c1549260qQ0, long j, final String str, final String str2) {
        if (LIZJ != null) {
            return;
        }
        LIZJ = c1549260qQ0;
        final double dNanoTime = (System.nanoTime() - j) / 1000000.0d;
        ((ScheduledExecutorService) LJFF.getValue()).schedule(new Runnable() { // from class: X.0gN1
            public final void LIZ() {
                new C1163030gN3(str2, C056T.GLOBAL_CONFIG_INIT).LIZJ(C2097608Jq.LJIIIIZZ(new Pair("type", str), new Pair("duration", Double.valueOf(dNanoTime))));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MynaRender@48ac.init$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MynaRender@48ac.init$1");
            }
        }, 10L, TimeUnit.SECONDS);
    }
}
