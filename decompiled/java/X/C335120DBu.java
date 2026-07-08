package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DBu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335120DBu extends AbstractC335160DBy {
    public final int LIZ;
    public final C334410D9b LIZIZ;
    public final C0DAO LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C335120DBu)) {
            return false;
        }
        C335120DBu c335120DBu = (C335120DBu) obj;
        return this.LIZ == c335120DBu.LIZ && Intrinsics.LJFF(this.LIZIZ, c335120DBu.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c335120DBu.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Product(index=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", productViewState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pageFlowState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C335120DBu(int i, C334410D9b c334410D9b, C0DAO c0dao) {
        this.LIZ = i;
        this.LIZIZ = c334410D9b;
        this.LIZJ = c0dao;
    }
}
