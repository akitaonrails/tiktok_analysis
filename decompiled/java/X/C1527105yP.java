package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05yP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1527105yP implements InterfaceC111300bX {
    public final C909290Zln LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1527105yP) && Intrinsics.LJFF(this.LL, ((C1527105yP) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleChatHierarchyData(singleSessionInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1527105yP(C909290Zln c909290Zln) {
        this.LL = c909290Zln;
    }
}
