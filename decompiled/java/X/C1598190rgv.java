package X;

import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rgv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598190rgv extends AbstractC1598130rgp {
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
        sbLIZ.append("DoubleLiveItem(liveNotice=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isWithBreathAV=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        SlimRoom slimRoom;
        SlimRoom.LinkMic linkMic;
        User user;
        if (!AbstractC1598130rgp.LJ()) {
            return super.hashCode();
        }
        Object[] objArr = new Object[2];
        InboxLiveNotice inboxLiveNotice = this.LLILLL;
        List<com.bytedance.android.live.base.model.user.User> list = null;
        objArr[0] = (inboxLiveNotice == null || (user = inboxLiveNotice.user) == null) ? null : user.getUid();
        InboxLiveNotice inboxLiveNotice2 = this.LLILLL;
        if (inboxLiveNotice2 != null && (slimRoom = inboxLiveNotice2.roomInfo) != null && (linkMic = slimRoom.getLinkMic()) != null) {
            list = linkMic.followedList;
        }
        objArr[1] = list;
        return Objects.hash(objArr);
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
        List<com.bytedance.android.live.base.model.user.User> list;
        List<com.bytedance.android.live.base.model.user.User> list2;
        Long lValueOf;
        User user;
        User user2;
        SlimRoom slimRoom;
        SlimRoom.LinkMic linkMic;
        SlimRoom slimRoom2;
        SlimRoom.LinkMic linkMic2;
        if (!AbstractC1598130rgp.LJ()) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }
        if (!(interfaceC1891350zJl instanceof C1598190rgv)) {
            return false;
        }
        InboxLiveNotice inboxLiveNotice = this.LLILLL;
        Long lValueOf2 = null;
        if (inboxLiveNotice != null && (slimRoom2 = inboxLiveNotice.roomInfo) != null && (linkMic2 = slimRoom2.getLinkMic()) != null) {
            list = linkMic2.followedList;
        } else {
            list = null;
        }
        C1598190rgv c1598190rgv = (C1598190rgv) interfaceC1891350zJl;
        InboxLiveNotice inboxLiveNotice2 = c1598190rgv.LLILLL;
        if (inboxLiveNotice2 != null && (slimRoom = inboxLiveNotice2.roomInfo) != null && (linkMic = slimRoom.getLinkMic()) != null) {
            list2 = linkMic.followedList;
        } else {
            list2 = null;
        }
        if (!Intrinsics.LJFF(list, list2)) {
            return false;
        }
        InboxLiveNotice inboxLiveNotice3 = this.LLILLL;
        if (inboxLiveNotice3 != null && (user2 = inboxLiveNotice3.user) != null) {
            lValueOf = Long.valueOf(user2.roomId);
        } else {
            lValueOf = null;
        }
        InboxLiveNotice inboxLiveNotice4 = c1598190rgv.LLILLL;
        if (inboxLiveNotice4 != null && (user = inboxLiveNotice4.user) != null) {
            lValueOf2 = Long.valueOf(user.roomId);
        }
        if (!Intrinsics.LJFF(lValueOf, lValueOf2) || this.LLILLJJLI != c1598190rgv.LLILLJJLI || this.LL != c1598190rgv.LL) {
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
            return interfaceC1891350zJl instanceof C1598190rgv;
        }
        if (!(interfaceC1891350zJl instanceof C1598190rgv)) {
            return false;
        }
        InboxLiveNotice inboxLiveNotice = this.LLILLL;
        Long lValueOf2 = null;
        if (inboxLiveNotice != null && (user4 = inboxLiveNotice.user) != null) {
            uid = user4.getUid();
        } else {
            uid = null;
        }
        C1598190rgv c1598190rgv = (C1598190rgv) interfaceC1891350zJl;
        InboxLiveNotice inboxLiveNotice2 = c1598190rgv.LLILLL;
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
        InboxLiveNotice inboxLiveNotice4 = c1598190rgv.LLILLL;
        if (inboxLiveNotice4 != null && (user = inboxLiveNotice4.user) != null) {
            lValueOf2 = Long.valueOf(user.roomId);
        }
        if (!Intrinsics.LJFF(lValueOf, lValueOf2) || this.LLILLJJLI != c1598190rgv.LLILLJJLI || this.LL != c1598190rgv.LL) {
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

    public C1598190rgv(InboxLiveNotice inboxLiveNotice, boolean z) {
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
