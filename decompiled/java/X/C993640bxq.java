package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bxq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C993640bxq implements InterfaceC1891350zJl {
    public final String LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C993640bxq)) {
            return false;
        }
        C993640bxq c993640bxq = (C993640bxq) obj;
        return Intrinsics.LJFF(this.LL, c993640bxq.LL) && this.LLILLJJLI == c993640bxq.LLILLJJLI && this.LLILLL == c993640bxq.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaSkuTextViewMoreVO(id=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", expanded=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hasSkuInit=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C993640bxq) && Intrinsics.LJFF(((C993640bxq) interfaceC1891350zJl).LL, this.LL)) {
            return true;
        }
        return false;
    }

    public C993640bxq(String str, boolean z, boolean z2) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }
}
