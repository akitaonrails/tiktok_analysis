package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fhE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1137100fhE {
    public final C1135810ff9 LIZ;
    public final DataChannel LIZIZ;
    public final InterfaceC1137230fhR LIZJ;
    public final EnumC1136790fgj LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1137100fhE)) {
            return false;
        }
        C1137100fhE c1137100fhE = (C1137100fhE) obj;
        return Intrinsics.LJFF(this.LIZ, c1137100fhE.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1137100fhE.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1137100fhE.LIZJ) && this.LIZLLL == c1137100fhE.LIZLLL;
    }

    public final int hashCode() {
        C1135810ff9 c1135810ff9 = this.LIZ;
        int iHashCode = (c1135810ff9 == null ? 0 : c1135810ff9.hashCode()) * 31;
        DataChannel dataChannel = this.LIZIZ;
        return ((((iHashCode + (dataChannel != null ? dataChannel.hashCode() : 0)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrayAnimationContext(giftMsg=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dataChannel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", policy=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", currentStyle=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1137100fhE(C1135810ff9 c1135810ff9, DataChannel dataChannel, InterfaceC1137230fhR interfaceC1137230fhR, EnumC1136790fgj enumC1136790fgj) {
        this.LIZ = c1135810ff9;
        this.LIZIZ = dataChannel;
        this.LIZJ = interfaceC1137230fhR;
        this.LIZLLL = enumC1136790fgj;
    }
}
