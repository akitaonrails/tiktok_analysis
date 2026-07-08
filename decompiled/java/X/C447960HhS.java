package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HhS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447960HhS implements InterfaceC447930HhP {
    public final InterfaceC456120Huc LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C447960HhS)) {
            return false;
        }
        C447960HhS c447960HhS = (C447960HhS) obj;
        return Intrinsics.LJFF(this.LIZ, c447960HhS.LIZ) && this.LIZIZ == c447960HhS.LIZIZ && this.LIZJ == c447960HhS.LIZJ && this.LIZLLL == c447960HhS.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InputsChanged(panelType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isInputEmpty=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isMentionShowing=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isVoiceRecording=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C447960HhS(InterfaceC456120Huc interfaceC456120Huc, boolean z, boolean z2, boolean z3) {
        this.LIZ = interfaceC456120Huc;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
    }
}
