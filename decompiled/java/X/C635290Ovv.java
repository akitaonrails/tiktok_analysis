package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceFunction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ovv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635290Ovv implements InterfaceC1891350zJl {
    public final EnumC635330Ovz LL;
    public final int LLILLJJLI;
    public final InboxEntranceFunction LLILLL;
    public final int LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C635290Ovv)) {
            return false;
        }
        C635290Ovv c635290Ovv = (C635290Ovv) obj;
        return this.LL == c635290Ovv.LL && this.LLILLJJLI == c635290Ovv.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c635290Ovv.LLILLL) && this.LLILZ == c635290Ovv.LLILZ;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31;
        InboxEntranceFunction inboxEntranceFunction = this.LLILLL;
        return ((iHashCode + (inboxEntranceFunction == null ? 0 : inboxEntranceFunction.hashCode())) * 31) + this.LLILZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InnerSwitchItem(pos=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", iconRes=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", inboxEntranceFunction=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", entranceId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C635290Ovv c635290Ovv;
        InboxEntranceFunction inboxEntranceFunction;
        InboxEntranceFunction inboxEntranceFunction2 = this.LLILLL;
        if (inboxEntranceFunction2 == null || !(interfaceC1891350zJl instanceof C635290Ovv) || (c635290Ovv = (C635290Ovv) interfaceC1891350zJl) == null || (inboxEntranceFunction = c635290Ovv.LLILLL) == null || inboxEntranceFunction2.actionStatus != inboxEntranceFunction.actionStatus) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C635290Ovv c635290Ovv;
        InboxEntranceFunction inboxEntranceFunction;
        InboxEntranceFunction inboxEntranceFunction2 = this.LLILLL;
        if (inboxEntranceFunction2 == null || !(interfaceC1891350zJl instanceof C635290Ovv) || (c635290Ovv = (C635290Ovv) interfaceC1891350zJl) == null || (inboxEntranceFunction = c635290Ovv.LLILLL) == null || inboxEntranceFunction2.functionType != inboxEntranceFunction.functionType) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        C635290Ovv c635290Ovv;
        InboxEntranceFunction inboxEntranceFunction;
        InboxEntranceFunction inboxEntranceFunction2 = this.LLILLL;
        if (inboxEntranceFunction2 == null || !(interfaceC1891350zJl instanceof C635290Ovv) || (c635290Ovv = (C635290Ovv) interfaceC1891350zJl) == null || (inboxEntranceFunction = c635290Ovv.LLILLL) == null || inboxEntranceFunction2.actionStatus == inboxEntranceFunction.actionStatus) {
            return null;
        }
        return new Object() { // from class: X.0Ovw
        };
    }

    public C635290Ovv(EnumC635330Ovz enumC635330Ovz, int i, InboxEntranceFunction inboxEntranceFunction, int i2) {
        this.LL = enumC635330Ovz;
        this.LLILLJJLI = i;
        this.LLILLL = inboxEntranceFunction;
        this.LLILZ = i2;
    }
}
