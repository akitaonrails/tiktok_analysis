package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17q5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21152317q5 {
    public final C01GW LIZ = C452501pT.LIZIZ(new C21152517q7());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C21152417q6());

    public final List<C06W3> LIZ() {
        return (List) this.LIZIZ.getValue();
    }

    public final void LIZIZ(C06W3 c06w3) {
        if (c06w3 instanceof InterfaceC1255010ilP) {
            LIZ().add(c06w3);
            return;
        }
        List<C06W3> listLIZ = LIZ();
        ArrayList arrayList = new ArrayList();
        for (C06W3 c06w32 : listLIZ) {
            if (Intrinsics.LJFF(c06w32.getClass(), c06w3.getClass())) {
                arrayList.add(c06w32);
            }
        }
        if (!arrayList.isEmpty()) {
            LIZ().removeAll(C13LP.LLIIII(arrayList));
        }
        LIZ().add(c06w3);
    }
}
