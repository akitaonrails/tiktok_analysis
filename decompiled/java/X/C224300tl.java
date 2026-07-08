package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.data.TouchPointColor;

/* JADX INFO: renamed from: X.00tl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C224300tl implements InterfaceC1891350zJl {
    public final TouchPointColor LL;
    public final double LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C224300tl)) {
            return false;
        }
        C224300tl c224300tl = (C224300tl) obj;
        return Intrinsics.LJFF(this.LL, c224300tl.LL) && Double.compare(this.LLILLJJLI, c224300tl.LLILLJJLI) == 0;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        TouchPointColor touchPointColor = this.LL;
        return ((touchPointColor == null ? 0 : touchPointColor.hashCode()) * 31) + C786410Ut5.X2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DivideModel(color=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C224300tl(TouchPointColor touchPointColor, double d) {
        this.LL = touchPointColor;
        this.LLILLJJLI = d;
    }
}
