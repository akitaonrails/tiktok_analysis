package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0miM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406880miM extends AbstractC1406870miL {
    public final String LIZ;
    public final List<InterfaceC1406920miQ> LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1406880miM)) {
            return false;
        }
        C1406880miM c1406880miM = (C1406880miM) obj;
        return Intrinsics.LJFF(this.LIZ, c1406880miM.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1406880miM.LIZIZ) && this.LIZJ == c1406880miM.LIZJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuDataReady(pageName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", preloadInfos=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", visibleItemCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1406880miM(String str, List<? extends InterfaceC1406920miQ> list, int i) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = i;
    }
}
