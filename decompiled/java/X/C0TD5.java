package X;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TD5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TD5 {
    public final boolean LIZ;
    public final C0TD4 LIZIZ;
    public final InterfaceC754220TiG LIZJ;
    public final Function0<String> LIZLLL;
    public final List<String> LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DualDeviceRtcClientData(shouldMixStream=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mixerInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", client=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", generateRTCParamByRole=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", pushUrls=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0TD5(boolean z, C0TD4 c0td4, InterfaceC754220TiG interfaceC754220TiG, Function0<String> function0, List<String> list) {
        this.LIZ = z;
        this.LIZIZ = c0td4;
        this.LIZJ = interfaceC754220TiG;
        this.LIZLLL = function0;
        this.LJ = list;
    }
}
