package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.proto.hybrid.EcHybridPbDecodeConfigModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.ec.rax.impl.IEcRaxService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS137S1100000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pZw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516980pZw {
    public static final C1516980pZw LIZ = new C1516980pZw();
    public static final IEcRaxService LIZIZ = (IEcRaxService) PluggableExtentionKt.pluggableSpi$default(IEcRaxService.class, false, false, false, 14, null);
    public static final C054G LIZJ = C2296808zG.LIZ(C0PEM.LIZJ);
    public static final List<InterfaceC1516960pZu> LIZLLL = C1697810uHb.LJIIJJI(new C1516930pZr(), new C1516940pZs());
    public static final ConcurrentHashMap<String, AnonymousClass0957<InterfaceC1516910pZp<?>>> LJ = new ConcurrentHashMap<>();

    public static void LIZJ(String str) {
        EcHybridPbDecodeConfigModel ecHybridPbDecodeConfigModel = (EcHybridPbDecodeConfigModel) C1517020pa0.LIZ().get(str);
        if (ecHybridPbDecodeConfigModel != null && ecHybridPbDecodeConfigModel.enableNaPrefetch) {
            LIZLLL(str, C1507400pKU.LIZ);
        }
        EcHybridPbDecodeConfigModel ecHybridPbDecodeConfigModel2 = (EcHybridPbDecodeConfigModel) C1517020pa0.LIZ().get(str);
        if (ecHybridPbDecodeConfigModel2 != null && ecHybridPbDecodeConfigModel2.enableTranscode) {
            LIZLLL(str, C1507330pKN.LIZ);
            return;
        }
        IEcRaxService iEcRaxService = LIZIZ;
        if (iEcRaxService == null) {
            return;
        }
        iEcRaxService.isOpen();
    }

    public static void LIZLLL(String str, InterfaceC1507360pKQ interfaceC1507360pKQ) {
        InterfaceC1516960pZu next;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(interfaceC1507360pKQ.getName());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Iterator<InterfaceC1516960pZu> it2 = LIZLLL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ(interfaceC1507360pKQ)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1516960pZu interfaceC1516960pZu = next;
        if (interfaceC1516960pZu == null) {
            return;
        }
        C099G c099gLIZIZ = C23250099c.LIZIZ(LIZJ, null, C099V.LAZY, new C1516970pZv(interfaceC1516960pZu, interfaceC1507360pKQ, str, null), 1);
        AnonymousClass0957<InterfaceC1516910pZp<?>> anonymousClass0957PutIfAbsent = LJ.putIfAbsent(strLIZIZ, c099gLIZIZ);
        if (anonymousClass0957PutIfAbsent == null) {
            anonymousClass0957PutIfAbsent = c099gLIZIZ;
        }
        if (anonymousClass0957PutIfAbsent != c099gLIZIZ) {
            c099gLIZIZ.LIZIZ(null);
        } else {
            c099gLIZIZ.start();
            c099gLIZIZ.LJII(new AwS137S1100000_23(strLIZIZ, c099gLIZIZ, 11));
        }
    }

    public static void LJ(ConcurrentHashMap concurrentHashMap, Object obj, AnonymousClass0957 anonymousClass0957) {
        if (Build.VERSION.SDK_INT >= 24) {
            concurrentHashMap.remove(obj, anonymousClass0957);
            return;
        }
        synchronized (concurrentHashMap) {
            try {
                if (Intrinsics.LJFF(concurrentHashMap.get(obj), anonymousClass0957)) {
                    concurrentHashMap.remove(obj);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r6, X.InterfaceC1364105Vn r7, X.AnonymousClass0957 r8) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1517000pZy
            if (r0 == 0) goto L24
            r4 = r7
            X.0pZy r4 = (X.C1517000pZy) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZIL
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 != r0) goto L2a
            X.0957 r8 = r4.LLILLJJLI
            java.lang.Object r6 = r4.LL
            goto L42
        L24:
            X.0pZy r4 = new X.0pZy
            r4.<init>(r5, r7)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r6     // Catch: java.lang.Exception -> L4f
            r4.LLILLJJLI = r8     // Catch: java.lang.Exception -> L4f
            r4.LLILZIL = r0     // Catch: java.lang.Exception -> L4f
            java.lang.Object r3 = r8.LJLIIIL(r4)     // Catch: java.lang.Exception -> L4f
            if (r3 != r2) goto L45
            return r2
        L42:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L4f
        L45:
            X.0pZp r3 = (X.InterfaceC1516910pZp) r3     // Catch: java.lang.Exception -> L4f
            if (r3 != 0) goto L59
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0957<X.0pZp<?>>> r0 = X.C1516980pZw.LJ     // Catch: java.lang.Exception -> L4f
            LJ(r0, r6, r8)     // Catch: java.lang.Exception -> L4f
            return r3
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0957<X.0pZp<?>>> r0 = X.C1516980pZw.LJ
            LJ(r0, r6, r8)
            r3 = 0
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1516980pZw.LIZ(java.lang.String, X.05Vn, X.0957):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1507360pKQ r10, java.lang.String r11, X.InterfaceC1364105Vn r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.C1516990pZx
            if (r0 == 0) goto L95
            r6 = r12
            X.0pZx r6 = (X.C1516990pZx) r6
            int r2 = r6.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L95
            int r2 = r2 - r1
            r6.LLIZ = r2
        L12:
            java.lang.Object r8 = r6.LLILZIL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLIZ
            r5 = 2
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L2b
            if (r0 == r4) goto L61
            if (r0 != r5) goto L9d
            X.C155000ia.LIZIZ(r8)
        L26:
            boolean r0 = r8 instanceof X.InterfaceC1516910pZp
            if (r0 == 0) goto L9c
            return r8
        L2b:
            X.C155000ia.LIZIZ(r8)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r11)
            r0 = 95
            r1.append(r0)
            java.lang.String r0 = r10.getName()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0957<X.0pZp<?>>> r0 = X.C1516980pZw.LJ
            java.lang.Object r2 = r0.get(r1)
            X.0957 r2 = (X.AnonymousClass0957) r2
            if (r2 != 0) goto L50
            return r3
        L50:
            r6.LL = r11
            r6.LLILLJJLI = r10
            r6.LLILLL = r1
            r6.LLILZ = r2
            r6.LLIZ = r4
            java.lang.Object r8 = r9.LIZ(r1, r6, r2)
            if (r8 != r7) goto L70
            return r7
        L61:
            X.0957 r2 = r6.LLILZ
            java.lang.Object r1 = r6.LLILLL
            java.lang.String r1 = (java.lang.String) r1
            X.0pKQ r10 = r6.LLILLJJLI
            java.lang.Object r11 = r6.LL
            java.lang.String r11 = (java.lang.String) r11
            X.C155000ia.LIZIZ(r8)
        L70:
            if (r8 == 0) goto L73
            return r8
        L73:
            LIZLLL(r11, r10)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0957<X.0pZp<?>>> r0 = X.C1516980pZw.LJ
            java.lang.Object r0 = r0.get(r1)
            X.0957 r0 = (X.AnonymousClass0957) r0
            if (r0 != 0) goto L81
            return r3
        L81:
            if (r0 != r2) goto L84
            return r3
        L84:
            r6.LL = r3
            r6.LLILLJJLI = r3
            r6.LLILLL = r3
            r6.LLILZ = r3
            r6.LLIZ = r5
            java.lang.Object r8 = r9.LIZ(r1, r6, r0)
            if (r8 != r7) goto L26
            return r7
        L95:
            X.0pZx r6 = new X.0pZx
            r6.<init>(r9, r12)
            goto L12
        L9c:
            return r3
        L9d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1516980pZw.LIZIZ(X.0pKQ, java.lang.String, X.05Vn):java.lang.Object");
    }
}
