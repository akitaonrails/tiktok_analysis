package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0miN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406890miN extends AbstractC1406870miL {
    public final String LIZ;
    public final int LIZIZ;
    public final List<InterfaceC1406920miQ> LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1406890miN)) {
            return false;
        }
        C1406890miN c1406890miN = (C1406890miN) obj;
        return Intrinsics.LJFF(this.LIZ, c1406890miN.LIZ) && this.LIZIZ == c1406890miN.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1406890miN.LIZJ) && this.LIZLLL == c1406890miN.LIZLLL;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuTouch(pageName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", preloadInfos=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", visibleItemCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1406890miN(String str, int i, List<? extends InterfaceC1406920miQ> list, int i2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = list;
        this.LIZLLL = i2;
    }
}
