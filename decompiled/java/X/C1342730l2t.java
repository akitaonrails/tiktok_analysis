package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l2t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342730l2t implements InterfaceC1891350zJl {
    public final Comment LL;
    public final Aweme LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final Object LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1342730l2t)) {
            return false;
        }
        C1342730l2t c1342730l2t = (C1342730l2t) obj;
        return Intrinsics.LJFF(this.LL, c1342730l2t.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1342730l2t.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1342730l2t.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1342730l2t.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1342730l2t.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Aweme aweme = this.LLILLJJLI;
        int iHashCode2 = (((((iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        Object obj = this.LLILZIL;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentInlineBannerOverflowItem(comment=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", thumbnailPath=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", synthesisHandle=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1342730l2t)) {
            return false;
        }
        C1342730l2t c1342730l2t = (C1342730l2t) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(c1342730l2t.LL.getCid(), this.LL.getCid()) || !Intrinsics.LJFF(c1342730l2t.LLILLL, this.LLILLL)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1342730l2t)) {
            return false;
        }
        return Intrinsics.LJFF(((C1342730l2t) interfaceC1891350zJl).LL.getCid(), this.LL.getCid());
    }

    public C1342730l2t(Comment comment, Aweme aweme, Object obj, String str, String str2) {
        this.LL = comment;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = obj;
    }
}
