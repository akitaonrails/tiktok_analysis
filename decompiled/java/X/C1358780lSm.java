package X;

import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lSm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358780lSm implements InterfaceC1891350zJl {
    public final UpvoteStruct LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1358780lSm)) {
            return false;
        }
        C1358780lSm c1358780lSm = (C1358780lSm) obj;
        return Intrinsics.LJFF(this.LL, c1358780lSm.LL) && this.LLILLJJLI == c1358780lSm.LLILLJJLI && this.LLILLL == c1358780lSm.LLILLL && this.LLILZ == c1358780lSm.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + this.LLILZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentRepostViewMorePanelItem(attachedVideoRepost=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", totalCommentRepostCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", expandingCount=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", buttonStatus=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1358780lSm)) {
            return false;
        }
        C1358780lSm c1358780lSm = (C1358780lSm) interfaceC1891350zJl;
        if (this.LLILLJJLI != c1358780lSm.LLILLJJLI || this.LLILLL != c1358780lSm.LLILLL || this.LLILZ != c1358780lSm.LLILZ) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        if (interfaceC1891350zJl instanceof C1358780lSm) {
            User user = this.LL.user;
            String uid2 = null;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            User user2 = ((C1358780lSm) interfaceC1891350zJl).LL.user;
            if (user2 != null) {
                uid2 = user2.getUid();
            }
            if (Intrinsics.LJFF(uid, uid2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1358780lSm(UpvoteStruct upvoteStruct, int i, int i2, int i3) {
        this.LL = upvoteStruct;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
    }
}
