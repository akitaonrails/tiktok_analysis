package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.0Eyk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382240Eyk {
    public final List<C1893907bN> LIZ;
    public final AFwS191S0000000_5 LIZIZ;

    public C382240Eyk() {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        this.LIZIZ = AFwS191S0000000_5.get$arr$(409);
        Set<EnumC379630EuX> set = new C382160Eyc().LIZJ;
        AFwS191S0000000_5 aFwS191S0000000_5 = AFwS191S0000000_5.get$arr$(407);
        C19719612Di.LJJIIJ(arrayList, new AwS582S0100000_3((Set) set, (Set<String>) 159), true);
        arrayList.add(new C1893907bN(set, aFwS191S0000000_5));
        C08CX c08cx = new C382390Eyz().LIZ;
        AFwS191S0000000_5 aFwS191S0000000_52 = AFwS191S0000000_5.get$arr$(408);
        C19719612Di.LJJIIJ(arrayList, new AwS582S0100000_3((Set) c08cx, (Set<String>) 159), true);
        arrayList.add(new C1893907bN(c08cx, aFwS191S0000000_52));
    }

    public final InterfaceC381790Ey1 LIZ(EnumC379630EuX enumC379630EuX) {
        Object next;
        Function0<InterfaceC381790Ey1> function0;
        InterfaceC381790Ey1 interfaceC381790Ey1Invoke;
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C1893907bN) next).LIZ.contains(enumC379630EuX)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1893907bN c1893907bN = (C1893907bN) next;
        if (c1893907bN != null && (function0 = c1893907bN.LIZIZ) != null && (interfaceC381790Ey1Invoke = function0.invoke()) != null) {
            return interfaceC381790Ey1Invoke;
        }
        this.LIZIZ.getClass();
        return new C382160Eyc();
    }
}
