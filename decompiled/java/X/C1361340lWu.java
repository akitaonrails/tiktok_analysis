package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lWu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361340lWu implements InterfaceC1361290lWp {
    public final String LL;
    public final int LLILLJJLI;

    public C1361340lWu() {
        this(0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1361340lWu)) {
            return false;
        }
        C1361340lWu c1361340lWu = (C1361340lWu) obj;
        return Intrinsics.LJFF(this.LL, c1361340lWu.LL) && this.LLILLJJLI == c1361340lWu.LLILLJJLI;
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
        sbLIZ.append("FriendsV3LVBItem(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", orderType=");
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

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1361280lWo.LIZ(this, interfaceC1891350zJl);
    }

    public C1361340lWu(int i, int i2) {
        String str;
        if ((i2 & 1) != 0) {
            str = "cell_lvb";
        } else {
            str = null;
        }
        i = (i2 & 2) != 0 ? 0 : i;
        this.LL = str;
        this.LLILLJJLI = i;
    }
}
