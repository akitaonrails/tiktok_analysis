package X;

import com.bytedance.android.livesdk.gift.model.GiftPage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fUg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129320fUg {
    public final List<GiftPage> LIZ;
    public final C1091480eVe LIZIZ;
    public final C157100iv LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1129320fUg)) {
            return false;
        }
        C1129320fUg c1129320fUg = (C1129320fUg) obj;
        return Intrinsics.LJFF(this.LIZ, c1129320fUg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1129320fUg.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1129320fUg.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C1091480eVe c1091480eVe = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c1091480eVe == null ? 0 : c1091480eVe.hashCode())) * 31;
        C157100iv c157100iv = this.LIZJ;
        return iHashCode2 + (c157100iv != null ? c157100iv.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssembledPanelResult(pages=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", panelSnapshot=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sourceTagIndex=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1129320fUg(List<? extends GiftPage> list, C1091480eVe c1091480eVe, C157100iv c157100iv) {
        this.LIZ = list;
        this.LIZIZ = c1091480eVe;
        this.LIZJ = c157100iv;
    }
}
