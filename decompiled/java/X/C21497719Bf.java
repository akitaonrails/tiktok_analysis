package X;

import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.19Bf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21497719Bf {
    public final InterfaceC21498719Bp LIZ;
    public final InterfaceC21495019Ae LIZIZ;

    public C21497719Bf(C19A6 c19a6, InterfaceC21495019Ae interfaceC21495019Ae) {
        this.LIZ = c19a6;
        this.LIZIZ = interfaceC21495019Ae == null ? new InterfaceC21495019Ae() { // from class: X.13X0
            public final C13E8<InterfaceC214942199w> LIZ = new C13E8<>();
            public final HashMap<InterfaceC214942199w, C13X1> LIZIZ = new HashMap<>();

            @Override // X.InterfaceC21495019Ae
            public final void clear() {
                this.LIZ.clear();
                this.LIZIZ.clear();
            }

            @Override // X.InterfaceC21495019Ae
            public final boolean isEmpty() {
                return this.LIZ.isEmpty();
            }

            @Override // X.InterfaceC21495019Ae
            public final List LIZ(C13X3 c13x3) {
                C13E8<InterfaceC214942199w> c13e8 = this.LIZ;
                ArrayList arrayList = new ArrayList();
                Iterator<InterfaceC214942199w> it2 = c13e8.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
                this.LIZ.removeAll(C13LP.LLIIJI(arrayList));
                return arrayList;
            }

            @Override // X.InterfaceC21495019Ae
            public final boolean LIZIZ(InterfaceC214942199w interfaceC214942199w) {
                if (interfaceC214942199w.W1() && !this.LIZ.contains(interfaceC214942199w)) {
                    this.LIZ.addLast(interfaceC214942199w);
                    this.LIZIZ.put(interfaceC214942199w, C13X1.RELEASED);
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC21495019Ae
            public final Scene LIZJ(C13X2 c13x2) {
                Object next;
                Iterator<InterfaceC214942199w> it2 = this.LIZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (c13x2.LIZ((InterfaceC214942199w) next)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Object obj = (InterfaceC214942199w) next;
                if (obj == null) {
                    return null;
                }
                this.LIZ.remove(obj);
                this.LIZIZ.put((InterfaceC214942199w) obj, C13X1.REUSED);
                return (Scene) obj;
            }

            @Override // X.InterfaceC21495019Ae
            public final C13X1 LIZLLL(InterfaceC214942199w interfaceC214942199w) {
                C13X1 c13x1 = this.LIZIZ.get(interfaceC214942199w);
                if (c13x1 == null) {
                    return C13X1.INITED;
                }
                return c13x1;
            }
        } : interfaceC21495019Ae;
    }
}
