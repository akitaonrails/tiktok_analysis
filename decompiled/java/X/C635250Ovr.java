package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceFunction;

/* JADX INFO: renamed from: X.0Ovr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635250Ovr implements InterfaceC1891350zJl {
    public final InboxEntranceFunction LL;
    public final int LLILLJJLI;
    public final C11UN LLILLL;

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C635290Ovv c635290Ovv;
        InboxEntranceFunction inboxEntranceFunction;
        InboxEntranceFunction inboxEntranceFunction2 = this.LL;
        if (inboxEntranceFunction2 == null || !(interfaceC1891350zJl instanceof C635290Ovv) || (c635290Ovv = (C635290Ovv) interfaceC1891350zJl) == null || (inboxEntranceFunction = c635290Ovv.LLILLL) == null || inboxEntranceFunction2.actionStatus != inboxEntranceFunction.actionStatus) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C635290Ovv c635290Ovv;
        InboxEntranceFunction inboxEntranceFunction;
        InboxEntranceFunction inboxEntranceFunction2 = this.LL;
        if (inboxEntranceFunction2 == null || !(interfaceC1891350zJl instanceof C635290Ovv) || (c635290Ovv = (C635290Ovv) interfaceC1891350zJl) == null || (inboxEntranceFunction = c635290Ovv.LLILLL) == null || inboxEntranceFunction2.functionType != inboxEntranceFunction.functionType) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        C635290Ovv c635290Ovv;
        InboxEntranceFunction inboxEntranceFunction;
        InboxEntranceFunction inboxEntranceFunction2 = this.LL;
        if (inboxEntranceFunction2 == null || !(interfaceC1891350zJl instanceof C635290Ovv) || (c635290Ovv = (C635290Ovv) interfaceC1891350zJl) == null || (inboxEntranceFunction = c635290Ovv.LLILLL) == null || inboxEntranceFunction2.actionStatus == inboxEntranceFunction.actionStatus) {
            return null;
        }
        return new Object() { // from class: X.0Ovs
        };
    }

    public C635250Ovr(InboxEntranceFunction inboxEntranceFunction, int i, C11UN c11un) {
        this.LL = inboxEntranceFunction;
        this.LLILLJJLI = i;
        this.LLILLL = c11un;
    }
}
