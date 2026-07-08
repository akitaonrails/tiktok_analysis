package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361330lWt implements InterfaceC1361290lWp {
    public final String LL = "cell_repost_entrance";
    public final C1361350lWv LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1361330lWt)) {
            return false;
        }
        C1361330lWt c1361330lWt = (C1361330lWt) obj;
        return Intrinsics.LJFF(this.LL, c1361330lWt.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1361330lWt.LLILLJJLI);
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
        sbLIZ.append("FriendsV3RepostEntranceItem(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", infoWrapper=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1361290lWp
    public final String getUniqueKey() {
        return C1017903yT.LIZ();
    }

    @Override // X.InterfaceC1361290lWp
    public final String getType() {
        return this.LL;
    }

    public C1361330lWt(C1361350lWv c1361350lWv) {
        this.LLILLJJLI = c1361350lWv;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1361280lWo.LIZ(this, interfaceC1891350zJl);
    }
}
