package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SRH, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SRH implements InterfaceC0148002o {
    public final C0SYI LL;

    public C0SRH() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0SRH) && Intrinsics.LJFF(this.LL, ((C0SRH) obj).LL);
    }

    public final int hashCode() {
        C0SYI c0syi = this.LL;
        if (c0syi == null) {
            return 0;
        }
        return c0syi.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostModeDiggState(displayState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0SRH(C0SYI c0syi) {
        this.LL = c0syi;
    }
}
