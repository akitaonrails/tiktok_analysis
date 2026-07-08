package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Z0A, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z0A {
    public final ExecutorService LIZ;
    public Function2<? super String, ? super Map<String, String>, Unit> LJFF;
    public volatile boolean LJI;
    public final Map<InterfaceC892680Z0g, List<InterfaceC892680Z0g>> LIZIZ = new LinkedHashMap();
    public final Map<String, InterfaceC892680Z0g> LIZJ = new LinkedHashMap();
    public final Map<InterfaceC892680Z0g, List<C0Z0D>> LIZLLL = new LinkedHashMap();
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final C01GW LJII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 10));

    public final List<InterfaceC892680Z0g> LIZJ() {
        return (List) this.LJII.getValue();
    }

    public C0Z0A(ExecutorService executorService) {
        this.LIZ = executorService;
    }

    public static void LJFF(C0Z0A c0z0a) {
        Object c098200Yq;
        try {
            List<InterfaceC892680Z0g> listLIZJ = c0z0a.LIZJ();
            ArrayList arrayList = new ArrayList();
            for (InterfaceC892680Z0g interfaceC892680Z0g : listLIZJ) {
                if (interfaceC892680Z0g instanceof C0Z03) {
                    arrayList.add(interfaceC892680Z0g);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C0Z03) it2.next()).releaseResource();
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m8isSuccessimpl(c098200Yq);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public static Object LIZIZ(C0Z0D c0z0d, InterfaceC1364105Vn interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        c0z0d.LIZ(new C0Z09(c2252611DEt));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public final C0Z0P LIZLLL(String str, List list) throws C892820Z0u {
        InterfaceC892680Z0g interfaceC892680Z0g = (InterfaceC892680Z0g) ((LinkedHashMap) this.LIZJ).get("start");
        if (interfaceC892680Z0g != null) {
            C882890YkJ c882890YkJ = (C882890YkJ) C13LP.LJJJLL(list);
            if (c882890YkJ != null) {
                int size = ((ArrayList) list).size();
                C882890YkJ c882890YkJ2 = c882890YkJ;
                for (int i = 1; i < size; i++) {
                    if (c882890YkJ2 == null) {
                        c882890YkJ2 = null;
                    } else {
                        c882890YkJ2.LJI = (C882890YkJ) ListProtector.get(list, i);
                        c882890YkJ2 = c882890YkJ2.LJI;
                    }
                }
                return new C0Z0P(interfaceC892680Z0g, this, this.LIZ, new C0Z0O(interfaceC892680Z0g, c882890YkJ, str));
            }
            throw new C892820Z0u("first data pack is empty in packBatch", "runtime");
        }
        throw new RuntimeException("can not find start node");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Z08] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C0Z03 r8, X.InterfaceC1364105Vn<java.lang.Object> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0Z0C
            if (r0 == 0) goto L4e
            r6 = r9
            X.0Z0C r6 = (X.C0Z0C) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L26
            if (r0 == r2) goto L3d
            if (r0 != r3) goto L54
            X.C155000ia.LIZIZ(r5)
        L25:
            return r5
        L26:
            X.C155000ia.LIZIZ(r5)
            X.099F r1 = X.C090F.LIZIZ()
            X.0Z08 r0 = new X.0Z08
            r0.<init>()
            r6.LL = r1
            r6.LLILZ = r2
            java.lang.Object r0 = r8.LJI(r0, r6)
            if (r0 != r4) goto L42
            return r4
        L3d:
            X.099F r1 = r6.LL
            X.C155000ia.LIZIZ(r5)
        L42:
            r0 = 0
            r6.LL = r0
            r6.LLILZ = r3
            java.lang.Object r5 = r1.LJLIIIL(r6)
            if (r5 != r4) goto L25
            return r4
        L4e:
            X.0Z0C r6 = new X.0Z0C
            r6.<init>(r7, r9)
            goto L12
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z0A.LJ(X.0Z03, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(final X.C0Z03 r8, final X.InterfaceC882520Yji r9, final java.util.concurrent.atomic.AtomicBoolean r10, X.InterfaceC1364105Vn<java.lang.Object> r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C0Z0B
            if (r0 == 0) goto L4e
            r6 = r11
            X.0Z0B r6 = (X.C0Z0B) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L26
            if (r0 == r2) goto L3d
            if (r0 != r3) goto L54
            X.C155000ia.LIZIZ(r5)
        L25:
            return r5
        L26:
            X.C155000ia.LIZIZ(r5)
            X.099F r1 = X.C090F.LIZIZ()
            X.0Z00 r0 = new X.0Z00
            r0.<init>()
            r6.LL = r1
            r6.LLILZ = r2
            java.lang.Object r0 = r8.LIZIZ(r0, r6)
            if (r0 != r4) goto L42
            return r4
        L3d:
            X.099F r1 = r6.LL
            X.C155000ia.LIZIZ(r5)
        L42:
            r0 = 0
            r6.LL = r0
            r6.LLILZ = r3
            java.lang.Object r5 = r1.LJLIIIL(r6)
            if (r5 != r4) goto L25
            return r4
        L4e:
            X.0Z0B r6 = new X.0Z0B
            r6.<init>(r7, r11)
            goto L12
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z0A.LIZ(X.0Z03, X.0Yji, java.util.concurrent.atomic.AtomicBoolean, X.05Vn):java.lang.Object");
    }
}
