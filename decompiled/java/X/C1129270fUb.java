package X;

import com.bytedance.android.livesdk.gift.model.GiftPage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129270fUb {
    public final List<GiftPage> LIZ;
    public final Object LIZIZ;
    public final Object LIZJ;
    public final long LIZLLL;

    public C1129270fUb() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1129270fUb)) {
            return false;
        }
        C1129270fUb c1129270fUb = (C1129270fUb) obj;
        return Intrinsics.LJFF(this.LIZ, c1129270fUb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1129270fUb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1129270fUb.LIZJ) && this.LIZLLL == c1129270fUb.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Object obj = this.LIZIZ;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.LIZJ;
        return ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreComputedPanelData(assembledPages=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", panelSnapshot=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sourceTagIndex=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1129270fUb(List list, C1091480eVe c1091480eVe, C157100iv c157100iv) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZ = list;
        this.LIZIZ = c1091480eVe;
        this.LIZJ = c157100iv;
        this.LIZLLL = jCurrentTimeMillis;
    }
}
