package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0czH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032970czH extends AbstractC1033120czW {
    public final AbstractC1033200cze LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1032970czH) && Intrinsics.LJFF(this.LIZ, ((C1032970czH) obj).LIZ);
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

    @Override // X.AbstractC1033120czW
    public final String LIZ() {
        return this.LIZ.LIZIZ();
    }

    public C1032970czH(AbstractC1033200cze abstractC1033200cze) {
        this.LIZ = abstractC1033200cze;
    }
}
