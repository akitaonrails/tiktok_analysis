package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06T9, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06T9 implements InterfaceC1891350zJl {
    public final Integer LL;
    public final Integer LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06T9)) {
            return false;
        }
        C06T9 c06t9 = (C06T9) obj;
        return Intrinsics.LJFF(this.LL, c06t9.LL) && Intrinsics.LJFF(this.LLILLJJLI, c06t9.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LLILLJJLI;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiIpRecommendTips(tipsResInt=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", maxLines=");
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

    public C06T9(Integer num, Integer num2) {
        this.LL = num;
        this.LLILLJJLI = num2;
    }
}
