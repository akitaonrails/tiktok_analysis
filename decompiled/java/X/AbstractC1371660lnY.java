package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lnY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1371660lnY {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1371670lnZ());

    public final void LIZ(String str) {
        InterfaceC1371680lna interfaceC1371680lna;
        if (!((Boolean) this.LIZ.getValue()).booleanValue() && (interfaceC1371680lna = C1370370llT.LIZJ) != null) {
            interfaceC1371680lna.i("[Share_Order]", str);
        }
    }

    public final void LIZIZ(Function0<String> function0) {
        InterfaceC1371680lna interfaceC1371680lna;
        if (!((Boolean) this.LIZ.getValue()).booleanValue() && (interfaceC1371680lna = C1370370llT.LIZJ) != null) {
            interfaceC1371680lna.i("[Share_Order]", function0.invoke());
        }
    }
}
