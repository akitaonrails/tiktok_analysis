package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O27, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O27 implements InterfaceC1891350zJl {
    public final C1462005nu LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0O27)) {
            return false;
        }
        C0O27 c0o27 = (C0O27) obj;
        return Intrinsics.LJFF(this.LL, c0o27.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0o27.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReadUserItem(member=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C0O27) && Intrinsics.LJFF(this.LL.getNickName(), ((C0O27) interfaceC1891350zJl).LL.getNickName())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0O27) {
            C0O27 c0o27 = (C0O27) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.LL.getUid(), c0o27.LL.getUid()) && Intrinsics.LJFF(this.LL.getSecUid(), c0o27.LL.getSecUid())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C0O27)) {
            return null;
        }
        return new C0O28(!Intrinsics.LJFF(this.LL.getNickName(), ((C0O27) interfaceC1891350zJl).LL.getNickName()));
    }

    public C0O27(C1462005nu c1462005nu, String str) {
        this.LL = c1462005nu;
        this.LLILLJJLI = str;
    }
}
