package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0czI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032980czI extends AbstractC1033140czY {
    public final AbstractC1033330czr LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1032980czI) && Intrinsics.LJFF(this.LIZ, ((C1032980czI) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkError(rewardADNetworkError=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1033140czY
    public final String LIZ() {
        return this.LIZ.LIZIZ();
    }

    public C1032980czI(AbstractC1033330czr abstractC1033330czr) {
        this.LIZ = abstractC1033330czr;
    }
}
