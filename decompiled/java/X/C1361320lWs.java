package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lWs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361320lWs implements InterfaceC1361290lWp {
    public final String LL;

    public C1361320lWs() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1361320lWs) && Intrinsics.LJFF(this.LL, ((C1361320lWs) obj).LL);
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
        sbLIZ.append("FriendsV3PublishItem(type=");
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

    public C1361320lWs(int i) {
        this.LL = "cell_publish";
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
