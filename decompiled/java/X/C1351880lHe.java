package X;

import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lHe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351880lHe implements InterfaceC1891350zJl {
    public final RepostReplyStruct LL;

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1351880lHe) && Intrinsics.LJFF(this.LL, ((C1351880lHe) obj).LL);
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
        sbLIZ.append("FriendsV3RepostCommentItem(repostComment=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1351880lHe(RepostReplyStruct repostReplyStruct) {
        this.LL = repostReplyStruct;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1351880lHe)) {
            return false;
        }
        C1351880lHe c1351880lHe = (C1351880lHe) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LL.replyId, c1351880lHe.LL.replyId) && !Intrinsics.LJFF(this.LL.fakeId, c1351880lHe.LL.fakeId)) {
            return false;
        }
        return true;
    }
}
