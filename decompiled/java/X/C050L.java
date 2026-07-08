package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.050L, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C050L implements InterfaceC1891350zJl {
    public final String LL;
    public final Map<String, String> LLILLJJLI;

    public C050L() {
        throw null;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxSearchRecentItem(keyword=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", eventParams=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C050L(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LL = str;
        this.LLILLJJLI = linkedHashMap;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        C050L c050l;
        if ((obj instanceof C050L) && (c050l = (C050L) obj) != null) {
            return Intrinsics.LJFF(c050l.LL, this.LL);
        }
        return false;
    }
}
