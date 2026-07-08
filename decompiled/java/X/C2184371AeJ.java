package X;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AeJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184371AeJ implements InterfaceC2184381AeK {
    public static boolean LJ;
    public static final C2184371AeJ LIZ = new C2184371AeJ();
    public static final List<String> LIZIZ = new CopyOnWriteArrayList();
    public static final Map<String, Boolean> LIZJ = new ConcurrentHashMap();
    public static final List<String> LIZLLL = new CopyOnWriteArrayList();
    public static final Set<String> LJFF = new LinkedHashSet();
    public static final C01GW LJI = C452501pT.LIZIZ(new C2184401AeM());

    @Override // X.InterfaceC2184381AeK
    public final void LIZ(String str) {
        InterfaceC2184381AeK interfaceC2184381AeKLIZ = C2184361AeI.LIZ(str);
        if (interfaceC2184381AeKLIZ != null) {
            interfaceC2184381AeKLIZ.LIZIZ(str);
        }
        InterfaceC2184381AeK interfaceC2184381AeKLIZ2 = C2184361AeI.LIZ(str);
        if (interfaceC2184381AeKLIZ2 != null) {
            interfaceC2184381AeKLIZ2.LIZ(str);
        }
        C2184361AeI.LIZ.remove(str);
    }

    @Override // X.InterfaceC2184381AeK
    public final void LIZIZ(String str) {
        InterfaceC2184381AeK interfaceC2184381AeKLIZ = C2184361AeI.LIZ(str);
        if (interfaceC2184381AeKLIZ != null) {
            interfaceC2184381AeKLIZ.LIZIZ(str);
        }
        ((ConcurrentHashMap) LIZJ).put(str, Boolean.FALSE);
        Iterator it2 = ((CopyOnWriteArrayList) LIZIZ).iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((ConcurrentHashMap) LIZJ).get(it2.next()), Boolean.TRUE)) {
                z = true;
            }
        }
        if (LJ && LJFF.contains(str) && !z) {
            C202111146j.LIZIZ((C2184391AeL) LJI.getValue());
            LJ = false;
        }
    }

    @Override // X.InterfaceC2184381AeK
    public final void LIZJ(String str) {
        InterfaceC2184381AeK interfaceC2184381AeKLIZ = C2184361AeI.LIZ(str);
        if (interfaceC2184381AeKLIZ != null) {
            interfaceC2184381AeKLIZ.LIZJ(str);
        }
    }

    @Override // X.InterfaceC2184381AeK
    public final void LIZLLL(String str) {
        ((ConcurrentHashMap) LIZJ).put(str, Boolean.TRUE);
        ((CopyOnWriteArrayList) LIZLLL).add(str);
        InterfaceC2184381AeK interfaceC2184381AeKLIZ = C2184361AeI.LIZ(str);
        if (interfaceC2184381AeKLIZ != null) {
            interfaceC2184381AeKLIZ.LIZLLL(str);
        }
        if (!LJ && LJFF.contains(str)) {
            C202111146j.LIZ((C2184391AeL) LJI.getValue());
            LJ = true;
        }
    }

    @Override // X.InterfaceC2184381AeK
    public final void LJ(String str) {
        InterfaceC2184381AeK interfaceC2184381AeKLIZ;
        for (Map.Entry entry : ((ConcurrentHashMap) LIZJ).entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue() && (interfaceC2184381AeKLIZ = C2184361AeI.LIZ((String) entry.getKey())) != null) {
                interfaceC2184381AeKLIZ.LJ(str);
            }
        }
    }
}
