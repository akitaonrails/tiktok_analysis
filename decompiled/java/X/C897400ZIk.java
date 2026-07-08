package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZIk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897400ZIk implements InterfaceC1891350zJl {
    public final C1462005nu LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C897400ZIk)) {
            return false;
        }
        C897400ZIk c897400ZIk = (C897400ZIk) obj;
        return Intrinsics.LJFF(this.LL, c897400ZIk.LL) && this.LLILLJJLI == c897400ZIk.LLILLJJLI && this.LLILLL == c897400ZIk.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupDetailMemberItem(imMember=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", role=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isOnline=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C897400ZIk)) {
            return false;
        }
        C897400ZIk c897400ZIk = (C897400ZIk) interfaceC1891350zJl;
        if (this.LLILLL != c897400ZIk.LLILLL || this.LLILLJJLI != c897400ZIk.LLILLJJLI) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C897400ZIk c897400ZIk;
        C1462005nu c1462005nu;
        String uid = this.LL.getUid();
        String uid2 = null;
        if ((interfaceC1891350zJl instanceof C897400ZIk) && (c897400ZIk = (C897400ZIk) interfaceC1891350zJl) != null && (c1462005nu = c897400ZIk.LL) != null) {
            uid2 = c1462005nu.getUid();
        }
        return Intrinsics.LJFF(uid, uid2);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if (!(interfaceC1891350zJl instanceof C897400ZIk)) {
            return null;
        }
        C897400ZIk c897400ZIk = (C897400ZIk) interfaceC1891350zJl;
        boolean z2 = true;
        if (this.LLILLL != c897400ZIk.LLILLL) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLILLJJLI == c897400ZIk.LLILLJJLI) {
            z2 = false;
        }
        return new C897410ZIl(z, z2);
    }

    public C897400ZIk(C1462005nu c1462005nu, int i, boolean z) {
        this.LL = c1462005nu;
        this.LLILLJJLI = i;
        this.LLILLL = z;
    }
}
