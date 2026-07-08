package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00vI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C233800vI implements InterfaceC0148002o {
    public final C291001Au<Unit> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C233800vI) && Intrinsics.LJFF(this.LL, ((C233800vI) obj).LL);
    }

    public final int hashCode() {
        C291001Au<Unit> c291001Au = this.LL;
        if (c291001Au == null) {
            return 0;
        }
        return c291001Au.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicCellAdd2DspState(event=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C233800vI(C291001Au<Unit> c291001Au) {
        this.LL = c291001Au;
    }
}
