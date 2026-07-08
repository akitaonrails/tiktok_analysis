package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0goB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179850goB implements InterfaceC1891350zJl {
    public final String LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1179850goB)) {
            return false;
        }
        C1179850goB c1179850goB = (C1179850goB) obj;
        return Intrinsics.LJFF(this.LL, c1179850goB.LL) && this.LLILLJJLI == c1179850goB.LLILLJJLI && this.LLILLL == c1179850goB.LLILLL;
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
        sbLIZ.append("PoiMapDetailFilterAreaItem(areaText=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", appliedSelectedState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", currentSelectedState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1179850goB c1179850goB;
        String str = this.LL;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof C1179850goB) && (c1179850goB = (C1179850goB) interfaceC1891350zJl) != null) {
            str2 = c1179850goB.LL;
        }
        return Intrinsics.LJFF(str, str2);
    }

    public C1179850goB(String str, boolean z, boolean z2) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }
}
