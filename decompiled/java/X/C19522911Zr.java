package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.11Zr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19522911Zr implements InterfaceC19523011Zs {
    public final Map<String, InterfaceC19523111Zt<?>> LIZ = new LinkedHashMap();

    @Override // X.InterfaceC19523011Zs
    public final <T extends C11ZA> InterfaceC19523111Zt<T> LIZ(String str) {
        Object obj = ((LinkedHashMap) this.LIZ).get(str);
        if (obj instanceof InterfaceC19523111Zt) {
            return (InterfaceC19523111Zt) obj;
        }
        return null;
    }

    public final void LIZIZ(String str, InterfaceC19523111Zt<?> interfaceC19523111Zt) {
        if (this.LIZ.containsKey(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("replace ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            C19529611aw.LIZ();
        }
        this.LIZ.put(str, interfaceC19523111Zt);
    }
}
