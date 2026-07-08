package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355570lNb implements InterfaceC1891350zJl {
    public final Aweme LL;
    public final UpvoteStruct LLILLJJLI;
    public final RepostReplyStruct LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1355570lNb)) {
            return false;
        }
        C1355570lNb c1355570lNb = (C1355570lNb) obj;
        return Intrinsics.LJFF(this.LL, c1355570lNb.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1355570lNb.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1355570lNb.LLILLL) && this.LLILZ == c1355570lNb.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        RepostReplyStruct repostReplyStruct = this.LLILLL;
        return ((iHashCode + (repostReplyStruct == null ? 0 : repostReplyStruct.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostInternalShareItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", repost=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", reply=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isFusedCell=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1355570lNb(Aweme aweme, UpvoteStruct upvoteStruct, RepostReplyStruct repostReplyStruct, boolean z) {
        this.LL = aweme;
        this.LLILLJJLI = upvoteStruct;
        this.LLILLL = repostReplyStruct;
        this.LLILZ = z;
    }
}
