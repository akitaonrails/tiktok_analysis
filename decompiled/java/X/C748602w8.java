package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02w8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C748602w8 implements InterfaceC1891350zJl {
    public final String LL;
    public final int LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C748602w8)) {
            return false;
        }
        C748602w8 c748602w8 = (C748602w8) obj;
        return Intrinsics.LJFF(this.LL, c748602w8.LL) && this.LLILLJJLI == c748602w8.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentCareModeBannerItem(awemeId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C748602w8 c748602w8;
        if (interfaceC1891350zJl instanceof C748602w8) {
            c748602w8 = (C748602w8) interfaceC1891350zJl;
        } else {
            c748602w8 = null;
        }
        if (c748602w8 == null || this.LLILLJJLI != c748602w8.LLILLJJLI) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C748602w8 c748602w8;
        String str = this.LL;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof C748602w8) && (c748602w8 = (C748602w8) interfaceC1891350zJl) != null) {
            str2 = c748602w8.LL;
        }
        return Intrinsics.LJFF(str, str2);
    }

    public C748602w8(String str, int i) {
        this.LL = str;
        this.LLILLJJLI = i;
    }
}
