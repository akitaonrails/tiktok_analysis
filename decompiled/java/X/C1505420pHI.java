package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pHI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505420pHI {
    public static final /* synthetic */ int LIZLLL = 0;
    public final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C1505450pHL> LIZIZ = new ConcurrentHashMap<>();
    public boolean LIZJ;

    public final void LIZ() {
        Iterator<Map.Entry<String, C1505450pHL>> it2 = this.LIZIZ.entrySet().iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (it2.next().getValue().LIZ()) {
                z = true;
            }
        }
        this.LIZJ = z;
    }

    public final ConcurrentHashMap<String, String> LIZLLL() {
        if (this.LIZJ) {
            if (C1505180pGu.LIZ) {
                System.currentTimeMillis();
            }
            for (Map.Entry<String, C1505450pHL> entry : this.LIZIZ.entrySet()) {
                if (entry.getValue().LIZ()) {
                    String key = entry.getKey();
                    C1505450pHL value = entry.getValue();
                    InterfaceC1505500pHQ interfaceC1505500pHQ = C1505340pHA.LIZ;
                    if (interfaceC1505500pHQ == null) {
                        interfaceC1505500pHQ = C1505480pHO.LIZ;
                    }
                    String strLIZIZ = interfaceC1505500pHQ.LIZIZ(key);
                    if (strLIZIZ != null && !value.LIZ) {
                        this.LIZ.put(key, strLIZIZ);
                    }
                    value.LIZ = true;
                }
            }
            LIZ();
            if (C1505180pGu.LIZ) {
                System.currentTimeMillis();
            }
        }
        return this.LIZ;
    }

    public final String LIZJ(String str) {
        C1505450pHL c1505450pHL;
        if (str == null) {
            return null;
        }
        String strLIZIZ = this.LIZ.get(str);
        if (strLIZIZ == null && this.LIZJ && (c1505450pHL = this.LIZIZ.get(str)) != null && c1505450pHL.LIZ()) {
            InterfaceC1505500pHQ interfaceC1505500pHQ = C1505340pHA.LIZ;
            if (interfaceC1505500pHQ == null) {
                interfaceC1505500pHQ = C1505480pHO.LIZ;
            }
            strLIZIZ = interfaceC1505500pHQ.LIZIZ(str);
            if (strLIZIZ != null && !c1505450pHL.LIZ) {
                this.LIZ.put(str, strLIZIZ);
            }
            c1505450pHL.LIZ = true;
            LIZ();
        }
        return strLIZIZ;
    }

    public final void LIZIZ(String str, C1505460pHM c1505460pHM) {
        C1505450pHL c1505450pHL = this.LIZIZ.get(str);
        if (c1505450pHL == null) {
            c1505450pHL = new C1505450pHL();
            this.LIZIZ.put(str, c1505450pHL);
        }
        c1505450pHL.LIZIZ = c1505460pHM;
        if (c1505450pHL.LIZ()) {
            this.LIZJ = true;
        }
    }

    public final boolean LJ(String str, String str2) {
        if (str == null || !(!Intrinsics.LJFF(this.LIZ.get(str), str2))) {
            return false;
        }
        this.LIZ.put(str, str2);
        C1505450pHL c1505450pHL = this.LIZIZ.get(str);
        if (c1505450pHL == null) {
            C1505450pHL c1505450pHL2 = new C1505450pHL();
            c1505450pHL2.LIZ = true;
            this.LIZIZ.put(str, c1505450pHL2);
        } else {
            if (!c1505450pHL.LIZ) {
                c1505450pHL.LIZ = true;
                LIZ();
            }
            C1505460pHM c1505460pHM = c1505450pHL.LIZIZ;
            if (c1505460pHM != null && c1505460pHM.LIZ && (c1505460pHM.LIZIZ <= 0 || c1505450pHL.LIZJ <= 0 || System.currentTimeMillis() - c1505450pHL.LIZJ >= c1505460pHM.LIZIZ)) {
                c1505450pHL.LIZJ = System.currentTimeMillis();
                InterfaceC1505500pHQ interfaceC1505500pHQ = C1505340pHA.LIZ;
                if (interfaceC1505500pHQ == null) {
                    interfaceC1505500pHQ = C1505480pHO.LIZ;
                }
                interfaceC1505500pHQ.LIZ(str, str2);
            }
        }
        return true;
    }

    public final void LJFF(Object obj, String str) {
        String string;
        if (obj != null) {
            string = obj.toString();
        } else {
            string = null;
        }
        LJ(str, string);
    }
}
