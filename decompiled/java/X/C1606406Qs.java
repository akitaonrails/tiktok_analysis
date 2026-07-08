package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Qs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1606406Qs implements InterfaceC1891350zJl {
    public final C869590Y9l LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1606406Qs) && Intrinsics.LJFF(this.LL, ((C1606406Qs) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMSuggestReplyMsgData(msg=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1606406Qs(C869590Y9l c869590Y9l) {
        this.LL = c869590Y9l;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1606406Qs c1606406Qs;
        C869590Y9l c869590Y9l;
        String content = null;
        if ((interfaceC1891350zJl instanceof C1606406Qs) && (c1606406Qs = (C1606406Qs) interfaceC1891350zJl) != null && (c869590Y9l = c1606406Qs.LL) != null) {
            content = c869590Y9l.getContent();
        }
        return Intrinsics.LJFF(content, this.LL.getContent());
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1606406Qs c1606406Qs;
        C869590Y9l c869590Y9l;
        String uuid = null;
        if ((interfaceC1891350zJl instanceof C1606406Qs) && (c1606406Qs = (C1606406Qs) interfaceC1891350zJl) != null && (c869590Y9l = c1606406Qs.LL) != null) {
            uuid = c869590Y9l.getUuid();
        }
        return Intrinsics.LJFF(uuid, this.LL.getUuid());
    }
}
