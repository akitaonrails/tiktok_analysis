package X;

import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;

/* JADX INFO: renamed from: X.0ftY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144740ftY {
    public final long LIZ;
    public final ItemInfo4FE LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleItemDebuffIconParams(userIdForDebuffIcon=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", itemInfo4FE=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isVisible=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", numCards=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1144740ftY(int i, long j, ItemInfo4FE itemInfo4FE, boolean z) {
        this.LIZ = j;
        this.LIZIZ = itemInfo4FE;
        this.LIZJ = z;
        this.LIZLLL = i;
    }
}
