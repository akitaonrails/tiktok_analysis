package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bxm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C993600bxm implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C993600bxm)) {
            return false;
        }
        C993600bxm c993600bxm = (C993600bxm) obj;
        return Intrinsics.LJFF(this.LL, c993600bxm.LL) && Intrinsics.LJFF(this.LLILLJJLI, c993600bxm.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsFormHeadlineItem(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C993600bxm() {
        this("", "");
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C993600bxm(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
