package X;

import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ftE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144540ftE implements InterfaceC0148002o {
    public final Long LL;
    public final Long LLILLJJLI;
    public final int LLILLL;
    public final List<ItemInfo4FE> LLILZ;

    public C1144540ftE() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1144540ftE)) {
            return false;
        }
        C1144540ftE c1144540ftE = (C1144540ftE) obj;
        return Intrinsics.LJFF(this.LL, c1144540ftE.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1144540ftE.LLILLJJLI) && this.LLILLL == c1144540ftE.LLILLL && Intrinsics.LJFF(this.LLILZ, c1144540ftE.LLILZ);
    }

    public final int hashCode() {
        Long l = this.LL;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31) + this.LLILLL) * 31;
        List<ItemInfo4FE> list = this.LLILZ;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwardCardState(battleId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", channelId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", mvpRankingIndex=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", awardCardInfos=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1144540ftE(int i) {
        this(null, null, -1, null);
    }

    public C1144540ftE(Long l, Long l2, int i, List<ItemInfo4FE> list) {
        this.LL = l;
        this.LLILLJJLI = l2;
        this.LLILLL = i;
        this.LLILZ = list;
    }
}
