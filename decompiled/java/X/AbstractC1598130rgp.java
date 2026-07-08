package X;

import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rgp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1598130rgp implements InterfaceC1891350zJl, InterfaceC1890700zIi, InterfaceC1596280rdq, InterfaceC1596350rdx, InterfaceC1595240rcA, InterfaceC1598460rhM {
    public int LL = -1;
    public int LLILLJJLI;

    public abstract InboxLiveNotice LIZIZ();

    public abstract boolean LIZLLL();

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1595240rcA
    public final int getReRankSequence() {
        return -1;
    }

    @Override // X.InterfaceC1595240rcA
    public final Integer getReRankType() {
        return -1;
    }

    public static final boolean LJ() {
        return ((Number) C279110Awn.LIZ.getValue()).intValue() == 1;
    }

    @Override // X.InterfaceC1595240rcA
    public final String getUid() {
        return C1595950rdJ.LIZ(this);
    }

    @Override // X.InterfaceC1595240rcA
    public final boolean isUnfollow() {
        return C1595950rdJ.LIZIZ(this);
    }

    @Override // X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        User user;
        String uid;
        InboxLiveNotice inboxLiveNoticeLIZIZ = LIZIZ();
        return (inboxLiveNoticeLIZIZ == null || (user = inboxLiveNoticeLIZIZ.user) == null || (uid = user.getUid()) == null) ? "" : uid;
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return C1598110rgn.LIZIZ;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof AbstractC1598130rgp;
    }

    @Override // X.InterfaceC1598460rhM
    public final String getItemFilterUid(String str) {
        User user;
        String uid;
        InboxLiveNotice inboxLiveNoticeLIZIZ = LIZIZ();
        if (inboxLiveNoticeLIZIZ == null || (user = inboxLiveNoticeLIZIZ.user) == null || (uid = user.getUid()) == null) {
            return "";
        }
        return uid;
    }

    @Override // X.InterfaceC1598460rhM
    public final int getItemPriority(int i) {
        InboxLiveNotice inboxLiveNoticeLIZIZ = LIZIZ();
        if (inboxLiveNoticeLIZIZ != null) {
            return inboxLiveNoticeLIZIZ.priority;
        }
        return 100000;
    }

    @Override // X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof AbstractC1598130rgp)) {
            return C1600110rk1.LIZ("unknown");
        }
        return C1600110rk1.LIZJ();
    }

    @Override // X.InterfaceC1596280rdq
    public final void setRankState(int i) {
        this.LLILLJJLI = i;
    }
}
