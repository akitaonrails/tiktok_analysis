package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.08oN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2229308oN {
    public final Map<EnumC2229208oM, WeakReference<InterfaceC2229408oO>> LIZ = new LinkedHashMap();
    public WeakReference<InterfaceC2229408oO> LIZIZ;

    public final void LIZ(InterfaceC2229408oO interfaceC2229408oO) {
        this.LIZ.put(interfaceC2229408oO.LIZ(), new WeakReference<>(interfaceC2229408oO));
    }

    public final void LIZIZ(InterfaceC2229408oO interfaceC2229408oO) {
        InterfaceC2229408oO interfaceC2229408oO2;
        WeakReference<InterfaceC2229408oO> weakReference = this.LIZIZ;
        if (weakReference != null) {
            interfaceC2229408oO2 = weakReference.get();
        } else {
            interfaceC2229408oO2 = null;
        }
        if (interfaceC2229408oO2 == interfaceC2229408oO) {
            this.LIZIZ = null;
        }
    }

    public final void LIZJ(InterfaceC2229408oO interfaceC2229408oO) {
        InterfaceC2229408oO interfaceC2229408oO2;
        Reference reference = (Reference) ((LinkedHashMap) this.LIZ).get(interfaceC2229408oO.LIZ());
        if (reference == null || reference.get() != interfaceC2229408oO) {
            LIZ(interfaceC2229408oO);
        }
        WeakReference<InterfaceC2229408oO> weakReference = this.LIZIZ;
        if (weakReference != null && (interfaceC2229408oO2 = weakReference.get()) != null && interfaceC2229408oO2 != interfaceC2229408oO) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BBMediaCoordinator: ");
            sbLIZ.append(interfaceC2229408oO2.LIZ());
            sbLIZ.append(" loses focus to ");
            sbLIZ.append(interfaceC2229408oO.LIZ());
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            interfaceC2229408oO2.LIZIZ();
        }
        this.LIZIZ = new WeakReference<>(interfaceC2229408oO);
    }
}
