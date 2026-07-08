package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lWq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361300lWq implements InterfaceC1361290lWp {
    public final String LL;

    public C1361300lWq() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1361300lWq) && Intrinsics.LJFF(this.LL, ((C1361300lWq) obj).LL);
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
        sbLIZ.append("FriendsV3BottomRecListItem(type=");
        sbLIZ.append(this.LL);
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

    public C1361300lWq(int i) {
        this.LL = "cell_bottom_rec_list";
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1361300lWq) || !Intrinsics.LJFF(((C1361300lWq) interfaceC1891350zJl).getUniqueKey(), getUniqueKey())) {
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1361280lWo.LIZ(this, interfaceC1891350zJl);
    }
}
