package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SD8, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SD8 implements InterfaceC0148002o {
    public final C291001Au<Unit> LL;
    public final C719160SIw LLILLJJLI;

    public C0SD8() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SD8)) {
            return false;
        }
        C0SD8 c0sd8 = (C0SD8) obj;
        return Intrinsics.LJFF(this.LL, c0sd8.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0sd8.LLILLJJLI);
    }

    public final int hashCode() {
        C291001Au<Unit> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C719160SIw c719160SIw = this.LLILLJJLI;
        return iHashCode + (c719160SIw != null ? c719160SIw.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LandscapeVideoDescState(sync2StateEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", toggleAnimationState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0SD8(C291001Au<Unit> c291001Au, C719160SIw c719160SIw) {
        this.LL = c291001Au;
        this.LLILLJJLI = c719160SIw;
    }
}
