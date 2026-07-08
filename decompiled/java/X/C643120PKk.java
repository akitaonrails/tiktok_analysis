package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PKk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643120PKk implements InterfaceC655050Pmh {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C643120PKk)) {
            return false;
        }
        C643120PKk c643120PKk = (C643120PKk) obj;
        return Intrinsics.LJFF(this.LL, c643120PKk.LL) && Intrinsics.LJFF(this.LLILLJJLI, c643120PKk.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c643120PKk.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchTakoWaitingListData(takoUserAmount=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", docId=");
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

    public C643120PKk(String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }
}
