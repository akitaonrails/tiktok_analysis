package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceFunction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OIu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C617220OIu implements InterfaceC1891350zJl {
    public final InboxEntranceFunction LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final C0OJ0 LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C617220OIu)) {
            return false;
        }
        C617220OIu c617220OIu = (C617220OIu) obj;
        return Intrinsics.LJFF(this.LL, c617220OIu.LL) && this.LLILLJJLI == c617220OIu.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c617220OIu.LLILLL) && Intrinsics.LJFF(this.LLILZ, c617220OIu.LLILZ);
    }

    public final int hashCode() {
        InboxEntranceFunction inboxEntranceFunction = this.LL;
        int iHashCode = (((inboxEntranceFunction == null ? 0 : inboxEntranceFunction.hashCode()) * 31) + this.LLILLJJLI) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C0OJ0 c0oj0 = this.LLILZ;
        return iHashCode2 + (c0oj0 != null ? c0oj0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxEntranceFunctionSwitchItem(inboxEntranceFunction=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", entranceId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", entranceKey=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", uiConfig=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C617220OIu c617220OIu;
        InboxEntranceFunction inboxEntranceFunction;
        InboxEntranceFunction inboxEntranceFunction2 = this.LL;
        if (inboxEntranceFunction2 == null || !(interfaceC1891350zJl instanceof C617220OIu) || (c617220OIu = (C617220OIu) interfaceC1891350zJl) == null || (inboxEntranceFunction = c617220OIu.LL) == null || inboxEntranceFunction2.actionStatus != inboxEntranceFunction.actionStatus) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C617220OIu c617220OIu;
        InboxEntranceFunction inboxEntranceFunction;
        InboxEntranceFunction inboxEntranceFunction2 = this.LL;
        if (inboxEntranceFunction2 == null || !(interfaceC1891350zJl instanceof C617220OIu) || (c617220OIu = (C617220OIu) interfaceC1891350zJl) == null || (inboxEntranceFunction = c617220OIu.LL) == null || inboxEntranceFunction2.functionType != inboxEntranceFunction.functionType) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        C617220OIu c617220OIu;
        InboxEntranceFunction inboxEntranceFunction;
        InboxEntranceFunction inboxEntranceFunction2 = this.LL;
        if (inboxEntranceFunction2 == null || !(interfaceC1891350zJl instanceof C617220OIu) || (c617220OIu = (C617220OIu) interfaceC1891350zJl) == null || (inboxEntranceFunction = c617220OIu.LL) == null || inboxEntranceFunction2.actionStatus == inboxEntranceFunction.actionStatus) {
            return null;
        }
        return new C617240OIw();
    }

    public static C617220OIu LIZ(C617220OIu c617220OIu, InboxEntranceFunction inboxEntranceFunction) {
        int i = c617220OIu.LLILLJJLI;
        String str = c617220OIu.LLILLL;
        C0OJ0 c0oj0 = c617220OIu.LLILZ;
        c617220OIu.getClass();
        return new C617220OIu(inboxEntranceFunction, i, str, c0oj0);
    }

    public C617220OIu(InboxEntranceFunction inboxEntranceFunction, int i, String str, C0OJ0 c0oj0) {
        this.LL = inboxEntranceFunction;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = c0oj0;
    }
}
