package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C894180Z6a implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final EnumC877490Ybb LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C894180Z6a)) {
            return false;
        }
        C894180Z6a c894180Z6a = (C894180Z6a) obj;
        return Intrinsics.LJFF(this.LL, c894180Z6a.LL) && Intrinsics.LJFF(this.LLILLJJLI, c894180Z6a.LLILLJJLI) && this.LLILLL == c894180Z6a.LLILLL && this.LLILZ == c894180Z6a.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupNotifyItem(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", notifyState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C894180Z6a c894180Z6a;
        EnumC877490Ybb enumC877490Ybb = this.LLILZ;
        EnumC877490Ybb enumC877490Ybb2 = null;
        if ((interfaceC1891350zJl instanceof C894180Z6a) && (c894180Z6a = (C894180Z6a) interfaceC1891350zJl) != null) {
            enumC877490Ybb2 = c894180Z6a.LLILZ;
        }
        if (enumC877490Ybb == enumC877490Ybb2) {
            return true;
        }
        return false;
    }

    public C894180Z6a(String str, String str2, boolean z, EnumC877490Ybb enumC877490Ybb) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = enumC877490Ybb;
    }
}
