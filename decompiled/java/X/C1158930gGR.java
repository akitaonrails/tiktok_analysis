package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158930gGR implements InterfaceC0148002o {
    public final List<C629740Omy> LL;
    public final C291001Au<Boolean> LLILLJJLI;

    public C1158930gGR() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158930gGR)) {
            return false;
        }
        C1158930gGR c1158930gGR = (C1158930gGR) obj;
        return Intrinsics.LJFF(this.LL, c1158930gGR.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1158930gGR.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Boolean> c291001Au = this.LLILLJJLI;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicState(musicItems=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", collectEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1158930gGR(int i) {
        this(null, C13BV.INSTANCE);
    }

    public C1158930gGR(C291001Au c291001Au, List list) {
        this.LL = list;
        this.LLILLJJLI = c291001Au;
    }

    public static C1158930gGR LIZ(C1158930gGR c1158930gGR, List list) {
        C291001Au<Boolean> c291001Au = c1158930gGR.LLILLJJLI;
        c1158930gGR.getClass();
        return new C1158930gGR(c291001Au, list);
    }
}
