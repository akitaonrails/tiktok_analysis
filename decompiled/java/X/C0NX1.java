package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS87S1000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NX1, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NX1 implements C0NXS {
    public final C0NXT LIZ;
    public final C0NXA LIZIZ;
    public final C595330NWp LIZJ;
    public final C595910NYv LIZLLL;
    public final C0NYW LJ;
    public final C0NXG LJFF;
    public final C595510NXh LJI;
    public final C595280NWk LJII;
    public final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public final String LJIIIZ;
    public volatile AnonymousClass0956 LJIIJ;
    public final C01GW LJIIJJI;
    public final C054G LJIIL;
    public final C2252331DDr LJIILIIL;
    public final C2252331DDr LJIILJJIL;
    public final C01GW LJIILL;
    public final C01GW LJIILLIIL;

    public final C592050NJz LJFF() {
        return (C592050NJz) this.LJIILLIIL.getValue();
    }

    public final void LJIIIIZZ() {
        AnonymousClass0956 anonymousClass0956 = this.LJIIJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        InterfaceC595310NWn interfaceC595310NWn = this.LIZLLL.LIZIZ;
        if (interfaceC595310NWn != null && interfaceC595310NWn.LIZIZ()) {
            LIZIZ(this.LIZ, "fetch is intercepted, startPolling return", null);
        } else {
            C0NXR.LIZLLL(this, this.LIZ, "start polling");
            this.LJIIJ = C23250099c.LIZLLL(this.LJIIL, null, null, new C595430NWz(this, null), 3);
        }
    }

    @Override // X.C0NXS
    public final String getTag() {
        return this.LJIIIZ;
    }

    public final void LIZ(List<String> list) {
        C0NXK c0nxkLIZ;
        C0NX7 c0nx7LIZ;
        C0NXA c0nxa = this.LIZIZ;
        c0nxa.getClass();
        if (list.isEmpty()) {
            C0NXR.LIZ(c0nxa, c0nxa.LIZ, "activateCache, uid list is empty");
        } else {
            synchronized (c0nxa.LJI) {
                try {
                    for (String str : list) {
                        C0NX7 c0nx7 = c0nxa.LIZIZ().get(str);
                        if (c0nx7 != null && (c0nx7LIZ = C0NX7.LIZ(c0nx7, 0, 0L, null, null, null, null, 63)) != null) {
                            c0nxa.LIZIZ().put(str, C0NX7.LIZ(c0nx7LIZ, c0nx7LIZ.LIZ + 1, 0L, null, null, null, null, 62));
                        } else {
                            C0NX7 c0nx72 = c0nxa.LJI().get(str);
                            if (c0nx72 == null) {
                                c0nx72 = c0nxa.LJFF().get(str);
                            }
                            ConcurrentHashMap<String, C0NX7> concurrentHashMapLIZIZ = c0nxa.LIZIZ();
                            if (c0nx72 == null || (c0nxkLIZ = c0nx72.LJ) == null) {
                                c0nxkLIZ = C0NX8.LIZ(str);
                            }
                            concurrentHashMapLIZIZ.put(str, new C0NX7(1, 0L, c0nxkLIZ, 46));
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (!C595320NWo.LIZ(this.LIZJ).LJIIZILJ) {
            C0NXA c0nxa2 = this.LIZIZ;
            c0nxa2.getClass();
            ArrayList arrayList = new ArrayList();
            for (String str2 : list) {
                C0NX7 c0nx73 = c0nxa2.LIZIZ().get(str2);
                if (c0nx73 != null && c0nxa2.LIZLLL.LIZIZ(c0nx73.LJ, Long.valueOf(c0nx73.LIZIZ))) {
                    arrayList.add(str2);
                }
            }
            C23250099c.LIZLLL(this.LJIIL, null, null, new C595230NWf(this, arrayList, null), 3);
        }
    }

    public final void LJ(List<String> list) {
        C0NXA c0nxa = this.LIZIZ;
        c0nxa.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            C0NX7 c0nx7 = c0nxa.LIZIZ().get(str);
            if (c0nx7 == null || c0nxa.LIZLLL.LIZIZ(c0nx7.LJ, Long.valueOf(c0nx7.LIZIZ))) {
                arrayList.add(str);
            }
        }
        C23250099c.LIZLLL(this.LJIIL, null, null, new C595240NWg(this, arrayList, null), 3);
    }

    public final void LJI(List<String> list) {
        C0NX7 c0nx7LIZ;
        C0NXA c0nxa = this.LIZIZ;
        synchronized (c0nxa.LJI) {
            try {
                for (String str : list) {
                    C0NX7 c0nx7 = c0nxa.LIZIZ().get(str);
                    if (c0nx7 != null && (c0nx7LIZ = C0NX7.LIZ(c0nx7, 0, 0L, null, null, null, null, 63)) != null) {
                        if (c0nx7LIZ.LIZ == 1) {
                            C0NXR.LIZIZ(c0nxa, c0nxa.LIZ, C595320NWo.LIZ(c0nxa.LJ).LJIIJJI, new AwS87S1000000_2(str, 36));
                            C0NX7 c0nx7Remove = c0nxa.LIZIZ().remove(str);
                            if (c0nx7Remove != null) {
                                c0nxa.LJI().put(str, c0nx7Remove);
                            }
                        } else {
                            c0nxa.LIZIZ().put(str, C0NX7.LIZ(c0nx7LIZ, c0nx7LIZ.LIZ - 1, 0L, null, null, null, null, 62));
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJII(List<C0NXK> list) {
        if (list.isEmpty()) {
            return;
        }
        C23250099c.LIZLLL(this.LJIIL, null, null, new C595250NWh(this, list, null), 3);
    }

    @Override // X.C0NXS
    public final void LIZJ(C0NXT c0nxt, String str) {
        C0NXR.LIZ(this, c0nxt, str);
    }

    public final void LIZIZ(C0NXT c0nxt, String str, Throwable th) {
        C0NXR.LIZJ(this, c0nxt, str, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012d A[LOOP:0: B:50:0x0127->B:52:0x012d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01aa  */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0NYv] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v0, types: [X.0NX1, X.0NXS] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006d -> B:12:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r22, java.util.List r23, X.InterfaceC1364105Vn r24) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NX1.LIZLLL(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    public final void LJIIIZ(String str, List list, List list2) {
        C595220NWe c595220NWe;
        C0NXA c0nxa = this.LIZIZ;
        if (list2 != null) {
            c595220NWe = (C595220NWe) C13LP.LJJLIIIJJI(list2);
        } else {
            c595220NWe = null;
        }
        Map<String, Boolean> mapLJII = c0nxa.LJII(list, false, c595220NWe, str);
        if (C595320NWo.LIZ(this.LIZJ).LJIILLIIL) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.LJFF(((LinkedHashMap) mapLJII).get(((C0NXK) obj).LIZ), Boolean.TRUE)) {
                    arrayList.add(obj);
                }
            }
            LJII(arrayList);
            return;
        }
        LJII(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a A[LOOP:0: B:44:0x0104->B:46:0x010a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d4 A[LOOP:3: B:73:0x01ce->B:75:0x01d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0276  */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.0NXA] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r20v0, types: [X.0NX1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0067 -> B:12:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(java.lang.String r21, java.util.List r22, X.InterfaceC1364105Vn r23) {
        /*
            Method dump skipped, instruction units count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NX1.LJIIJ(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    public C0NX1(C0NY7 c0ny7, C0NXT c0nxt, C0NXA c0nxa, C595330NWp c595330NWp, C595910NYv c595910NYv, C0NYW c0nyw, C0NXG c0nxg, C595510NXh c595510NXh, C595280NWk c595280NWk, C0NX9 c0nx9) {
        this.LIZ = c0nxt;
        this.LIZIZ = c0nxa;
        this.LIZJ = c595330NWp;
        this.LIZLLL = c595910NYv;
        this.LJ = c0nyw;
        this.LJFF = c0nxg;
        this.LJI = c595510NXh;
        this.LJII = c595280NWk;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[DataSource][");
        sbLIZ.append(c0ny7.LIZ);
        sbLIZ.append(']');
        this.LJIIIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LJIIJJI = C452501pT.LIZIZ(new C0NX4(this));
        this.LJIIL = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LJIILIIL = c2252331DDrLIZIZ;
        this.LJIILJJIL = c2252331DDrLIZIZ;
        this.LJIILL = C452501pT.LIZIZ(new C0NX6(c0nx9));
        this.LJIILLIIL = C452501pT.LIZIZ(new C0NX0(this));
    }
}
