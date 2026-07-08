package X;

import com.ss.android.ugc.aweme.simkit.model.superresolution.SuperResolutionStrategyConfigV2;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;

/* JADX INFO: renamed from: X.0oXv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477290oXv implements InterfaceC1477050oXX {
    public final C1477300oXw LIZ;

    @Override // X.InterfaceC1477050oXX
    public final void LJ() throws Exception {
        C1477300oXw c1477300oXw = this.LIZ;
        if (c1477300oXw == null) {
            return;
        }
        c1477300oXw.LJ();
    }

    public C1477290oXv() {
        SuperResolutionStrategyConfigV2 superResolutionStrategyConfigV2 = C582130MsN.LIZ().getConfig().getCommonConfig().getSuperResolutionStrategyConfigV2();
        if (superResolutionStrategyConfigV2 == null || superResolutionStrategyConfigV2.batteryPercentThreshold > 1.0f) {
            return;
        }
        this.LIZ = new C1477300oXw();
    }

    @Override // X.InterfaceC1477050oXX
    public final void LIZJ(float f) {
        C1477300oXw c1477300oXw = this.LIZ;
        if (c1477300oXw == null) {
            return;
        }
        c1477300oXw.LJ = f;
    }

    @Override // X.InterfaceC1477050oXX
    public final void LIZ(int i, long j, String str, boolean z) {
        C1477300oXw c1477300oXw = this.LIZ;
        if (c1477300oXw == null) {
            return;
        }
        c1477300oXw.LIZ(i, j, str, z);
    }

    @Override // X.InterfaceC1477050oXX
    public final C1476840oXC LIZIZ(SimVideoUrlModel simVideoUrlModel, List<SimBitRate> list, int i, boolean z, InterfaceC1477040oXW interfaceC1477040oXW) {
        C1477300oXw c1477300oXw = this.LIZ;
        if (c1477300oXw == null) {
            return null;
        }
        return c1477300oXw.LIZIZ(simVideoUrlModel, list, i, z, interfaceC1477040oXW);
    }

    @Override // X.InterfaceC1477050oXX
    public final int LIZLLL(float f, int i, int i2, int i3, long j, InterfaceC1477220oXo interfaceC1477220oXo, SimVideoUrlModel simVideoUrlModel, String str, String str2, boolean z) {
        C1477300oXw c1477300oXw = this.LIZ;
        if (c1477300oXw == null) {
            return 1;
        }
        return c1477300oXw.LIZLLL(f, i, i2, i3, j, interfaceC1477220oXo, simVideoUrlModel, str, str2, z);
    }
}
