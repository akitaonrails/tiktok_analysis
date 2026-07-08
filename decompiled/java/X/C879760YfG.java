package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YfG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879760YfG implements InterfaceC879770YfH {
    public final C878950Ydx LIZ;
    public final C880490YgR LIZIZ;
    public final boolean LIZJ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C879760YfG)) {
            return false;
        }
        C879760YfG c879760YfG = (C879760YfG) obj;
        return Intrinsics.LJFF(this.LIZ, c879760YfG.LIZ) && Intrinsics.LJFF(this.LIZIZ, c879760YfG.LIZIZ) && this.LIZJ == c879760YfG.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationFilterArgs(key=");
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

    public C879760YfG(C878950Ydx c878950Ydx, C880490YgR c880490YgR) {
        this.LIZ = c878950Ydx;
        this.LIZIZ = c880490YgR;
    }
}
