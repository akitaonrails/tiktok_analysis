package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ICD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0ICD implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final double LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ICD)) {
            return false;
        }
        C0ICD c0icd = (C0ICD) obj;
        return Intrinsics.LJFF(this.LL, c0icd.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0icd.LLILLJJLI) && Double.compare(this.LLILLL, c0icd.LLILLL) == 0;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.X2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameChallengeFakeCreateMsgData(thumbnail=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", score=");
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

    public C0ICD(String str, String str2, double d) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = d;
    }
}
