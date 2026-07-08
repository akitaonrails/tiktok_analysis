package X;

import com.bytedance.android.starship.engine.graph.config.GraphConfig;
import com.bytedance.android.starship.engine.graph.config.NodeConfig;
import com.bytedance.android.starship.engine.graph.foundation.Task;
import com.bytedance.android.starship.engine.strategy.IStarShipStrategy;
import com.bytedance.android.starship.strategy.CancelableJob;
import com.bytedance.android.starship.strategy.graph.CancelableJobImpl;
import com.bytedance.android.starship.strategy.repository.StrategyModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS169S1100000_20;
import kotlin.jvm.internal.AwS229S0300000_20;
import kotlin.jvm.internal.AwS564S0100000_20;

/* JADX INFO: renamed from: X.0k63, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306250k63 implements InterfaceC1306280k66, IStarShipStrategy {
    public final InterfaceC1306280k66 LIZ;
    public volatile boolean LJI;
    public String LIZIZ = "uninitialized";
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1283800jVq());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C1306310k69());
    public final C01GW LJ = C452501pT.LIZIZ(new C1306300k68());
    public final C01GW LJFF = C452501pT.LIZIZ(new C0NJQ());
    public final ReentrantReadWriteLock LJII = new ReentrantReadWriteLock();

    @Override // X.InterfaceC1306280k66
    public final Object LIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return this.LIZ.LIZ(interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1306280k66
    public final Object LIZIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return this.LIZ.LIZIZ(interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1306280k66
    public final Object LJ(String str, InterfaceC1364105Vn<? super InterfaceC346201Wa<Task.Output>> interfaceC1364105Vn) {
        return this.LIZ.LJ(str, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1306280k66
    public final NodeConfig LJFF(String str, String str2) {
        return this.LIZ.LJFF(str, str2);
    }

    @Override // X.InterfaceC1306280k66
    public final Object LJI(String str, Object obj, InterfaceC1307160k7W interfaceC1307160k7W, C1306240k62 c1306240k62) {
        return this.LIZ.LJI(str, obj, interfaceC1307160k7W, c1306240k62);
    }

    @Override // X.InterfaceC1306280k66
    public final Object LJIIIZ(String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return this.LIZ.LJIIIZ(str, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.starship.engine.strategy.IStarShipStrategy
    @InterfaceC1294060jmO
    public final void LJIIJ(EnumC1306820k6y enumC1306820k6y, AFwS245S0000000_12 aFwS245S0000000_12) {
    }

    @Override // X.InterfaceC1306280k66
    public final Object LJIIJJI(Map<String, GraphConfig> map, Map<String, NodeConfig> map2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return this.LIZ.LJIIJJI(map, map2, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1306280k66
    public final List<String> LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final boolean addDataProvider(InterfaceC1307050k7L interfaceC1307050k7L) {
        return false;
    }

    @Override // com.bytedance.android.starship.engine.strategy.IStarShipStrategy
    @InterfaceC1294060jmO
    public final C1306390k6H<Map<String, Object>> gf(String str, String str2) {
        return null;
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final void loadStarShipStrategy() {
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final boolean removeDataProvider(String str) {
        return false;
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final void sendEvent(String str, Map<String, ? extends Object> map) {
    }

    public final Map<String, GraphConfig> LJIILIIL() {
        return (Map) this.LJ.getValue();
    }

    public final ConcurrentHashMap<String, StrategyModel> LJIILJJIL() {
        return (ConcurrentHashMap) this.LIZLLL.getValue();
    }

    public C1306250k63(C1307280k7i c1307280k7i) {
        this.LIZ = c1307280k7i;
    }

    public static final C1306060k5k LJIILL(String str) {
        C1306060k5k c1306060k5k = new C1306060k5k();
        c1306060k5k.LIZIZ = str;
        return c1306060k5k;
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final String getStrategyVersion(String str) {
        StrategyModel strategyModel = LJIILJJIL().get(str);
        if (strategyModel != null) {
            return strategyModel.version;
        }
        return null;
    }

    @Override // X.InterfaceC1306280k66, com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final boolean isStrategyLoaded(String str) {
        C1306430k6L.LIZ(new AwS169S1100000_20(this, str, 0));
        if (this.LJI && this.LIZ.isStrategyLoaded(str)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final C1306060k5k runStrategySync(C1306400k6I c1306400k6I) {
        if (!this.LJI) {
            return LJIILL("uninitialized.");
        }
        return (C1306060k5k) C23250099c.LJ(C23271099x.INSTANCE, new C1306000k5e(c1306400k6I, this, null));
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final C1306060k5k runStrategyWithEvent(C1306400k6I c1306400k6I) {
        if (!this.LJI) {
            return LJIILL("uninitialized.");
        }
        Pair<String, ? extends Map<String, ? extends Object>> pair = c1306400k6I.LIZJ;
        if (pair == null) {
            return LJIILL("event is null.");
        }
        return (C1306060k5k) C23250099c.LJ(C23271099x.INSTANCE, new C1305990k5d(c1306400k6I, this, pair, null));
    }

    public static Pair LJIILLIIL(Map map, Map map2) {
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(((Map.Entry) it2.next()).getKey());
        }
        List listLLIIII = C13LP.LLIIII(arrayList);
        ArrayList arrayList2 = new ArrayList(map2.size());
        Iterator it3 = map2.entrySet().iterator();
        while (it3.hasNext()) {
            arrayList2.add(((Map.Entry) it3.next()).getKey());
        }
        List listLLIIII2 = C13LP.LLIIII(arrayList2);
        if (listLLIIII.containsAll(listLLIIII2)) {
            return new Pair(Boolean.TRUE, listLLIIII.toString());
        }
        Boolean bool = Boolean.FALSE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(listLLIIII);
        sbLIZ.append(listLLIIII2);
        return new Pair(bool, C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019c A[Catch: all -> 0x01ca, TryCatch #4 {all -> 0x01ca, blocks: (B:69:0x0165, B:73:0x0181, B:75:0x0185, B:77:0x018d, B:78:0x018f, B:82:0x0196, B:83:0x0198, B:85:0x019c, B:86:0x019f, B:88:0x01a5, B:89:0x01a7, B:57:0x012d, B:98:0x01c0, B:99:0x01c9), top: B:119:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a5 A[Catch: all -> 0x01ca, TryCatch #4 {all -> 0x01ca, blocks: (B:69:0x0165, B:73:0x0181, B:75:0x0185, B:77:0x018d, B:78:0x018f, B:82:0x0196, B:83:0x0198, B:85:0x019c, B:86:0x019f, B:88:0x01a5, B:89:0x01a7, B:57:0x012d, B:98:0x01c0, B:99:0x01c9), top: B:119:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b5  */
    /* JADX WARN: Type inference failed for: r0v41, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0k63] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.0k7W, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.AutoCloseable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:107:0x01d4
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIZILJ(X.C1306400k6I r12, X.InterfaceC1364105Vn<? super X.C1306060k5k> r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1306250k63.LJIIZILJ(X.0k6I, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final void getStrategyResult(C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1) {
        Object obj = ((ConcurrentHashMap) this.LIZJ.getValue()).get(c1306400k6I.LIZ);
        if (obj != 0) {
            function1.invoke(obj);
        } else {
            runStrategy(c1306400k6I, new AwS229S0300000_20(this, (C1306250k63) c1306400k6I, (C1306400k6I) function1, (Function1<? super C1306060k5k, Unit>) 0));
        }
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final CancelableJob registerStrategyCallback(C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1) {
        C1306430k6L.LIZ(new AwS564S0100000_20(c1306400k6I, 2));
        return new CancelableJobImpl(C23250099c.LIZLLL((InterfaceC497601wk) this.LJFF.getValue(), null, null, new C1306040k5i(this, c1306400k6I, function1, null), 3));
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final void runStrategy(C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1) {
        if (!this.LJI) {
            function1.invoke(LJIILL("uninitialized."));
        } else {
            C23250099c.LIZLLL((InterfaceC497601wk) this.LJFF.getValue(), null, null, new C1306020k5g(this, c1306400k6I, function1, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    @Override // com.bytedance.android.starship.engine.strategy.IStarShipStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> X.C1306390k6H<T> LIZJ(java.lang.String r6, java.lang.String r7, java.lang.reflect.Type r8) {
        /*
            r5 = this;
            boolean r0 = r5.LJI
            r2 = 0
            if (r0 != 0) goto L31
            r1 = -1
            java.lang.String r0 = "Uninitialized or No data."
            X.0k6H r0 = X.C1306380k6G.LIZ(r1, r0)
        Lc:
            java.util.concurrent.ConcurrentHashMap r1 = X.C0NOR.LIZLLL()
            boolean r1 = r1.containsKey(r6)
            if (r1 != 0) goto L22
            java.util.concurrent.ConcurrentHashMap r3 = X.C0NOR.LIZLLL()
            X.0NOT r1 = new X.0NOT
            r1.<init>(r6, r2)
            X.C1306520k6U.LJ(r3, r6, r1)
        L22:
            kotlin.jvm.internal.AwS134S1100000_20 r2 = new kotlin.jvm.internal.AwS134S1100000_20
            r1 = 1
            r2.<init>(r7, r0, r1)
            java.lang.String r1 = "trace_span_node"
            X.C0NOR.LIZ(r6, r1, r2)
            X.C0NOR.LIZJ(r6, r1)
            return r0
        L31:
            com.bytedance.android.starship.engine.graph.config.NodeConfig r3 = r5.LJFF(r6, r7)
            if (r3 == 0) goto L80
            X.0k7u r1 = r3.type
            X.0k7u r0 = X.EnumC1307400k7u.NOOP
            if (r1 != r0) goto L80
            com.bytedance.android.starship.engine.graph.config.NoopNodeConfig r4 = r3.noopConfig
            if (r4 == 0) goto L80
            java.lang.Object r3 = r4.LIZ
            if (r3 == 0) goto L5e
            com.google.gson.reflect.TypeToken r0 = com.google.gson.reflect.TypeToken.get(r8)     // Catch: java.lang.Exception -> L5a
            java.lang.Class r1 = r0.getRawType()     // Catch: java.lang.Exception -> L5a
            java.lang.Class r0 = r3.getClass()     // Catch: java.lang.Exception -> L5a
            boolean r0 = r1.isAssignableFrom(r0)     // Catch: java.lang.Exception -> L5a
            if (r0 == 0) goto L5e
            java.lang.Object r1 = r4.LIZ     // Catch: java.lang.Exception -> L5a
            goto L6a
        L5a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5e:
            java.lang.String r1 = r4.data
            if (r1 == 0) goto L78
            com.google.gson.Gson r0 = X.C1306320k6A.LIZ     // Catch: java.lang.Exception -> L74
            java.lang.Object r1 = r0.LJIIIIZZ(r1, r8)     // Catch: java.lang.Exception -> L74
            r4.LIZ = r1     // Catch: java.lang.Exception -> L74
        L6a:
            if (r1 == 0) goto L78
            X.0k6H r0 = new X.0k6H
            r0.<init>()
            r0.LIZ = r1
            goto Lc
        L74:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L78:
            r1 = -3
            java.lang.String r0 = "Parse error."
            X.0k6H r0 = X.C1306380k6G.LIZ(r1, r0)
            goto Lc
        L80:
            r1 = -2
            java.lang.String r0 = "Strategy or Node not found."
            X.0k6H r0 = X.C1306380k6G.LIZ(r1, r0)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1306250k63.LIZJ(java.lang.String, java.lang.String, java.lang.reflect.Type):X.0k6H");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x007d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void LJIJ(java.util.List<java.lang.String> r13, java.util.Map<java.lang.String, com.bytedance.android.starship.engine.graph.config.GraphConfig> r14, java.util.Map<java.lang.String, com.bytedance.android.starship.engine.graph.config.NodeConfig> r15, X.InterfaceC1307160k7W r16) {
        /*
            r12 = this;
            r8 = r13
            r0 = r8
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r10 = r15
            r9 = r14
            if (r0 == 0) goto L19
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L19
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L19
            return
        L19:
            r11 = 0
            r1 = r16
            if (r1 == 0) goto L25
            java.lang.String r0 = "apply_to_engine"
            X.0k7W r6 = r1.LLIIIZ(r0)
            goto L26
        L25:
            r6 = r11
        L26:
            kotlin.jvm.internal.AwS421S0200000_20 r1 = new kotlin.jvm.internal.AwS421S0200000_20     // Catch: java.lang.Throwable -> L75
            r0 = 0
            r7 = r12
            r1.<init>(r7, r9, r0)     // Catch: java.lang.Throwable -> L75
            X.C1306430k6L.LIZ(r1)     // Catch: java.lang.Throwable -> L75
            kotlin.jvm.internal.AwS564S0100000_20 r1 = new kotlin.jvm.internal.AwS564S0100000_20     // Catch: java.lang.Throwable -> L75
            r0 = 7
            r1.<init>(r7, r0)     // Catch: java.lang.Throwable -> L75
            X.C1306430k6L.LIZ(r1)     // Catch: java.lang.Throwable -> L75
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r7.LJII     // Catch: java.lang.Throwable -> L75
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r0.writeLock()     // Catch: java.lang.Throwable -> L75
            r4.lock()     // Catch: java.lang.Throwable -> L75
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6d
            X.0k64 r5 = new X.0k64     // Catch: java.lang.Throwable -> L6d
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L6d
            X.C23250099c.LJFF(r5)     // Catch: java.lang.Throwable -> L6d
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6d
            long r2 = r2 - r0
            X.0k61 r0 = new X.0k61     // Catch: java.lang.Throwable -> L6d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L6d
            X.C1306430k6L.LIZ(r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 == 0) goto L66
            java.lang.String r1 = "container_update_cost_time"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L6d
            r6.LJJLIIIJLLLLLLLZ(r0, r1)     // Catch: java.lang.Throwable -> L6d
        L66:
            r4.unlock()     // Catch: java.lang.Throwable -> L75
            X.C1306420k6K.LIZ(r6, r11)
            return
        L6d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6d
            r4.unlock()     // Catch: java.lang.Throwable -> L75
            throw r0     // Catch: java.lang.Throwable -> L75
        L75:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L7d
            throw r1     // Catch: java.lang.Throwable -> L7a
        L7a:
            r0 = move-exception
            r11 = r1
            goto L7e
        L7d:
            r0 = move-exception
        L7e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7d
            X.C1306420k6K.LIZ(r6, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1306250k63.LJIJ(java.util.List, java.util.Map, java.util.Map, X.0k7W):void");
    }
}
