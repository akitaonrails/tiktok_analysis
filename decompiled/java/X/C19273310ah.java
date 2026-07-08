package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.10ah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19273310ah implements InterfaceC19271510aP {
    public static final C19273310ah LIZ = new C19273310ah();
    public static final List<InterfaceC19271510aP> LIZIZ = new ArrayList();

    @Override // X.InterfaceC19271510aP
    public final String LIZ() {
        return "web";
    }

    @Override // X.InterfaceC19271510aP
    public final String getName() {
        return "bridge_scan_handler";
    }

    @Override // X.InterfaceC19271510aP
    public final boolean LIZIZ(int i, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(LIZIZ);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC19271510aP) it2.next()).LIZIZ(i, str);
        }
        return false;
    }
}
