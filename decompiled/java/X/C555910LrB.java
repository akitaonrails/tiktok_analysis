package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS622S0100000_8;

/* JADX INFO: renamed from: X.0LrB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555910LrB {
    public final Map<String, C2339209Eo> LIZ;
    public final Set<String> LIZIZ;
    public AwS622S0100000_8 LIZJ;
    public volatile String LIZLLL;

    public C555910LrB() {
        this(0);
    }

    public C555910LrB(Map<String, C2339209Eo> map) {
        this.LIZ = map;
        this.LIZIZ = Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public /* synthetic */ C555910LrB(int i) {
        this(new ConcurrentHashMap());
    }

    public static C2339209Eo LIZLLL(C2339209Eo c2339209Eo, C2339209Eo c2339209Eo2) {
        Object c098200Yq;
        Object objLJIIL;
        if (c2339209Eo == null) {
            return c2339209Eo2;
        }
        Object obj = c2339209Eo.LIZIZ;
        Object obj2 = c2339209Eo2.LIZIZ;
        if (obj != null && obj2 != null) {
            if ((obj instanceof List) && (obj2 instanceof List)) {
                objLJIIL = C13LP.LJLIL((Iterable) obj2, (Collection) obj);
            } else if ((obj instanceof Set) && (obj2 instanceof Set)) {
                objLJIIL = C15442062u.LJIIIZ((Set) obj, (Iterable) obj2);
            } else {
                if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
                    return c2339209Eo2;
                }
                objLJIIL = C2097608Jq.LJIIL((Map) obj, (Map) obj2);
            }
            return new C2339209Eo(null, objLJIIL);
        }
        String strLIZJ = c2339209Eo.LIZ;
        if (strLIZJ == null) {
            if (obj != null) {
                strLIZJ = C2338909El.LIZJ(obj);
            } else {
                strLIZJ = null;
            }
        }
        String strLIZJ2 = c2339209Eo2.LIZ;
        if (strLIZJ2 == null) {
            if (obj2 != null) {
                strLIZJ2 = C2338909El.LIZJ(obj2);
            } else {
                strLIZJ2 = null;
            }
        }
        if (strLIZJ != null && strLIZJ.length() != 0 && strLIZJ2 != null && strLIZJ2.length() != 0) {
            ConcurrentHashMap<Class<?>, Boolean> concurrentHashMap = C2338909El.LIZ;
            C470601sO c470601sO = C470601sO.LIZ;
            try {
                C01GW c01gw = C2338909El.LIZJ;
                ((p) c01gw.getValue()).getClass();
                k kVarLIZJ = p.LIZJ(strLIZJ);
                ((p) c01gw.getValue()).getClass();
                k kVarLIZJ2 = p.LIZJ(strLIZJ2);
                if ((kVarLIZJ instanceof h) && (kVarLIZJ2 instanceof h)) {
                    h hVar = new h();
                    Iterator<k> it2 = kVarLIZJ.LJIIL().iterator();
                    while (it2.hasNext()) {
                        hVar.LJJIFFI(it2.next());
                    }
                    Iterator<k> it3 = kVarLIZJ2.LJIIL().iterator();
                    while (it3.hasNext()) {
                        hVar.LJJIFFI(it3.next());
                    }
                    c098200Yq = hVar.toString();
                } else if ((kVarLIZJ instanceof n) && (kVarLIZJ2 instanceof n)) {
                    n nVar = new n();
                    Iterator<T> it4 = kVarLIZJ.LJIILIIL().entrySet().iterator();
                    while (it4.hasNext()) {
                        Map.Entry entry = (Map.Entry) it4.next();
                        nVar.LJJIFFI((String) entry.getKey(), (k) entry.getValue());
                    }
                    Iterator<T> it5 = kVarLIZJ2.LJIILIIL().entrySet().iterator();
                    while (it5.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it5.next();
                        nVar.LJJIFFI((String) entry2.getKey(), (k) entry2.getValue());
                    }
                    c098200Yq = nVar.toString();
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!(th instanceof CancellationException)) {
                    c470601sO.getClass();
                    C470601sO.LIZ(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                } else {
                    throw th;
                }
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String str = (String) c098200Yq;
            if (str == null) {
                return c2339209Eo2;
            }
            return new C2339209Eo(str, null);
        }
        return c2339209Eo2;
    }

    public final Unit LIZ(String str, InterfaceC1406105et interfaceC1406105et) {
        C2339209Eo c2339209Eo;
        boolean z;
        if ((interfaceC1406105et instanceof C2339209Eo) && (c2339209Eo = (C2339209Eo) interfaceC1406105et) != null) {
            C2339209Eo c2339209EoLIZLLL = LIZLLL(this.LIZ.get(str), c2339209Eo);
            this.LIZ.put(str, c2339209EoLIZLLL);
            C0LX3 c0lx3 = C0LX3.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("put artifact: ");
            sbLIZ.append(str);
            sbLIZ.append(", merged=");
            if (c2339209EoLIZLLL != c2339209Eo) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            sbLIZ.append(", runtimeValue=");
            sbLIZ.append(c2339209EoLIZLLL.LIZIZ);
            sbLIZ.append(", serializedValue=");
            sbLIZ.append(c2339209EoLIZLLL.LIZ);
            C201955140j.LIZLLL(c0lx3, "AIGCWorkflowCentralRegistry", C2188811AlT.LIZIZ(sbLIZ));
            AwS622S0100000_8 awS622S0100000_8 = this.LIZJ;
            if (awS622S0100000_8 != null) {
                awS622S0100000_8.invoke(str, c2339209EoLIZLLL);
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0062 -> B:22:0x0076). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r11, java.util.Map<java.lang.String, ? extends X.InterfaceC1406105et> r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C555930LrD
            if (r0 == 0) goto Lb3
            r5 = r13
            X.0LrD r5 = (X.C555930LrD) r5
            int r2 = r5.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb3
            int r2 = r2 - r1
            r5.LLIZ = r2
        L12:
            java.lang.Object r9 = r5.LLILZIL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLIZ
            r6 = 0
            r8 = 1
            r7 = 2
            r3 = 3
            if (r0 == 0) goto L31
            if (r0 == r8) goto L65
            if (r0 == r7) goto L8f
            if (r0 != r3) goto Lba
            X.C155000ia.LIZIZ(r9)
            X.00o6 r9 = (X.C189200o6) r9
            r9.m10unboximpl()
        L2e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L31:
            X.C155000ia.LIZIZ(r9)
            java.util.Set r0 = r12.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L3c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            X.05et r0 = (X.InterfaceC1406105et) r0
            r5.LL = r11
            r5.LLILLJJLI = r12
            r5.LLILLL = r2
            r5.LLILZ = r1
            r5.LLIZ = r8
            kotlin.Unit r0 = r10.LIZ(r1, r0)
            if (r0 != r4) goto L76
            return r4
        L65:
            java.lang.Object r1 = r5.LLILZ
            java.lang.Object r2 = r5.LLILLL
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r12 = r5.LLILLJJLI
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r11 = r5.LL
            java.lang.String r11 = (java.lang.String) r11
            X.C155000ia.LIZIZ(r9)
        L76:
            java.util.Set<java.lang.String> r0 = r10.LIZIZ
            r0.add(r1)
            goto L3c
        L7c:
            r5.LL = r11
            r5.LLILLJJLI = r12
            r5.LLILLL = r10
            r5.LLILZ = r6
            r5.LLIZ = r7
            java.lang.Object r9 = X.C556540LsC.LIZ(r10, r5)
            if (r9 != r4) goto L8d
            return r4
        L8d:
            r0 = r10
            goto L9e
        L8f:
            java.lang.Object r0 = r5.LLILLL
            X.0LrB r0 = (X.C555910LrB) r0
            java.lang.Object r12 = r5.LLILLJJLI
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r11 = r5.LL
            java.lang.String r11 = (java.lang.String) r11
            X.C155000ia.LIZIZ(r9)
        L9e:
            java.lang.String r9 = (java.lang.String) r9
            r0.LIZLLL = r9
            X.1DpL r0 = X.C2267651DpL.LIZ
            r5.LL = r6
            r5.LLILLJJLI = r6
            r5.LLILLL = r6
            r5.LLIZ = r3
            java.lang.Object r0 = r0.LJIILL(r11, r12, r5)
            if (r0 != r4) goto L2e
            return r4
        Lb3:
            X.0LrD r5 = new X.0LrD
            r5.<init>(r10, r13)
            goto L12
        Lba:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555910LrB.LIZJ(java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0160  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b9 -> B:34:0x00d1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r14, java.util.Map r15, X.InterfaceC1364105Vn r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555910LrB.LIZIZ(java.lang.String, java.util.Map, X.05Vn, boolean):java.lang.Object");
    }
}
