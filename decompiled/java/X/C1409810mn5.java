package X;

import com.ss.android.ugc.aweme.creative.model.stickers.PovItemInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mn5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1409810mn5 extends AbstractC1409800mn4 {
    public final List<PovItemInfo> LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1409810mn5)) {
            return false;
        }
        C1409810mn5 c1409810mn5 = (C1409810mn5) obj;
        return Intrinsics.LJFF(this.LIZ, c1409810mn5.LIZ) && this.LIZIZ == c1409810mn5.LIZIZ && this.LIZJ == c1409810mn5.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PovListPage(items=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", canLoadMore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", needAnimation=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1409810mn5(List<PovItemInfo> list, boolean z, boolean z2) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
