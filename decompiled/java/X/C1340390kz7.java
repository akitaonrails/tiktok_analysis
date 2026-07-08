package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kz7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340390kz7 extends AbstractC1049450dPr {
    public final Comment LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1340390kz7) && Intrinsics.LJFF(this.LLILLJJLI, ((C1340390kz7) obj).LLILLJJLI);
    }

    public final int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsV3CommentItem(comment=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1049450dPr
    public final Comment LIZ() {
        return this.LLILLJJLI;
    }

    public C1340390kz7(Comment comment) {
        super(comment);
        this.LLILLJJLI = comment;
    }

    @Override // X.AbstractC1049450dPr, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        if (!(interfaceC1891350zJl instanceof C1340390kz7)) {
            return false;
        }
        C1340390kz7 c1340390kz7 = (C1340390kz7) interfaceC1891350zJl;
        if (c1340390kz7.LLILLJJLI.getCommentType() != this.LLILLJJLI.getCommentType()) {
            return false;
        }
        String text = c1340390kz7.LLILLJJLI.getText();
        String str = "";
        if (text == null) {
            text = "";
        }
        String text2 = this.LLILLJJLI.getText();
        if (text2 != null) {
            str = text2;
        }
        if (!Intrinsics.LJFF(text, str)) {
            return false;
        }
        User user = c1340390kz7.LLILLJJLI.getUser();
        String uid2 = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        User user2 = this.LLILLJJLI.getUser();
        if (user2 != null) {
            uid2 = user2.getUid();
        }
        if (!Intrinsics.LJFF(uid, uid2)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1049450dPr, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1340390kz7)) {
            return false;
        }
        if (C703302op.LIZ(this.LLILLJJLI.getFakeId())) {
            C1340390kz7 c1340390kz7 = (C1340390kz7) interfaceC1891350zJl;
            if (C703302op.LIZ(c1340390kz7.LLILLJJLI.getFakeId())) {
                return Intrinsics.LJFF(c1340390kz7.LLILLJJLI.getFakeId(), this.LLILLJJLI.getFakeId());
            }
        }
        return Intrinsics.LJFF(((C1340390kz7) interfaceC1891350zJl).LLILLJJLI.getCid(), this.LLILLJJLI.getCid());
    }
}
