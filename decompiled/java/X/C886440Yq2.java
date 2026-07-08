package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0Yq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C886440Yq2 implements Serializable {
    public final boolean showBlock;
    public final boolean showMute;
    public final boolean showPin;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C886440Yq2)) {
            return false;
        }
        C886440Yq2 c886440Yq2 = (C886440Yq2) obj;
        return this.showBlock == c886440Yq2.showBlock && this.showMute == c886440Yq2.showMute && this.showPin == c886440Yq2.showPin;
    }

    public int hashCode() {
        return (((C786410Ut5.Z2(this.showBlock) * 31) + C786410Ut5.Z2(this.showMute)) * 31) + C786410Ut5.Z2(this.showPin);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMVOChatStatus(showBlock=");
        sbLIZ.append(this.showBlock);
        sbLIZ.append(", showMute=");
        sbLIZ.append(this.showMute);
        sbLIZ.append(", showPin=");
        sbLIZ.append(this.showPin);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C886440Yq2(boolean z, boolean z2, boolean z3) {
        this.showBlock = z;
        this.showMute = z2;
        this.showPin = z3;
    }
}
