package X;

import com.ss.android.ugc.aweme.vibefeed.viewmodel.VibeFeedUser;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908580Zke implements InterfaceC0148002o {
    public final Boolean LL;
    public final Integer LLILLJJLI;
    public final List<VibeFeedUser> LLILLL;

    public C908580Zke() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C908580Zke)) {
            return false;
        }
        C908580Zke c908580Zke = (C908580Zke) obj;
        return Intrinsics.LJFF(this.LL, c908580Zke.LL) && Intrinsics.LJFF(this.LLILLJJLI, c908580Zke.LLILLJJLI) && Intrinsics.LJFF(null, null) && Intrinsics.LJFF(this.LLILLL, c908580Zke.LLILLL);
    }

    public final int hashCode() {
        Boolean bool = this.LL;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31 * 31;
        List<VibeFeedUser> list = this.LLILLL;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeFeedEntranceState(vibeFeedEntranceStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", vibeFeedEntranceRedDotStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sharedFeedGeckoResource=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", joinedFeedUserList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C908580Zke(int i) {
        this(Boolean.FALSE, 0, null);
    }

    public C908580Zke(Boolean bool, Integer num, List list) {
        this.LL = bool;
        this.LLILLJJLI = num;
        this.LLILLL = list;
    }

    public static C908580Zke LIZ(C908580Zke c908580Zke, Boolean bool, Integer num, List list, int i) {
        if ((i & 1) != 0) {
            bool = c908580Zke.LL;
        }
        if ((i & 2) != 0) {
            num = c908580Zke.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c908580Zke.getClass();
        }
        if ((i & 8) != 0) {
            list = c908580Zke.LLILLL;
        }
        c908580Zke.getClass();
        return new C908580Zke(bool, num, list);
    }
}
