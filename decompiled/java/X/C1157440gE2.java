package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gE2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157440gE2 implements InterfaceC1891350zJl {
    public final EnumC1342610l2h LL;
    public final C1220590hrt LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157440gE2)) {
            return false;
        }
        C1157440gE2 c1157440gE2 = (C1157440gE2) obj;
        return this.LL == c1157440gE2.LL && Intrinsics.LJFF(this.LLILLJJLI, c1157440gE2.LLILLJJLI);
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
        sbLIZ.append("FoldFooterItem(height=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", fetchParam=");
        sbLIZ.append(this.LLILLJJLI);
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

    public C1157440gE2(EnumC1342610l2h enumC1342610l2h, C1220590hrt c1220590hrt) {
        this.LL = enumC1342610l2h;
        this.LLILLJJLI = c1220590hrt;
    }
}
