package X;

import com.ss.android.ugc.aweme.creative.model.stickers.PovItemInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mn3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1409790mn3 extends AbstractC1409800mn4 {
    public final List<PovItemInfo> LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1409790mn3)) {
            return false;
        }
        C1409790mn3 c1409790mn3 = (C1409790mn3) obj;
        return Intrinsics.LJFF(this.LIZ, c1409790mn3.LIZ) && this.LIZIZ == c1409790mn3.LIZIZ && this.LIZJ == c1409790mn3.LIZJ && this.LIZLLL == c1409790mn3.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdatePovListPage(appendItems=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", canLoadMore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onlyRemoveLoadMoreFooter=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", dataSentinel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1409790mn3(long j, boolean z, List list, boolean z2) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = j;
    }
}
