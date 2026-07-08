package X;

import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;

/* JADX INFO: renamed from: X.0bmp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C986810bmp {
    public final long LIZ;
    public final ItemInfo4FE LIZIZ;
    public final boolean LIZJ;
    public final C1144750ftZ LIZLLL;
    public final boolean LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleItemEffectLeftState(leftTime=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", itemInfo4FE=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", initialized=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", unifiedCardInfoWithParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", fromFallbackRequest=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C986810bmp LIZ(C986810bmp c986810bmp) {
        long j = c986810bmp.LIZ;
        ItemInfo4FE itemInfo4FE = c986810bmp.LIZIZ;
        boolean z = c986810bmp.LIZJ;
        C1144750ftZ c1144750ftZ = c986810bmp.LIZLLL;
        c986810bmp.getClass();
        return new C986810bmp(j, itemInfo4FE, z, c1144750ftZ, false);
    }

    public /* synthetic */ C986810bmp(long j, ItemInfo4FE itemInfo4FE, boolean z, C1144750ftZ c1144750ftZ, int i) {
        this((i & 1) != 0 ? 30L : j, itemInfo4FE, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : c1144750ftZ, false);
    }

    public C986810bmp(long j, ItemInfo4FE itemInfo4FE, boolean z, C1144750ftZ c1144750ftZ, boolean z2) {
        this.LIZ = j;
        this.LIZIZ = itemInfo4FE;
        this.LIZJ = z;
        this.LIZLLL = c1144750ftZ;
        this.LJ = z2;
    }
}
