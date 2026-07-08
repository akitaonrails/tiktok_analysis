package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e4h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1074770e4h implements InterfaceC1891350zJl {
    public final String LL;
    public final C1074830e4n LLILLJJLI;
    public final boolean LLILLL;
    public final C1074630e4T LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1074770e4h)) {
            return false;
        }
        C1074770e4h c1074770e4h = (C1074770e4h) obj;
        return Intrinsics.LJFF(this.LL, c1074770e4h.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1074770e4h.LLILLJJLI) && this.LLILLL == c1074770e4h.LLILLL && Intrinsics.LJFF(this.LLILZ, c1074770e4h.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        return this.LLILLJJLI.contactName;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1074770e4h c1074770e4h;
        C1074830e4n c1074830e4n;
        String str = this.LLILLJJLI.phoneNumber;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof C1074770e4h) && (c1074770e4h = (C1074770e4h) interfaceC1891350zJl) != null && (c1074830e4n = c1074770e4h.LLILLJJLI) != null) {
            str2 = c1074830e4n.phoneNumber;
        }
        return Intrinsics.LJFF(str, str2);
    }

    public C1074770e4h(String str, C1074830e4n c1074830e4n, boolean z, C1074630e4T c1074630e4T) {
        this.LL = str;
        this.LLILLJJLI = c1074830e4n;
        this.LLILLL = z;
        this.LLILZ = c1074630e4T;
    }
}
