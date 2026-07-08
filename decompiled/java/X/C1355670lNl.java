package X;

import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lNl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355670lNl implements InterfaceC1891350zJl {
    public final UpvoteStruct LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1355670lNl) && Intrinsics.LJFF(this.LL, ((C1355670lNl) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostReplyGuideItem(targetRepost=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1355670lNl(UpvoteStruct upvoteStruct) {
        this.LL = upvoteStruct;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        String uid2;
        String nickname;
        if (!(interfaceC1891350zJl instanceof C1355670lNl)) {
            return false;
        }
        C1355670lNl c1355670lNl = (C1355670lNl) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LL.upvoteId, c1355670lNl.LL.upvoteId)) {
            return false;
        }
        User user = this.LL.user;
        String nickname2 = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        User user2 = c1355670lNl.LL.user;
        if (user2 != null) {
            uid2 = user2.getUid();
        } else {
            uid2 = null;
        }
        if (!Intrinsics.LJFF(uid, uid2)) {
            return false;
        }
        User user3 = this.LL.user;
        if (user3 != null) {
            nickname = user3.getNickname();
        } else {
            nickname = null;
        }
        User user4 = c1355670lNl.LL.user;
        if (user4 != null) {
            nickname2 = user4.getNickname();
        }
        if (!Intrinsics.LJFF(nickname, nickname2)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1355670lNl)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL.upvoteId, ((C1355670lNl) interfaceC1891350zJl).LL.upvoteId);
    }
}
