package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.13xU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20179013xU implements InterfaceC497601wk {
    public final CoroutineContext LL = C0PEM.LIZJ.plus(C2296908zH.LIZ());
    public final C1DEK LLILLJJLI = C095G.LIZ(200, null, 6);
    public final List<C1420100n3g> LLILLL = new ArrayList();
    public final AtomicLong LLILZ = new AtomicLong(0);
    public final C01C2 LLILZIL = new C01C2();
    public final C20179113xV LLILZLL = C20179113xV.LIZ;
    public final C1DEV LLIZ = C2191201ApK.LIZ();
    public final AtomicBoolean LLIZLLLIL = new AtomicBoolean(false);
    public final AtomicLong LLJ = new AtomicLong(0);
    public final AtomicLong LLJI = new AtomicLong(0);

    public C20179013xU() {
        int i = 0;
        C0MHB c0mhb = C0MHB.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaskScheduler initializing with ");
        sbLIZ.append(4);
        sbLIZ.append(" executors");
        C201955140j.LJIILL(c0mhb, "TaskScheduler", C2188811AlT.LIZIZ(sbLIZ));
        do {
            List<C1420100n3g> list = this.LLILLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("TaskExecutor-");
            sbLIZ2.append(i);
            ((ArrayList) list).add(new C1420100n3g(C2188811AlT.LIZIZ(sbLIZ2)));
            i++;
        } while (i < 4);
        C23250099c.LIZLLL(this, null, null, new C605750NpN(this, null), 3);
        for (C1420100n3g c1420100n3g : (ArrayList) this.LLILLL) {
            c1420100n3g.LIZJ = true;
            C0MHB c0mhb2 = C0MHB.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(c1420100n3g.LIZ);
            sbLIZ3.append(": TaskExecutor started with maxConcurrency: ");
            sbLIZ3.append(c1420100n3g.LIZIZ);
            C201955140j.LJIILL(c0mhb2, "TaskExecutor", C2188811AlT.LIZIZ(sbLIZ3));
        }
        C0MHB c0mhb3 = C0MHB.LIZIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("TaskScheduler initialized successfully with ");
        sbLIZ4.append(((ArrayList) this.LLILLL).size());
        sbLIZ4.append(" executors");
        C201955140j.LJIILL(c0mhb3, "TaskScheduler", C2188811AlT.LIZIZ(sbLIZ4));
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL;
    }

    public static C1457070o1J LIZIZ(AbstractC1420120n3i abstractC1420120n3i) {
        Object next;
        Object next2;
        if (abstractC1420120n3i instanceof C20177513xF) {
            return ((C20177513xF) abstractC1420120n3i).LJFF;
        }
        if (abstractC1420120n3i instanceof C20178113xL) {
            return ((C20178113xL) abstractC1420120n3i).LJFF.LJFF;
        }
        if (abstractC1420120n3i instanceof C20177813xI) {
            Iterator it2 = ((ArrayList) abstractC1420120n3i.LIZIZ).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (next2 instanceof C20177513xF) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            AbstractC1420120n3i abstractC1420120n3i2 = (AbstractC1420120n3i) next2;
            if (abstractC1420120n3i2 == null) {
                return null;
            }
            return ((C20177513xF) abstractC1420120n3i2).LJFF;
        }
        Iterator it3 = ((ArrayList) abstractC1420120n3i.LIZIZ).iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (next instanceof C20177513xF) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AbstractC1420120n3i abstractC1420120n3i3 = (AbstractC1420120n3i) next;
        if (abstractC1420120n3i3 == null) {
            return null;
        }
        return ((C20177513xF) abstractC1420120n3i3).LJFF;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(2:37|12)|35|25|20|(7:33|22|(2:24|30)|35|25|20|(2:31|32)(0))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x003c -> B:20:0x0047). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003e -> B:20:0x0047). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005c -> B:35:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C605770NpP
            if (r0 == 0) goto L20
            r5 = r8
            X.0NpP r5 = (X.C605770NpP) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r0 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r5.LLILLL
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 != r4) goto L2a
            goto L26
        L20:
            X.0NpP r5 = new X.0NpP
            r5.<init>(r7, r8)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Exception -> L36
            goto L5f
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r0)
            goto L47
        L36:
            r0 = move-exception
        L37:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L47
            X.0MHB r3 = X.C0MHB.LIZIZ
            java.lang.String r2 = "TaskScheduler"
            java.lang.String r1 = "processScheduling: error while processing scheduling request"
            X.C201955140j.LJIIIZ(r3, r2, r1, r0)
        L47:
            X.09AM r0 = X.C09AM.LL
            r0.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.LLIZLLLIL
            boolean r0 = r0.get()
            if (r0 != 0) goto L71
            X.1DEK r0 = r7.LLILLJJLI     // Catch: java.lang.Exception -> L6e
            r5.LLILLL = r4     // Catch: java.lang.Exception -> L6e
            java.lang.Object r0 = r0.LJIILIIL(r5)     // Catch: java.lang.Exception -> L6e
            if (r0 != r6) goto L5f
            goto L70
        L5f:
            X.13xh r0 = (X.C20180313xh) r0     // Catch: java.lang.Exception -> L6c
            X.0NpO r2 = new X.0NpO     // Catch: java.lang.Exception -> L6c
            r1 = 0
            r2.<init>(r7, r0, r1)     // Catch: java.lang.Exception -> L6c
            r0 = 3
            X.C23250099c.LIZLLL(r7, r1, r1, r2, r0)     // Catch: java.lang.Exception -> L6c
            goto L47
        L6c:
            r0 = move-exception
            goto L37
        L6e:
            r0 = move-exception
            goto L37
        L70:
            return r6
        L71:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20179013xU.LIZLLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r10, X.InterfaceC1364105Vn<? super X.AbstractC20178613xQ> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C605780NpQ
            if (r0 == 0) goto L27
            r8 = r11
            X.0NpQ r8 = (X.C605780NpQ) r8
            int r2 = r8.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r8.LLILZ = r2
        L12:
            java.lang.Object r1 = r8.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LLILZ
            java.lang.String r5 = "TaskScheduler"
            r4 = 0
            r6 = 1
            if (r0 == 0) goto L35
            if (r0 != r6) goto L2d
            java.lang.Object r10 = r8.LL
            java.lang.String r10 = (java.lang.String) r10
            goto L6a
        L27:
            X.0NpQ r8 = new X.0NpQ
            r8.<init>(r9, r11)
            goto L12
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            X.C155000ia.LIZIZ(r1)
            X.0C64 r3 = X.C0C64.LJIILLIIL()     // Catch: java.lang.Exception -> L70
            java.lang.String r2 = "studio_cover_extraction_disable_cache"
            r1 = 31744(0x7c00, float:4.4483E-41)
            r0 = 0
            boolean r0 = r3.LJIIIZ(r1, r2, r6, r0)     // Catch: java.lang.Exception -> L70
            if (r0 == 0) goto L5d
            X.0MHB r2 = X.C0MHB.LIZIZ     // Catch: java.lang.Exception -> L70
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L70
            java.lang.String r0 = "checkResultCache: cache disabled, skipping check for key "
            r1.append(r0)     // Catch: java.lang.Exception -> L70
            r1.append(r10)     // Catch: java.lang.Exception -> L70
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L70
            X.C201955140j.LIZLLL(r2, r5, r0)     // Catch: java.lang.Exception -> L70
            return r4
        L5d:
            X.13xV r0 = r9.LLILZLL     // Catch: java.lang.Exception -> L70
            r8.LL = r10     // Catch: java.lang.Exception -> L70
            r8.LLILZ = r6     // Catch: java.lang.Exception -> L70
            java.lang.Object r1 = r0.LIZIZ(r4, r10, r8)     // Catch: java.lang.Exception -> L70
            if (r1 != r7) goto L6d
            return r7
        L6a:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L70
        L6d:
            X.13xQ r1 = (X.AbstractC20178613xQ) r1     // Catch: java.lang.Exception -> L70
            return r1
        L70:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.0MHB r2 = X.C0MHB.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "checkResultCache: error checking cache for key "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJIIIZ(r2, r5, r0, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20179013xU.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:23:0x009f, B:16:0x0075], limit reached: 101 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb A[Catch: Exception -> 0x0337, LOOP:3: B:25:0x00b5->B:27:0x00bb, LOOP_END, TryCatch #1 {Exception -> 0x0337, blocks: (B:24:0x00a2, B:25:0x00b5, B:27:0x00bb, B:28:0x00c7, B:29:0x00e1, B:31:0x00e7, B:33:0x00f3, B:34:0x00ff), top: B:84:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7 A[Catch: Exception -> 0x0337, TryCatch #1 {Exception -> 0x0337, blocks: (B:24:0x00a2, B:25:0x00b5, B:27:0x00bb, B:28:0x00c7, B:29:0x00e1, B:31:0x00e7, B:33:0x00f3, B:34:0x00ff), top: B:84:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0125 A[Catch: Exception -> 0x0339, TryCatch #0 {Exception -> 0x0339, blocks: (B:48:0x01ac, B:49:0x01af, B:35:0x011f, B:37:0x0125, B:38:0x0131, B:40:0x0137, B:42:0x0146, B:44:0x014a, B:54:0x020b, B:58:0x025f, B:59:0x0278, B:60:0x02b6, B:62:0x02bc, B:64:0x02d0, B:73:0x02e1, B:74:0x030a, B:51:0x01ed, B:53:0x01f1, B:55:0x0241), top: B:82:0x01ac }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ed A[Catch: Exception -> 0x0339, TryCatch #0 {Exception -> 0x0339, blocks: (B:48:0x01ac, B:49:0x01af, B:35:0x011f, B:37:0x0125, B:38:0x0131, B:40:0x0137, B:42:0x0146, B:44:0x014a, B:54:0x020b, B:58:0x025f, B:59:0x0278, B:60:0x02b6, B:62:0x02bc, B:64:0x02d0, B:73:0x02e1, B:74:0x030a, B:51:0x01ed, B:53:0x01f1, B:55:0x0241), top: B:82:0x01ac }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x025f A[Catch: Exception -> 0x0339, TryCatch #0 {Exception -> 0x0339, blocks: (B:48:0x01ac, B:49:0x01af, B:35:0x011f, B:37:0x0125, B:38:0x0131, B:40:0x0137, B:42:0x0146, B:44:0x014a, B:54:0x020b, B:58:0x025f, B:59:0x0278, B:60:0x02b6, B:62:0x02bc, B:64:0x02d0, B:73:0x02e1, B:74:0x030a, B:51:0x01ed, B:53:0x01f1, B:55:0x0241), top: B:82:0x01ac }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02bc A[Catch: Exception -> 0x0339, TryCatch #0 {Exception -> 0x0339, blocks: (B:48:0x01ac, B:49:0x01af, B:35:0x011f, B:37:0x0125, B:38:0x0131, B:40:0x0137, B:42:0x0146, B:44:0x014a, B:54:0x020b, B:58:0x025f, B:59:0x0278, B:60:0x02b6, B:62:0x02bc, B:64:0x02d0, B:73:0x02e1, B:74:0x030a, B:51:0x01ed, B:53:0x01f1, B:55:0x0241), top: B:82:0x01ac }] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[PHI: r3 r7 r8 r9 r11 r12 r14 r16
      PHI (r3v1 X.13xh) = (r3v0 X.13xh), (r3v3 X.13xh) binds: [B:34:0x00ff, B:50:0x01eb] A[DONT_GENERATE, DONT_INLINE]
      PHI (r7v2 java.util.List) = (r7v11 java.util.List), (r7v12 java.util.List) binds: [B:34:0x00ff, B:50:0x01eb] A[DONT_GENERATE, DONT_INLINE]
      PHI (r8v3 int) = (r8v2 int), (r8v7 int) binds: [B:34:0x00ff, B:50:0x01eb] A[DONT_GENERATE, DONT_INLINE]
      PHI (r9v1 java.util.Map<java.lang.String, ? extends X.13xQ>) = (r9v0 java.util.Map<java.lang.String, ? extends X.13xQ>), (r9v3 java.util.Map<java.lang.String, ? extends X.13xQ>) binds: [B:34:0x00ff, B:50:0x01eb] A[DONT_GENERATE, DONT_INLINE]
      PHI (r11v1 java.util.Iterator) = (r11v0 java.util.Iterator), (r11v2 java.util.Iterator) binds: [B:34:0x00ff, B:50:0x01eb] A[DONT_GENERATE, DONT_INLINE]
      PHI (r12v2 X.13xQ) = (r12v1 X.13xQ), (r12v10 X.13xQ) binds: [B:34:0x00ff, B:50:0x01eb] A[DONT_GENERATE, DONT_INLINE]
      PHI (r14v3 ??) = (r14v9 ??), (r14v10 ??) binds: [B:34:0x00ff, B:50:0x01eb] A[DONT_GENERATE, DONT_INLINE]
      PHI (r16v1 long) = (r16v0 long), (r16v3 long) binds: [B:34:0x00ff, B:50:0x01eb] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.099F] */
    /* JADX WARN: Type inference failed for: r14v1, types: [X.05XL] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [X.05XL] */
    /* JADX WARN: Type inference failed for: r14v4, types: [X.05XL] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [X.05XL] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01a6 -> B:49:0x01af). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C20180313xh r27, X.InterfaceC1364105Vn<? super kotlin.Unit> r28) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20179013xU.LIZJ(X.13xh, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|2|(2:4|(1:6)(1:14))(0)|7|(1:77)|(1:(4:(1:(1:(5:13|58|59|60|61)(2:15|16))(8:17|71|18|55|(1:57)|59|60|61))(6:21|75|22|70|47|(3:49|50|51)(7:52|(1:54)|55|(0)|59|60|61))|65|68|69)(1:25))(2:26|(2:28|29)(2:30|(1:32)))|73|33|(4:36|(2:39|37)|79|34)|78|40|(1:42)(1:44)|43|(1:46)|70|47|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0222, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0224, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0197 A[Catch: all -> 0x0222, TRY_LEAVE, TryCatch #0 {all -> 0x0222, blocks: (B:55:0x01db, B:47:0x0193, B:49:0x0197, B:52:0x01b5), top: B:70:0x0193 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b5 A[Catch: all -> 0x0222, TRY_ENTER, TryCatch #0 {all -> 0x0222, blocks: (B:55:0x01db, B:47:0x0193, B:49:0x0197, B:52:0x01b5), top: B:70:0x0193 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0218 A[RETURN] */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.13xU] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r3v15, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.01eN, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [X.01eN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.util.List<? extends X.AbstractC1420120n3i> r15, X.InterfaceC1364105Vn<? super X.AbstractC20178613xQ> r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20179013xU.LJ(java.util.List, X.05Vn):java.lang.Object");
    }
}
