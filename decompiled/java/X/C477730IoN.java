package X;

import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendItem;
import com.bytedance.android.livesdk.model.message.GuestApplyInfo;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IoN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477730IoN implements InterfaceC0148002o {
    public final List<RecommendItem> LL;
    public final RecommendItem LLILLJJLI;
    public final EnumC479370Ir1 LLILLL;
    public final String LLILZ;
    public final Pair<Integer, GuestApplyInfo> LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C477730IoN)) {
            return false;
        }
        C477730IoN c477730IoN = (C477730IoN) obj;
        return Intrinsics.LJFF(this.LL, c477730IoN.LL) && Intrinsics.LJFF(this.LLILLJJLI, c477730IoN.LLILLJJLI) && this.LLILLL == c477730IoN.LLILLL && Intrinsics.LJFF(this.LLILZ, c477730IoN.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c477730IoN.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        RecommendItem recommendItem = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (recommendItem == null ? 0 : recommendItem.hashCode())) * 31) + this.LLILLL.hashCode()) * 31;
        String str = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Pair<Integer, GuestApplyInfo> pair = this.LLILZIL;
        return iHashCode3 + (pair != null ? pair.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiTopLiveDistributeState(recommendItems=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", goLiveItem=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", errMsg=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", applyStateInfo=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C477730IoN(List<RecommendItem> list, RecommendItem recommendItem, EnumC479370Ir1 enumC479370Ir1, String str, Pair<Integer, GuestApplyInfo> pair) {
        this.LL = list;
        this.LLILLJJLI = recommendItem;
        this.LLILLL = enumC479370Ir1;
        this.LLILZ = str;
        this.LLILZIL = pair;
    }

    public static C477730IoN LIZ(C477730IoN c477730IoN, List list, RecommendItem recommendItem, EnumC479370Ir1 enumC479370Ir1, String str, Pair pair, int i) {
        Pair pair2 = pair;
        String str2 = str;
        EnumC479370Ir1 enumC479370Ir12 = enumC479370Ir1;
        RecommendItem recommendItem2 = recommendItem;
        List list2 = list;
        if ((i & 1) != 0) {
            list2 = c477730IoN.LL;
        }
        if ((i & 2) != 0) {
            recommendItem2 = c477730IoN.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            enumC479370Ir12 = c477730IoN.LLILLL;
        }
        if ((i & 8) != 0) {
            str2 = c477730IoN.LLILZ;
        }
        if ((i & 16) != 0) {
            pair2 = c477730IoN.LLILZIL;
        }
        c477730IoN.getClass();
        return new C477730IoN(list2, recommendItem2, enumC479370Ir12, str2, pair2);
    }
}
