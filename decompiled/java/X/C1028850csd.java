package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0csd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1028850csd implements InterfaceC1028700csO, InterfaceC1029020csu, C07LU {
    public final Map<Class<? extends Object>, Object> LIZ = new LinkedHashMap();
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1028860cse(this));
    public final Map<String, Object> LIZJ = new LinkedHashMap();
    public final C1028880csg<?>[] LIZLLL = new C1028880csg[0];

    @Override // X.InterfaceC1029020csu
    public final Map<String, Function1<C1028760csU, Object>> getProvidedLogics() {
        return (Map) this.LIZIZ.getValue();
    }

    @Override // X.C07LU
    public final Map<String, Object> LIZ() {
        return this.LIZJ;
    }

    public C1028880csg<?>[] LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1028700csO
    public final Map<Class<? extends Object>, Object> getProvidedContexts() {
        return this.LIZ;
    }

    public C1028850csd(Object... objArr) {
        Iterator it2 = ((ArrayList) C13LQ.LJIJI(Arrays.copyOf(objArr, objArr.length))).iterator();
        while (it2.hasNext()) {
            C1028710csP.LIZ(this, it2.next());
        }
    }

    public static Map LIZLLL(InterfaceC1023690ckJ[] interfaceC1023690ckJArr, C1028760csU c1028760csU, C1028990csr c1028990csr, C07LV c07lv) {
        Object c252300yH;
        Object obj;
        int iLIZIZ = C2097908Jt.LIZIZ(interfaceC1023690ckJArr.length);
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (InterfaceC1023690ckJ interfaceC1023690ckJ : interfaceC1023690ckJArr) {
            String name = interfaceC1023690ckJ.getName();
            Object obj2 = ((LinkedHashMap) c1028990csr.LIZ).get(interfaceC1023690ckJ.getName());
            C19719512Dh.LJ(1, obj2);
            Function1 function1LIZIZ = (Function1) obj2;
            if (function1LIZIZ == null && (function1LIZIZ = interfaceC1023690ckJ.LIZIZ()) == null) {
                c252300yH = new C252400yI();
            } else {
                Object objInvoke = function1LIZIZ.invoke(c1028760csU);
                interfaceC1023690ckJ.LIZ(objInvoke);
                c252300yH = new C252300yH(objInvoke);
            }
            if (c252300yH instanceof C252300yH) {
                obj = ((C252300yH) c252300yH).LIZ;
                if (obj == null) {
                }
                Pair pair = new Pair(name, obj);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            } else if (!(c252300yH instanceof C252400yI)) {
                throw new C1954807lC();
            }
            obj = ((LinkedHashMap) c07lv.LIZ).get(interfaceC1023690ckJ.getName());
            Pair pair2 = new Pair(name, obj);
            linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
        }
        return linkedHashMap;
    }
}
