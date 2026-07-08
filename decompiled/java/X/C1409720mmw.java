package X;

import com.ss.android.ugc.aweme.creative.model.edit.InspirationItemData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mmw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1409720mmw extends AbstractC1409710mmv {
    public final List<InspirationItemData> LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1409720mmw)) {
            return false;
        }
        C1409720mmw c1409720mmw = (C1409720mmw) obj;
        return Intrinsics.LJFF(this.LIZ, c1409720mmw.LIZ) && this.LIZIZ == c1409720mmw.LIZIZ && this.LIZJ == c1409720mmw.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InspirationListPage(list=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enableLoadMore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", needAnimation=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1409720mmw(List<InspirationItemData> list, boolean z, boolean z2) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
