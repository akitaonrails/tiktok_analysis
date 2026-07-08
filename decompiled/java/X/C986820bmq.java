package X;

import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import java.util.List;

/* JADX INFO: renamed from: X.0bmq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C986820bmq {
    public final List<ItemInfo4FE> LIZ;
    public final List<ItemInfo4FE> LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatchItemsCoHostWindowIconsPredictedOrder(selfOrder=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rivalOrder=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C986820bmq(List<ItemInfo4FE> list, List<ItemInfo4FE> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
