package X;

import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lRR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357950lRR extends C1358220lRs {
    public final UpvoteStruct LLILZIL;
    public final RepostReplyStruct LLILZLL;
    public final boolean LLIZ;
    public final EnumC992140bvQ LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1357950lRR)) {
            return false;
        }
        C1357950lRR c1357950lRR = (C1357950lRR) obj;
        return Intrinsics.LJFF(this.LLILZIL, c1357950lRR.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1357950lRR.LLILZLL) && this.LLIZ == c1357950lRR.LLIZ && this.LLIZLLLIL == c1357950lRR.LLIZLLLIL;
    }

    public final int hashCode() {
        return (((((this.LLILZIL.hashCode() * 31) + this.LLILZLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + this.LLIZLLLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostReplyItem(attachedRepost=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", repostReply=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isServerExpand=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", publishState=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1358220lRs, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1357950lRR) {
            C1357950lRR c1357950lRR = (C1357950lRR) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.LL, c1357950lRR.LL) || C1357960lRS.LIZIZ(this, c1357950lRR.LLILZLL.fakeId)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1357950lRR(UpvoteStruct upvoteStruct, RepostReplyStruct repostReplyStruct, boolean z, EnumC992140bvQ enumC992140bvQ) {
        int i;
        EnumC992140bvQ enumC992140bvQ2;
        int iIntValue;
        long jLongValue;
        String str = repostReplyStruct.replyId;
        str = str == null ? "" : str;
        UpvoteCacheState upvoteCacheState = repostReplyStruct.cacheState;
        if (upvoteCacheState == null) {
            i = -1;
        } else {
            i = C1357830lRF.LIZ[upvoteCacheState.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                enumC992140bvQ2 = EnumC992140bvQ.SUCCESS;
            } else {
                enumC992140bvQ2 = EnumC992140bvQ.FAILED;
            }
        } else {
            enumC992140bvQ2 = EnumC992140bvQ.START;
        }
        User user = repostReplyStruct.user;
        Integer num = repostReplyStruct.userDigged;
        boolean z2 = num != null && num.intValue() == 1;
        Integer num2 = repostReplyStruct.diggCount;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        String str2 = repostReplyStruct.text;
        String str3 = str2 != null ? str2 : "";
        List<? extends TextExtraStruct> list = repostReplyStruct.textExtra;
        Long l = repostReplyStruct.createTime;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        super(str, upvoteStruct, new C1358240lRu(user, z2, iIntValue, str3, list, jLongValue, enumC992140bvQ2));
        this.LLILZIL = upvoteStruct;
        this.LLILZLL = repostReplyStruct;
        this.LLIZ = z;
        this.LLIZLLLIL = enumC992140bvQ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1357950lRR(UpvoteStruct upvoteStruct, RepostReplyStruct repostReplyStruct, boolean z, int i) {
        EnumC992140bvQ enumC992140bvQ;
        z = (i & 4) != 0 ? false : z;
        if ((i & 8) != 0) {
            enumC992140bvQ = EnumC992140bvQ.SUCCESS;
        } else {
            enumC992140bvQ = null;
        }
        this(upvoteStruct, repostReplyStruct, z, enumC992140bvQ);
    }
}
