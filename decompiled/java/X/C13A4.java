package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.13A4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13A4 implements C13A5 {
    public final List<InterfaceC21434318uT> LIZ;
    public final List<InterfaceC21434318uT> LIZIZ;
    public final Set<InterfaceC21434318uT> LIZJ = new HashSet(3);

    public C13A4(List<InterfaceC21434318uT> list) {
        this.LIZ = list;
        this.LIZIZ = new ArrayList(list.size());
    }

    public final void LIZ(InterfaceC21434318uT interfaceC21434318uT) {
        if (!((ArrayList) this.LIZIZ).contains(interfaceC21434318uT)) {
            if (!((HashSet) this.LIZJ).contains(interfaceC21434318uT)) {
                ((HashSet) this.LIZJ).add(interfaceC21434318uT);
                interfaceC21434318uT.LJIIIIZZ(this);
                ((HashSet) this.LIZJ).remove(interfaceC21434318uT);
                if (!((ArrayList) this.LIZIZ).contains(interfaceC21434318uT)) {
                    if (C21423818sm.class.isAssignableFrom(interfaceC21434318uT.getClass())) {
                        ListProtector.add(this.LIZIZ, 0, interfaceC21434318uT);
                        return;
                    } else {
                        ((ArrayList) this.LIZIZ).add(interfaceC21434318uT);
                        return;
                    }
                }
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cyclic dependency chain found: ");
            sbLIZ.append(this.LIZJ);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final <P extends InterfaceC21434318uT> P LIZJ(Class<P> cls) {
        P p = (P) LIZIZ(cls, this.LIZIZ);
        if (p == null) {
            p = (P) LIZIZ(cls, this.LIZ);
            if (p != null) {
                LIZ(p);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Requested plugin is not added: ");
                sbLIZ.append(cls.getName());
                sbLIZ.append(", plugins: ");
                sbLIZ.append(this.LIZ);
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return p;
    }

    public static InterfaceC21434318uT LIZIZ(Class cls, List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC21434318uT interfaceC21434318uT = (InterfaceC21434318uT) it2.next();
            if (cls.isAssignableFrom(interfaceC21434318uT.getClass())) {
                return interfaceC21434318uT;
            }
        }
        return null;
    }
}
