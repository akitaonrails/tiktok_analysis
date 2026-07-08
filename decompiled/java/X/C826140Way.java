package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0Way, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826140Way {
    public static final CopyOnWriteArrayList<InterfaceC826180Wb2> LIZ = new CopyOnWriteArrayList<>();

    public static C826130Wax LIZ(Object obj) {
        Iterator it2 = ((ArrayList) LIZIZ(obj)).iterator();
        while (it2.hasNext()) {
            C826130Wax c826130WaxLIZJ = ((InterfaceC826180Wb2) it2.next()).LIZJ(obj);
            if (c826130WaxLIZJ != null) {
                return c826130WaxLIZJ;
            }
        }
        return null;
    }

    public static List LIZIZ(Object obj) {
        Class<?> cls = obj.getClass();
        CopyOnWriteArrayList<InterfaceC826180Wb2> copyOnWriteArrayList = LIZ;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC826180Wb2 interfaceC826180Wb2 : copyOnWriteArrayList) {
            List<Class<?>> listLIZ = interfaceC826180Wb2.LIZ();
            if (!(listLIZ instanceof Collection) || !listLIZ.isEmpty()) {
                Iterator<Class<?>> it2 = listLIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (it2.next().isAssignableFrom(cls)) {
                        arrayList.add(interfaceC826180Wb2);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }
}
