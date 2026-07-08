package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0wh1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1790450wh1 {
    public final C1790550whB LIZ;
    public final C01GW LIZIZ = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new C1783780wWG(this));
    public final C01GW LIZJ = C452501pT.LIZ(EnumC452301pR.NONE, new C1790440wh0());

    public C1790450wh1(C1790550whB c1790550whB) {
        this.LIZ = c1790550whB;
    }

    public final InterfaceC1790610whH LIZ(C1906460zi8 c1906460zi8) {
        Object obj;
        Object next;
        Iterator it2 = ((List) this.LIZJ.getValue()).iterator();
        while (true) {
            obj = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (((InterfaceC1790610whH) next).LIZIZ(c1906460zi8)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1790610whH interfaceC1790610whH = (InterfaceC1790610whH) next;
        if (interfaceC1790610whH != null) {
            return interfaceC1790610whH;
        }
        List list = (List) ((Map) this.LIZIZ.getValue()).get(c1906460zi8.LIZ);
        if (list == null) {
            return null;
        }
        Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (((InterfaceC1790610whH) next2).LIZIZ(c1906460zi8)) {
                obj = next2;
                break;
            }
        }
        return (InterfaceC1790610whH) obj;
    }
}
