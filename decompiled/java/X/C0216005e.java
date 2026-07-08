package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.005e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0216005e implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final int LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0216005e)) {
            return false;
        }
        C0216005e c0216005e = (C0216005e) obj;
        return Intrinsics.LJFF(this.LL, c0216005e.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0216005e.LLILLJJLI) && this.LLILLL == c0216005e.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FanGroupTitleItem(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", cellMargin=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    public C0216005e(String str, String str2, int i) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
    }
}
