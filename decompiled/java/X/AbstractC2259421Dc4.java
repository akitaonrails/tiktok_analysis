package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.1Dc4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2259421Dc4 {
    static {
        new C2259361Dby();
    }

    public static InterfaceC2259401Dc2 LIZJ(InterfaceC2259411Dc3 interfaceC2259411Dc3) {
        for (InterfaceC2259391Dc1 interfaceC2259391Dc1 : interfaceC2259411Dc3.LIZ()) {
            if (interfaceC2259391Dc1.LJFF() != null) {
                return interfaceC2259391Dc1.LJFF();
            }
        }
        return null;
    }

    public static InterfaceC2259411Dc3 LIZLLL(InterfaceC2259401Dc2 interfaceC2259401Dc2, String str) {
        return LJ(interfaceC2259401Dc2, str.split("/"), 0);
    }

    public static InterfaceC2259401Dc2 LJII(C2259441Dc6 c2259441Dc6, String str) {
        InterfaceC2259401Dc2 interfaceC2259401Dc2LIZIZ = c2259441Dc6.LIZIZ(str);
        if (interfaceC2259401Dc2LIZIZ != null) {
            return interfaceC2259401Dc2LIZIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unexpected state, requested language is not found: ");
        sbLIZ.append(str);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static C2259371Dbz LIZIZ(InterfaceC2259401Dc2 interfaceC2259401Dc2, String str, InterfaceC2259411Dc3... interfaceC2259411Dc3Arr) {
        int length = interfaceC2259411Dc3Arr.length;
        if (length == 0) {
            return new C2259371Dbz(str, C2259361Dby.LIZ(new C1DQC(), interfaceC2259401Dc2).LIZ());
        }
        HashMap map = new HashMap(length);
        for (InterfaceC2259411Dc3 interfaceC2259411Dc3 : interfaceC2259411Dc3Arr) {
            map.put(interfaceC2259411Dc3.name(), interfaceC2259411Dc3);
        }
        List<InterfaceC2259411Dc3> listLIZ = interfaceC2259401Dc2.LIZ();
        ArrayList arrayList = new ArrayList(listLIZ.size());
        for (InterfaceC2259411Dc3 interfaceC2259411Dc32 : listLIZ) {
            Object obj = map.get(interfaceC2259411Dc32.name());
            if (obj != null) {
                arrayList.add(obj);
            } else {
                arrayList.add(C2259361Dby.LIZIZ(new C1DQC(), interfaceC2259411Dc32));
            }
        }
        return new C2259371Dbz(str, arrayList);
    }

    public static InterfaceC2259411Dc3 LJ(InterfaceC2259401Dc2 interfaceC2259401Dc2, String[] strArr, int i) {
        boolean z;
        String str = strArr[i];
        if (i == strArr.length - 1) {
            z = true;
        } else {
            z = false;
        }
        for (InterfaceC2259411Dc3 interfaceC2259411Dc3 : interfaceC2259401Dc2.LIZ()) {
            if (str.equals(interfaceC2259411Dc3.name())) {
                if (z) {
                    return interfaceC2259411Dc3;
                }
                InterfaceC2259401Dc2 interfaceC2259401Dc2LIZJ = LIZJ(interfaceC2259411Dc3);
                if (interfaceC2259401Dc2LIZJ != null) {
                    return LJ(interfaceC2259401Dc2LIZJ, strArr, i + 1);
                }
                return null;
            }
        }
        return null;
    }

    public static void LJFF(InterfaceC2259401Dc2 interfaceC2259401Dc2, String str, InterfaceC2259411Dc3... interfaceC2259411Dc3Arr) {
        if (interfaceC2259411Dc3Arr.length != 0) {
            LJI(interfaceC2259401Dc2, str.split("/"), 0, interfaceC2259411Dc3Arr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    public static C2259371Dbz LIZ(InterfaceC2259401Dc2 interfaceC2259401Dc2, String str, InterfaceC2259431Dc5 interfaceC2259431Dc5, InterfaceC2259411Dc3... interfaceC2259411Dc3Arr) {
        ?? map;
        int length = interfaceC2259411Dc3Arr.length;
        if (length == 0) {
            map = Collections.emptyMap();
        } else {
            map = new HashMap(length);
            for (InterfaceC2259411Dc3 interfaceC2259411Dc3 : interfaceC2259411Dc3Arr) {
                map.put(interfaceC2259411Dc3.name(), interfaceC2259411Dc3);
            }
        }
        List<InterfaceC2259411Dc3> listLIZ = interfaceC2259401Dc2.LIZ();
        ArrayList arrayList = new ArrayList(listLIZ.size());
        for (InterfaceC2259411Dc3 interfaceC2259411Dc32 : listLIZ) {
            if (interfaceC2259431Dc5.LIZ(interfaceC2259411Dc32)) {
                Object obj = map.get(interfaceC2259411Dc32.name());
                if (obj != null) {
                    arrayList.add(obj);
                } else {
                    arrayList.add(C2259361Dby.LIZIZ(new C1DQC(), interfaceC2259411Dc32));
                }
            }
        }
        return new C2259371Dbz(str, arrayList);
    }

    public static void LJI(InterfaceC2259401Dc2 interfaceC2259401Dc2, String[] strArr, int i, InterfaceC2259411Dc3[] interfaceC2259411Dc3Arr) {
        boolean z;
        String str = strArr[i];
        if (i == strArr.length - 1) {
            z = true;
        } else {
            z = false;
        }
        List<InterfaceC2259411Dc3> listLIZ = interfaceC2259401Dc2.LIZ();
        int size = listLIZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC2259411Dc3 interfaceC2259411Dc3 = (InterfaceC2259411Dc3) ListProtector.get(listLIZ, i2);
            if (str.equals(interfaceC2259411Dc3.name())) {
                if (z) {
                    int length = interfaceC2259411Dc3Arr.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        ListProtector.add(listLIZ, i2 + i3, interfaceC2259411Dc3Arr[i3]);
                    }
                    return;
                }
                InterfaceC2259401Dc2 interfaceC2259401Dc2LIZJ = LIZJ(interfaceC2259411Dc3);
                if (interfaceC2259401Dc2LIZJ != null) {
                    LJI(interfaceC2259401Dc2LIZJ, strArr, i + 1, interfaceC2259411Dc3Arr);
                    return;
                }
                return;
            }
        }
    }
}
