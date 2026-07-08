package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P5T, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P5T implements InterfaceC0148002o {
    public final boolean LL;
    public final C291001Au<Unit> LLILLJJLI;

    public C0P5T() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0P5T)) {
            return false;
        }
        C0P5T c0p5t = (C0P5T) obj;
        return this.LL == c0p5t.LL && Intrinsics.LJFF(this.LLILLJJLI, c0p5t.LLILLJJLI);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        C291001Au<Unit> c291001Au = this.LLILLJJLI;
        return iZ2 + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Top1ExpandFloatingState(showTop1ExpandFloatingView=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", buttonClickEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0P5T(int i) {
        this(null, false);
    }

    public C0P5T(C291001Au c291001Au, boolean z) {
        this.LL = z;
        this.LLILLJJLI = c291001Au;
    }
}
