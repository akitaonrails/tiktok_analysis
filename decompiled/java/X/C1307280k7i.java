package X;

import android.os.Build;
import com.bytedance.android.starship.engine.graph.config.NodeConfig;
import com.bytedance.android.starship.engine.graph.foundation.Packet;
import com.bytedance.android.starship.engine.graph.foundation.Task;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0k7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1307280k7i implements InterfaceC1306280k66, InterfaceC1307790k8X {
    public final HashMap<Long, InterfaceC1307210k7b> LIZ = new HashMap<>();
    public final HashMap<Long, HashSet<C1307480k82>> LIZIZ = new HashMap<>();
    public final HashMap<Long, HashSet<C1307480k82>> LIZJ = new HashMap<>();
    public final HashMap<String, C1307150k7V> LIZLLL = new HashMap<>();
    public final HashMap<Long, C1307150k7V> LJ = new HashMap<>();
    public final C054G LJFF;
    public final C054G LJI;
    public AnonymousClass0956 LJII;
    public final PriorityQueue<Task> LJIIIIZZ;
    public final C1DEU LJIIIZ;
    public final ConcurrentHashMap<String, C05YC<Task.Output>> LJIIJ;
    public final C1307730k8R LJIIJJI;

    @Override // X.InterfaceC1306280k66
    public final List<String> LJIIL() {
        return C13LP.LLIIII(this.LIZLLL.keySet());
    }

    public C1307280k7i() {
        C2232408os c2232408osLIZ = C08YE.LIZ("StarshipSerialScheduler");
        this.LJFF = C2296808zG.LIZ(c2232408osLIZ);
        this.LJI = C2296808zG.LIZ(c2232408osLIZ);
        this.LJIIIIZZ = new PriorityQueue<>();
        int i = C2252461DEe.LIZ;
        this.LJIIIZ = new C1DEU(LSPassThroughRecordSizeConfig.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT);
        this.LJIIJ = new ConcurrentHashMap<>();
        this.LJIIJJI = new C1307730k8R(new C1307770k8V(), new C1307690k8N(), new C1307750k8T());
    }

    @Override // X.InterfaceC1307790k8X
    public final C1307730k8R LJJIIZI() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC1306280k66
    public final Object LIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        this.LJII = C23250099c.LIZLLL(this.LJI, null, null, new C862020Xrk(this, null), 3);
        C1307940k8m.LIZIZ().isDebug();
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    @Override // X.InterfaceC1306280k66
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1307360k7q
            if (r0 == 0) goto L78
            r4 = r6
            X.0k7q r4 = (X.C1307360k7q) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L78
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L68
            if (r0 != r1) goto L88
            X.C155000ia.LIZIZ(r3)
        L22:
            r0 = 0
            r5.LJII = r0
        L25:
            java.util.PriorityQueue<com.bytedance.android.starship.engine.graph.foundation.Task> r0 = r5.LJIIIIZZ
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L7e
            java.util.PriorityQueue<com.bytedance.android.starship.engine.graph.foundation.Task> r0 = r5.LJIIIIZZ
            java.lang.Object r4 = r0.poll()
            com.bytedance.android.starship.engine.graph.foundation.Task r4 = (com.bytedance.android.starship.engine.graph.foundation.Task) r4
            if (r4 == 0) goto L25
            X.1DEU r3 = r5.LJIIIZ
            r3.getClass()
        L3e:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = X.C1DEU.LJI
            int r1 = r2.get(r3)
            int r0 = r3.LIZ
            if (r1 > r0) goto L57
            if (r1 <= 0) goto L52
            int r0 = r1 + (-1)
            boolean r0 = r2.compareAndSet(r3, r1, r0)
            if (r0 == 0) goto L3e
        L52:
            X.0k7p r0 = X.EnumC1307350k7p.CANCELLED
            r4.LLILLL = r0
            goto L25
        L57:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = X.C1DEU.LJI
            int r1 = r2.get(r3)
            int r0 = r3.LIZ
            if (r1 <= r0) goto L3e
            boolean r0 = r2.compareAndSet(r3, r1, r0)
            if (r0 == 0) goto L57
            goto L3e
        L68:
            X.C155000ia.LIZIZ(r3)
            X.0956 r0 = r5.LJII
            if (r0 == 0) goto L22
            r4.LLILLL = r1
            java.lang.Object r0 = X.C23118094a.LIZLLL(r0, r4)
            if (r0 != r2) goto L22
            return r2
        L78:
            X.0k7q r4 = new X.0k7q
            r4.<init>(r5, r6)
            goto L12
        L7e:
            X.0k6M r0 = X.C1307940k8m.LIZIZ()
            r0.isDebug()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1307280k7i.LIZIZ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1307790k8X
    public final String LIZJ(long j) {
        String str;
        C1307150k7V c1307150k7V = this.LJ.get(Long.valueOf(j));
        if (c1307150k7V != null && (str = c1307150k7V.LIZ) != null) {
            return str;
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    public final void LJIIJ(Task task) {
        C23250099c.LIZLLL(this.LJFF, null, null, new C1307290k7j(task, this, null), 3);
    }

    @Override // X.InterfaceC1306280k66, com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final boolean isStrategyLoaded(String str) {
        return this.LIZLLL.containsKey(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.bytedance.android.starship.engine.graph.foundation.Task r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1307280k7i.LIZLLL(com.bytedance.android.starship.engine.graph.foundation.Task, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1306280k66
    public final Object LJ(String str, InterfaceC1364105Vn<? super InterfaceC346201Wa<Task.Output>> interfaceC1364105Vn) {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.LJIIJ.computeIfAbsent(str, new Function() { // from class: X.0k7x
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return C09IR.LIZIZ(0, 0, null, 7);
                }
            });
        }
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        C05YC<Task.Output> c05ycPutIfAbsent = this.LJIIJ.putIfAbsent(str, c2252331DDrLIZIZ);
        if (c05ycPutIfAbsent != null) {
            return c05ycPutIfAbsent;
        }
        return c2252331DDrLIZIZ;
    }

    @Override // X.InterfaceC1306280k66
    public final NodeConfig LJFF(String str, String str2) {
        C1307150k7V c1307150k7V = this.LIZLLL.get(str);
        if (c1307150k7V == null) {
            return null;
        }
        for (InterfaceC1307210k7b interfaceC1307210k7b : c1307150k7V.LIZJ) {
            if (Intrinsics.LJFF(interfaceC1307210k7b.getConfig().name, str2)) {
                return interfaceC1307210k7b.getConfig();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(com.bytedance.android.starship.engine.graph.foundation.Task r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1307340k7o
            if (r0 == 0) goto L8c
            r4 = r8
            X.0k7o r4 = (X.C1307340k7o) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r5 = 1
            if (r0 == 0) goto L4e
            if (r0 != r5) goto Lae
            com.bytedance.android.starship.engine.graph.foundation.Task r7 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            java.util.HashSet<X.0k7f> r0 = r7.LLIZ
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
        L30:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r1 = r3.next()
            if (r2 == 0) goto L40
            r4.add(r1)
            goto L30
        L40:
            r0 = r1
            X.0k7f r0 = (X.InterfaceC1307250k7f) r0
            boolean r0 = r0.LIZ(r7)
            if (r0 != 0) goto L30
            r4.add(r1)
            r2 = 1
            goto L30
        L4e:
            X.C155000ia.LIZIZ(r1)
            java.util.HashMap<java.lang.Long, X.0k7V> r2 = r6.LJ
            X.0k7b r0 = r7.LL
            long r0 = r0.getId()
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
            java.lang.Object r2 = r2.get(r0)
            X.0k7V r2 = (X.C1307150k7V) r2
            if (r2 == 0) goto L24
            com.bytedance.android.starship.engine.graph.foundation.Task$Output r1 = r7.LLILZLL
            X.0k7W r0 = r7.LLIZLLLIL
            if (r0 == 0) goto L8a
            java.lang.String r0 = r0.getTraceId()
        L6f:
            r1.traceId = r0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.05YC<com.bytedance.android.starship.engine.graph.foundation.Task$Output>> r1 = r6.LJIIJ
            java.lang.String r0 = r2.LIZ
            java.lang.Object r1 = r1.get(r0)
            X.05YC r1 = (X.C05YC) r1
            if (r1 == 0) goto L24
            com.bytedance.android.starship.engine.graph.foundation.Task$Output r0 = r7.LLILZLL
            r4.LL = r7
            r4.LLILZ = r5
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L24
            return r3
        L8a:
            r0 = 0
            goto L6f
        L8c:
            X.0k7o r4 = new X.0k7o
            r4.<init>(r6, r8)
            goto L12
        L92:
            java.util.Iterator r2 = r4.iterator()
        L96:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lab
            java.lang.Object r1 = r2.next()
            X.0k7f r1 = (X.InterfaceC1307250k7f) r1
            X.0k7d r0 = new X.0k7d
            r0.<init>(r7)
            r1.LIZIZ(r0)
            goto L96
        Lab:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1307280k7i.LJII(com.bytedance.android.starship.engine.graph.foundation.Task, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        r10 = new com.bytedance.android.starship.engine.graph.foundation.Task(r11.LJ);
        r0 = r2.LLIZLLLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bf, code lost:
    
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c5, code lost:
    
        r10.LLIZLLLIL = r0.LJJLIIIJJIZ();
        r10.LLILZ = r2.LLILZ - 1;
        r10.LLILZIL.manual = r2.LLILZIL.manual;
        r10.LLIZ.add(new X.C1307240k7e(r2));
        LJIIJ(r10);
        LJIIJ(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        r10 = r2.LLIZ.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0102, code lost:
    
        if (r10.hasNext() == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0104, code lost:
    
        r10.next().LIZIZ(new X.C1307230k7d(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x003a, code lost:
    
        r10.LLIZLLLIL = null;
        r10.LLILZ = r2.LLILZ - 1;
        r10.LLILZIL.manual = r2.LLILZIL.manual;
        r10.LLIZ.add(new X.C1307240k7e(r2));
        LJIIJ(r10);
        LJIIJ(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005c -> B:17:0x003a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0102 -> B:17:0x003a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0172 -> B:66:0x0195). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x017e -> B:66:0x0195). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x018b -> B:66:0x0195). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.InterfaceC497601wk r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1307280k7i.LJIIIIZZ(X.01wk, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0161  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x014f -> B:11:0x002c). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC1306280k66
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(final java.lang.String r13, X.InterfaceC1364105Vn<? super kotlin.Unit> r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1307280k7i.LJIIIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f5  */
    /* JADX WARN: Type inference failed for: r0v55, types: [X.0k7U] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004d -> B:11:0x002a). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC1306280k66
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(java.util.Map<java.lang.String, com.bytedance.android.starship.engine.graph.config.GraphConfig> r15, java.util.Map<java.lang.String, com.bytedance.android.starship.engine.graph.config.NodeConfig> r16, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1307280k7i.LJIIJJI(java.util.Map, java.util.Map, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1306280k66
    public final Object LJI(String str, Object obj, InterfaceC1307160k7W interfaceC1307160k7W, C1306240k62 c1306240k62) {
        InterfaceC1307210k7b interfaceC1307210k7b;
        InterfaceC1307160k7W interfaceC1307160k7WLLIIIZ;
        InterfaceC1307160k7W interfaceC1307160k7WLJJLIIIJJIZ;
        C1307150k7V c1307150k7V = this.LIZLLL.get(str);
        if (c1307150k7V == null || (interfaceC1307210k7b = c1307150k7V.LJFF) == null) {
            return null;
        }
        if (interfaceC1307160k7W != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("strategy_");
            sbLIZ.append(str);
            interfaceC1307160k7W.LJLL("trace_type", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("strategy_");
            sbLIZ2.append(str);
            interfaceC1307160k7WLLIIIZ = interfaceC1307160k7W.LLIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            interfaceC1307160k7WLLIIIZ = null;
        }
        Task task = new Task(interfaceC1307210k7b);
        if (interfaceC1307160k7WLLIIIZ != null) {
            interfaceC1307160k7WLJJLIIIJJIZ = interfaceC1307160k7WLLIIIZ.LJJLIIIJJIZ();
        } else {
            interfaceC1307160k7WLJJLIIIJJIZ = null;
        }
        task.LLIZLLLIL = interfaceC1307160k7WLJJLIIIJJIZ;
        if (obj != null) {
            task.LLILZIL.manual = new Packet(obj);
            if (interfaceC1307160k7WLLIIIZ != null) {
                interfaceC1307160k7WLLIIIZ.LLIIIILZ("input", obj);
            }
        }
        Long l = c1307150k7V.LJ;
        if (l != null) {
            C099F c099fLIZIZ = C090F.LIZIZ();
            C099F c099fLIZIZ2 = C090F.LIZIZ();
            C23250099c.LIZLLL(this.LJI, null, null, new C1307120k7S(c099fLIZIZ, interfaceC1307160k7WLLIIIZ, c099fLIZIZ2, str, null), 3);
            task.LLIZ.add(new C1307190k7Z(l.longValue(), c099fLIZIZ));
            LJIIJ(task);
            return c099fLIZIZ2;
        }
        LJIIJ(task);
        return null;
    }
}
