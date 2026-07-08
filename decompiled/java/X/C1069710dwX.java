package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dwX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1069710dwX extends AbstractC1069740dwa {
    public final C1073970e3P LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1069710dwX) && Intrinsics.LJFF(this.LL, ((C1069710dwX) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecFriendsInviteItem(trackInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1069710dwX(C1073970e3P c1073970e3P) {
        this.LL = c1073970e3P;
    }

    @Override // X.AbstractC1069740dwa, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C1069710dwX;
    }

    @Override // X.AbstractC1069740dwa, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C1069710dwX;
    }
}
