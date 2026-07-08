package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Ja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1586406Ja implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1586406Ja)) {
            return false;
        }
        C1586406Ja c1586406Ja = (C1586406Ja) obj;
        return Intrinsics.LJFF(this.LL, c1586406Ja.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1586406Ja.LLILLJJLI) && this.LLILLL == c1586406Ja.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WorkBenchFilterTitleItem(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", valType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isFirst=");
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

    public C1586406Ja(String str, String str2, boolean z) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
    }
}
