package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RPy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695520RPy implements InterfaceC0148002o {
    public final C731160SmA LL;
    public final C731160SmA LLILLJJLI;
    public final int LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C695520RPy)) {
            return false;
        }
        C695520RPy c695520RPy = (C695520RPy) obj;
        return Intrinsics.LJFF(this.LL, c695520RPy.LL) && Intrinsics.LJFF(this.LLILLJJLI, c695520RPy.LLILLJJLI) && this.LLILLL == c695520RPy.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RightAreaState(commonItemSize=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", avatarItemSize=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", forceBtnTextVisibility=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C695520RPy(C731160SmA c731160SmA, C731160SmA c731160SmA2, int i) {
        this.LL = c731160SmA;
        this.LLILLJJLI = c731160SmA2;
        this.LLILLL = i;
    }
}
