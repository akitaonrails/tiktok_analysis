package X;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.13GE, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13GE {
    public static final InterfaceC19983313Gt[] LIZ = new InterfaceC19983313Gt[0];

    public static final Set<String> LIZ(InterfaceC19983313Gt interfaceC19983313Gt) {
        if (interfaceC19983313Gt instanceof InterfaceC1865240yde) {
            return ((InterfaceC1865240yde) interfaceC19983313Gt).LIZLLL();
        }
        HashSet hashSet = new HashSet(interfaceC19983313Gt.LJ());
        int iLJ = interfaceC19983313Gt.LJ();
        for (int i = 0; i < iLJ; i++) {
            hashSet.add(interfaceC19983313Gt.LIZJ(i));
        }
        return hashSet;
    }

    public static final InterfaceC19983313Gt[] LIZIZ(List<? extends InterfaceC19983313Gt> list) {
        InterfaceC19983313Gt[] interfaceC19983313GtArr;
        if (list == null || list.isEmpty() || (interfaceC19983313GtArr = (InterfaceC19983313Gt[]) list.toArray(new InterfaceC19983313Gt[0])) == null) {
            return LIZ;
        }
        return interfaceC19983313GtArr;
    }

    public static final C13IQ<Object> LIZJ(C09RO c09ro) {
        C09R0 c09r0LJFF = c09ro.LJFF();
        if (c09r0LJFF instanceof C13IQ) {
            return (C13IQ) c09r0LJFF;
        }
        if (c09r0LJFF instanceof C09R2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Captured type parameter ");
            sbLIZ.append(c09r0LJFF);
            sbLIZ.append(" from generic non-reified function. Such functionality cannot be supported because ");
            sbLIZ.append(c09r0LJFF);
            sbLIZ.append(" is erased, either specify serializer explicitly or make calling function inline with reified ");
            sbLIZ.append(c09r0LJFF);
            sbLIZ.append('.');
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Only KClass supported as classifier, got ");
        sbLIZ2.append(c09r0LJFF);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
