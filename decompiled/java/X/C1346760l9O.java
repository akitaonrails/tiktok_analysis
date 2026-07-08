package X;

import Y.AComparatorS40S0000000_21;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS71S1000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l9O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346760l9O {
    public static final List<InterfaceC1346750l9N> LIZ = new ArrayList();
    public static String LIZIZ;

    public static void LIZ(String str) {
        if (Intrinsics.LJFF(LIZIZ, str)) {
            LIZIZ = null;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("guide dismissed: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LIZIZ(InterfaceC1346750l9N interfaceC1346750l9N) {
        List<InterfaceC1346750l9N> list = LIZ;
        if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((InterfaceC1346750l9N) it2.next()).getId(), interfaceC1346750l9N.getId())) {
                    return;
                }
            }
        }
        ((ArrayList) LIZ).add(interfaceC1346750l9N);
        interfaceC1346750l9N.getId();
        Objects.toString(interfaceC1346750l9N.LIZ());
        interfaceC1346750l9N.getPriority();
    }

    public static void LIZJ(EnumC993530bxf enumC993530bxf) {
        Object next;
        if (LIZIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryShowGuide(");
            sbLIZ.append(enumC993530bxf);
            sbLIZ.append(") skipped: ");
            sbLIZ.append(LIZIZ);
            sbLIZ.append(" is showing");
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        EnumC993520bxe compareGroup = enumC993530bxf.getCompareGroup();
        List<InterfaceC1346750l9N> list = LIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (((InterfaceC1346750l9N) obj).LIZ().getCompareGroup() == compareGroup) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            EnumC993530bxf enumC993530bxfLIZ = ((InterfaceC1346750l9N) obj2).LIZ();
            Object arrayList2 = linkedHashMap.get(enumC993530bxfLIZ);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(enumC993530bxfLIZ, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        for (Map.Entry entry : ((TreeMap) C2097908Jt.LIZLLL(C20085613iQ.LIZ(AFwS252S0000000_16.get$arr$(441), AFwS252S0000000_16.get$arr$(442)), linkedHashMap)).entrySet()) {
            Object key = entry.getKey();
            Iterator it2 = C13LP.LJLLLL(new AComparatorS40S0000000_21(8), (Iterable) entry.getValue()).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((InterfaceC1346750l9N) next).LJJLIL()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InterfaceC1346750l9N interfaceC1346750l9N = (InterfaceC1346750l9N) next;
            if (interfaceC1346750l9N != null) {
                if (key == enumC993530bxf) {
                    if (interfaceC1346750l9N.show()) {
                        LIZIZ = interfaceC1346750l9N.getId();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("tryShowGuide(");
                        sbLIZ2.append(enumC993530bxf);
                        sbLIZ2.append(") shown: ");
                        sbLIZ2.append(interfaceC1346750l9N.getId());
                        C2188811AlT.LIZIZ(sbLIZ2);
                        return;
                    }
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("tryShowGuide(");
                sbLIZ3.append(enumC993530bxf);
                sbLIZ3.append(") blocked by scene ");
                sbLIZ3.append(key);
                sbLIZ3.append(": ");
                sbLIZ3.append(interfaceC1346750l9N.getId());
                C2188811AlT.LIZIZ(sbLIZ3);
                return;
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("tryShowGuide(");
        sbLIZ4.append(enumC993530bxf);
        sbLIZ4.append(") no eligible guide");
        C2188811AlT.LIZIZ(sbLIZ4);
    }

    public static void LIZLLL(String str) {
        if (Intrinsics.LJFF(LIZIZ, str)) {
            LIZIZ = null;
        }
        C19719612Di.LJJIIJ(LIZ, new AwS71S1000000_21(str, 2), true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unregister guide: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
