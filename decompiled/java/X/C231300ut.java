package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00ut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C231300ut implements InterfaceC0148002o {
    public final C291001Au<Unit> LL;
    public final C291001Au<Unit> LLILLJJLI;

    public C231300ut() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C231300ut)) {
            return false;
        }
        C231300ut c231300ut = (C231300ut) obj;
        return Intrinsics.LJFF(this.LL, c231300ut.LL) && Intrinsics.LJFF(this.LLILLJJLI, c231300ut.LLILLJJLI);
    }

    public final int hashCode() {
        C291001Au<Unit> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Unit> c291001Au2 = this.LLILLJJLI;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserPhotoState(onPlayMediaEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onPauseMediaEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C231300ut(Object obj) {
        this.LL = null;
        this.LLILLJJLI = null;
    }
}
