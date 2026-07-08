package X;

import Y.ACallableS416S0100000_9;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS146S1200000_31;

/* JADX INFO: renamed from: X.161b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207069161b {
    public static final C207069161b LIZ = new C207069161b();

    public static void LIZ(C207071161d c207071161d, String str, Map map) {
        if (c207071161d.LIZJ) {
            String value = c207071161d.LIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(": ");
            sbLIZ.append(map);
            C2344809Gs.LIZLLL(5, value, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @InterfaceC1294060jmO
    public static final void LJFF(C207071161d c207071161d, String str, Map map) {
        boolean z;
        if (((Number) C257540A7k.LIZ.getValue()).intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LIZ.getClass();
            if (c207071161d.LIZLLL) {
                C807840VmY.LIZIZ(C807350Vll.LIZIZ.LIZIZ(null), map);
            }
            C20684815ws.LJIILLIIL(str, map);
            LIZ(c207071161d, str, map);
            return;
        }
        C15O7.LIZIZ(new ACallableS416S0100000_9(new AwS146S1200000_31(c207071161d, str, map, 11), 10), C20684815ws.LJFF(), null);
    }

    public static final void LIZJ(Class<? extends AbstractC207072161e> cls, final InterfaceC665370Q7z interfaceC665370Q7z, C207071161d c207071161d, List<? extends InterfaceC1282004zy> list) {
        LJ(cls, new C017D() { // from class: X.0S5v
            @Override // X.C017D
            public final List<InterfaceC1282004zy> LIZ(List<? extends Class<? extends InterfaceC0241006d>> list2) {
                List listLIZIZ;
                InterfaceC0241006d interfaceC0241006dMb0;
                InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
                ArrayList arrayList = null;
                if (interfaceC665370Q7z2 != null && (listLIZIZ = C1554610qYd.LIZIZ(interfaceC665370Q7z2, ETParamsProvider.class, false)) != null) {
                    arrayList = new ArrayList();
                    for (ETParamsProvider eTParamsProvider : (ArrayList) listLIZIZ) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<? extends Class<? extends InterfaceC0241006d>> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (eTParamsProvider.lt2(it2.next()) && (interfaceC0241006dMb0 = eTParamsProvider.Mb0()) != null) {
                                arrayList2.add(interfaceC0241006dMb0);
                            }
                        }
                        C19719612Di.LJJI(arrayList2, arrayList);
                    }
                }
                return arrayList;
            }
        }, c207071161d, list, 16);
    }

    public static void LIZIZ(C207071161d c207071161d, C017D c017d, Class cls, List list, Function1 function1) {
        AbstractC207072161e abstractC207072161e = (AbstractC207072161e) cls.newInstance();
        Class[] clsArrLIZ = C2806016u.LIZ(cls.getName());
        if (clsArrLIZ != null) {
            ArrayList arrayList = new ArrayList();
            for (Class cls2 : clsArrLIZ) {
                if (InterfaceC0241006d.class.isAssignableFrom(cls2)) {
                    arrayList.add(cls2);
                }
            }
            List<InterfaceC1282004zy> listLIZ = c017d.LIZ(arrayList);
            if (listLIZ != null) {
                Iterator<InterfaceC1282004zy> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    abstractC207072161e.LJII(it2.next());
                }
            }
            List listLJJJJLI = C13LP.LJJJJLI(list);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJJJLI, 10));
            Iterator it3 = ((ArrayList) listLJJJJLI).iterator();
            while (it3.hasNext()) {
                abstractC207072161e.LJII((InterfaceC1282004zy) it3.next());
                arrayList2.add(abstractC207072161e);
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            C207069161b c207069161b = LIZ;
            Map<String, String> map = c2344009Gk.LIZ;
            c207069161b.getClass();
            if (c207071161d.LIZLLL) {
                C807840VmY.LIZIZ(C807350Vll.LIZIZ.LIZIZ(null), map);
            }
            for (Map.Entry entry : ((HashMap) c2344009Gk.LIZ).entrySet()) {
                abstractC207072161e.LJI(entry.getValue(), (String) entry.getKey());
            }
            if (function1 != null) {
                function1.invoke(abstractC207072161e);
            }
            abstractC207072161e.LJIIIIZZ();
            LIZ(c207071161d, abstractC207072161e.LIZ, abstractC207072161e.LIZLLL());
        }
    }

    public static final void LIZLLL(final C207071161d c207071161d, final C017D c017d, final Class cls, final List list, final Function1 function1) {
        if (c207071161d.LIZIZ) {
            C15O7.LIZIZ(new Callable() { // from class: X.161c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("CLAETHelper@dea0.triggerCLAEvent$1");
                    C207069161b c207069161b = C207069161b.LIZ;
                    Class<? extends AbstractC207072161e> cls2 = cls;
                    List<InterfaceC1282004zy> list2 = list;
                    C017D c017d2 = c017d;
                    C207071161d c207071161d2 = c207071161d;
                    Function1<AbstractC207072161e, Unit> function12 = function1;
                    c207069161b.getClass();
                    C207069161b.LIZIZ(c207071161d2, c017d2, cls2, list2, function12);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CLAETHelper@dea0.triggerCLAEvent$1");
                    return unit;
                }
            }, C20684815ws.LJFF(), null);
        } else {
            LIZ.getClass();
            LIZIZ(c207071161d, c017d, cls, list, function1);
        }
    }

    public static void LJ(Class cls, C017D c017d, C207071161d c207071161d, List list, int i) {
        if ((i & 8) != 0) {
            list = C13BV.INSTANCE;
        }
        LIZLLL(c207071161d, c017d, cls, list, null);
    }
}
