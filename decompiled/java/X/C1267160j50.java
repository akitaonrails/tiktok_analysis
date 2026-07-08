package X;

import java.util.List;

/* JADX INFO: renamed from: X.0j50, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267160j50 implements InterfaceC1267260j5A, InterfaceC1267250j59 {
    public int LIZ = -1;
    public int LIZIZ = -1;

    @Override // X.InterfaceC1267260j5A
    public final /* synthetic */ EnumC1268000j6M LIZIZ(InterfaceC1267260j5A interfaceC1267260j5A) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHEffectFeature(isEffectSupportSuperResolution=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSuperResolutionWorked=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1267250j59
    public final List<String> LIZ(InterfaceC1267260j5A interfaceC1267260j5A) {
        return C1697810uHb.LJIILJJIL("updateEffectGPUTurbo");
    }

    @Override // X.InterfaceC1267260j5A
    public final void LIZJ(InterfaceC1267260j5A interfaceC1267260j5A) {
        if (interfaceC1267260j5A instanceof C1267160j50) {
            C1267160j50 c1267160j50 = (C1267160j50) interfaceC1267260j5A;
            this.LIZ = c1267160j50.LIZ;
            this.LIZIZ = c1267160j50.LIZIZ;
        }
    }
}
