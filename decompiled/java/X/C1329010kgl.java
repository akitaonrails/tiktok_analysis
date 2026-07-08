package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0kgl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1329010kgl {
    public Map<C1330000kiM, InterfaceC1330200kig> LIZ;
    public List<InterfaceC1330220kii> LIZIZ;

    public final void LIZ(C1330000kiM c1330000kiM, InterfaceC1330220kii interfaceC1330220kii, InterfaceC1330200kig interfaceC1330200kig) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new ArrayList();
        }
        ((ArrayList) this.LIZIZ).add(interfaceC1330220kii);
        if (this.LIZ == null) {
            this.LIZ = new HashMap();
        }
        ((HashMap) this.LIZ).put(c1330000kiM, interfaceC1330200kig);
    }
}
