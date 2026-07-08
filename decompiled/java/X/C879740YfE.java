package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YfE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879740YfE implements InterfaceC879770YfH {
    public final C878960Ydy LIZ;
    public final C880430YgL LIZIZ;
    public final boolean LIZJ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C879740YfE)) {
            return false;
        }
        C879740YfE c879740YfE = (C879740YfE) obj;
        return Intrinsics.LJFF(this.LIZ, c879740YfE.LIZ) && Intrinsics.LJFF(this.LIZIZ, c879740YfE.LIZIZ) && this.LIZJ == c879740YfE.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestFilterArgs(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", identifier=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", filterFullDataWhenUpdate=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC879770YfH
    public final boolean LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC879770YfH
    public final /* bridge */ /* synthetic */ InterfaceC879750YfF getIdentifier() {
        return this.LIZIZ;
    }

    public C879740YfE(C878960Ydy c878960Ydy, C880430YgL c880430YgL) {
        this.LIZ = c878960Ydy;
        this.LIZIZ = c880430YgL;
    }
}
