package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0j54, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267200j54 implements InterfaceC1267260j5A {
    public Map<String, ? extends Object> LIZ;
    public Map<String, ? extends Object> LIZIZ;

    @Override // X.InterfaceC1267260j5A
    public final /* synthetic */ EnumC1268000j6M LIZIZ(InterfaceC1267260j5A interfaceC1267260j5A) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("flatGroup=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("; customGroup=");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1267260j5A
    public final void LIZJ(InterfaceC1267260j5A interfaceC1267260j5A) {
        if (interfaceC1267260j5A != null && (interfaceC1267260j5A instanceof C1267200j54)) {
            C1267200j54 c1267200j54 = (C1267200j54) interfaceC1267260j5A;
            this.LIZ = c1267200j54.LIZ;
            this.LIZIZ = c1267200j54.LIZIZ;
        }
    }
}
