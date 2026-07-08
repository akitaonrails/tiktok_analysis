package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yiV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868250yiV implements InterfaceC951240arS<Object> {
    public final C20359414lU LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868250yiV)) {
            return false;
        }
        C1868250yiV c1868250yiV = (C1868250yiV) obj;
        return Intrinsics.LJFF(this.LIZ, c1868250yiV.LIZ) && this.LIZIZ == c1868250yiV.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StepTitleData(playbookStep=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stepIndex=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (!(obj instanceof C1868250yiV)) {
            return false;
        }
        C1868250yiV c1868250yiV = (C1868250yiV) obj;
        if (!Intrinsics.LJFF(c1868250yiV.LIZ, this.LIZ) || c1868250yiV.LIZIZ != this.LIZIZ) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C1868250yiV;
    }

    public C1868250yiV(C20359414lU c20359414lU, int i) {
        this.LIZ = c20359414lU;
        this.LIZIZ = i;
    }
}
