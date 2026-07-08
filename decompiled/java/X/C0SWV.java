package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SWV, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SWV extends C720930SPr {
    public final User LLILLJJLI;
    public final String LLILLL;
    public final long LLILZ;
    public final String LLILZIL;
    public final C0SQ1 LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SWV)) {
            return false;
        }
        C0SWV c0swv = (C0SWV) obj;
        return Intrinsics.LJFF(this.LLILLJJLI, c0swv.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0swv.LLILLL) && this.LLILZ == c0swv.LLILZ && Intrinsics.LJFF(this.LLILZIL, c0swv.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0swv.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = this.LLILLJJLI.hashCode() * 31;
        String str = this.LLILLL;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31;
        String str2 = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C0SQ1 c0sq1 = this.LLILZLL;
        return iHashCode3 + (c0sq1 != null ? c0sq1.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReactionBubbleDmReplyItem(user=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", messageId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", mobEventParam=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0SWV(User user, String str, long j, String str2, C0SQ1 c0sq1) {
        super(5);
        this.LLILLJJLI = user;
        this.LLILLL = str;
        this.LLILZ = j;
        this.LLILZIL = str2;
        this.LLILZLL = c0sq1;
    }
}
