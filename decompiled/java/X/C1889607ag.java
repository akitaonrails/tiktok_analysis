package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1889607ag implements InterfaceC1891350zJl {
    public final String LL;
    public final boolean LLILLJJLI;
    public final Integer LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1889607ag)) {
            return false;
        }
        C1889607ag c1889607ag = (C1889607ag) obj;
        return Intrinsics.LJFF(this.LL, c1889607ag.LL) && this.LLILLJJLI == c1889607ag.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1889607ag.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        Integer num = this.LLILLL;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAnswerSegmentTextItem(content=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isHighLight=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", highLightIndex=");
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
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1889607ag(Integer num, String str, boolean z) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = num;
    }
}
