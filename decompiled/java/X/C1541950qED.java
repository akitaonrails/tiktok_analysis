package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qED, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541950qED {
    public static boolean LIZLLL;
    public static volatile Function0<Unit> LJII;
    public static final Class<?> LJIIJJI;
    public static final Object LJIIL;
    public static final Method LJIILIIL;
    public static final Method LJIILJJIL;
    public static final C01GW<Boolean> LJIILL;
    public final Context LIZ;
    public final SparkContext LIZIZ;
    public static final C1537900q7g LIZJ = new C1537900q7g();
    public static final CopyOnWriteArrayList<AbstractC1538680q8w> LJ = new CopyOnWriteArrayList<>();
    public static final ConcurrentHashMap<String, AbstractC1538690q8x> LJFF = new ConcurrentHashMap<>();
    public static AbstractC1538600q8o LJI = C1540430qBl.LIZ;
    public static final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public static final AtomicBoolean LJIIIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LJIIJ = new AtomicBoolean(false);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    static {
        /*
            X.0q7g r0 = new X.0q7g
            r0.<init>()
            X.C1541950qED.LIZJ = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            X.C1541950qED.LJ = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            X.C1541950qED.LJFF = r0
            X.0qBk r0 = X.C1540430qBl.LIZ
            X.C1541950qED.LJI = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r5 = 0
            r0.<init>(r5)
            X.C1541950qED.LJIIIIZZ = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r5)
            X.C1541950qED.LJIIIZ = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r5)
            X.C1541950qED.LJIIJ = r0
            r6 = 0
            java.lang.String r0 = "com.bytedance.hybrid.spark.prefetch.PrefetchService"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L37
            goto L3c
        L37:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = r6
        L3c:
            X.C1541950qED.LJIIJJI = r1
            r4 = 1
            if (r1 == 0) goto L55
            java.lang.String r0 = "INSTANCE"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L55
            r0.setAccessible(r4)     // Catch: java.lang.Throwable -> L51
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L51
            goto L56
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L55:
            r0 = r6
        L56:
            X.C1541950qED.LJIIL = r0
            java.lang.Class<?> r3 = X.C1541950qED.LJIIJJI     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L6d
            java.lang.String r2 = "prefetchWhenNavigate"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L69
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r5] = r0     // Catch: java.lang.Throwable -> L69
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r2, r1)     // Catch: java.lang.Throwable -> L69
            goto L6e
        L69:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6d:
            r0 = r6
        L6e:
            X.C1541950qED.LJIILIIL = r0
            java.lang.Class<?> r3 = X.C1541950qED.LJIIJJI     // Catch: java.lang.Throwable -> L81
            if (r3 == 0) goto L85
            java.lang.String r2 = "prefetchWhenLoad"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L81
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r5] = r0     // Catch: java.lang.Throwable -> L81
            java.lang.reflect.Method r6 = r3.getDeclaredMethod(r2, r1)     // Catch: java.lang.Throwable -> L81
            goto L85
        L81:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L85:
            X.C1541950qED.LJIILJJIL = r6
            X.0q7l r0 = new X.0q7l
            r0.<init>()
            X.C1538260q8G.LIZLLL = r0
            X.01GW<X.0q6t> r0 = X.C1537410q6t.LJIIIZ
            X.0q6t r3 = X.C1161970gLL.LIZIZ()
            r0 = 3
            java.lang.Class[] r2 = new java.lang.Class[r0]
            java.lang.Class<X.0dge> r0 = X.C1059860dge.class
            r2[r5] = r0
            java.lang.Class<X.0e6J> r0 = X.C1075770e6J.class
            r2[r4] = r0
            r1 = 2
            java.lang.Class<X.0qDV> r0 = X.InterfaceC1541510qDV.class
            r2[r1] = r0
            java.util.List r0 = X.C1697810uHb.LJIILJJIL(r2)
            r3.LIZ(r0)
            X.0eqG r0 = new X.0eqG
            r0.<init>()
            X.01GW r0 = X.C452501pT.LIZIZ(r0)
            X.C1541950qED.LJIILL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1541950qED.<clinit>():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1541950qED.LIZIZ():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.hybrid.spark.page.SparkPopup LIZJ() {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1541950qED.LIZJ():com.bytedance.hybrid.spark.page.SparkPopup");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZ(boolean z) {
        boolean useMutableContext;
        Context mutableContextWrapper;
        InterfaceC1542060qEO interfaceC1542060qEO;
        InterfaceC1545600qK6 interfaceC1545600qK6LIZLLL;
        SparkContext sparkContext = this.LIZIZ;
        if (!sparkContext.hasExecuteGlobalPreHandler) {
            sparkContext.hasExecuteGlobalPreHandler = true;
        }
        C1530030puz.LIZIZ("Spark", "createView", sparkContext);
        LIZJ.LJIIL();
        SparkSchemaParam sparkSchemaParamLJJJI = this.LIZIZ.LJJJI(3);
        if (sparkSchemaParamLJJJI != null) {
            useMutableContext = sparkSchemaParamLJJJI.getUseMutableContext();
        } else {
            useMutableContext = false;
        }
        if (C1540320qBa.LIZ && (interfaceC1542060qEO = C1546010qKl.LIZ) != null && (interfaceC1545600qK6LIZLLL = interfaceC1542060qEO.LIZLLL()) != null && interfaceC1545600qK6LIZLLL.LIZLLL(this.LIZ) != this.LIZIZ.LJIIZILJ(this.LIZ)) {
            Integer numLJJJJ = this.LIZIZ.LJJJJ(this.LIZ);
            if (numLJJJJ != null) {
                int iIntValue = numLJJJJ.intValue();
                if (useMutableContext) {
                    mutableContextWrapper = new C487720JAs(this.LIZ, iIntValue);
                } else {
                    mutableContextWrapper = new C2481809o0(this.LIZ, iIntValue);
                }
            } else if (useMutableContext) {
                mutableContextWrapper = new MutableContextWrapper(this.LIZ);
            } else {
                mutableContextWrapper = this.LIZ;
            }
        } else if (useMutableContext) {
            mutableContextWrapper = new MutableContextWrapper(this.LIZ);
        } else {
            mutableContextWrapper = this.LIZ;
        }
        String strName = null;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = new SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB(mutableContextWrapper, 0 == true ? 1 : 0, 62);
        if (!z) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJ(this.LIZIZ);
        }
        C829950Wh7 c829950Wh7 = C829950Wh7.LIZ;
        String strLJIJI = this.LIZIZ.LJIJI();
        c829950Wh7.getClass();
        boolean z2 = !C829950Wh7.LIZJ(strLJIJI);
        int iLJ = this.LIZIZ.LJ();
        if (z2) {
            this.LIZIZ.LJJJJLI();
            String strLJIJI2 = this.LIZIZ.LJIJI();
            EnumC822170WNb enumC822170WNb = EnumC822170WNb.Spark;
            Context context = this.LIZ;
            SparkContext sparkContext2 = this.LIZIZ;
            c829950Wh7.getClass();
            Map mapLIZ = C829950Wh7.LIZ(sparkContext2);
            EnumC1542040qEM enumC1542040qEM = EnumC1542040qEM.VIEW;
            InterfaceC1541510qDV interfaceC1541510qDV = (InterfaceC1541510qDV) this.LIZIZ.LJFF(InterfaceC1541510qDV.class);
            if (interfaceC1541510qDV != null) {
                strName = interfaceC1541510qDV.name();
            }
            C821850WLv c821850WLvLJ = C829950Wh7.LJ(iLJ, strLJIJI2, enumC822170WNb, context, mapLIZ, enumC1542040qEM, strName);
            if (c821850WLvLJ != null) {
                C829950Wh7.LIZIZ(this.LIZIZ, c821850WLvLJ);
                if (c821850WLvLJ.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("can not create spark view -> dataflowId:");
                    sbLIZ.append(iLJ);
                    throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            String strLJIJI3 = this.LIZIZ.LJIJI();
            Context context2 = this.LIZ;
            c829950Wh7.getClass();
            C829950Wh7.LIZLLL(iLJ, strLJIJI3, enumC822170WNb, context2, enumC1542040qEM);
        }
        return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
    }

    public C1541950qED(Context context, SparkContext sparkContext) {
        this.LIZ = context;
        this.LIZIZ = sparkContext;
    }
}
