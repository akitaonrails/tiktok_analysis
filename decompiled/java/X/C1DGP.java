package X;

import bn3.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1DGP, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DGP {
    /* JADX WARN: Type inference failed for: r4v0, types: [X.1DGG] */
    public static final C1DGO LIZ(Function1 function1) {
        Object next;
        C1DGK c1dgk;
        C1DGR c1dgr = new C1DGR();
        function1.invoke(c1dgr);
        Collection collectionValues = c1dgr.LIZIZ.values();
        Iterator it2 = collectionValues.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C1DGQ) next).LIZIZ) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1DGQ c1dgq = (C1DGQ) next;
        if (c1dgq == null || (c1dgk = c1dgq.LIZ) == null) {
            c1dgk = ((C1DGQ) C13LP.LJJJJZ(collectionValues)).LIZ;
        }
        C13DA c13da = new C13DA();
        for (Map.Entry entry : c1dgr.LIZIZ.entrySet()) {
            C1DGK c1dgk2 = (C1DGK) entry.getKey();
            C1DGV c1dgv = new C1DGV(((C1DGQ) entry.getValue()).LIZLLL);
            c13da.put(c1dgk2, new C1DGJ(new C1DGW(c1dgv, c1dgr), new C1DGX(c1dgk2, c1dgv)));
        }
        final Map mapBuild = c13da.build();
        ?? r4 = new C1DGI<KEY>(mapBuild) { // from class: X.1DGG
            public final Map<C1DGK<KEY>, C1DGJ> LIZ;
            public final Map<C1DGK<KEY>, C1DKA> LIZIZ = new LinkedHashMap();
            public final Map<C1DGK<KEY>, Map<Class<C1DGM>, C1DGM>> LIZJ = new LinkedHashMap();

            {
                this.LIZ = mapBuild;
            }

            @Override // X.C1DGI
            public final C1DKA LIZIZ(C1DGK<KEY> c1dgk3) {
                return LIZJ(c1dgk3);
            }

            public final C1DKA LIZJ(C1DGK<KEY> c1dgk3) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZIZ;
                Object obj = linkedHashMap.get(c1dgk3);
                if (obj == null) {
                    obj = (C1DKA) LIZLLL(c1dgk3).LIZ.invoke();
                    linkedHashMap.put(c1dgk3, obj);
                }
                return (C1DKA) obj;
            }

            public final C1DGJ LIZLLL(C1DGK<KEY> c1dgk3) {
                C1DGJ c1dgj = this.LIZ.get(c1dgk3);
                if (c1dgj != null) {
                    return c1dgj;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("context of session [");
                sbLIZ.append(c1dgk3);
                sbLIZ.append("] not found");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalArgumentException(strLIZIZ);
            }

            @Override // X.C1DGI
            public final C1DKA LIZ(C1DGK<KEY> c1dgk3, C1DGK<KEY> c1dgk4) {
                C1DKA c1dkaLIZJ = LIZJ(c1dgk4);
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZJ;
                Object objLIZIZ = linkedHashMap.get(c1dgk4);
                if (objLIZIZ == null) {
                    objLIZIZ = LIZLLL(c1dgk4).LIZIZ.LIZIZ();
                    linkedHashMap.put(c1dgk4, objLIZIZ);
                }
                C13LP.LLIIII(((Map) objLIZIZ).values());
                if (c1dgk3 != null) {
                    C1DKA c1dkaLIZ = LIZLLL(c1dgk3).LIZIZ.LIZ(c1dgk4, c1dkaLIZJ, LIZJ(c1dgk3));
                    if (c1dkaLIZ != null) {
                        c1dkaLIZJ = c1dkaLIZ;
                    }
                }
                this.LIZIZ.put(c1dgk4, c1dkaLIZJ);
                return c1dkaLIZJ;
            }
        };
        a aVar = new a();
        Function1<? super a, Unit> function12 = c1dgr.LIZ;
        if (function12 != null) {
            function12.invoke(aVar);
        }
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptureLog globalContext: ");
        sbLIZ.append(aVar);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        C1DGO c1dgo = new C1DGO(c1dgk, r4, new AwS579S0100000_35(aVar, 11));
        c1dgo.LIZLLL = new C2250101D5c(c1dgr);
        return c1dgo;
    }
}
