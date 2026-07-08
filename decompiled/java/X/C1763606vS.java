package X;

import com.ss.android.ugc.aweme.im.b2c.actionbar.ActionBarButtonConfBusiness;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06vS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1763606vS implements InterfaceC0148002o {
    public final Pair<Integer, List<ActionBarButtonConfBusiness>> LL;
    public final List<InterfaceC901690ZYx> LLILLJJLI;

    public C1763606vS() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1763606vS)) {
            return false;
        }
        C1763606vS c1763606vS = (C1763606vS) obj;
        return Intrinsics.LJFF(this.LL, c1763606vS.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1763606vS.LLILLJJLI);
    }

    public final int hashCode() {
        Pair<Integer, List<ActionBarButtonConfBusiness>> pair = this.LL;
        int iHashCode = (pair == null ? 0 : pair.hashCode()) * 31;
        List<InterfaceC901690ZYx> list = this.LLILLJJLI;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BusinessChatActionBarState(actionBarData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", actionBarButtonItemList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1763606vS(List list, Pair pair) {
        this.LL = pair;
        this.LLILLJJLI = list;
    }

    public static C1763606vS LIZ(C1763606vS c1763606vS, Pair pair, List list, int i) {
        if ((i & 1) != 0) {
            pair = c1763606vS.LL;
        }
        if ((i & 2) != 0) {
            list = c1763606vS.LLILLJJLI;
        }
        c1763606vS.getClass();
        return new C1763606vS(list, pair);
    }
}
