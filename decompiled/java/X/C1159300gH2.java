package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gH2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159300gH2 implements InterfaceC0148002o {
    public final C291001Au<EnumC1411170mpH> LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159300gH2)) {
            return false;
        }
        C1159300gH2 c1159300gH2 = (C1159300gH2) obj;
        return Intrinsics.LJFF(this.LL, c1159300gH2.LL) && this.LLILLJJLI == c1159300gH2.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QRGroupCreationMessageVMStatus(qrMessageLoadStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loadingState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1159300gH2(C291001Au<? extends EnumC1411170mpH> c291001Au, boolean z) {
        this.LL = c291001Au;
        this.LLILLJJLI = z;
    }
}
