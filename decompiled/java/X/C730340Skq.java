package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Skq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730340Skq implements InterfaceC360001aY {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SecretReplyItem(baseAwemeId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", secretReplyId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", secretReplyQuestion=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", secretReplyResponse=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C730340Skq) && interfaceC1891350zJl != null) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C730340Skq c730340Skq;
        if ((interfaceC1891350zJl instanceof C730340Skq) && (c730340Skq = (C730340Skq) interfaceC1891350zJl) != null) {
            return Intrinsics.LJFF(c730340Skq.LLILLJJLI, this.LLILLJJLI);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        C730340Skq c730340Skq;
        if ((obj instanceof C730340Skq) && (c730340Skq = (C730340Skq) obj) != null) {
            return Intrinsics.LJFF(c730340Skq.LLILLJJLI, this.LLILLJJLI);
        }
        return false;
    }

    public C730340Skq(String str, String str2, String str3, String str4) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
    }
}
