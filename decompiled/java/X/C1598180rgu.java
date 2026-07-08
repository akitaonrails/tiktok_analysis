package X;

import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rgu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598180rgu extends AbstractC1598130rgp {
    public final InboxLiveNotice LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL = true;
    public final User LLILZLL;

    @Override // X.InterfaceC1595240rcA
    public final String getCellType() {
        return "live";
    }

    @Override // X.InterfaceC1595240rcA
    public final boolean isSingleUser() {
        return false;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleLiveItem(liveNotice=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isWithBreathAV=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        User user;
        String uid;
        if (!AbstractC1598130rgp.LJ()) {
            return super.hashCode();
        }
        InboxLiveNotice inboxLiveNotice = this.LLILLL;
        if (inboxLiveNotice == null || (user = inboxLiveNotice.user) == null || (uid = user.getUid()) == null) {
            return 0;
        }
        return uid.hashCode();
    }

    @Override // X.InterfaceC1596350rdx
    public final boolean LIZ() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC1598130rgp
    public final InboxLiveNotice LIZIZ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1598130rgp
    public final boolean LIZLLL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1595240rcA
    public final User getUser() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC1598130rgp, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        String uid2;
        Long lValueOf;
        User user;
        User user2;
        User user3;
        User user4;
        if (!AbstractC1598130rgp.LJ()) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }
        if (!(interfaceC1891350zJl instanceof C1598180rgu)) {
            return false;
        }
        InboxLiveNotice inboxLiveNotice = this.LLILLL;
        Long lValueOf2 = null;
        if (inboxLiveNotice != null && (user4 = inboxLiveNotice.user) != null) {
            uid = user4.getUid();
        } else {
            uid = null;
        }
        C1598180rgu c1598180rgu = (C1598180rgu) interfaceC1891350zJl;
        InboxLiveNotice inboxLiveNotice2 = c1598180rgu.LLILLL;
        if (inboxLiveNotice2 != null && (user3 = inboxLiveNotice2.user) != null) {
            uid2 = user3.getUid();
        } else {
            uid2 = null;
        }
        if (!Intrinsics.LJFF(uid, uid2)) {
            return false;
        }
        InboxLiveNotice inboxLiveNotice3 = this.LLILLL;
        if (inboxLiveNotice3 != null && (user2 = inboxLiveNotice3.user) != null) {
            lValueOf = Long.valueOf(user2.roomId);
        } else {
            lValueOf = null;
        }
        InboxLiveNotice inboxLiveNotice4 = c1598180rgu.LLILLL;
        if (inboxLiveNotice4 != null && (user = inboxLiveNotice4.user) != null) {
            lValueOf2 = Long.valueOf(user.roomId);
        }
        if (!Intrinsics.LJFF(lValueOf, lValueOf2) || this.LLILLJJLI != c1598180rgu.LLILLJJLI || this.LL != c1598180rgu.LL) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1598130rgp, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        String uid2;
        Long lValueOf;
        User user;
        User user2;
        User user3;
        User user4;
        if (!AbstractC1598130rgp.LJ()) {
            return interfaceC1891350zJl instanceof C1598180rgu;
        }
        if (!(interfaceC1891350zJl instanceof C1598180rgu)) {
            return false;
        }
        InboxLiveNotice inboxLiveNotice = this.LLILLL;
        Long lValueOf2 = null;
        if (inboxLiveNotice != null && (user4 = inboxLiveNotice.user) != null) {
            uid = user4.getUid();
        } else {
            uid = null;
        }
        C1598180rgu c1598180rgu = (C1598180rgu) interfaceC1891350zJl;
        InboxLiveNotice inboxLiveNotice2 = c1598180rgu.LLILLL;
        if (inboxLiveNotice2 != null && (user3 = inboxLiveNotice2.user) != null) {
            uid2 = user3.getUid();
        } else {
            uid2 = null;
        }
        if (!Intrinsics.LJFF(uid, uid2)) {
            return false;
        }
        InboxLiveNotice inboxLiveNotice3 = this.LLILLL;
        if (inboxLiveNotice3 != null && (user2 = inboxLiveNotice3.user) != null) {
            lValueOf = Long.valueOf(user2.roomId);
        } else {
            lValueOf = null;
        }
        InboxLiveNotice inboxLiveNotice4 = c1598180rgu.LLILLL;
        if (inboxLiveNotice4 != null && (user = inboxLiveNotice4.user) != null) {
            lValueOf2 = Long.valueOf(user.roomId);
        }
        if (!Intrinsics.LJFF(lValueOf, lValueOf2) || this.LLILLJJLI != c1598180rgu.LLILLJJLI || this.LL != c1598180rgu.LL) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!AbstractC1598130rgp.LJ()) {
            return super.equals(obj);
        }
        if (!(obj instanceof InterfaceC1891350zJl)) {
            return false;
        }
        return areContentsTheSame((InterfaceC1891350zJl) obj);
    }

    public C1598180rgu(InboxLiveNotice inboxLiveNotice, boolean z) {
        User user;
        this.LLILLL = inboxLiveNotice;
        this.LLILZ = z;
        if (inboxLiveNotice != null) {
            user = inboxLiveNotice.user;
        } else {
            user = null;
        }
        this.LLILZLL = user;
    }
}
