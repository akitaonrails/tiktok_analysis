package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS371S0200000_5;

/* JADX INFO: renamed from: X.0FMf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C388790FMf {
    public final C390420FSm LIZ;
    public final List<InterfaceC388800FMg> LIZIZ = new ArrayList();
    public final Map<C13IQ<? extends InterfaceC388800FMg>, List<Function1<InterfaceC388800FMg, Unit>>> LIZJ = new LinkedHashMap();

    public final void LIZ() {
        Iterator<InterfaceC388800FMg> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
    }

    public final void LIZIZ() {
        Iterator<InterfaceC388800FMg> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJI();
        }
    }

    public C388790FMf(C390420FSm c390420FSm) {
        this.LIZ = c390420FSm;
    }

    public final InterfaceC388800FMg LIZJ(C19719912Dl c19719912Dl) {
        Object next;
        Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (c19719912Dl.LIZIZ(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC388800FMg interfaceC388800FMg = (InterfaceC388800FMg) next;
        if (interfaceC388800FMg == null) {
            return null;
        }
        C1300150jwD.LIZ(c19719912Dl, interfaceC388800FMg);
        return interfaceC388800FMg;
    }

    public final void LIZLLL(C0FKZ c0fkz) {
        ((ArrayList) this.LIZIZ).add(c0fkz);
        List<Function1<InterfaceC388800FMg, Unit>> listRemove = this.LIZJ.remove(C13LE.LIZ(c0fkz.getClass()));
        if (listRemove != null) {
            Iterator<Function1<InterfaceC388800FMg, Unit>> it2 = listRemove.iterator();
            while (it2.hasNext()) {
                it2.next().invoke(c0fkz);
            }
        }
    }

    public final void LJ(Function1 function1, C19719912Dl c19719912Dl) {
        InterfaceC388800FMg interfaceC388800FMgLIZJ = LIZJ(c19719912Dl);
        if (interfaceC388800FMgLIZJ != null) {
            function1.invoke(interfaceC388800FMgLIZJ);
            return;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZJ;
        Object arrayList = linkedHashMap.get(c19719912Dl);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(c19719912Dl, arrayList);
        }
        ((List) arrayList).add(new AwS371S0200000_5(function1, c19719912Dl, 281));
    }
}
