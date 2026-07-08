package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e7H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1076370e7H extends AbstractC1223820hx6 {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1076370e7H)) {
            return false;
        }
        C1076370e7H c1076370e7H = (C1076370e7H) obj;
        return Intrinsics.LJFF(this.LL, c1076370e7H.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1076370e7H.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1076370e7H.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecomReasonItem(imgUrl=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", awemeSchema=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1223800hx4, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1076370e7H)) {
            return false;
        }
        C1076370e7H c1076370e7H = (C1076370e7H) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LL, c1076370e7H.LL) || !Intrinsics.LJFF(this.LLILLJJLI, c1076370e7H.LLILLJJLI)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1223800hx4, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C1076370e7H;
    }

    @Override // X.AbstractC1223800hx4, X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1076370e7H)) {
            return null;
        }
        C1076370e7H c1076370e7H = (C1076370e7H) interfaceC1891350zJl;
        return new C1076380e7I(!Intrinsics.LJFF(c1076370e7H.LL, this.LL), !Intrinsics.LJFF(c1076370e7H.LLILLJJLI, this.LLILLJJLI));
    }

    public C1076370e7H(String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }
}
