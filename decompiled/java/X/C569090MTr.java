package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0MTr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569090MTr implements InterfaceC569070MTp {
    public final Map<String, Object> LIZ = new LinkedHashMap();
    public List<? extends InterfaceC569070MTp> LIZIZ;

    @Override // X.InterfaceC569070MTp
    public final List<InterfaceC569070MTp> LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC569070MTp
    public final Map<String, Object> getItems() {
        return this.LIZ;
    }

    @Override // X.InterfaceC569070MTp
    public final Object LIZIZ(Class<?> cls) {
        return get(cls.getName());
    }

    public final void LIZLLL(InterfaceC569070MTp interfaceC569070MTp) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new ArrayList();
        }
        List<? extends InterfaceC569070MTp> list = this.LIZIZ;
        if (C19719512Dh.LJI(list) && list != null) {
            list.add(interfaceC569070MTp);
        }
    }

    @Override // X.InterfaceC569070MTp
    public final Object get(String str) {
        if (this.LIZ.containsKey(str)) {
            return ((LinkedHashMap) this.LIZ).get(str);
        }
        List<? extends InterfaceC569070MTp> list = this.LIZIZ;
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                Object obj = ((InterfaceC569070MTp) it2.next()).get(str);
                if (obj != null) {
                    return obj;
                }
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC569070MTp
    public final void LIZJ(Class<?> cls, Object obj) {
        LJ(cls.getName(), obj);
    }

    public final void LJ(String str, Object obj) {
        if (str.length() > 0) {
            this.LIZ.put(str, obj);
        }
    }
}
