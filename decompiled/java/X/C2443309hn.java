package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09hn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2443309hn implements InterfaceC0148002o {
    public final InterfaceC2011507uL LL;
    public final C291001Au<InterfaceC343480DdK> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2443309hn)) {
            return false;
        }
        C2443309hn c2443309hn = (C2443309hn) obj;
        return Intrinsics.LJFF(this.LL, c2443309hn.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2443309hn.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<InterfaceC343480DdK> c291001Au = this.LLILLJJLI;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameraEffectVMState(effectCameraBtnUiState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showEffectResultEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2443309hn(InterfaceC2011507uL interfaceC2011507uL, C291001Au<? extends InterfaceC343480DdK> c291001Au) {
        this.LL = interfaceC2011507uL;
        this.LLILLJJLI = c291001Au;
    }
}
